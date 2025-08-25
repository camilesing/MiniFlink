package com.dogeking;

import org.apache.commons.lang3.Strings;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ColumnSemanticAnalyzer extends FQLBaseListener {

    private final SemanticContext semanticContext;
    private CurrentStatementType currentStatementType;

    public ColumnSemanticAnalyzer(SemanticContext semanticContext) {
        this.semanticContext = semanticContext;
    }

    @Override
    public void enterInsertSimpleStatement(FQLParser.InsertSimpleStatementContext ctx) {
        currentStatementType = CurrentStatementType.INSERT;
    }

    @Override
    public void exitInsertSimpleStatement(FQLParser.InsertSimpleStatementContext ctx) {
        currentStatementType = null;
    }

    @Override
    public void enterCommonQuery(FQLParser.CommonQueryContext ctx) {
        if (currentStatementType != CurrentStatementType.INSERT) {
            currentStatementType = CurrentStatementType.SELECT;
        }

        FQLParser.SelectClauseContext selectClauseContext;
        String tableName;
        if (ctx.selectClause() != null) {
            tableName = null;
            selectClauseContext = ctx.selectClause();
        } else if (ctx.selectStatement() != null) {
            FQLParser.SelectStatementContext ssc = ctx.selectStatement();
            if (ssc instanceof FQLParser.CommonSQLContext) {
                selectClauseContext = ((FQLParser.CommonSQLContext) ssc).selectClause();
                tableName = getTableName(((FQLParser.CommonSQLContext) ssc).fromClause().tableExpression().tableReference());
            } else if (ssc instanceof FQLParser.SelectWithMatchRecognizeContext) {
                selectClauseContext = ((FQLParser.SelectWithMatchRecognizeContext) ssc).selectClause();
                tableName = getTableName(((FQLParser.SelectWithMatchRecognizeContext) ssc).fromClause().tableExpression().tableReference());
            } else {
                throw new IllegalArgumentException("unknown condition fork");
            }
        } else {
            throw new IllegalArgumentException("unknown condition fork");
        }
        if (tableName == null) {
            throw new IllegalArgumentException("Table name not found");
        }

        List<FQLParser.ProjectItemDefinitionContext> ptdContextList = selectClauseContext.projectItemDefinition();

        ptdContextList.stream().filter(it -> it instanceof FQLParser.CommonContext)
                .map(ptd -> ((FQLParser.CommonContext) ptd).expression())
                .forEach(expressionContexts -> {
                    expressionContexts.forEach(expressionContext -> {
                        if (expressionContext.booleanExpression() instanceof FQLParser.PredicatedContext) {
                            FQLParser.ValueExpressionContext valueExpressionContext =
                                    ((FQLParser.PredicatedContext) expressionContext.booleanExpression()).valueExpression();
                            if (valueExpressionContext instanceof FQLParser.ValueExpressionDefaultContext) {
                                FQLParser.PrimaryExpressionContext primaryExpressionContext =
                                        ((FQLParser.ValueExpressionDefaultContext) valueExpressionContext).primaryExpression();
                                if (primaryExpressionContext instanceof FQLParser.ColumnReferenceContext) {
                                    String fieldName = ((FQLParser.ColumnReferenceContext) primaryExpressionContext).identifier().getText();
                                    fieldName = Strings.CS.remove(fieldName, "`"); //for `user_id`
                                    checkFiledIsExist(tableName, fieldName);
                                }
                            }
                        }
                    });
                });
    }


    @Override
    public void exitCommonQuery(FQLParser.CommonQueryContext ctx) {
        currentStatementType = null;
    }


    @Override
    public void enterUnionQuery(FQLParser.UnionQueryContext ctx) {
        throw new IllegalArgumentException("新代码，别搞。后面实现");
    }

    @Override
    public void exitUnionQuery(FQLParser.UnionQueryContext ctx) {
        throw new IllegalArgumentException("新代码，别搞。后面实现");
    }

    @Override
    public void enterSimpleCreateTable(FQLParser.SimpleCreateTableContext ctx) {
        currentStatementType = CurrentStatementType.CREATE;
        List<FQLParser.IdentifierContext> identifierContext = ctx.tablePathCreate().uid().identifier();
        String tableName;
        //todo 考虑不同路径下的表名，应该是两张表。现在当作一张表处理的
        if (identifierContext.size() > 1) {
            tableName = identifierContext.get(1).getText();
        } else {
            tableName = identifierContext.get(0).getText();
        }
        List<FQLParser.ColumnOptionDefinitionContext> columnCtxList = ctx.columnOptionDefinition();
        recordColumnInfo(tableName, columnCtxList);
    }

    @Override
    public void exitSimpleCreateTable(FQLParser.SimpleCreateTableContext ctx) {
        currentStatementType = null;
    }

    private void recordColumnInfo(String tableName, List<FQLParser.ColumnOptionDefinitionContext> columnCtxList) {
        columnCtxList.forEach(columnCtx -> {
            String columnName;
            String columnType;
            if (columnCtx.physicalColumnDefinition() != null) {
                //todo 处理expression的情况
                columnName = columnCtx.physicalColumnDefinition().columnName().uid().getText();
                columnType = columnCtx.physicalColumnDefinition().columnType().typeName.getText();
            } else if (columnCtx.metadataColumnDefinition() != null) {
                columnName = columnCtx.metadataColumnDefinition().columnName().uid().getText();
                columnType = columnCtx.metadataColumnDefinition().columnType().typeName.getText();
            } else if (columnCtx.computedColumnDefinition() != null) {
                throw new IllegalArgumentException("新代码，别搞。后面实现");
            } else {
                throw new IllegalArgumentException("cannot get columnName");
            }
            columnName = Strings.CS.remove(columnName, "`"); //for `user_id`
            semanticContext.getMetaDataMapping().computeIfAbsent(tableName, s ->
                            new TableMetaData()).getColumnMetaDataList()
                    .add(new ColumnMetaData(columnName, columnType));
        });
    }


    private void checkFiledIsExist(String targetTableName, String targetColumnName) {
        TableMetaData tableMetaData = semanticContext.getMetaDataMapping().get(targetTableName);
        if (tableMetaData == null) {
            throw new IllegalArgumentException("Table " + targetTableName + " not found");
        }

        boolean columnExists = tableMetaData.getColumnMetaDataList().stream()
                .anyMatch(column -> column.getName().equals(targetColumnName));

        if (!columnExists) {
            throw new IllegalArgumentException("Column " + targetColumnName + " not found in table " + targetTableName);
        }
    }


    private String getTableName(List<FQLParser.TableReferenceContext> tableExpression) {
        AtomicReference<String> tableName = new AtomicReference<>();
        tableExpression.forEach(tableExpressionContext ->
                tableName.set(tableExpressionContext.tablePrimary().tablePath().getText())
        );
        if (tableName.get() == null) {
            throw new IllegalArgumentException("Table name not found");
        }
        return tableName.get();
    }

    enum CurrentStatementType {
        SELECT,
        INSERT,
        CREATE
    }

}


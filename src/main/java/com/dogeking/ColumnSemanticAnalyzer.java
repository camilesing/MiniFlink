package com.dogeking;

import org.apache.commons.lang3.Strings;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public class ColumnSemanticAnalyzer extends FQLBaseListener {

    private final SemanticContext semanticContext;
    private final Consumer<String> analyzeReport;
    private final Consumer<String> errorReport;
    private final Consumer<String> warnReport;
    private CurrentStatementType currentStatementType;

    public ColumnSemanticAnalyzer(SemanticContext semanticContext, Consumer<String> analyzeReporter,
                                  Consumer<String> errorReporter, Consumer<String> warnReporter) {
        this.semanticContext = semanticContext;
        this.analyzeReport = analyzeReporter;
        this.errorReport = errorReporter;
        this.warnReport = warnReporter;
    }

    @Override
    public void enterInsertSimpleStatement(FQLParser.InsertSimpleStatementContext ctx) {
        currentStatementType = CurrentStatementType.INSERT;
        handleInsertSimpleStatement(ctx);
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
        this.handleCommonQueryContext(ctx);
    }


    @Override
    public void exitCommonQuery(FQLParser.CommonQueryContext ctx) {
        currentStatementType = null;
    }


    @Override
    public void enterUnionQuery(FQLParser.UnionQueryContext ctx) {
        this.warnReport.accept("新代码，别搞。后面实现");
    }

    @Override
    public void exitUnionQuery(FQLParser.UnionQueryContext ctx) {
        this.warnReport.accept("新代码，别搞。后面实现");
    }

    @Override
    public void enterSimpleCreateTable(FQLParser.SimpleCreateTableContext ctx) {
        currentStatementType = CurrentStatementType.CREATE;
        List<FQLParser.IdentifierContext> identifierContextList = ctx.tablePathCreate().uid().identifier();
        String tableName;
        if (identifierContextList.size() > 1) {
            tableName = identifierContextList.get(0).getText() + "." + identifierContextList.get(1).getText();
        } else {
            tableName = identifierContextList.get(0).getText();
        }
        List<FQLParser.ColumnOptionDefinitionContext> columnCtxList = ctx.columnOptionDefinition();
        recordColumnInfo(tableName, columnCtxList);
    }

    @Override
    public void exitSimpleCreateTable(FQLParser.SimpleCreateTableContext ctx) {
        currentStatementType = null;
    }

    private void handleInsertSimpleStatement(FQLParser.InsertSimpleStatementContext ctx) {
        currentStatementType = CurrentStatementType.INSERT;
        FQLParser.TablePathContext tablePathContext = ctx.tablePath();
        String insertTargetTable = tablePathContext.uid().getText();
        TableMetaData tableMetaData = semanticContext.getMetaDataMapping().get(insertTargetTable);
        if (tableMetaData == null) {
            this.analyzeReport.accept("Insert target table " + insertTargetTable + " not found");
            return;
        }
        if (ctx.columnNameList() != null) {
            ctx.columnNameList().columnName().forEach(columnNameContext -> {
                if (columnNameContext.uid() != null) {
                    List<FQLParser.IdentifierContext> idList = columnNameContext.uid().identifier();
                    if (idList != null && !idList.isEmpty()) {
                        this.checkMetadata(insertTargetTable, idList.get(0).getText());
                    } else {
                        this.warnReport.accept("unexpected branch for columnList. we cannot check metadata");
                    }
                } else {
                    this.warnReport.accept("unexpected branch for columnList");
                }

            });
        } else if (ctx.queryStatement() != null && ctx.queryStatement() instanceof FQLParser.CommonQueryContext commonContext) {
            if (commonContext.selectClause() != null) {
                this.handleSelectClauseWithTableName(commonContext.selectClause(), insertTargetTable, true);
            } else {
                FQLParser.SelectStatementContext selectStatementContext = commonContext.selectStatement();
                if (selectStatementContext instanceof FQLParser.CommonSQLContext commonSQLContext) {
                    this.handleSelectClauseWithTableName(commonSQLContext.selectClause(), insertTargetTable, true);
                } else if (selectStatementContext instanceof FQLParser.SelectWithMatchRecognizeContext selectWithMatchRecognizeContext) {
                    this.handleSelectClauseWithTableName(selectWithMatchRecognizeContext.selectClause(), insertTargetTable, true);
                } else {
                    this.errorReport.accept("not support select statement");
                }
            }
        } else {
            this.errorReport.accept("unexpected branch for insert simple statement");
        }
    }

    private void handleCommonQueryContext(FQLParser.CommonQueryContext ctx) {
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
                this.errorReport.accept("unknown condition fork");
                return;
            }
        } else {
            this.errorReport.accept("unknown condition fork");
            return;
        }
        if (tableName == null) {
            this.analyzeReport.accept("Table name not found");
            return;
        }

        TableMetaData tableMetaData = semanticContext.getMetaDataMapping().get(tableName);
        if (tableMetaData == null) {
            this.analyzeReport.accept("Table " + tableName + " not found when query");
            return;
        }

        this.handleSelectClauseWithTableName(selectClauseContext, tableName, false);
    }


    private void handleSelectClauseWithTableName(FQLParser.SelectClauseContext selectCtx, String tableName, boolean careAs) {
        List<FQLParser.ProjectItemDefinitionContext> projectItemDefinitionList = selectCtx.projectItemDefinition();
        projectItemDefinitionList.forEach(projectItemDefinition -> {
            if (projectItemDefinition instanceof FQLParser.FlinkStyleProjectItemContext) {
                this.warnReport.accept("We will support for WindowsProjectItem in the future.");
            } else if (projectItemDefinition instanceof FQLParser.CommonContext) {
                this.analyzeExpression(tableName, (FQLParser.CommonContext) projectItemDefinition, careAs);
            }
        });
    }

    private void analyzeExpression(String tableName, FQLParser.CommonContext ctx, boolean careAs) {
        FQLParser.BooleanExpressionContext expressionContext;
        if (ctx.expression().size() == 2) {
            if (careAs) {
                expressionContext = ctx.expression().get(1).booleanExpression();
            } else {
                expressionContext = ctx.expression().get(0).booleanExpression();
            }
        } else if (ctx.expression().size() == 1) {
            expressionContext = ctx.expression().get(0).booleanExpression();
        } else {
            this.errorReport.accept("Unsupported expression");
            return;
        }

        if (!(expressionContext.children.get(0) instanceof FQLParser.ValueExpressionDefaultContext)) {
            this.warnReport.accept("unexpected type: " + expressionContext.children.get(0).getClass() + " when analyzeExpression");
            return;
        }

        FQLParser.ValueExpressionContext valueExpression = ((FQLParser.ValueExpressionDefaultContext) (expressionContext.children.get(0)));

        FQLParser.PrimaryExpressionContext primaryExpression;
        if (valueExpression.children.get(0) instanceof FQLParser.ColumnReferenceContext || valueExpression.children.get(0) instanceof FQLParser.DereferenceContext) {
            primaryExpression = (FQLParser.PrimaryExpressionContext) valueExpression.children.get(0);
        } else if (valueExpression.children.get(0) instanceof FQLParser.StarContext) {
            //ignore start
            return;
        } else {
            this.warnReport.accept("Unsupported primaryExpression");
            return;
        }
        String filedName;
        if (primaryExpression instanceof FQLParser.ColumnReferenceContext) {
            filedName = ((FQLParser.ColumnReferenceContext) primaryExpression).identifier().getText();
        } else if (primaryExpression instanceof FQLParser.DereferenceContext) {
            List<FQLParser.IdentifierContext> identifierList = ((FQLParser.DereferenceContext) primaryExpression).dereferenceDefinition().uid().identifier();
            if (identifierList.size() == 1) {
                filedName = identifierList.get(0).getText();
            } else if (identifierList.size() == 2) {
                if (careAs) {
                    filedName = identifierList.get(1).getText();
                } else {
                    filedName = identifierList.get(0).getText();
                }
            } else {
                this.warnReport.accept("Unsupported column name");
                return;
            }
        } else {
            this.warnReport.accept("Unsupported primaryExpression");
            return;
        }
        this.checkMetadata(tableName, filedName);
    }


    private String getTableName(List<FQLParser.TableReferenceContext> tableExpression) {
        AtomicReference<String> tableName = new AtomicReference<>();
        tableExpression.forEach(tableExpressionContext ->
                tableName.set(tableExpressionContext.tablePrimary().tablePath().getText())
        );
        if (tableName.get() == null) {
            this.errorReport.accept("cannot find table name when analyze table expression");
        }
        return tableName.get();
    }

    private void checkMetadata(String targetTableName, String targetColumnName) {
        TableMetaData tableMetaData = semanticContext.getMetaDataMapping().get(targetTableName);
        if (tableMetaData == null) {
            this.analyzeReport.accept("Table " + targetTableName + " not found");
            return;
        }

        boolean columnExists = tableMetaData.getColumnMetaDataList().stream()
                .anyMatch(column -> column.getName().equals(targetColumnName));

        if (!columnExists) {
            this.analyzeReport.accept("Column " + targetColumnName + " not found in table " + targetTableName);
        }
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
                this.warnReport.accept("新代码，别搞。后面实现");
                return;
            } else {
                this.errorReport.accept("cannot get columnName");
                return;
            }
            columnName = Strings.CS.remove(columnName, "`"); //for `user_id`
            semanticContext.getMetaDataMapping().computeIfAbsent(tableName, s ->
                            new TableMetaData()).getColumnMetaDataList()
                    .add(new ColumnMetaData(columnName, columnType));
        });
    }

    enum CurrentStatementType {
        SELECT,
        INSERT,
        CREATE
    }

}


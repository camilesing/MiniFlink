// Generated from /Users/camile/Work/JVM/MiniFlink/src/main/resources/FQL.g4 by ANTLR 4.13.2

package com.dogeking;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FQLParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(FQLParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#sqlStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatements(FQLParser.SqlStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ddlPart}
	 * labeled alternative in {@link FQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdlPart(FQLParser.DdlPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dmlPart}
	 * labeled alternative in {@link FQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlPart(FQLParser.DmlPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(FQLParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#ddlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdlStatement(FQLParser.DdlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#createStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStatement(FQLParser.CreateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#dmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlStatement(FQLParser.DmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#simpleCreateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCreateTable(FQLParser.SimpleCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#insertSimpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSimpleStatement(FQLParser.InsertSimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#insertPartitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertPartitionDefinition(FQLParser.InsertPartitionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionQuery}
	 * labeled alternative in {@link FQLParser#queryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionQuery(FQLParser.UnionQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commonQuery}
	 * labeled alternative in {@link FQLParser#queryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonQuery(FQLParser.CommonQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#valuesCaluse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesCaluse(FQLParser.ValuesCaluseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#withItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithItem(FQLParser.WithItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#withItemName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithItemName(FQLParser.WithItemNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(FQLParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(FQLParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(FQLParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#flinkJoinOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlinkJoinOp(FQLParser.FlinkJoinOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#tablePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePrimary(FQLParser.TablePrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#timePeriod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimePeriod(FQLParser.TimePeriodContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#dateTimeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTimeExpression(FQLParser.DateTimeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#inlineDataValueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineDataValueClause(FQLParser.InlineDataValueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#windowTVFClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowTVFClause(FQLParser.WindowTVFClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#windowTVFExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowTVFExpression(FQLParser.WindowTVFExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#tumableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTumableExpression(FQLParser.TumableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#hopExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHopExpression(FQLParser.HopExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#cumulateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCumulateExpression(FQLParser.CumulateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#sessionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSessionExpression(FQLParser.SessionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#windowTVFName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowTVFName(FQLParser.WindowTVFNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#windowTVFParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowTVFParam(FQLParser.WindowTVFParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#timeIntervalParamName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeIntervalParamName(FQLParser.TimeIntervalParamNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#columnDescriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDescriptor(FQLParser.ColumnDescriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#joinCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCondition(FQLParser.JoinConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(FQLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#groupItemDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupItemDefinition(FQLParser.GroupItemDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(FQLParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#groupingSets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSets(FQLParser.GroupingSetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#groupingSetsNotionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSetsNotionName(FQLParser.GroupingSetsNotionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#groupWindowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupWindowFunction(FQLParser.GroupWindowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#groupWindowFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupWindowFunctionName(FQLParser.GroupWindowFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#timeAttrColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeAttrColumn(FQLParser.TimeAttrColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(FQLParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#windowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(FQLParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#namedWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindow(FQLParser.NamedWindowContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowSpec(FQLParser.WindowSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#matchRecognizeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchRecognizeClause(FQLParser.MatchRecognizeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#orderByCaluse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByCaluse(FQLParser.OrderByCaluseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#orderItemDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderItemDefinition(FQLParser.OrderItemDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(FQLParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#partitionByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionByClause(FQLParser.PartitionByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#quantifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiers(FQLParser.QuantifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#measuresClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasuresClause(FQLParser.MeasuresClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#patternDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternDefinition(FQLParser.PatternDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#patternVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternVariable(FQLParser.PatternVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#outputMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputMode(FQLParser.OutputModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#afterMatchStrategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfterMatchStrategy(FQLParser.AfterMatchStrategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#patternVariablesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternVariablesDefinition(FQLParser.PatternVariablesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(FQLParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(FQLParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#withinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithinClause(FQLParser.WithinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#analyzePartitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzePartitionDefinition(FQLParser.AnalyzePartitionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#selfDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfDefinitionClause(FQLParser.SelfDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#partitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinition(FQLParser.PartitionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#transformList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformList(FQLParser.TransformListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityTransform(FQLParser.IdentityTransformContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyTransform(FQLParser.ApplyTransformContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#transformArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformArgument(FQLParser.TransformArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#likeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeDefinition(FQLParser.LikeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#distributed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistributed(FQLParser.DistributedContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#distribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistribution(FQLParser.DistributionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#likeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeOption(FQLParser.LikeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#columnOptionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnOptionDefinition(FQLParser.ColumnOptionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#physicalColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysicalColumnDefinition(FQLParser.PhysicalColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#computedColumnExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputedColumnExpression(FQLParser.ComputedColumnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#watermarkDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWatermarkDefinition(FQLParser.WatermarkDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraint(FQLParser.TableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#constraintName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintName(FQLParser.ConstraintNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#valuesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesDefinition(FQLParser.ValuesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#valuesRowDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesRowDefinition(FQLParser.ValuesRowDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthOneDimension(FQLParser.LengthOneDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthTwoOptionalDimension(FQLParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#lengthTwoStringDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthTwoStringDimension(FQLParser.LengthTwoStringDimensionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lengthSymbolsTypeDimension}
	 * labeled alternative in {@link FQLParser#lengthOneTypeDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthSymbolsTypeDimension(FQLParser.LengthSymbolsTypeDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#mapTypeDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapTypeDimension(FQLParser.MapTypeDimensionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowSymbolsTypeDimension}
	 * labeled alternative in {@link FQLParser#rowTypeDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowSymbolsTypeDimension(FQLParser.RowSymbolsTypeDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraint(FQLParser.ColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#commentSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentSpec(FQLParser.CommentSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#metadataColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadataColumnDefinition(FQLParser.MetadataColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#metadataKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadataKey(FQLParser.MetadataKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#computedColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputedColumnDefinition(FQLParser.ComputedColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(FQLParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#columnNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNameList(FQLParser.ColumnNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#columnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnType(FQLParser.ColumnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link FQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(FQLParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link FQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(FQLParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link FQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(FQLParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNested}
	 * labeled alternative in {@link FQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNested(FQLParser.LogicalNestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link FQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(FQLParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(FQLParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#likePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePredicate(FQLParser.LikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link FQLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(FQLParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link FQLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(FQLParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link FQLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(FQLParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link FQLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(FQLParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(FQLParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(FQLParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(FQLParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code last}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast(FQLParser.LastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(FQLParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(FQLParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallFilter}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallFilter(FQLParser.FunctionCallFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(FQLParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(FQLParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(FQLParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyExpression}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyExpression(FQLParser.EmptyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(FQLParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDataTypeFieldExpression}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataTypeFieldExpression(FQLParser.ComplexDataTypeFieldExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(FQLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(FQLParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code position}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(FQLParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code first}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(FQLParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#complexDataTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataTypeExpression(FQLParser.ComplexDataTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#arrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(FQLParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#rowExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowExpression(FQLParser.RowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#mapExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExpression(FQLParser.MapExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#dataTypeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeExpression(FQLParser.DataTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(FQLParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#functionParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParam(FQLParser.FunctionParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#filterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterClause(FQLParser.FilterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#dereferenceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereferenceDefinition(FQLParser.DereferenceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#correlationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrelationName(FQLParser.CorrelationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(FQLParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#timeIntervalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeIntervalExpression(FQLParser.TimeIntervalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingMultiUnitsInterval(FQLParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiUnitsInterval(FQLParser.MultiUnitsIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingUnitToUnitInterval(FQLParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitToUnitInterval(FQLParser.UnitToUnitIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(FQLParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#columnAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAlias(FQLParser.ColumnAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(FQLParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingIdentifier(FQLParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link FQLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorIdent(FQLParser.ErrorIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link FQLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealIdent(FQLParser.RealIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(FQLParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#identifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSeq(FQLParser.IdentifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifierAlternative}
	 * labeled alternative in {@link FQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifierAlternative(FQLParser.UnquotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link FQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(FQLParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonReservedKeywordsAlternative}
	 * labeled alternative in {@link FQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReservedKeywordsAlternative(FQLParser.NonReservedKeywordsAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code urefVarAlternative}
	 * labeled alternative in {@link FQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrefVarAlternative(FQLParser.UrefVarAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#refVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefVar(FQLParser.RefVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#unquotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(FQLParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(FQLParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(FQLParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#catalogPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatalogPath(FQLParser.CatalogPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#databasePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabasePath(FQLParser.DatabasePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#databasePathCreate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabasePathCreate(FQLParser.DatabasePathCreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#tablePathCreate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePathCreate(FQLParser.TablePathCreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#tablePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePath(FQLParser.TablePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUid(FQLParser.UidContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#withOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithOption(FQLParser.WithOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(FQLParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(FQLParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#tableCanHasKeyPropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableCanHasKeyPropertyList(FQLParser.TableCanHasKeyPropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#tablePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyList(FQLParser.TablePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#tableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperty(FQLParser.TablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyKey(FQLParser.TablePropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyValue(FQLParser.TablePropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(FQLParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(FQLParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#timePointLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimePointLiteral(FQLParser.TimePointLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(FQLParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(FQLParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(FQLParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(FQLParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#timePointUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimePointUnit(FQLParser.TimePointUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#timeIntervalUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeIntervalUnit(FQLParser.TimeIntervalUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#reservedKeywordsUsedAsFuncParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedKeywordsUsedAsFuncParam(FQLParser.ReservedKeywordsUsedAsFuncParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#reservedKeywordsUsedAsFuncName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedKeywordsUsedAsFuncName(FQLParser.ReservedKeywordsUsedAsFuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#nonReservedKeywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReservedKeywords(FQLParser.NonReservedKeywordsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code flinkStyleProjectItem}
	 * labeled alternative in {@link FQLParser#projectItemDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlinkStyleProjectItem(FQLParser.FlinkStyleProjectItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code common}
	 * labeled alternative in {@link FQLParser#projectItemDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon(FQLParser.CommonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commonSQL}
	 * labeled alternative in {@link FQLParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonSQL(FQLParser.CommonSQLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectWithMatchRecognize}
	 * labeled alternative in {@link FQLParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectWithMatchRecognize(FQLParser.SelectWithMatchRecognizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(FQLParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commonInsert}
	 * labeled alternative in {@link FQLParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonInsert(FQLParser.CommonInsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#joinOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinOp(FQLParser.JoinOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#tableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExpression(FQLParser.TableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(FQLParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code flink_commn}
	 * labeled alternative in {@link FQLParser#overWindowItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlink_commn(FQLParser.Flink_commnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code flink_common2}
	 * labeled alternative in {@link FQLParser#overWindowItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlink_common2(FQLParser.Flink_common2Context ctx);
}
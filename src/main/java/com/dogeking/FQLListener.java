// Generated from /Users/camile/Work/JVM/MiniFlink/src/main/resources/FQL.g4 by ANTLR 4.13.2

package com.dogeking;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FQLParser}.
 */
public interface FQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FQLParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(FQLParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(FQLParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(FQLParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(FQLParser.SqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ddlPart}
	 * labeled alternative in {@link FQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDdlPart(FQLParser.DdlPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ddlPart}
	 * labeled alternative in {@link FQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDdlPart(FQLParser.DdlPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dmlPart}
	 * labeled alternative in {@link FQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlPart(FQLParser.DmlPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dmlPart}
	 * labeled alternative in {@link FQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlPart(FQLParser.DmlPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(FQLParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(FQLParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDdlStatement(FQLParser.DdlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDdlStatement(FQLParser.DdlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStatement(FQLParser.CreateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStatement(FQLParser.CreateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(FQLParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(FQLParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#simpleCreateTable}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCreateTable(FQLParser.SimpleCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#simpleCreateTable}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCreateTable(FQLParser.SimpleCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#insertSimpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertSimpleStatement(FQLParser.InsertSimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#insertSimpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertSimpleStatement(FQLParser.InsertSimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#insertPartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInsertPartitionDefinition(FQLParser.InsertPartitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#insertPartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInsertPartitionDefinition(FQLParser.InsertPartitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionQuery}
	 * labeled alternative in {@link FQLParser#queryStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionQuery(FQLParser.UnionQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionQuery}
	 * labeled alternative in {@link FQLParser#queryStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionQuery(FQLParser.UnionQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commonQuery}
	 * labeled alternative in {@link FQLParser#queryStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommonQuery(FQLParser.CommonQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commonQuery}
	 * labeled alternative in {@link FQLParser#queryStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommonQuery(FQLParser.CommonQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#valuesCaluse}.
	 * @param ctx the parse tree
	 */
	void enterValuesCaluse(FQLParser.ValuesCaluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#valuesCaluse}.
	 * @param ctx the parse tree
	 */
	void exitValuesCaluse(FQLParser.ValuesCaluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#withItem}.
	 * @param ctx the parse tree
	 */
	void enterWithItem(FQLParser.WithItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#withItem}.
	 * @param ctx the parse tree
	 */
	void exitWithItem(FQLParser.WithItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#withItemName}.
	 * @param ctx the parse tree
	 */
	void enterWithItemName(FQLParser.WithItemNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#withItemName}.
	 * @param ctx the parse tree
	 */
	void exitWithItemName(FQLParser.WithItemNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(FQLParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(FQLParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(FQLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(FQLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(FQLParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(FQLParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#flinkJoinOp}.
	 * @param ctx the parse tree
	 */
	void enterFlinkJoinOp(FQLParser.FlinkJoinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#flinkJoinOp}.
	 * @param ctx the parse tree
	 */
	void exitFlinkJoinOp(FQLParser.FlinkJoinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#tablePrimary}.
	 * @param ctx the parse tree
	 */
	void enterTablePrimary(FQLParser.TablePrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#tablePrimary}.
	 * @param ctx the parse tree
	 */
	void exitTablePrimary(FQLParser.TablePrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#timePeriod}.
	 * @param ctx the parse tree
	 */
	void enterTimePeriod(FQLParser.TimePeriodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#timePeriod}.
	 * @param ctx the parse tree
	 */
	void exitTimePeriod(FQLParser.TimePeriodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#dateTimeExpression}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeExpression(FQLParser.DateTimeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#dateTimeExpression}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeExpression(FQLParser.DateTimeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#inlineDataValueClause}.
	 * @param ctx the parse tree
	 */
	void enterInlineDataValueClause(FQLParser.InlineDataValueClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#inlineDataValueClause}.
	 * @param ctx the parse tree
	 */
	void exitInlineDataValueClause(FQLParser.InlineDataValueClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#windowTVFClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowTVFClause(FQLParser.WindowTVFClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#windowTVFClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowTVFClause(FQLParser.WindowTVFClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#windowTVFExpression}.
	 * @param ctx the parse tree
	 */
	void enterWindowTVFExpression(FQLParser.WindowTVFExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#windowTVFExpression}.
	 * @param ctx the parse tree
	 */
	void exitWindowTVFExpression(FQLParser.WindowTVFExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#tumableExpression}.
	 * @param ctx the parse tree
	 */
	void enterTumableExpression(FQLParser.TumableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#tumableExpression}.
	 * @param ctx the parse tree
	 */
	void exitTumableExpression(FQLParser.TumableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#hopExpression}.
	 * @param ctx the parse tree
	 */
	void enterHopExpression(FQLParser.HopExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#hopExpression}.
	 * @param ctx the parse tree
	 */
	void exitHopExpression(FQLParser.HopExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#cumulateExpression}.
	 * @param ctx the parse tree
	 */
	void enterCumulateExpression(FQLParser.CumulateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#cumulateExpression}.
	 * @param ctx the parse tree
	 */
	void exitCumulateExpression(FQLParser.CumulateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#sessionExpression}.
	 * @param ctx the parse tree
	 */
	void enterSessionExpression(FQLParser.SessionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#sessionExpression}.
	 * @param ctx the parse tree
	 */
	void exitSessionExpression(FQLParser.SessionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#windowTVFName}.
	 * @param ctx the parse tree
	 */
	void enterWindowTVFName(FQLParser.WindowTVFNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#windowTVFName}.
	 * @param ctx the parse tree
	 */
	void exitWindowTVFName(FQLParser.WindowTVFNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#windowTVFParam}.
	 * @param ctx the parse tree
	 */
	void enterWindowTVFParam(FQLParser.WindowTVFParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#windowTVFParam}.
	 * @param ctx the parse tree
	 */
	void exitWindowTVFParam(FQLParser.WindowTVFParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#timeIntervalParamName}.
	 * @param ctx the parse tree
	 */
	void enterTimeIntervalParamName(FQLParser.TimeIntervalParamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#timeIntervalParamName}.
	 * @param ctx the parse tree
	 */
	void exitTimeIntervalParamName(FQLParser.TimeIntervalParamNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#columnDescriptor}.
	 * @param ctx the parse tree
	 */
	void enterColumnDescriptor(FQLParser.ColumnDescriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#columnDescriptor}.
	 * @param ctx the parse tree
	 */
	void exitColumnDescriptor(FQLParser.ColumnDescriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void enterJoinCondition(FQLParser.JoinConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void exitJoinCondition(FQLParser.JoinConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(FQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(FQLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#groupItemDefinition}.
	 * @param ctx the parse tree
	 */
	void enterGroupItemDefinition(FQLParser.GroupItemDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#groupItemDefinition}.
	 * @param ctx the parse tree
	 */
	void exitGroupItemDefinition(FQLParser.GroupItemDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(FQLParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(FQLParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#groupingSets}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSets(FQLParser.GroupingSetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#groupingSets}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSets(FQLParser.GroupingSetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#groupingSetsNotionName}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSetsNotionName(FQLParser.GroupingSetsNotionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#groupingSetsNotionName}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSetsNotionName(FQLParser.GroupingSetsNotionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#groupWindowFunction}.
	 * @param ctx the parse tree
	 */
	void enterGroupWindowFunction(FQLParser.GroupWindowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#groupWindowFunction}.
	 * @param ctx the parse tree
	 */
	void exitGroupWindowFunction(FQLParser.GroupWindowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#groupWindowFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterGroupWindowFunctionName(FQLParser.GroupWindowFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#groupWindowFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitGroupWindowFunctionName(FQLParser.GroupWindowFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#timeAttrColumn}.
	 * @param ctx the parse tree
	 */
	void enterTimeAttrColumn(FQLParser.TimeAttrColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#timeAttrColumn}.
	 * @param ctx the parse tree
	 */
	void exitTimeAttrColumn(FQLParser.TimeAttrColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(FQLParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(FQLParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(FQLParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(FQLParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(FQLParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(FQLParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpec(FQLParser.WindowSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpec(FQLParser.WindowSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#matchRecognizeClause}.
	 * @param ctx the parse tree
	 */
	void enterMatchRecognizeClause(FQLParser.MatchRecognizeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#matchRecognizeClause}.
	 * @param ctx the parse tree
	 */
	void exitMatchRecognizeClause(FQLParser.MatchRecognizeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#orderByCaluse}.
	 * @param ctx the parse tree
	 */
	void enterOrderByCaluse(FQLParser.OrderByCaluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#orderByCaluse}.
	 * @param ctx the parse tree
	 */
	void exitOrderByCaluse(FQLParser.OrderByCaluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#orderItemDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOrderItemDefinition(FQLParser.OrderItemDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#orderItemDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOrderItemDefinition(FQLParser.OrderItemDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(FQLParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(FQLParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionByClause(FQLParser.PartitionByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionByClause(FQLParser.PartitionByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#quantifiers}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiers(FQLParser.QuantifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#quantifiers}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiers(FQLParser.QuantifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#measuresClause}.
	 * @param ctx the parse tree
	 */
	void enterMeasuresClause(FQLParser.MeasuresClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#measuresClause}.
	 * @param ctx the parse tree
	 */
	void exitMeasuresClause(FQLParser.MeasuresClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#patternDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPatternDefinition(FQLParser.PatternDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#patternDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPatternDefinition(FQLParser.PatternDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#patternVariable}.
	 * @param ctx the parse tree
	 */
	void enterPatternVariable(FQLParser.PatternVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#patternVariable}.
	 * @param ctx the parse tree
	 */
	void exitPatternVariable(FQLParser.PatternVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#outputMode}.
	 * @param ctx the parse tree
	 */
	void enterOutputMode(FQLParser.OutputModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#outputMode}.
	 * @param ctx the parse tree
	 */
	void exitOutputMode(FQLParser.OutputModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#afterMatchStrategy}.
	 * @param ctx the parse tree
	 */
	void enterAfterMatchStrategy(FQLParser.AfterMatchStrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#afterMatchStrategy}.
	 * @param ctx the parse tree
	 */
	void exitAfterMatchStrategy(FQLParser.AfterMatchStrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#patternVariablesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPatternVariablesDefinition(FQLParser.PatternVariablesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#patternVariablesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPatternVariablesDefinition(FQLParser.PatternVariablesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(FQLParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(FQLParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(FQLParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(FQLParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#withinClause}.
	 * @param ctx the parse tree
	 */
	void enterWithinClause(FQLParser.WithinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#withinClause}.
	 * @param ctx the parse tree
	 */
	void exitWithinClause(FQLParser.WithinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#analyzePartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzePartitionDefinition(FQLParser.AnalyzePartitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#analyzePartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzePartitionDefinition(FQLParser.AnalyzePartitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#selfDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterSelfDefinitionClause(FQLParser.SelfDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#selfDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitSelfDefinitionClause(FQLParser.SelfDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinition(FQLParser.PartitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinition(FQLParser.PartitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#transformList}.
	 * @param ctx the parse tree
	 */
	void enterTransformList(FQLParser.TransformListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#transformList}.
	 * @param ctx the parse tree
	 */
	void exitTransformList(FQLParser.TransformListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterIdentityTransform(FQLParser.IdentityTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitIdentityTransform(FQLParser.IdentityTransformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterApplyTransform(FQLParser.ApplyTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitApplyTransform(FQLParser.ApplyTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void enterTransformArgument(FQLParser.TransformArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void exitTransformArgument(FQLParser.TransformArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#likeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLikeDefinition(FQLParser.LikeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#likeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLikeDefinition(FQLParser.LikeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#distributed}.
	 * @param ctx the parse tree
	 */
	void enterDistributed(FQLParser.DistributedContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#distributed}.
	 * @param ctx the parse tree
	 */
	void exitDistributed(FQLParser.DistributedContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#distribution}.
	 * @param ctx the parse tree
	 */
	void enterDistribution(FQLParser.DistributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#distribution}.
	 * @param ctx the parse tree
	 */
	void exitDistribution(FQLParser.DistributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#likeOption}.
	 * @param ctx the parse tree
	 */
	void enterLikeOption(FQLParser.LikeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#likeOption}.
	 * @param ctx the parse tree
	 */
	void exitLikeOption(FQLParser.LikeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#columnOptionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnOptionDefinition(FQLParser.ColumnOptionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#columnOptionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnOptionDefinition(FQLParser.ColumnOptionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#physicalColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPhysicalColumnDefinition(FQLParser.PhysicalColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#physicalColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPhysicalColumnDefinition(FQLParser.PhysicalColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#computedColumnExpression}.
	 * @param ctx the parse tree
	 */
	void enterComputedColumnExpression(FQLParser.ComputedColumnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#computedColumnExpression}.
	 * @param ctx the parse tree
	 */
	void exitComputedColumnExpression(FQLParser.ComputedColumnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#watermarkDefinition}.
	 * @param ctx the parse tree
	 */
	void enterWatermarkDefinition(FQLParser.WatermarkDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#watermarkDefinition}.
	 * @param ctx the parse tree
	 */
	void exitWatermarkDefinition(FQLParser.WatermarkDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraint(FQLParser.TableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraint(FQLParser.TableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(FQLParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(FQLParser.ConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#valuesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterValuesDefinition(FQLParser.ValuesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#valuesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitValuesDefinition(FQLParser.ValuesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#valuesRowDefinition}.
	 * @param ctx the parse tree
	 */
	void enterValuesRowDefinition(FQLParser.ValuesRowDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#valuesRowDefinition}.
	 * @param ctx the parse tree
	 */
	void exitValuesRowDefinition(FQLParser.ValuesRowDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthOneDimension(FQLParser.LengthOneDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthOneDimension(FQLParser.LengthOneDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthTwoOptionalDimension(FQLParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthTwoOptionalDimension(FQLParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#lengthTwoStringDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthTwoStringDimension(FQLParser.LengthTwoStringDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#lengthTwoStringDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthTwoStringDimension(FQLParser.LengthTwoStringDimensionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lengthSymbolsTypeDimension}
	 * labeled alternative in {@link FQLParser#lengthOneTypeDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthSymbolsTypeDimension(FQLParser.LengthSymbolsTypeDimensionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lengthSymbolsTypeDimension}
	 * labeled alternative in {@link FQLParser#lengthOneTypeDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthSymbolsTypeDimension(FQLParser.LengthSymbolsTypeDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#mapTypeDimension}.
	 * @param ctx the parse tree
	 */
	void enterMapTypeDimension(FQLParser.MapTypeDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#mapTypeDimension}.
	 * @param ctx the parse tree
	 */
	void exitMapTypeDimension(FQLParser.MapTypeDimensionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowSymbolsTypeDimension}
	 * labeled alternative in {@link FQLParser#rowTypeDimension}.
	 * @param ctx the parse tree
	 */
	void enterRowSymbolsTypeDimension(FQLParser.RowSymbolsTypeDimensionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowSymbolsTypeDimension}
	 * labeled alternative in {@link FQLParser#rowTypeDimension}.
	 * @param ctx the parse tree
	 */
	void exitRowSymbolsTypeDimension(FQLParser.RowSymbolsTypeDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraint(FQLParser.ColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraint(FQLParser.ColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void enterCommentSpec(FQLParser.CommentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void exitCommentSpec(FQLParser.CommentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#metadataColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMetadataColumnDefinition(FQLParser.MetadataColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#metadataColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMetadataColumnDefinition(FQLParser.MetadataColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#metadataKey}.
	 * @param ctx the parse tree
	 */
	void enterMetadataKey(FQLParser.MetadataKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#metadataKey}.
	 * @param ctx the parse tree
	 */
	void exitMetadataKey(FQLParser.MetadataKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#computedColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterComputedColumnDefinition(FQLParser.ComputedColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#computedColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitComputedColumnDefinition(FQLParser.ComputedColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(FQLParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(FQLParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#columnNameList}.
	 * @param ctx the parse tree
	 */
	void enterColumnNameList(FQLParser.ColumnNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#columnNameList}.
	 * @param ctx the parse tree
	 */
	void exitColumnNameList(FQLParser.ColumnNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#columnType}.
	 * @param ctx the parse tree
	 */
	void enterColumnType(FQLParser.ColumnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#columnType}.
	 * @param ctx the parse tree
	 */
	void exitColumnType(FQLParser.ColumnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link FQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(FQLParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link FQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(FQLParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link FQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(FQLParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link FQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(FQLParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link FQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(FQLParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link FQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(FQLParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNested}
	 * labeled alternative in {@link FQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNested(FQLParser.LogicalNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNested}
	 * labeled alternative in {@link FQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNested(FQLParser.LogicalNestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link FQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(FQLParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link FQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(FQLParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(FQLParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(FQLParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#likePredicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(FQLParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#likePredicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(FQLParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link FQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(FQLParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link FQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(FQLParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link FQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(FQLParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link FQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(FQLParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link FQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(FQLParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link FQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(FQLParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link FQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(FQLParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link FQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(FQLParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(FQLParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(FQLParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(FQLParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(FQLParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(FQLParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(FQLParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLast(FQLParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLast(FQLParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(FQLParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(FQLParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(FQLParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(FQLParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallFilter}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallFilter(FQLParser.FunctionCallFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallFilter}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallFilter(FQLParser.FunctionCallFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(FQLParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(FQLParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(FQLParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(FQLParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(FQLParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(FQLParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyExpression}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterEmptyExpression(FQLParser.EmptyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyExpression}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitEmptyExpression(FQLParser.EmptyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(FQLParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(FQLParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataTypeFieldExpression}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataTypeFieldExpression(FQLParser.ComplexDataTypeFieldExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataTypeFieldExpression}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataTypeFieldExpression(FQLParser.ComplexDataTypeFieldExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(FQLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(FQLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(FQLParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(FQLParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(FQLParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(FQLParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(FQLParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link FQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(FQLParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#complexDataTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataTypeExpression(FQLParser.ComplexDataTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#complexDataTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataTypeExpression(FQLParser.ComplexDataTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(FQLParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(FQLParser.ArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#rowExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowExpression(FQLParser.RowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#rowExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowExpression(FQLParser.RowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#mapExpression}.
	 * @param ctx the parse tree
	 */
	void enterMapExpression(FQLParser.MapExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#mapExpression}.
	 * @param ctx the parse tree
	 */
	void exitMapExpression(FQLParser.MapExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#dataTypeExpression}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeExpression(FQLParser.DataTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#dataTypeExpression}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeExpression(FQLParser.DataTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(FQLParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(FQLParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#functionParam}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParam(FQLParser.FunctionParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#functionParam}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParam(FQLParser.FunctionParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#filterClause}.
	 * @param ctx the parse tree
	 */
	void enterFilterClause(FQLParser.FilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#filterClause}.
	 * @param ctx the parse tree
	 */
	void exitFilterClause(FQLParser.FilterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#dereferenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDereferenceDefinition(FQLParser.DereferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#dereferenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDereferenceDefinition(FQLParser.DereferenceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#correlationName}.
	 * @param ctx the parse tree
	 */
	void enterCorrelationName(FQLParser.CorrelationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#correlationName}.
	 * @param ctx the parse tree
	 */
	void exitCorrelationName(FQLParser.CorrelationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(FQLParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(FQLParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#timeIntervalExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimeIntervalExpression(FQLParser.TimeIntervalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#timeIntervalExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimeIntervalExpression(FQLParser.TimeIntervalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingMultiUnitsInterval(FQLParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingMultiUnitsInterval(FQLParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterMultiUnitsInterval(FQLParser.MultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitMultiUnitsInterval(FQLParser.MultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingUnitToUnitInterval(FQLParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingUnitToUnitInterval(FQLParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterUnitToUnitInterval(FQLParser.UnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitUnitToUnitInterval(FQLParser.UnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(FQLParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(FQLParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#columnAlias}.
	 * @param ctx the parse tree
	 */
	void enterColumnAlias(FQLParser.ColumnAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#columnAlias}.
	 * @param ctx the parse tree
	 */
	void exitColumnAlias(FQLParser.ColumnAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(FQLParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(FQLParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingIdentifier(FQLParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingIdentifier(FQLParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link FQLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterErrorIdent(FQLParser.ErrorIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link FQLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitErrorIdent(FQLParser.ErrorIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link FQLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterRealIdent(FQLParser.RealIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link FQLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitRealIdent(FQLParser.RealIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(FQLParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(FQLParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(FQLParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(FQLParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifierAlternative}
	 * labeled alternative in {@link FQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifierAlternative(FQLParser.UnquotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifierAlternative}
	 * labeled alternative in {@link FQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifierAlternative(FQLParser.UnquotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link FQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(FQLParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link FQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(FQLParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonReservedKeywordsAlternative}
	 * labeled alternative in {@link FQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterNonReservedKeywordsAlternative(FQLParser.NonReservedKeywordsAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonReservedKeywordsAlternative}
	 * labeled alternative in {@link FQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitNonReservedKeywordsAlternative(FQLParser.NonReservedKeywordsAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code urefVarAlternative}
	 * labeled alternative in {@link FQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterUrefVarAlternative(FQLParser.UrefVarAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code urefVarAlternative}
	 * labeled alternative in {@link FQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitUrefVarAlternative(FQLParser.UrefVarAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#refVar}.
	 * @param ctx the parse tree
	 */
	void enterRefVar(FQLParser.RefVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#refVar}.
	 * @param ctx the parse tree
	 */
	void exitRefVar(FQLParser.RefVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#unquotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(FQLParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#unquotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(FQLParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(FQLParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(FQLParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(FQLParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(FQLParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#catalogPath}.
	 * @param ctx the parse tree
	 */
	void enterCatalogPath(FQLParser.CatalogPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#catalogPath}.
	 * @param ctx the parse tree
	 */
	void exitCatalogPath(FQLParser.CatalogPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#databasePath}.
	 * @param ctx the parse tree
	 */
	void enterDatabasePath(FQLParser.DatabasePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#databasePath}.
	 * @param ctx the parse tree
	 */
	void exitDatabasePath(FQLParser.DatabasePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#databasePathCreate}.
	 * @param ctx the parse tree
	 */
	void enterDatabasePathCreate(FQLParser.DatabasePathCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#databasePathCreate}.
	 * @param ctx the parse tree
	 */
	void exitDatabasePathCreate(FQLParser.DatabasePathCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#tablePathCreate}.
	 * @param ctx the parse tree
	 */
	void enterTablePathCreate(FQLParser.TablePathCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#tablePathCreate}.
	 * @param ctx the parse tree
	 */
	void exitTablePathCreate(FQLParser.TablePathCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#tablePath}.
	 * @param ctx the parse tree
	 */
	void enterTablePath(FQLParser.TablePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#tablePath}.
	 * @param ctx the parse tree
	 */
	void exitTablePath(FQLParser.TablePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(FQLParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(FQLParser.UidContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#withOption}.
	 * @param ctx the parse tree
	 */
	void enterWithOption(FQLParser.WithOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#withOption}.
	 * @param ctx the parse tree
	 */
	void exitWithOption(FQLParser.WithOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(FQLParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(FQLParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(FQLParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(FQLParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#tableCanHasKeyPropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTableCanHasKeyPropertyList(FQLParser.TableCanHasKeyPropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#tableCanHasKeyPropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTableCanHasKeyPropertyList(FQLParser.TableCanHasKeyPropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(FQLParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(FQLParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(FQLParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(FQLParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(FQLParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(FQLParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(FQLParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(FQLParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(FQLParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(FQLParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(FQLParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(FQLParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#timePointLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTimePointLiteral(FQLParser.TimePointLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#timePointLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTimePointLiteral(FQLParser.TimePointLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(FQLParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(FQLParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(FQLParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(FQLParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(FQLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(FQLParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(FQLParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(FQLParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#timePointUnit}.
	 * @param ctx the parse tree
	 */
	void enterTimePointUnit(FQLParser.TimePointUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#timePointUnit}.
	 * @param ctx the parse tree
	 */
	void exitTimePointUnit(FQLParser.TimePointUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#timeIntervalUnit}.
	 * @param ctx the parse tree
	 */
	void enterTimeIntervalUnit(FQLParser.TimeIntervalUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#timeIntervalUnit}.
	 * @param ctx the parse tree
	 */
	void exitTimeIntervalUnit(FQLParser.TimeIntervalUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#reservedKeywordsUsedAsFuncParam}.
	 * @param ctx the parse tree
	 */
	void enterReservedKeywordsUsedAsFuncParam(FQLParser.ReservedKeywordsUsedAsFuncParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#reservedKeywordsUsedAsFuncParam}.
	 * @param ctx the parse tree
	 */
	void exitReservedKeywordsUsedAsFuncParam(FQLParser.ReservedKeywordsUsedAsFuncParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#reservedKeywordsUsedAsFuncName}.
	 * @param ctx the parse tree
	 */
	void enterReservedKeywordsUsedAsFuncName(FQLParser.ReservedKeywordsUsedAsFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#reservedKeywordsUsedAsFuncName}.
	 * @param ctx the parse tree
	 */
	void exitReservedKeywordsUsedAsFuncName(FQLParser.ReservedKeywordsUsedAsFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#nonReservedKeywords}.
	 * @param ctx the parse tree
	 */
	void enterNonReservedKeywords(FQLParser.NonReservedKeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#nonReservedKeywords}.
	 * @param ctx the parse tree
	 */
	void exitNonReservedKeywords(FQLParser.NonReservedKeywordsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code flinkStyleProjectItem}
	 * labeled alternative in {@link FQLParser#projectItemDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFlinkStyleProjectItem(FQLParser.FlinkStyleProjectItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code flinkStyleProjectItem}
	 * labeled alternative in {@link FQLParser#projectItemDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFlinkStyleProjectItem(FQLParser.FlinkStyleProjectItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code common}
	 * labeled alternative in {@link FQLParser#projectItemDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCommon(FQLParser.CommonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code common}
	 * labeled alternative in {@link FQLParser#projectItemDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCommon(FQLParser.CommonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commonSQL}
	 * labeled alternative in {@link FQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommonSQL(FQLParser.CommonSQLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commonSQL}
	 * labeled alternative in {@link FQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommonSQL(FQLParser.CommonSQLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectWithMatchRecognize}
	 * labeled alternative in {@link FQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectWithMatchRecognize(FQLParser.SelectWithMatchRecognizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectWithMatchRecognize}
	 * labeled alternative in {@link FQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectWithMatchRecognize(FQLParser.SelectWithMatchRecognizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(FQLParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(FQLParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commonInsert}
	 * labeled alternative in {@link FQLParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommonInsert(FQLParser.CommonInsertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commonInsert}
	 * labeled alternative in {@link FQLParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommonInsert(FQLParser.CommonInsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void enterJoinOp(FQLParser.JoinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void exitJoinOp(FQLParser.JoinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void enterTableExpression(FQLParser.TableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void exitTableExpression(FQLParser.TableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(FQLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(FQLParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code flink_commn}
	 * labeled alternative in {@link FQLParser#overWindowItem}.
	 * @param ctx the parse tree
	 */
	void enterFlink_commn(FQLParser.Flink_commnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code flink_commn}
	 * labeled alternative in {@link FQLParser#overWindowItem}.
	 * @param ctx the parse tree
	 */
	void exitFlink_commn(FQLParser.Flink_commnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code flink_common2}
	 * labeled alternative in {@link FQLParser#overWindowItem}.
	 * @param ctx the parse tree
	 */
	void enterFlink_common2(FQLParser.Flink_common2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code flink_common2}
	 * labeled alternative in {@link FQLParser#overWindowItem}.
	 * @param ctx the parse tree
	 */
	void exitFlink_common2(FQLParser.Flink_common2Context ctx);
}
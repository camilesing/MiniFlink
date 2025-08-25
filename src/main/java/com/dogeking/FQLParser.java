// Generated from /Users/camile/Work/JVM/MiniFlink/src/main/resources/FQL.g4 by ANTLR 4.13.2

package com.dogeking;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, COMMENT_INPUT=2, LINE_COMMENT=3, KW_ADD=4, KW_ADMIN=5, KW_AFTER=6, 
		KW_ANALYZE=7, KW_ASC=8, KW_BEFORE=9, KW_BYTES=10, KW_CASCADE=11, KW_CATALOG=12, 
		KW_CATALOGS=13, KW_CENTURY=14, KW_CHAIN=15, KW_CHANGELOG_MODE=16, KW_CHARACTERS=17, 
		KW_COMMENT=18, KW_COMPACT=19, KW_COMPUTE=20, KW_COLUMNS=21, KW_CONSTRAINTS=22, 
		KW_CONSTRUCTOR=23, KW_CUMULATE=24, KW_DATA=25, KW_DATABASE=26, KW_DATABASES=27, 
		KW_DAYS=28, KW_DECADE=29, KW_DEFINED=30, KW_DESC=31, KW_DESCRIPTOR=32, 
		KW_DIV=33, KW_ENCODING=34, KW_ENFORCED=35, KW_ENGINE=36, KW_EPOCH=37, 
		KW_ERROR=38, KW_ESTIMATED_COST=39, KW_EXCEPTION=40, KW_EXCLUDE=41, KW_EXCLUDING=42, 
		KW_EXTENDED=43, KW_FILTER=44, KW_FILE=45, KW_FINAL=46, KW_FIRST=47, KW_FOLLOWING=48, 
		KW_FORMAT=49, KW_FORTRAN=50, KW_FOUND=51, KW_FRAC_SECOND=52, KW_FUNCTIONS=53, 
		KW_GENERAL=54, KW_GENERATED=55, KW_GAP=56, KW_GO=57, KW_GOTO=58, KW_GRANTED=59, 
		KW_HOP=60, KW_HOURS=61, KW_IF=62, KW_IGNORE=63, KW_INCREMENT=64, KW_INPUT=65, 
		KW_INVOKER=66, KW_JAR=67, KW_JARS=68, KW_JAVA=69, KW_JSON=70, KW_JOB=71, 
		KW_JOBS=72, KW_JSON_EXECUTION_PLAN=73, KW_KEY=74, KW_KEY_MEMBER=75, KW_KEY_TYPE=76, 
		KW_LABEL=77, KW_LAST=78, KW_LENGTH=79, KW_LEVEL=80, KW_LOAD=81, KW_MAP=82, 
		KW_MICROSECOND=83, KW_MILLENNIUM=84, KW_MILLISECOND=85, KW_MINUTES=86, 
		KW_MINVALUE=87, KW_MODIFY=88, KW_MODULES=89, KW_MONTHS=90, KW_NANOSECOND=91, 
		KW_NULLS=92, KW_NUMBER=93, KW_OPTION=94, KW_OPTIONS=95, KW_ORDERING=96, 
		KW_OUTPUT=97, KW_OVERWRITE=98, KW_OVERWRITING=99, KW_PARTITIONED=100, 
		KW_PARTITIONS=101, KW_PASSING=102, KW_PAST=103, KW_PATH=104, KW_PLACING=105, 
		KW_PLAN=106, KW_PLAN_ADVICE=107, KW_PRECEDING=108, KW_PRESERVE=109, KW_PRIOR=110, 
		KW_PROCEDURES=111, KW_PRIVILEGES=112, KW_PUBLIC=113, KW_PYTHON=114, KW_PYTHON_FILES=115, 
		KW_PYTHON_REQUIREMENTS=116, KW_PYTHON_DEPENDENCIES=117, KW_PYTHON_JAR=118, 
		KW_PYTHON_ARCHIVES=119, KW_PYTHON_PARAMETER=120, KW_QUARTER=121, KW_RAW=122, 
		KW_RECORDWRITER=123, KW_RECORDREADER=124, KW_READ=125, KW_RELATIVE=126, 
		KW_REMOVE=127, KW_RENAME=128, KW_REPLACE=129, KW_RESPECT=130, KW_RESTART=131, 
		KW_RESTRICT=132, KW_ROLE=133, KW_ROW_COUNT=134, KW_SCALA=135, KW_SCALAR=136, 
		KW_SCALE=137, KW_SCHEMA=138, KW_SECONDS=139, KW_SECTION=140, KW_SECURITY=141, 
		KW_SELF=142, KW_SEMI=143, KW_SERVER=144, KW_SERVER_NAME=145, KW_SESSION=146, 
		KW_SETS=147, KW_SIMPLE=148, KW_SIZE=149, KW_SLIDE=150, KW_SOURCE=151, 
		KW_SPACE=152, KW_STATE=153, KW_STATEMENT=154, KW_STATISTICS=155, KW_STEP=156, 
		KW_STOP=157, KW_STRING=158, KW_STRUCTURE=159, KW_STYLE=160, KW_TABLES=161, 
		KW_TEMPORARY=162, KW_TIMECOL=163, KW_FLOOR=164, KW_TIMESTAMP_LTZ=165, 
		KW_TIMESTAMPADD=166, KW_TIMESTAMPDIFF=167, KW_TO_TIMESTAMP=168, KW_TRANSFORM=169, 
		KW_TUMBLE=170, KW_TYPE=171, KW_UNBOUNDED=172, KW_UNDER=173, KW_UNLOAD=174, 
		KW_USAGE=175, KW_USE=176, KW_UTF16=177, KW_UTF32=178, KW_UTF8=179, KW_VERSION=180, 
		KW_VIEW=181, KW_VIEWS=182, KW_VIRTUAL=183, KW_WATERMARK=184, KW_WATERMARKS=185, 
		KW_WEEK=186, KW_WEEKS=187, KW_WORK=188, KW_WRAPPER=189, KW_YEARS=190, 
		KW_ZONE=191, KW_ABS=192, KW_ALL=193, KW_ALLOW=194, KW_ALTER=195, KW_AND=196, 
		KW_ANY=197, KW_ARE=198, KW_ARRAY=199, KW_AS=200, KW_ASYMMETRIC=201, KW_AT=202, 
		KW_AVG=203, KW_BEGIN=204, KW_BETWEEN=205, KW_BIGINT=206, KW_BINARY=207, 
		KW_BIT=208, KW_BLOB=209, KW_BOOLEAN=210, KW_BOTH=211, KW_BY=212, KW_CALL=213, 
		KW_CALLED=214, KW_CASCADED=215, KW_CASE=216, KW_CAST=217, KW_CEIL=218, 
		KW_CHAR=219, KW_CHARACTER=220, KW_CHECK=221, KW_CLOB=222, KW_CLOSE=223, 
		KW_CLUSTER=224, KW_COALESCE=225, KW_COLLATE=226, KW_COLLECT=227, KW_COLUMN=228, 
		KW_COMMIT=229, KW_CONNECT=230, KW_CONSTRAINT=231, KW_CONTAINS=232, KW_CONVERT=233, 
		KW_COUNT=234, KW_CREATE=235, KW_CROSS=236, KW_CUBE=237, KW_CUME_DIST=238, 
		KW_CURRENT=239, KW_CURSOR=240, KW_CYCLE=241, KW_DATE=242, KW_DATETIME=243, 
		KW_DAY=244, KW_DEC=245, KW_DECIMAL=246, KW_DECLARE=247, KW_DEFAULT=248, 
		KW_DEFINE=249, KW_DELIMITED=250, KW_DELETE=251, KW_DESCRIBE=252, KW_DENSE_RANK=253, 
		KW_DISTINCT=254, KW_DISTRIBUTE=255, KW_DOUBLE=256, KW_DROP=257, KW_DRAIN=258, 
		KW_EACH=259, KW_ELSE=260, KW_END=261, KW_EQUALS=262, KW_ESCAPE=263, KW_EXCEPT=264, 
		KW_EXECUTE=265, KW_EXISTS=266, KW_EXPLAIN=267, KW_EXTERNAL=268, KW_EXTRACT=269, 
		KW_FIRST_VALUE=270, KW_FALSE=271, KW_FIELDS=272, KW_FLOAT=273, KW_FOR=274, 
		KW_FROM=275, KW_FROM_UNIXTIME=276, KW_FULL=277, KW_FUNCTION=278, KW_GLOBAL=279, 
		KW_GRANT=280, KW_GROUP=281, KW_GROUPING=282, KW_GROUPS=283, KW_HAVING=284, 
		KW_HOUR=285, KW_IMPORT=286, KW_IN=287, KW_INCLUDING=288, KW_INNER=289, 
		KW_INOUT=290, KW_INSERT=291, KW_INT=292, KW_INTEGER=293, KW_INTERSECT=294, 
		KW_INTERVAL=295, KW_INTO=296, KW_IS=297, KW_JOIN=298, KW_LAG=299, KW_LANGUAGE=300, 
		KW_LATERAL=301, KW_LAST_VALUE=302, KW_LEAD=303, KW_LEADING=304, KW_LEFT=305, 
		KW_LIKE=306, KW_LINES=307, KW_LIMIT=308, KW_LOCAL=309, KW_LOCALTIMESTAMP=310, 
		KW_MATCH=311, KW_MATCH_RECOGNIZE=312, KW_MEASURES=313, KW_MERGE=314, KW_METADATA=315, 
		KW_MINUS=316, KW_MINUTE=317, KW_MODIFIES=318, KW_MODULE=319, KW_MONTH=320, 
		KW_MULTISET=321, KW_NATURAL=322, KW_NEXT=323, KW_NO=324, KW_NONE=325, 
		KW_NOT=326, KW_NTH_VALUE=327, KW_NTILE=328, KW_NULL=329, KW_NUMERIC=330, 
		KW_OF=331, KW_OFFSET=332, KW_ON=333, KW_ONE=334, KW_OR=335, KW_ORDER=336, 
		KW_OUT=337, KW_OUTER=338, KW_OVER=339, KW_OVERLAY=340, KW_PARTITION=341, 
		KW_PATTERN=342, KW_PER=343, KW_PERCENT=344, KW_PERCENT_RANK=345, KW_PERIOD=346, 
		KW_POSITION=347, KW_POWER=348, KW_PRIMARY=349, KW_RANGE=350, KW_ROW_NUMBER=351, 
		KW_RANK=352, KW_RESET=353, KW_REVOKE=354, KW_RIGHT=355, KW_RLIKE=356, 
		KW_ROLLBACK=357, KW_ROLLUP=358, KW_ROW=359, KW_ROWS=360, KW_SAVEPOINT=361, 
		KW_SECOND=362, KW_SELECT=363, KW_SET=364, KW_SHOW=365, KW_SIMILAR=366, 
		KW_SORT=367, KW_SKIP=368, KW_SMALLINT=369, KW_START=370, KW_STATIC=371, 
		KW_SUBSTRING=372, KW_SUM=373, KW_SYMMETRIC=374, KW_SYSTEM=375, KW_SYSTEM_TIME=376, 
		KW_SYSTEM_USER=377, KW_TABLE=378, KW_TABLESAMPLE=379, KW_TERMINATED=380, 
		KW_THEN=381, KW_TIME=382, KW_TIMESTAMP=383, KW_TIMESTAMP_3=384, KW_TIMESTAMP_6=385, 
		KW_TIMESTAMP_9=386, KW_TINYINT=387, KW_TO=388, KW_TRAILING=389, KW_TRUE=390, 
		KW_TRUNCATE=391, KW_UNION=392, KW_UNIQUE=393, KW_UNKNOWN=394, KW_UNNEST=395, 
		KW_UPDATE=396, KW_UPPER=397, KW_UPSERT=398, KW_USER=399, KW_USING=400, 
		KW_VALUE=401, KW_VALUES=402, KW_VARBINARY=403, KW_VARCHAR=404, KW_WHEN=405, 
		KW_WHERE=406, KW_WINDOW=407, KW_WITH=408, KW_WITHIN=409, KW_WITHOUT=410, 
		KW_YEAR=411, KW_MATERIALIZED=412, KW_FRESHNESS=413, KW_REFRESH_MODE=414, 
		KW_CONTINUOUS=415, KW_SERDE=416, KW_SERDEPROPERTIES=417, KW_SUSPEND=418, 
		KW_RESUME=419, KW_REFRESH=420, KW_DISTRIBUTED=421, KW_DISTRIBUTION=422, 
		KW_HASH=423, KW_BUCKETS=424, BIT_NOT_OP=425, BIT_OR_OP=426, BIT_AND_OP=427, 
		BIT_XOR_OP=428, EQUAL_SYMBOL=429, GREATER_SYMBOL=430, LESS_SYMBOL=431, 
		EXCLAMATION_SYMBOL=432, DOT=433, LS_BRACKET=434, RS_BRACKET=435, LR_BRACKET=436, 
		RR_BRACKET=437, LB_BRACKET=438, RB_BRACKET=439, COMMA=440, SEMICOLON=441, 
		AT_SIGN=442, DOLLAR=443, SINGLE_QUOTE_SYMB=444, DOUBLE_QUOTE_SYMB=445, 
		REVERSE_QUOTE_SYMB=446, COLON_SYMB=447, ASTERISK_SIGN=448, UNDERLINE_SIGN=449, 
		HYPNEN_SIGN=450, ADD_SIGN=451, PENCENT_SIGN=452, DOUBLE_VERTICAL_SIGN=453, 
		DOUBLE_HYPNEN_SIGN=454, SLASH_SIGN=455, QUESTION_MARK_SIGN=456, DOUBLE_RIGHT_ARROW=457, 
		STRING_LITERAL=458, DIG_LITERAL=459, REAL_LITERAL=460, ID_LITERAL=461;
	public static final int
		RULE_statements = 0, RULE_sqlStatements = 1, RULE_sqlStatement = 2, RULE_emptyStatement = 3, 
		RULE_ddlStatement = 4, RULE_createStatement = 5, RULE_dmlStatement = 6, 
		RULE_simpleCreateTable = 7, RULE_insertSimpleStatement = 8, RULE_insertPartitionDefinition = 9, 
		RULE_queryStatement = 10, RULE_valuesCaluse = 11, RULE_withItem = 12, 
		RULE_withItemName = 13, RULE_groupByClause = 14, RULE_fromClause = 15, 
		RULE_tableReference = 16, RULE_flinkJoinOp = 17, RULE_tablePrimary = 18, 
		RULE_timePeriod = 19, RULE_dateTimeExpression = 20, RULE_inlineDataValueClause = 21, 
		RULE_windowTVFClause = 22, RULE_windowTVFExpression = 23, RULE_tumableExpression = 24, 
		RULE_hopExpression = 25, RULE_cumulateExpression = 26, RULE_sessionExpression = 27, 
		RULE_windowTVFName = 28, RULE_windowTVFParam = 29, RULE_timeIntervalParamName = 30, 
		RULE_columnDescriptor = 31, RULE_joinCondition = 32, RULE_whereClause = 33, 
		RULE_groupItemDefinition = 34, RULE_groupingSet = 35, RULE_groupingSets = 36, 
		RULE_groupingSetsNotionName = 37, RULE_groupWindowFunction = 38, RULE_groupWindowFunctionName = 39, 
		RULE_timeAttrColumn = 40, RULE_havingClause = 41, RULE_windowClause = 42, 
		RULE_namedWindow = 43, RULE_windowSpec = 44, RULE_matchRecognizeClause = 45, 
		RULE_orderByCaluse = 46, RULE_orderItemDefinition = 47, RULE_limitClause = 48, 
		RULE_partitionByClause = 49, RULE_quantifiers = 50, RULE_measuresClause = 51, 
		RULE_patternDefinition = 52, RULE_patternVariable = 53, RULE_outputMode = 54, 
		RULE_afterMatchStrategy = 55, RULE_patternVariablesDefinition = 56, RULE_windowFrame = 57, 
		RULE_frameBound = 58, RULE_withinClause = 59, RULE_analyzePartitionDefinition = 60, 
		RULE_selfDefinitionClause = 61, RULE_partitionDefinition = 62, RULE_transformList = 63, 
		RULE_transform = 64, RULE_transformArgument = 65, RULE_likeDefinition = 66, 
		RULE_distributed = 67, RULE_distribution = 68, RULE_likeOption = 69, RULE_columnOptionDefinition = 70, 
		RULE_physicalColumnDefinition = 71, RULE_computedColumnExpression = 72, 
		RULE_watermarkDefinition = 73, RULE_tableConstraint = 74, RULE_constraintName = 75, 
		RULE_valuesDefinition = 76, RULE_valuesRowDefinition = 77, RULE_lengthOneDimension = 78, 
		RULE_lengthTwoOptionalDimension = 79, RULE_lengthTwoStringDimension = 80, 
		RULE_lengthOneTypeDimension = 81, RULE_mapTypeDimension = 82, RULE_rowTypeDimension = 83, 
		RULE_columnConstraint = 84, RULE_commentSpec = 85, RULE_metadataColumnDefinition = 86, 
		RULE_metadataKey = 87, RULE_computedColumnDefinition = 88, RULE_columnName = 89, 
		RULE_columnNameList = 90, RULE_columnType = 91, RULE_expression = 92, 
		RULE_booleanExpression = 93, RULE_predicate = 94, RULE_likePredicate = 95, 
		RULE_valueExpression = 96, RULE_primaryExpression = 97, RULE_complexDataTypeExpression = 98, 
		RULE_arrayExpression = 99, RULE_rowExpression = 100, RULE_mapExpression = 101, 
		RULE_dataTypeExpression = 102, RULE_functionName = 103, RULE_functionParam = 104, 
		RULE_filterClause = 105, RULE_dereferenceDefinition = 106, RULE_correlationName = 107, 
		RULE_qualifiedName = 108, RULE_timeIntervalExpression = 109, RULE_errorCapturingMultiUnitsInterval = 110, 
		RULE_multiUnitsInterval = 111, RULE_errorCapturingUnitToUnitInterval = 112, 
		RULE_unitToUnitInterval = 113, RULE_intervalValue = 114, RULE_columnAlias = 115, 
		RULE_tableAlias = 116, RULE_errorCapturingIdentifier = 117, RULE_errorCapturingIdentifierExtra = 118, 
		RULE_identifierList = 119, RULE_identifierSeq = 120, RULE_identifier = 121, 
		RULE_refVar = 122, RULE_unquotedIdentifier = 123, RULE_quotedIdentifier = 124, 
		RULE_whenClause = 125, RULE_catalogPath = 126, RULE_databasePath = 127, 
		RULE_databasePathCreate = 128, RULE_tablePathCreate = 129, RULE_tablePath = 130, 
		RULE_uid = 131, RULE_withOption = 132, RULE_ifNotExists = 133, RULE_ifExists = 134, 
		RULE_tableCanHasKeyPropertyList = 135, RULE_tablePropertyList = 136, RULE_tableProperty = 137, 
		RULE_tablePropertyKey = 138, RULE_tablePropertyValue = 139, RULE_comparisonOperator = 140, 
		RULE_constant = 141, RULE_timePointLiteral = 142, RULE_stringLiteral = 143, 
		RULE_decimalLiteral = 144, RULE_booleanLiteral = 145, RULE_setQuantifier = 146, 
		RULE_timePointUnit = 147, RULE_timeIntervalUnit = 148, RULE_reservedKeywordsUsedAsFuncParam = 149, 
		RULE_reservedKeywordsUsedAsFuncName = 150, RULE_nonReservedKeywords = 151, 
		RULE_projectItemDefinition = 152, RULE_selectStatement = 153, RULE_selectClause = 154, 
		RULE_insertStatement = 155, RULE_joinOp = 156, RULE_tableExpression = 157, 
		RULE_createTable = 158, RULE_overWindowItem = 159;
	private static String[] makeRuleNames() {
		return new String[] {
			"statements", "sqlStatements", "sqlStatement", "emptyStatement", "ddlStatement", 
			"createStatement", "dmlStatement", "simpleCreateTable", "insertSimpleStatement", 
			"insertPartitionDefinition", "queryStatement", "valuesCaluse", "withItem", 
			"withItemName", "groupByClause", "fromClause", "tableReference", "flinkJoinOp", 
			"tablePrimary", "timePeriod", "dateTimeExpression", "inlineDataValueClause", 
			"windowTVFClause", "windowTVFExpression", "tumableExpression", "hopExpression", 
			"cumulateExpression", "sessionExpression", "windowTVFName", "windowTVFParam", 
			"timeIntervalParamName", "columnDescriptor", "joinCondition", "whereClause", 
			"groupItemDefinition", "groupingSet", "groupingSets", "groupingSetsNotionName", 
			"groupWindowFunction", "groupWindowFunctionName", "timeAttrColumn", "havingClause", 
			"windowClause", "namedWindow", "windowSpec", "matchRecognizeClause", 
			"orderByCaluse", "orderItemDefinition", "limitClause", "partitionByClause", 
			"quantifiers", "measuresClause", "patternDefinition", "patternVariable", 
			"outputMode", "afterMatchStrategy", "patternVariablesDefinition", "windowFrame", 
			"frameBound", "withinClause", "analyzePartitionDefinition", "selfDefinitionClause", 
			"partitionDefinition", "transformList", "transform", "transformArgument", 
			"likeDefinition", "distributed", "distribution", "likeOption", "columnOptionDefinition", 
			"physicalColumnDefinition", "computedColumnExpression", "watermarkDefinition", 
			"tableConstraint", "constraintName", "valuesDefinition", "valuesRowDefinition", 
			"lengthOneDimension", "lengthTwoOptionalDimension", "lengthTwoStringDimension", 
			"lengthOneTypeDimension", "mapTypeDimension", "rowTypeDimension", "columnConstraint", 
			"commentSpec", "metadataColumnDefinition", "metadataKey", "computedColumnDefinition", 
			"columnName", "columnNameList", "columnType", "expression", "booleanExpression", 
			"predicate", "likePredicate", "valueExpression", "primaryExpression", 
			"complexDataTypeExpression", "arrayExpression", "rowExpression", "mapExpression", 
			"dataTypeExpression", "functionName", "functionParam", "filterClause", 
			"dereferenceDefinition", "correlationName", "qualifiedName", "timeIntervalExpression", 
			"errorCapturingMultiUnitsInterval", "multiUnitsInterval", "errorCapturingUnitToUnitInterval", 
			"unitToUnitInterval", "intervalValue", "columnAlias", "tableAlias", "errorCapturingIdentifier", 
			"errorCapturingIdentifierExtra", "identifierList", "identifierSeq", "identifier", 
			"refVar", "unquotedIdentifier", "quotedIdentifier", "whenClause", "catalogPath", 
			"databasePath", "databasePathCreate", "tablePathCreate", "tablePath", 
			"uid", "withOption", "ifNotExists", "ifExists", "tableCanHasKeyPropertyList", 
			"tablePropertyList", "tableProperty", "tablePropertyKey", "tablePropertyValue", 
			"comparisonOperator", "constant", "timePointLiteral", "stringLiteral", 
			"decimalLiteral", "booleanLiteral", "setQuantifier", "timePointUnit", 
			"timeIntervalUnit", "reservedKeywordsUsedAsFuncParam", "reservedKeywordsUsedAsFuncName", 
			"nonReservedKeywords", "projectItemDefinition", "selectStatement", "selectClause", 
			"insertStatement", "joinOp", "tableExpression", "createTable", "overWindowItem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'~'", "'|'", "'&'", "'^'", "'='", "'>'", 
			"'<'", "'!'", "'.'", "'['", "']'", "'('", "')'", "'{'", "'}'", "','", 
			"';'", "'@'", "'$'", "'''", "'\"'", "'`'", "':'", "'*'", "'_'", "'-'", 
			"'+'", "'%'", null, null, "'/'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "COMMENT_INPUT", "LINE_COMMENT", "KW_ADD", "KW_ADMIN", 
			"KW_AFTER", "KW_ANALYZE", "KW_ASC", "KW_BEFORE", "KW_BYTES", "KW_CASCADE", 
			"KW_CATALOG", "KW_CATALOGS", "KW_CENTURY", "KW_CHAIN", "KW_CHANGELOG_MODE", 
			"KW_CHARACTERS", "KW_COMMENT", "KW_COMPACT", "KW_COMPUTE", "KW_COLUMNS", 
			"KW_CONSTRAINTS", "KW_CONSTRUCTOR", "KW_CUMULATE", "KW_DATA", "KW_DATABASE", 
			"KW_DATABASES", "KW_DAYS", "KW_DECADE", "KW_DEFINED", "KW_DESC", "KW_DESCRIPTOR", 
			"KW_DIV", "KW_ENCODING", "KW_ENFORCED", "KW_ENGINE", "KW_EPOCH", "KW_ERROR", 
			"KW_ESTIMATED_COST", "KW_EXCEPTION", "KW_EXCLUDE", "KW_EXCLUDING", "KW_EXTENDED", 
			"KW_FILTER", "KW_FILE", "KW_FINAL", "KW_FIRST", "KW_FOLLOWING", "KW_FORMAT", 
			"KW_FORTRAN", "KW_FOUND", "KW_FRAC_SECOND", "KW_FUNCTIONS", "KW_GENERAL", 
			"KW_GENERATED", "KW_GAP", "KW_GO", "KW_GOTO", "KW_GRANTED", "KW_HOP", 
			"KW_HOURS", "KW_IF", "KW_IGNORE", "KW_INCREMENT", "KW_INPUT", "KW_INVOKER", 
			"KW_JAR", "KW_JARS", "KW_JAVA", "KW_JSON", "KW_JOB", "KW_JOBS", "KW_JSON_EXECUTION_PLAN", 
			"KW_KEY", "KW_KEY_MEMBER", "KW_KEY_TYPE", "KW_LABEL", "KW_LAST", "KW_LENGTH", 
			"KW_LEVEL", "KW_LOAD", "KW_MAP", "KW_MICROSECOND", "KW_MILLENNIUM", "KW_MILLISECOND", 
			"KW_MINUTES", "KW_MINVALUE", "KW_MODIFY", "KW_MODULES", "KW_MONTHS", 
			"KW_NANOSECOND", "KW_NULLS", "KW_NUMBER", "KW_OPTION", "KW_OPTIONS", 
			"KW_ORDERING", "KW_OUTPUT", "KW_OVERWRITE", "KW_OVERWRITING", "KW_PARTITIONED", 
			"KW_PARTITIONS", "KW_PASSING", "KW_PAST", "KW_PATH", "KW_PLACING", "KW_PLAN", 
			"KW_PLAN_ADVICE", "KW_PRECEDING", "KW_PRESERVE", "KW_PRIOR", "KW_PROCEDURES", 
			"KW_PRIVILEGES", "KW_PUBLIC", "KW_PYTHON", "KW_PYTHON_FILES", "KW_PYTHON_REQUIREMENTS", 
			"KW_PYTHON_DEPENDENCIES", "KW_PYTHON_JAR", "KW_PYTHON_ARCHIVES", "KW_PYTHON_PARAMETER", 
			"KW_QUARTER", "KW_RAW", "KW_RECORDWRITER", "KW_RECORDREADER", "KW_READ", 
			"KW_RELATIVE", "KW_REMOVE", "KW_RENAME", "KW_REPLACE", "KW_RESPECT", 
			"KW_RESTART", "KW_RESTRICT", "KW_ROLE", "KW_ROW_COUNT", "KW_SCALA", "KW_SCALAR", 
			"KW_SCALE", "KW_SCHEMA", "KW_SECONDS", "KW_SECTION", "KW_SECURITY", "KW_SELF", 
			"KW_SEMI", "KW_SERVER", "KW_SERVER_NAME", "KW_SESSION", "KW_SETS", "KW_SIMPLE", 
			"KW_SIZE", "KW_SLIDE", "KW_SOURCE", "KW_SPACE", "KW_STATE", "KW_STATEMENT", 
			"KW_STATISTICS", "KW_STEP", "KW_STOP", "KW_STRING", "KW_STRUCTURE", "KW_STYLE", 
			"KW_TABLES", "KW_TEMPORARY", "KW_TIMECOL", "KW_FLOOR", "KW_TIMESTAMP_LTZ", 
			"KW_TIMESTAMPADD", "KW_TIMESTAMPDIFF", "KW_TO_TIMESTAMP", "KW_TRANSFORM", 
			"KW_TUMBLE", "KW_TYPE", "KW_UNBOUNDED", "KW_UNDER", "KW_UNLOAD", "KW_USAGE", 
			"KW_USE", "KW_UTF16", "KW_UTF32", "KW_UTF8", "KW_VERSION", "KW_VIEW", 
			"KW_VIEWS", "KW_VIRTUAL", "KW_WATERMARK", "KW_WATERMARKS", "KW_WEEK", 
			"KW_WEEKS", "KW_WORK", "KW_WRAPPER", "KW_YEARS", "KW_ZONE", "KW_ABS", 
			"KW_ALL", "KW_ALLOW", "KW_ALTER", "KW_AND", "KW_ANY", "KW_ARE", "KW_ARRAY", 
			"KW_AS", "KW_ASYMMETRIC", "KW_AT", "KW_AVG", "KW_BEGIN", "KW_BETWEEN", 
			"KW_BIGINT", "KW_BINARY", "KW_BIT", "KW_BLOB", "KW_BOOLEAN", "KW_BOTH", 
			"KW_BY", "KW_CALL", "KW_CALLED", "KW_CASCADED", "KW_CASE", "KW_CAST", 
			"KW_CEIL", "KW_CHAR", "KW_CHARACTER", "KW_CHECK", "KW_CLOB", "KW_CLOSE", 
			"KW_CLUSTER", "KW_COALESCE", "KW_COLLATE", "KW_COLLECT", "KW_COLUMN", 
			"KW_COMMIT", "KW_CONNECT", "KW_CONSTRAINT", "KW_CONTAINS", "KW_CONVERT", 
			"KW_COUNT", "KW_CREATE", "KW_CROSS", "KW_CUBE", "KW_CUME_DIST", "KW_CURRENT", 
			"KW_CURSOR", "KW_CYCLE", "KW_DATE", "KW_DATETIME", "KW_DAY", "KW_DEC", 
			"KW_DECIMAL", "KW_DECLARE", "KW_DEFAULT", "KW_DEFINE", "KW_DELIMITED", 
			"KW_DELETE", "KW_DESCRIBE", "KW_DENSE_RANK", "KW_DISTINCT", "KW_DISTRIBUTE", 
			"KW_DOUBLE", "KW_DROP", "KW_DRAIN", "KW_EACH", "KW_ELSE", "KW_END", "KW_EQUALS", 
			"KW_ESCAPE", "KW_EXCEPT", "KW_EXECUTE", "KW_EXISTS", "KW_EXPLAIN", "KW_EXTERNAL", 
			"KW_EXTRACT", "KW_FIRST_VALUE", "KW_FALSE", "KW_FIELDS", "KW_FLOAT", 
			"KW_FOR", "KW_FROM", "KW_FROM_UNIXTIME", "KW_FULL", "KW_FUNCTION", "KW_GLOBAL", 
			"KW_GRANT", "KW_GROUP", "KW_GROUPING", "KW_GROUPS", "KW_HAVING", "KW_HOUR", 
			"KW_IMPORT", "KW_IN", "KW_INCLUDING", "KW_INNER", "KW_INOUT", "KW_INSERT", 
			"KW_INT", "KW_INTEGER", "KW_INTERSECT", "KW_INTERVAL", "KW_INTO", "KW_IS", 
			"KW_JOIN", "KW_LAG", "KW_LANGUAGE", "KW_LATERAL", "KW_LAST_VALUE", "KW_LEAD", 
			"KW_LEADING", "KW_LEFT", "KW_LIKE", "KW_LINES", "KW_LIMIT", "KW_LOCAL", 
			"KW_LOCALTIMESTAMP", "KW_MATCH", "KW_MATCH_RECOGNIZE", "KW_MEASURES", 
			"KW_MERGE", "KW_METADATA", "KW_MINUS", "KW_MINUTE", "KW_MODIFIES", "KW_MODULE", 
			"KW_MONTH", "KW_MULTISET", "KW_NATURAL", "KW_NEXT", "KW_NO", "KW_NONE", 
			"KW_NOT", "KW_NTH_VALUE", "KW_NTILE", "KW_NULL", "KW_NUMERIC", "KW_OF", 
			"KW_OFFSET", "KW_ON", "KW_ONE", "KW_OR", "KW_ORDER", "KW_OUT", "KW_OUTER", 
			"KW_OVER", "KW_OVERLAY", "KW_PARTITION", "KW_PATTERN", "KW_PER", "KW_PERCENT", 
			"KW_PERCENT_RANK", "KW_PERIOD", "KW_POSITION", "KW_POWER", "KW_PRIMARY", 
			"KW_RANGE", "KW_ROW_NUMBER", "KW_RANK", "KW_RESET", "KW_REVOKE", "KW_RIGHT", 
			"KW_RLIKE", "KW_ROLLBACK", "KW_ROLLUP", "KW_ROW", "KW_ROWS", "KW_SAVEPOINT", 
			"KW_SECOND", "KW_SELECT", "KW_SET", "KW_SHOW", "KW_SIMILAR", "KW_SORT", 
			"KW_SKIP", "KW_SMALLINT", "KW_START", "KW_STATIC", "KW_SUBSTRING", "KW_SUM", 
			"KW_SYMMETRIC", "KW_SYSTEM", "KW_SYSTEM_TIME", "KW_SYSTEM_USER", "KW_TABLE", 
			"KW_TABLESAMPLE", "KW_TERMINATED", "KW_THEN", "KW_TIME", "KW_TIMESTAMP", 
			"KW_TIMESTAMP_3", "KW_TIMESTAMP_6", "KW_TIMESTAMP_9", "KW_TINYINT", "KW_TO", 
			"KW_TRAILING", "KW_TRUE", "KW_TRUNCATE", "KW_UNION", "KW_UNIQUE", "KW_UNKNOWN", 
			"KW_UNNEST", "KW_UPDATE", "KW_UPPER", "KW_UPSERT", "KW_USER", "KW_USING", 
			"KW_VALUE", "KW_VALUES", "KW_VARBINARY", "KW_VARCHAR", "KW_WHEN", "KW_WHERE", 
			"KW_WINDOW", "KW_WITH", "KW_WITHIN", "KW_WITHOUT", "KW_YEAR", "KW_MATERIALIZED", 
			"KW_FRESHNESS", "KW_REFRESH_MODE", "KW_CONTINUOUS", "KW_SERDE", "KW_SERDEPROPERTIES", 
			"KW_SUSPEND", "KW_RESUME", "KW_REFRESH", "KW_DISTRIBUTED", "KW_DISTRIBUTION", 
			"KW_HASH", "KW_BUCKETS", "BIT_NOT_OP", "BIT_OR_OP", "BIT_AND_OP", "BIT_XOR_OP", 
			"EQUAL_SYMBOL", "GREATER_SYMBOL", "LESS_SYMBOL", "EXCLAMATION_SYMBOL", 
			"DOT", "LS_BRACKET", "RS_BRACKET", "LR_BRACKET", "RR_BRACKET", "LB_BRACKET", 
			"RB_BRACKET", "COMMA", "SEMICOLON", "AT_SIGN", "DOLLAR", "SINGLE_QUOTE_SYMB", 
			"DOUBLE_QUOTE_SYMB", "REVERSE_QUOTE_SYMB", "COLON_SYMB", "ASTERISK_SIGN", 
			"UNDERLINE_SIGN", "HYPNEN_SIGN", "ADD_SIGN", "PENCENT_SIGN", "DOUBLE_VERTICAL_SIGN", 
			"DOUBLE_HYPNEN_SIGN", "SLASH_SIGN", "QUESTION_MARK_SIGN", "DOUBLE_RIGHT_ARROW", 
			"STRING_LITERAL", "DIG_LITERAL", "REAL_LITERAL", "ID_LITERAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public SqlStatementsContext sqlStatements() {
			return getRuleContext(SqlStatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FQLParser.EOF, 0); }
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			sqlStatements();
			setState(321);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SqlStatementsContext extends ParserRuleContext {
		public List<SqlStatementContext> sqlStatement() {
			return getRuleContexts(SqlStatementContext.class);
		}
		public SqlStatementContext sqlStatement(int i) {
			return getRuleContext(SqlStatementContext.class,i);
		}
		public List<EmptyStatementContext> emptyStatement() {
			return getRuleContexts(EmptyStatementContext.class);
		}
		public EmptyStatementContext emptyStatement(int i) {
			return getRuleContext(EmptyStatementContext.class,i);
		}
		public SqlStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSqlStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSqlStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSqlStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementsContext sqlStatements() throws RecognitionException {
		SqlStatementsContext _localctx = new SqlStatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sqlStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 235)) & ~0x3f) == 0 && ((1L << (_la - 235)) & 72057595111669761L) != 0) || _la==KW_SELECT || _la==SEMICOLON) {
				{
				setState(325);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_CREATE:
				case KW_EXECUTE:
				case KW_INSERT:
				case KW_SELECT:
					{
					setState(323);
					sqlStatement();
					}
					break;
				case SEMICOLON:
					{
					setState(324);
					emptyStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SqlStatementContext extends ParserRuleContext {
		public SqlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatement; }
	 
		public SqlStatementContext() { }
		public void copyFrom(SqlStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DmlPartContext extends SqlStatementContext {
		public DmlStatementContext dmlStatement() {
			return getRuleContext(DmlStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FQLParser.SEMICOLON, 0); }
		public DmlPartContext(SqlStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterDmlPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitDmlPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitDmlPart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DdlPartContext extends SqlStatementContext {
		public DdlStatementContext ddlStatement() {
			return getRuleContext(DdlStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FQLParser.SEMICOLON, 0); }
		public DdlPartContext(SqlStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterDdlPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitDdlPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitDdlPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementContext sqlStatement() throws RecognitionException {
		SqlStatementContext _localctx = new SqlStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sqlStatement);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CREATE:
				_localctx = new DdlPartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				ddlStatement();
				setState(331);
				match(SEMICOLON);
				}
				break;
			case KW_EXECUTE:
			case KW_INSERT:
			case KW_SELECT:
				_localctx = new DmlPartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				dmlStatement();
				setState(334);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(FQLParser.SEMICOLON, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DdlStatementContext extends ParserRuleContext {
		public CreateStatementContext createStatement() {
			return getRuleContext(CreateStatementContext.class,0);
		}
		public DdlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterDdlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitDdlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitDdlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdlStatementContext ddlStatement() throws RecognitionException {
		DdlStatementContext _localctx = new DdlStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ddlStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			createStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateStatementContext extends ParserRuleContext {
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public CreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterCreateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitCreateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitCreateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStatementContext createStatement() throws RecognitionException {
		CreateStatementContext _localctx = new CreateStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			createTable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DmlStatementContext extends ParserRuleContext {
		public QueryStatementContext queryStatement() {
			return getRuleContext(QueryStatementContext.class,0);
		}
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public DmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementContext dmlStatement() throws RecognitionException {
		DmlStatementContext _localctx = new DmlStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dmlStatement);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				queryStatement(0);
				}
				break;
			case KW_EXECUTE:
			case KW_INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				insertStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCreateTableContext extends ParserRuleContext {
		public TerminalNode KW_CREATE() { return getToken(FQLParser.KW_CREATE, 0); }
		public TerminalNode KW_TABLE() { return getToken(FQLParser.KW_TABLE, 0); }
		public TablePathCreateContext tablePathCreate() {
			return getRuleContext(TablePathCreateContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public List<ColumnOptionDefinitionContext> columnOptionDefinition() {
			return getRuleContexts(ColumnOptionDefinitionContext.class);
		}
		public ColumnOptionDefinitionContext columnOptionDefinition(int i) {
			return getRuleContext(ColumnOptionDefinitionContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public TerminalNode KW_TEMPORARY() { return getToken(FQLParser.KW_TEMPORARY, 0); }
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public WatermarkDefinitionContext watermarkDefinition() {
			return getRuleContext(WatermarkDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public SelfDefinitionClauseContext selfDefinitionClause() {
			return getRuleContext(SelfDefinitionClauseContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public PartitionDefinitionContext partitionDefinition() {
			return getRuleContext(PartitionDefinitionContext.class,0);
		}
		public WithOptionContext withOption() {
			return getRuleContext(WithOptionContext.class,0);
		}
		public LikeDefinitionContext likeDefinition() {
			return getRuleContext(LikeDefinitionContext.class,0);
		}
		public DistributedContext distributed() {
			return getRuleContext(DistributedContext.class,0);
		}
		public SimpleCreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCreateTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSimpleCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSimpleCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSimpleCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCreateTableContext simpleCreateTable() throws RecognitionException {
		SimpleCreateTableContext _localctx = new SimpleCreateTableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpleCreateTable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(KW_CREATE);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_TEMPORARY) {
				{
				setState(349);
				match(KW_TEMPORARY);
				}
			}

			setState(352);
			match(KW_TABLE);
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(353);
				ifNotExists();
				}
				break;
			}
			setState(356);
			tablePathCreate();
			setState(357);
			match(LR_BRACKET);
			setState(358);
			columnOptionDefinition();
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(359);
					match(COMMA);
					setState(360);
					columnOptionDefinition();
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(366);
				match(COMMA);
				setState(367);
				watermarkDefinition();
				}
				break;
			}
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(370);
				match(COMMA);
				setState(371);
				tableConstraint();
				}
				break;
			}
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(374);
				match(COMMA);
				setState(375);
				selfDefinitionClause();
				}
			}

			setState(378);
			match(RR_BRACKET);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(379);
				commentSpec();
				}
			}

			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PARTITIONED) {
				{
				setState(382);
				partitionDefinition();
				}
			}

			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WITH) {
				{
				setState(385);
				withOption();
				}
			}

			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_LIKE) {
				{
				setState(388);
				likeDefinition();
				}
			}

			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DISTRIBUTED) {
				{
				setState(391);
				distributed();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertSimpleStatementContext extends ParserRuleContext {
		public TerminalNode KW_INSERT() { return getToken(FQLParser.KW_INSERT, 0); }
		public TablePathContext tablePath() {
			return getRuleContext(TablePathContext.class,0);
		}
		public TerminalNode KW_INTO() { return getToken(FQLParser.KW_INTO, 0); }
		public TerminalNode KW_OVERWRITE() { return getToken(FQLParser.KW_OVERWRITE, 0); }
		public QueryStatementContext queryStatement() {
			return getRuleContext(QueryStatementContext.class,0);
		}
		public ValuesDefinitionContext valuesDefinition() {
			return getRuleContext(ValuesDefinitionContext.class,0);
		}
		public TerminalNode KW_TABLE() { return getToken(FQLParser.KW_TABLE, 0); }
		public InsertPartitionDefinitionContext insertPartitionDefinition() {
			return getRuleContext(InsertPartitionDefinitionContext.class,0);
		}
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public InsertSimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSimpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInsertSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInsertSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInsertSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertSimpleStatementContext insertSimpleStatement() throws RecognitionException {
		InsertSimpleStatementContext _localctx = new InsertSimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insertSimpleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(KW_INSERT);
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_INTO:
				{
				setState(395);
				match(KW_INTO);
				}
				break;
			case KW_OVERWRITE:
				{
				setState(396);
				match(KW_OVERWRITE);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_TABLE) {
					{
					setState(397);
					match(KW_TABLE);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(402);
			tablePath();
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ADD:
			case KW_ADMIN:
			case KW_AFTER:
			case KW_ANALYZE:
			case KW_ASC:
			case KW_BEFORE:
			case KW_BYTES:
			case KW_CASCADE:
			case KW_CATALOG:
			case KW_CATALOGS:
			case KW_CENTURY:
			case KW_CHAIN:
			case KW_CHANGELOG_MODE:
			case KW_CHARACTERS:
			case KW_COMMENT:
			case KW_COMPACT:
			case KW_COLUMNS:
			case KW_CONSTRAINTS:
			case KW_CONSTRUCTOR:
			case KW_CUMULATE:
			case KW_DATA:
			case KW_DATABASE:
			case KW_DATABASES:
			case KW_DAYS:
			case KW_DECADE:
			case KW_DEFINED:
			case KW_DESC:
			case KW_DESCRIPTOR:
			case KW_DIV:
			case KW_ENCODING:
			case KW_ENFORCED:
			case KW_ENGINE:
			case KW_ERROR:
			case KW_ESTIMATED_COST:
			case KW_EXCEPTION:
			case KW_EXCLUDE:
			case KW_EXCLUDING:
			case KW_EXTENDED:
			case KW_FILE:
			case KW_FINAL:
			case KW_FIRST:
			case KW_FOLLOWING:
			case KW_FORMAT:
			case KW_FORTRAN:
			case KW_FOUND:
			case KW_FRAC_SECOND:
			case KW_FUNCTIONS:
			case KW_GENERAL:
			case KW_GENERATED:
			case KW_GO:
			case KW_GOTO:
			case KW_GRANTED:
			case KW_HOP:
			case KW_HOURS:
			case KW_IF:
			case KW_IGNORE:
			case KW_INCREMENT:
			case KW_INPUT:
			case KW_INVOKER:
			case KW_JAR:
			case KW_JARS:
			case KW_JAVA:
			case KW_JSON:
			case KW_JSON_EXECUTION_PLAN:
			case KW_KEY:
			case KW_KEY_MEMBER:
			case KW_KEY_TYPE:
			case KW_LABEL:
			case KW_LAST:
			case KW_LENGTH:
			case KW_LEVEL:
			case KW_LOAD:
			case KW_MAP:
			case KW_MICROSECOND:
			case KW_MILLENNIUM:
			case KW_MILLISECOND:
			case KW_MINUTES:
			case KW_MINVALUE:
			case KW_MODIFY:
			case KW_MODULES:
			case KW_MONTHS:
			case KW_NANOSECOND:
			case KW_NULLS:
			case KW_NUMBER:
			case KW_OPTION:
			case KW_OPTIONS:
			case KW_ORDERING:
			case KW_OUTPUT:
			case KW_OVERWRITE:
			case KW_OVERWRITING:
			case KW_PARTITIONED:
			case KW_PARTITIONS:
			case KW_PASSING:
			case KW_PAST:
			case KW_PATH:
			case KW_PLACING:
			case KW_PLAN:
			case KW_PRECEDING:
			case KW_PRESERVE:
			case KW_PRIOR:
			case KW_PRIVILEGES:
			case KW_PUBLIC:
			case KW_PYTHON:
			case KW_PYTHON_FILES:
			case KW_PYTHON_REQUIREMENTS:
			case KW_PYTHON_DEPENDENCIES:
			case KW_PYTHON_JAR:
			case KW_PYTHON_ARCHIVES:
			case KW_PYTHON_PARAMETER:
			case KW_QUARTER:
			case KW_RAW:
			case KW_READ:
			case KW_RELATIVE:
			case KW_REMOVE:
			case KW_RENAME:
			case KW_REPLACE:
			case KW_RESPECT:
			case KW_RESTART:
			case KW_RESTRICT:
			case KW_ROLE:
			case KW_ROW_COUNT:
			case KW_SCALA:
			case KW_SCALAR:
			case KW_SCALE:
			case KW_SCHEMA:
			case KW_SECONDS:
			case KW_SECTION:
			case KW_SECURITY:
			case KW_SELF:
			case KW_SERVER:
			case KW_SERVER_NAME:
			case KW_SESSION:
			case KW_SETS:
			case KW_SIMPLE:
			case KW_SIZE:
			case KW_SLIDE:
			case KW_SOURCE:
			case KW_SPACE:
			case KW_STATE:
			case KW_STATEMENT:
			case KW_STEP:
			case KW_STRING:
			case KW_STRUCTURE:
			case KW_STYLE:
			case KW_TABLES:
			case KW_TEMPORARY:
			case KW_TIMECOL:
			case KW_FLOOR:
			case KW_TIMESTAMP_LTZ:
			case KW_TIMESTAMPADD:
			case KW_TIMESTAMPDIFF:
			case KW_TO_TIMESTAMP:
			case KW_TRANSFORM:
			case KW_TUMBLE:
			case KW_TYPE:
			case KW_UNDER:
			case KW_UNLOAD:
			case KW_USAGE:
			case KW_USE:
			case KW_UTF16:
			case KW_UTF32:
			case KW_UTF8:
			case KW_VERSION:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_VIRTUAL:
			case KW_WATERMARK:
			case KW_WATERMARKS:
			case KW_WEEK:
			case KW_WORK:
			case KW_WRAPPER:
			case KW_YEARS:
			case KW_ZONE:
			case KW_ABS:
			case KW_ARRAY:
			case KW_AVG:
			case KW_CASE:
			case KW_CAST:
			case KW_CEIL:
			case KW_COALESCE:
			case KW_COLLECT:
			case KW_COUNT:
			case KW_DATE:
			case KW_DAY:
			case KW_EXISTS:
			case KW_FIRST_VALUE:
			case KW_FALSE:
			case KW_FROM_UNIXTIME:
			case KW_GROUPING:
			case KW_HOUR:
			case KW_INTERVAL:
			case KW_LAG:
			case KW_LAST_VALUE:
			case KW_LEAD:
			case KW_LEFT:
			case KW_LOCALTIMESTAMP:
			case KW_MINUTE:
			case KW_MONTH:
			case KW_NOT:
			case KW_NTILE:
			case KW_NULL:
			case KW_OVERLAY:
			case KW_PARTITION:
			case KW_PERCENT_RANK:
			case KW_POSITION:
			case KW_POWER:
			case KW_ROW_NUMBER:
			case KW_RANK:
			case KW_RIGHT:
			case KW_ROW:
			case KW_SECOND:
			case KW_SELECT:
			case KW_SUBSTRING:
			case KW_SUM:
			case KW_TIME:
			case KW_TIMESTAMP:
			case KW_TIMESTAMP_3:
			case KW_TIMESTAMP_6:
			case KW_TIMESTAMP_9:
			case KW_TRUE:
			case KW_TRUNCATE:
			case KW_UPPER:
			case KW_USER:
			case KW_YEAR:
			case BIT_NOT_OP:
			case LR_BRACKET:
			case DOLLAR:
			case ASTERISK_SIGN:
			case HYPNEN_SIGN:
			case ADD_SIGN:
			case STRING_LITERAL:
			case DIG_LITERAL:
			case REAL_LITERAL:
			case ID_LITERAL:
				{
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PARTITION) {
					{
					setState(403);
					insertPartitionDefinition();
					}
				}

				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -72075323663974416L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1729531790491648385L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -576478345160589313L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 5633940647839873L) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & -3438479958269688783L) != 0) || ((((_la - 340)) & ~0x3f) == 0 && ((1L << (_la - 340)) & 724089992431311265L) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & 2112853360263169L) != 0)) {
					{
					setState(406);
					columnNameList();
					}
				}

				setState(409);
				queryStatement(0);
				}
				break;
			case KW_VALUES:
				{
				setState(410);
				valuesDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertPartitionDefinitionContext extends ParserRuleContext {
		public TerminalNode KW_PARTITION() { return getToken(FQLParser.KW_PARTITION, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertPartitionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertPartitionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInsertPartitionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInsertPartitionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInsertPartitionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertPartitionDefinitionContext insertPartitionDefinition() throws RecognitionException {
		InsertPartitionDefinitionContext _localctx = new InsertPartitionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_insertPartitionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(KW_PARTITION);
			setState(414);
			tablePropertyList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryStatementContext extends ParserRuleContext {
		public QueryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStatement; }
	 
		public QueryStatementContext() { }
		public void copyFrom(QueryStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnionQueryContext extends QueryStatementContext {
		public QueryStatementContext left;
		public Token operator;
		public QueryStatementContext right;
		public List<QueryStatementContext> queryStatement() {
			return getRuleContexts(QueryStatementContext.class);
		}
		public QueryStatementContext queryStatement(int i) {
			return getRuleContext(QueryStatementContext.class,i);
		}
		public TerminalNode KW_INTERSECT() { return getToken(FQLParser.KW_INTERSECT, 0); }
		public TerminalNode KW_UNION() { return getToken(FQLParser.KW_UNION, 0); }
		public TerminalNode KW_EXCEPT() { return getToken(FQLParser.KW_EXCEPT, 0); }
		public TerminalNode KW_ALL() { return getToken(FQLParser.KW_ALL, 0); }
		public OrderByCaluseContext orderByCaluse() {
			return getRuleContext(OrderByCaluseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public UnionQueryContext(QueryStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterUnionQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitUnionQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitUnionQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommonQueryContext extends QueryStatementContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public OrderByCaluseContext orderByCaluse() {
			return getRuleContext(OrderByCaluseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public CommonQueryContext(QueryStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterCommonQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitCommonQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitCommonQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryStatementContext queryStatement() throws RecognitionException {
		return queryStatement(0);
	}

	private QueryStatementContext queryStatement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryStatementContext _localctx = new QueryStatementContext(_ctx, _parentState);
		QueryStatementContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_queryStatement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CommonQueryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(417);
				selectClause();
				}
				break;
			case 2:
				{
				setState(418);
				selectStatement();
				}
				break;
			}
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(421);
				orderByCaluse();
				}
				break;
			}
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(424);
				limitClause();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UnionQueryContext(new QueryStatementContext(_parentctx, _parentState));
					((UnionQueryContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryStatement);
					setState(427);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(428);
					((UnionQueryContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==KW_EXCEPT || _la==KW_INTERSECT || _la==KW_UNION) ) {
						((UnionQueryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_ALL) {
						{
						setState(429);
						match(KW_ALL);
						}
					}

					setState(432);
					((UnionQueryContext)_localctx).right = queryStatement(0);
					setState(434);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(433);
						orderByCaluse();
						}
						break;
					}
					setState(437);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(436);
						limitClause();
						}
						break;
					}
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesCaluseContext extends ParserRuleContext {
		public TerminalNode KW_VALUES() { return getToken(FQLParser.KW_VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public ValuesCaluseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesCaluse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterValuesCaluse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitValuesCaluse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitValuesCaluse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesCaluseContext valuesCaluse() throws RecognitionException {
		ValuesCaluseContext _localctx = new ValuesCaluseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valuesCaluse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(KW_VALUES);
			setState(445);
			expression();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(446);
				match(COMMA);
				setState(447);
				expression();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WithItemContext extends ParserRuleContext {
		public WithItemNameContext withItemName() {
			return getRuleContext(WithItemNameContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(FQLParser.KW_AS, 0); }
		public List<TerminalNode> LR_BRACKET() { return getTokens(FQLParser.LR_BRACKET); }
		public TerminalNode LR_BRACKET(int i) {
			return getToken(FQLParser.LR_BRACKET, i);
		}
		public QueryStatementContext queryStatement() {
			return getRuleContext(QueryStatementContext.class,0);
		}
		public List<TerminalNode> RR_BRACKET() { return getTokens(FQLParser.RR_BRACKET); }
		public TerminalNode RR_BRACKET(int i) {
			return getToken(FQLParser.RR_BRACKET, i);
		}
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public WithItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterWithItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitWithItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitWithItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithItemContext withItem() throws RecognitionException {
		WithItemContext _localctx = new WithItemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_withItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			withItemName();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(454);
				match(LR_BRACKET);
				setState(455);
				columnName();
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(456);
					match(COMMA);
					setState(457);
					columnName();
					}
					}
					setState(462);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(463);
				match(RR_BRACKET);
				}
			}

			setState(467);
			match(KW_AS);
			setState(468);
			match(LR_BRACKET);
			setState(469);
			queryStatement(0);
			setState(470);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WithItemNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WithItemNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withItemName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterWithItemName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitWithItemName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitWithItemName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithItemNameContext withItemName() throws RecognitionException {
		WithItemNameContext _localctx = new WithItemNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_withItemName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode KW_GROUP() { return getToken(FQLParser.KW_GROUP, 0); }
		public TerminalNode KW_BY() { return getToken(FQLParser.KW_BY, 0); }
		public List<GroupItemDefinitionContext> groupItemDefinition() {
			return getRuleContexts(GroupItemDefinitionContext.class);
		}
		public GroupItemDefinitionContext groupItemDefinition(int i) {
			return getRuleContext(GroupItemDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_groupByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(KW_GROUP);
			setState(475);
			match(KW_BY);
			setState(476);
			groupItemDefinition();
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(477);
					match(COMMA);
					setState(478);
					groupItemDefinition();
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(484);
				groupingSet();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode KW_FROM() { return getToken(FQLParser.KW_FROM, 0); }
		public TableExpressionContext tableExpression() {
			return getRuleContext(TableExpressionContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(KW_FROM);
			setState(488);
			tableExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableReferenceContext extends ParserRuleContext {
		public TablePrimaryContext tablePrimary() {
			return getRuleContext(TablePrimaryContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(490);
			tablePrimary();
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(491);
				tableAlias();
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FlinkJoinOpContext extends ParserRuleContext {
		public TerminalNode KW_LEFT() { return getToken(FQLParser.KW_LEFT, 0); }
		public TerminalNode KW_RIGHT() { return getToken(FQLParser.KW_RIGHT, 0); }
		public TerminalNode KW_FULL() { return getToken(FQLParser.KW_FULL, 0); }
		public TerminalNode KW_INNER() { return getToken(FQLParser.KW_INNER, 0); }
		public FlinkJoinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flinkJoinOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFlinkJoinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFlinkJoinOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFlinkJoinOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlinkJoinOpContext flinkJoinOp() throws RecognitionException {
		FlinkJoinOpContext _localctx = new FlinkJoinOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_flinkJoinOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !(((((_la - 277)) & ~0x3f) == 0 && ((1L << (_la - 277)) & 268439553L) != 0) || _la==KW_RIGHT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePrimaryContext extends ParserRuleContext {
		public TablePathContext tablePath() {
			return getRuleContext(TablePathContext.class,0);
		}
		public TerminalNode KW_TABLE() { return getToken(FQLParser.KW_TABLE, 0); }
		public TimePeriodContext timePeriod() {
			return getRuleContext(TimePeriodContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(FQLParser.KW_AS, 0); }
		public CorrelationNameContext correlationName() {
			return getRuleContext(CorrelationNameContext.class,0);
		}
		public TerminalNode KW_LATERAL() { return getToken(FQLParser.KW_LATERAL, 0); }
		public List<TerminalNode> LR_BRACKET() { return getTokens(FQLParser.LR_BRACKET); }
		public TerminalNode LR_BRACKET(int i) {
			return getToken(FQLParser.LR_BRACKET, i);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<FunctionParamContext> functionParam() {
			return getRuleContexts(FunctionParamContext.class);
		}
		public FunctionParamContext functionParam(int i) {
			return getRuleContext(FunctionParamContext.class,i);
		}
		public List<TerminalNode> RR_BRACKET() { return getTokens(FQLParser.RR_BRACKET); }
		public TerminalNode RR_BRACKET(int i) {
			return getToken(FQLParser.RR_BRACKET, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public QueryStatementContext queryStatement() {
			return getRuleContext(QueryStatementContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public List<ProjectItemDefinitionContext> projectItemDefinition() {
			return getRuleContexts(ProjectItemDefinitionContext.class);
		}
		public ProjectItemDefinitionContext projectItemDefinition(int i) {
			return getRuleContext(ProjectItemDefinitionContext.class,i);
		}
		public TerminalNode KW_UNNEST() { return getToken(FQLParser.KW_UNNEST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TablePrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTablePrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTablePrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTablePrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePrimaryContext tablePrimary() throws RecognitionException {
		TablePrimaryContext _localctx = new TablePrimaryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tablePrimary);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_TABLE) {
					{
					setState(496);
					match(KW_TABLE);
					}
				}

				setState(499);
				tablePath();
				setState(501);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(500);
					timePeriod();
					}
					break;
				}
				setState(505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(503);
					match(KW_AS);
					setState(504);
					correlationName();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(KW_LATERAL);
				setState(508);
				match(KW_TABLE);
				setState(509);
				match(LR_BRACKET);
				setState(510);
				functionName();
				setState(511);
				match(LR_BRACKET);
				setState(512);
				functionParam();
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(513);
					match(COMMA);
					setState(514);
					functionParam();
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(520);
				match(RR_BRACKET);
				setState(521);
				match(RR_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_LATERAL) {
					{
					setState(523);
					match(KW_LATERAL);
					}
				}

				setState(526);
				match(LR_BRACKET);
				setState(527);
				queryStatement(0);
				setState(528);
				match(RR_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				match(KW_LATERAL);
				setState(531);
				match(KW_TABLE);
				setState(532);
				match(LR_BRACKET);
				setState(533);
				functionName();
				setState(534);
				match(LR_BRACKET);
				setState(535);
				functionParam();
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(536);
					match(COMMA);
					setState(537);
					functionParam();
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(543);
				match(RR_BRACKET);
				setState(544);
				match(RR_BRACKET);
				setState(545);
				match(KW_AS);
				setState(546);
				tableAlias();
				setState(547);
				match(LR_BRACKET);
				setState(548);
				projectItemDefinition();
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(549);
					match(COMMA);
					setState(550);
					projectItemDefinition();
					}
					}
					setState(555);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(556);
				match(RR_BRACKET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(558);
				match(KW_UNNEST);
				setState(559);
				match(LR_BRACKET);
				setState(560);
				expression();
				setState(561);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimePeriodContext extends ParserRuleContext {
		public TerminalNode KW_FOR() { return getToken(FQLParser.KW_FOR, 0); }
		public TerminalNode KW_SYSTEM_TIME() { return getToken(FQLParser.KW_SYSTEM_TIME, 0); }
		public TerminalNode KW_AS() { return getToken(FQLParser.KW_AS, 0); }
		public TerminalNode KW_OF() { return getToken(FQLParser.KW_OF, 0); }
		public DateTimeExpressionContext dateTimeExpression() {
			return getRuleContext(DateTimeExpressionContext.class,0);
		}
		public TimePeriodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timePeriod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTimePeriod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTimePeriod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTimePeriod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimePeriodContext timePeriod() throws RecognitionException {
		TimePeriodContext _localctx = new TimePeriodContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_timePeriod);
		try {
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(KW_FOR);
				setState(566);
				match(KW_SYSTEM_TIME);
				setState(567);
				match(KW_AS);
				setState(568);
				match(KW_OF);
				setState(569);
				dateTimeExpression();
				}
				break;
			case KW_AS:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(KW_AS);
				setState(571);
				match(KW_OF);
				setState(572);
				dateTimeExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DateTimeExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DateTimeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterDateTimeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitDateTimeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitDateTimeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTimeExpressionContext dateTimeExpression() throws RecognitionException {
		DateTimeExpressionContext _localctx = new DateTimeExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dateTimeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlineDataValueClauseContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public ValuesDefinitionContext valuesDefinition() {
			return getRuleContext(ValuesDefinitionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineDataValueClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineDataValueClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInlineDataValueClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInlineDataValueClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInlineDataValueClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineDataValueClauseContext inlineDataValueClause() throws RecognitionException {
		InlineDataValueClauseContext _localctx = new InlineDataValueClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inlineDataValueClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(LR_BRACKET);
			setState(578);
			valuesDefinition();
			setState(579);
			match(RR_BRACKET);
			setState(580);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowTVFClauseContext extends ParserRuleContext {
		public TerminalNode KW_TABLE() { return getToken(FQLParser.KW_TABLE, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public WindowTVFExpressionContext windowTVFExpression() {
			return getRuleContext(WindowTVFExpressionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public WindowTVFClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowTVFClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterWindowTVFClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitWindowTVFClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitWindowTVFClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowTVFClauseContext windowTVFClause() throws RecognitionException {
		WindowTVFClauseContext _localctx = new WindowTVFClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_windowTVFClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(KW_TABLE);
			setState(583);
			match(LR_BRACKET);
			setState(584);
			windowTVFExpression();
			setState(585);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowTVFExpressionContext extends ParserRuleContext {
		public TumableExpressionContext tumableExpression() {
			return getRuleContext(TumableExpressionContext.class,0);
		}
		public HopExpressionContext hopExpression() {
			return getRuleContext(HopExpressionContext.class,0);
		}
		public CumulateExpressionContext cumulateExpression() {
			return getRuleContext(CumulateExpressionContext.class,0);
		}
		public SessionExpressionContext sessionExpression() {
			return getRuleContext(SessionExpressionContext.class,0);
		}
		public WindowTVFExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowTVFExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterWindowTVFExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitWindowTVFExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitWindowTVFExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowTVFExpressionContext windowTVFExpression() throws RecognitionException {
		WindowTVFExpressionContext _localctx = new WindowTVFExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_windowTVFExpression);
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TUMBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				tumableExpression();
				}
				break;
			case KW_HOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				hopExpression();
				}
				break;
			case KW_CUMULATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				cumulateExpression();
				}
				break;
			case KW_SESSION:
				enterOuterAlt(_localctx, 4);
				{
				setState(590);
				sessionExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TumableExpressionContext extends ParserRuleContext {
		public TerminalNode KW_TUMBLE() { return getToken(FQLParser.KW_TUMBLE, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public TerminalNode KW_TABLE() { return getToken(FQLParser.KW_TABLE, 0); }
		public TerminalNode KW_DATA() { return getToken(FQLParser.KW_DATA, 0); }
		public List<TerminalNode> DOUBLE_RIGHT_ARROW() { return getTokens(FQLParser.DOUBLE_RIGHT_ARROW); }
		public TerminalNode DOUBLE_RIGHT_ARROW(int i) {
			return getToken(FQLParser.DOUBLE_RIGHT_ARROW, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public ColumnDescriptorContext columnDescriptor() {
			return getRuleContext(ColumnDescriptorContext.class,0);
		}
		public List<TimeIntervalExpressionContext> timeIntervalExpression() {
			return getRuleContexts(TimeIntervalExpressionContext.class);
		}
		public TimeIntervalExpressionContext timeIntervalExpression(int i) {
			return getRuleContext(TimeIntervalExpressionContext.class,i);
		}
		public TerminalNode KW_TIMECOL() { return getToken(FQLParser.KW_TIMECOL, 0); }
		public TerminalNode KW_SIZE() { return getToken(FQLParser.KW_SIZE, 0); }
		public List<TerminalNode> DOUBLE_QUOTE_SYMB() { return getTokens(FQLParser.DOUBLE_QUOTE_SYMB); }
		public TerminalNode DOUBLE_QUOTE_SYMB(int i) {
			return getToken(FQLParser.DOUBLE_QUOTE_SYMB, i);
		}
		public TerminalNode KW_OFFSET() { return getToken(FQLParser.KW_OFFSET, 0); }
		public TumableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tumableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTumableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTumableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTumableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TumableExpressionContext tumableExpression() throws RecognitionException {
		TumableExpressionContext _localctx = new TumableExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tumableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(KW_TUMBLE);
			setState(594);
			match(LR_BRACKET);
			setState(599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TABLE:
				{
				setState(595);
				match(KW_TABLE);
				}
				break;
			case KW_DATA:
				{
				setState(596);
				match(KW_DATA);
				setState(597);
				match(DOUBLE_RIGHT_ARROW);
				setState(598);
				match(KW_TABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(601);
			uid();
			{
			setState(602);
			match(COMMA);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_TIMECOL) {
				{
				setState(603);
				match(KW_TIMECOL);
				setState(604);
				match(DOUBLE_RIGHT_ARROW);
				}
			}

			setState(607);
			columnDescriptor();
			}
			{
			setState(609);
			match(COMMA);
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SIZE) {
				{
				setState(610);
				match(KW_SIZE);
				setState(611);
				match(DOUBLE_RIGHT_ARROW);
				}
			}

			setState(614);
			timeIntervalExpression();
			}
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(616);
				match(COMMA);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLE_QUOTE_SYMB) {
					{
					setState(617);
					match(DOUBLE_QUOTE_SYMB);
					setState(618);
					match(KW_OFFSET);
					setState(619);
					match(DOUBLE_QUOTE_SYMB);
					setState(620);
					match(DOUBLE_RIGHT_ARROW);
					}
				}

				setState(623);
				timeIntervalExpression();
				}
			}

			setState(626);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HopExpressionContext extends ParserRuleContext {
		public TerminalNode KW_HOP() { return getToken(FQLParser.KW_HOP, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public TerminalNode KW_TABLE() { return getToken(FQLParser.KW_TABLE, 0); }
		public TerminalNode KW_DATA() { return getToken(FQLParser.KW_DATA, 0); }
		public List<TerminalNode> DOUBLE_RIGHT_ARROW() { return getTokens(FQLParser.DOUBLE_RIGHT_ARROW); }
		public TerminalNode DOUBLE_RIGHT_ARROW(int i) {
			return getToken(FQLParser.DOUBLE_RIGHT_ARROW, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public ColumnDescriptorContext columnDescriptor() {
			return getRuleContext(ColumnDescriptorContext.class,0);
		}
		public List<TimeIntervalExpressionContext> timeIntervalExpression() {
			return getRuleContexts(TimeIntervalExpressionContext.class);
		}
		public TimeIntervalExpressionContext timeIntervalExpression(int i) {
			return getRuleContext(TimeIntervalExpressionContext.class,i);
		}
		public TerminalNode KW_TIMECOL() { return getToken(FQLParser.KW_TIMECOL, 0); }
		public TerminalNode KW_SIZE() { return getToken(FQLParser.KW_SIZE, 0); }
		public TerminalNode KW_SLIDE() { return getToken(FQLParser.KW_SLIDE, 0); }
		public List<TerminalNode> DOUBLE_QUOTE_SYMB() { return getTokens(FQLParser.DOUBLE_QUOTE_SYMB); }
		public TerminalNode DOUBLE_QUOTE_SYMB(int i) {
			return getToken(FQLParser.DOUBLE_QUOTE_SYMB, i);
		}
		public TerminalNode KW_OFFSET() { return getToken(FQLParser.KW_OFFSET, 0); }
		public HopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterHopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitHopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitHopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HopExpressionContext hopExpression() throws RecognitionException {
		HopExpressionContext _localctx = new HopExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_hopExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(KW_HOP);
			setState(629);
			match(LR_BRACKET);
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TABLE:
				{
				setState(630);
				match(KW_TABLE);
				}
				break;
			case KW_DATA:
				{
				setState(631);
				match(KW_DATA);
				setState(632);
				match(DOUBLE_RIGHT_ARROW);
				setState(633);
				match(KW_TABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(636);
			uid();
			{
			setState(637);
			match(COMMA);
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_TIMECOL) {
				{
				setState(638);
				match(KW_TIMECOL);
				setState(639);
				match(DOUBLE_RIGHT_ARROW);
				}
			}

			setState(642);
			columnDescriptor();
			}
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(644);
				match(COMMA);
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_SLIDE) {
					{
					setState(645);
					match(KW_SLIDE);
					setState(646);
					match(DOUBLE_RIGHT_ARROW);
					}
				}

				setState(649);
				timeIntervalExpression();
				}
				break;
			}
			{
			setState(652);
			match(COMMA);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SIZE) {
				{
				setState(653);
				match(KW_SIZE);
				setState(654);
				match(DOUBLE_RIGHT_ARROW);
				}
			}

			setState(657);
			timeIntervalExpression();
			}
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(659);
				match(COMMA);
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLE_QUOTE_SYMB) {
					{
					setState(660);
					match(DOUBLE_QUOTE_SYMB);
					setState(661);
					match(KW_OFFSET);
					setState(662);
					match(DOUBLE_QUOTE_SYMB);
					setState(663);
					match(DOUBLE_RIGHT_ARROW);
					}
				}

				setState(666);
				timeIntervalExpression();
				}
			}

			setState(669);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CumulateExpressionContext extends ParserRuleContext {
		public TerminalNode KW_CUMULATE() { return getToken(FQLParser.KW_CUMULATE, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public TerminalNode KW_TABLE() { return getToken(FQLParser.KW_TABLE, 0); }
		public TerminalNode KW_DATA() { return getToken(FQLParser.KW_DATA, 0); }
		public List<TerminalNode> DOUBLE_RIGHT_ARROW() { return getTokens(FQLParser.DOUBLE_RIGHT_ARROW); }
		public TerminalNode DOUBLE_RIGHT_ARROW(int i) {
			return getToken(FQLParser.DOUBLE_RIGHT_ARROW, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public ColumnDescriptorContext columnDescriptor() {
			return getRuleContext(ColumnDescriptorContext.class,0);
		}
		public List<TimeIntervalExpressionContext> timeIntervalExpression() {
			return getRuleContexts(TimeIntervalExpressionContext.class);
		}
		public TimeIntervalExpressionContext timeIntervalExpression(int i) {
			return getRuleContext(TimeIntervalExpressionContext.class,i);
		}
		public TerminalNode KW_TIMECOL() { return getToken(FQLParser.KW_TIMECOL, 0); }
		public TerminalNode KW_SIZE() { return getToken(FQLParser.KW_SIZE, 0); }
		public TerminalNode KW_STEP() { return getToken(FQLParser.KW_STEP, 0); }
		public CumulateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cumulateExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterCumulateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitCumulateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitCumulateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CumulateExpressionContext cumulateExpression() throws RecognitionException {
		CumulateExpressionContext _localctx = new CumulateExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cumulateExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(KW_CUMULATE);
			setState(672);
			match(LR_BRACKET);
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TABLE:
				{
				setState(673);
				match(KW_TABLE);
				}
				break;
			case KW_DATA:
				{
				setState(674);
				match(KW_DATA);
				setState(675);
				match(DOUBLE_RIGHT_ARROW);
				setState(676);
				match(KW_TABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(679);
			uid();
			{
			setState(680);
			match(COMMA);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_TIMECOL) {
				{
				setState(681);
				match(KW_TIMECOL);
				setState(682);
				match(DOUBLE_RIGHT_ARROW);
				}
			}

			setState(685);
			columnDescriptor();
			}
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(687);
				match(COMMA);
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_STEP) {
					{
					setState(688);
					match(KW_STEP);
					setState(689);
					match(DOUBLE_RIGHT_ARROW);
					}
				}

				setState(692);
				timeIntervalExpression();
				}
				break;
			}
			{
			setState(695);
			match(COMMA);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SIZE) {
				{
				setState(696);
				match(KW_SIZE);
				setState(697);
				match(DOUBLE_RIGHT_ARROW);
				}
			}

			setState(700);
			timeIntervalExpression();
			}
			setState(702);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SessionExpressionContext extends ParserRuleContext {
		public TerminalNode KW_SESSION() { return getToken(FQLParser.KW_SESSION, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public List<UidContext> uid() {
			return getRuleContexts(UidContext.class);
		}
		public UidContext uid(int i) {
			return getRuleContext(UidContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public TerminalNode KW_TABLE() { return getToken(FQLParser.KW_TABLE, 0); }
		public TerminalNode KW_DATA() { return getToken(FQLParser.KW_DATA, 0); }
		public List<TerminalNode> DOUBLE_RIGHT_ARROW() { return getTokens(FQLParser.DOUBLE_RIGHT_ARROW); }
		public TerminalNode DOUBLE_RIGHT_ARROW(int i) {
			return getToken(FQLParser.DOUBLE_RIGHT_ARROW, i);
		}
		public TerminalNode KW_PARTITION() { return getToken(FQLParser.KW_PARTITION, 0); }
		public TerminalNode KW_BY() { return getToken(FQLParser.KW_BY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public ColumnDescriptorContext columnDescriptor() {
			return getRuleContext(ColumnDescriptorContext.class,0);
		}
		public TimeIntervalExpressionContext timeIntervalExpression() {
			return getRuleContext(TimeIntervalExpressionContext.class,0);
		}
		public TerminalNode KW_TIMECOL() { return getToken(FQLParser.KW_TIMECOL, 0); }
		public TerminalNode KW_GAP() { return getToken(FQLParser.KW_GAP, 0); }
		public SessionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sessionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSessionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSessionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSessionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SessionExpressionContext sessionExpression() throws RecognitionException {
		SessionExpressionContext _localctx = new SessionExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sessionExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(KW_SESSION);
			setState(705);
			match(LR_BRACKET);
			setState(710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TABLE:
				{
				setState(706);
				match(KW_TABLE);
				}
				break;
			case KW_DATA:
				{
				setState(707);
				match(KW_DATA);
				setState(708);
				match(DOUBLE_RIGHT_ARROW);
				setState(709);
				match(KW_TABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(712);
			uid();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PARTITION) {
				{
				setState(713);
				match(KW_PARTITION);
				setState(714);
				match(KW_BY);
				setState(715);
				uid();
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(716);
						match(COMMA);
						setState(717);
						uid();
						}
						} 
					}
					setState(722);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
			}

			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(725);
				match(COMMA);
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_TIMECOL) {
					{
					setState(726);
					match(KW_TIMECOL);
					setState(727);
					match(DOUBLE_RIGHT_ARROW);
					}
				}

				setState(730);
				columnDescriptor();
				}
				break;
			}
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(733);
				match(COMMA);
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_GAP) {
					{
					setState(734);
					match(KW_GAP);
					setState(735);
					match(DOUBLE_RIGHT_ARROW);
					}
				}

				setState(738);
				timeIntervalExpression();
				}
			}

			setState(741);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowTVFNameContext extends ParserRuleContext {
		public TerminalNode KW_TUMBLE() { return getToken(FQLParser.KW_TUMBLE, 0); }
		public TerminalNode KW_HOP() { return getToken(FQLParser.KW_HOP, 0); }
		public TerminalNode KW_CUMULATE() { return getToken(FQLParser.KW_CUMULATE, 0); }
		public TerminalNode KW_SESSION() { return getToken(FQLParser.KW_SESSION, 0); }
		public WindowTVFNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowTVFName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterWindowTVFName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitWindowTVFName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitWindowTVFName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowTVFNameContext windowTVFName() throws RecognitionException {
		WindowTVFNameContext _localctx = new WindowTVFNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_windowTVFName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_la = _input.LA(1);
			if ( !(_la==KW_CUMULATE || _la==KW_HOP || _la==KW_SESSION || _la==KW_TUMBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowTVFParamContext extends ParserRuleContext {
		public TerminalNode KW_TABLE() { return getToken(FQLParser.KW_TABLE, 0); }
		public TimeAttrColumnContext timeAttrColumn() {
			return getRuleContext(TimeAttrColumnContext.class,0);
		}
		public ColumnDescriptorContext columnDescriptor() {
			return getRuleContext(ColumnDescriptorContext.class,0);
		}
		public TimeIntervalExpressionContext timeIntervalExpression() {
			return getRuleContext(TimeIntervalExpressionContext.class,0);
		}
		public TerminalNode KW_DATA() { return getToken(FQLParser.KW_DATA, 0); }
		public TerminalNode DOUBLE_RIGHT_ARROW() { return getToken(FQLParser.DOUBLE_RIGHT_ARROW, 0); }
		public TerminalNode KW_TIMECOL() { return getToken(FQLParser.KW_TIMECOL, 0); }
		public TimeIntervalParamNameContext timeIntervalParamName() {
			return getRuleContext(TimeIntervalParamNameContext.class,0);
		}
		public WindowTVFParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowTVFParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterWindowTVFParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitWindowTVFParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitWindowTVFParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowTVFParamContext windowTVFParam() throws RecognitionException {
		WindowTVFParamContext _localctx = new WindowTVFParamContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_windowTVFParam);
		try {
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				match(KW_TABLE);
				setState(746);
				timeAttrColumn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				columnDescriptor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(748);
				timeIntervalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(749);
				match(KW_DATA);
				setState(750);
				match(DOUBLE_RIGHT_ARROW);
				setState(751);
				match(KW_TABLE);
				setState(752);
				timeAttrColumn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(753);
				match(KW_TIMECOL);
				setState(754);
				match(DOUBLE_RIGHT_ARROW);
				setState(755);
				columnDescriptor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(756);
				timeIntervalParamName();
				setState(757);
				match(DOUBLE_RIGHT_ARROW);
				setState(758);
				timeIntervalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeIntervalParamNameContext extends ParserRuleContext {
		public TerminalNode KW_DATA() { return getToken(FQLParser.KW_DATA, 0); }
		public TerminalNode KW_TIMECOL() { return getToken(FQLParser.KW_TIMECOL, 0); }
		public TerminalNode KW_SIZE() { return getToken(FQLParser.KW_SIZE, 0); }
		public TerminalNode KW_OFFSET() { return getToken(FQLParser.KW_OFFSET, 0); }
		public TerminalNode KW_STEP() { return getToken(FQLParser.KW_STEP, 0); }
		public TerminalNode KW_SLIDE() { return getToken(FQLParser.KW_SLIDE, 0); }
		public TimeIntervalParamNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeIntervalParamName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTimeIntervalParamName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTimeIntervalParamName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTimeIntervalParamName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeIntervalParamNameContext timeIntervalParamName() throws RecognitionException {
		TimeIntervalParamNameContext _localctx = new TimeIntervalParamNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_timeIntervalParamName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			_la = _input.LA(1);
			if ( !(_la==KW_DATA || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 16515L) != 0) || _la==KW_OFFSET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnDescriptorContext extends ParserRuleContext {
		public TerminalNode KW_DESCRIPTOR() { return getToken(FQLParser.KW_DESCRIPTOR, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public ColumnDescriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDescriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterColumnDescriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitColumnDescriptor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitColumnDescriptor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDescriptorContext columnDescriptor() throws RecognitionException {
		ColumnDescriptorContext _localctx = new ColumnDescriptorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_columnDescriptor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(KW_DESCRIPTOR);
			setState(765);
			match(LR_BRACKET);
			setState(766);
			uid();
			setState(767);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinConditionContext extends ParserRuleContext {
		public TerminalNode KW_ON() { return getToken(FQLParser.KW_ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode KW_USING() { return getToken(FQLParser.KW_USING, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public List<UidContext> uid() {
			return getRuleContexts(UidContext.class);
		}
		public UidContext uid(int i) {
			return getRuleContext(UidContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public JoinConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterJoinCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitJoinCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitJoinCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConditionContext joinCondition() throws RecognitionException {
		JoinConditionContext _localctx = new JoinConditionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_joinCondition);
		int _la;
		try {
			setState(783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				match(KW_ON);
				setState(770);
				booleanExpression(0);
				}
				break;
			case KW_USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				match(KW_USING);
				setState(772);
				match(LR_BRACKET);
				setState(773);
				uid();
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(774);
					match(COMMA);
					setState(775);
					uid();
					}
					}
					setState(780);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(781);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode KW_WHERE() { return getToken(FQLParser.KW_WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(KW_WHERE);
			setState(786);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupItemDefinitionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupWindowFunctionContext groupWindowFunction() {
			return getRuleContext(GroupWindowFunctionContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public GroupingSetsNotionNameContext groupingSetsNotionName() {
			return getRuleContext(GroupingSetsNotionNameContext.class,0);
		}
		public GroupItemDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupItemDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterGroupItemDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitGroupItemDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitGroupItemDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupItemDefinitionContext groupItemDefinition() throws RecognitionException {
		GroupItemDefinitionContext _localctx = new GroupItemDefinitionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_groupItemDefinition);
		int _la;
		try {
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				groupWindowFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(790);
				match(LR_BRACKET);
				setState(791);
				match(RR_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(792);
				match(LR_BRACKET);
				setState(793);
				expression();
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(794);
					match(COMMA);
					setState(795);
					expression();
					}
					}
					setState(800);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(801);
				match(RR_BRACKET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(803);
				groupingSetsNotionName();
				setState(804);
				match(LR_BRACKET);
				setState(805);
				expression();
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(806);
					match(COMMA);
					setState(807);
					expression();
					}
					}
					setState(812);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(813);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupingSetContext extends ParserRuleContext {
		public GroupingSetsContext groupingSets() {
			return getRuleContext(GroupingSetsContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public List<GroupItemDefinitionContext> groupItemDefinition() {
			return getRuleContexts(GroupItemDefinitionContext.class);
		}
		public GroupItemDefinitionContext groupItemDefinition(int i) {
			return getRuleContext(GroupItemDefinitionContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_groupingSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			groupingSets();
			setState(818);
			match(LR_BRACKET);
			setState(819);
			groupItemDefinition();
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(820);
				match(COMMA);
				setState(821);
				groupItemDefinition();
				}
				}
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(827);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupingSetsContext extends ParserRuleContext {
		public TerminalNode KW_GROUPING() { return getToken(FQLParser.KW_GROUPING, 0); }
		public TerminalNode KW_SETS() { return getToken(FQLParser.KW_SETS, 0); }
		public GroupingSetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterGroupingSets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitGroupingSets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitGroupingSets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetsContext groupingSets() throws RecognitionException {
		GroupingSetsContext _localctx = new GroupingSetsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_groupingSets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(KW_GROUPING);
			setState(830);
			match(KW_SETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupingSetsNotionNameContext extends ParserRuleContext {
		public TerminalNode KW_CUBE() { return getToken(FQLParser.KW_CUBE, 0); }
		public TerminalNode KW_ROLLUP() { return getToken(FQLParser.KW_ROLLUP, 0); }
		public GroupingSetsNotionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSetsNotionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterGroupingSetsNotionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitGroupingSetsNotionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitGroupingSetsNotionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetsNotionNameContext groupingSetsNotionName() throws RecognitionException {
		GroupingSetsNotionNameContext _localctx = new GroupingSetsNotionNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_groupingSetsNotionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			_la = _input.LA(1);
			if ( !(_la==KW_CUBE || _la==KW_ROLLUP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupWindowFunctionContext extends ParserRuleContext {
		public GroupWindowFunctionNameContext groupWindowFunctionName() {
			return getRuleContext(GroupWindowFunctionNameContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public TimeAttrColumnContext timeAttrColumn() {
			return getRuleContext(TimeAttrColumnContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FQLParser.COMMA, 0); }
		public TimeIntervalExpressionContext timeIntervalExpression() {
			return getRuleContext(TimeIntervalExpressionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public GroupWindowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupWindowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterGroupWindowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitGroupWindowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitGroupWindowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupWindowFunctionContext groupWindowFunction() throws RecognitionException {
		GroupWindowFunctionContext _localctx = new GroupWindowFunctionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_groupWindowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			groupWindowFunctionName();
			setState(835);
			match(LR_BRACKET);
			setState(836);
			timeAttrColumn();
			setState(837);
			match(COMMA);
			setState(838);
			timeIntervalExpression();
			setState(839);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupWindowFunctionNameContext extends ParserRuleContext {
		public TerminalNode KW_TUMBLE() { return getToken(FQLParser.KW_TUMBLE, 0); }
		public TerminalNode KW_HOP() { return getToken(FQLParser.KW_HOP, 0); }
		public TerminalNode KW_SESSION() { return getToken(FQLParser.KW_SESSION, 0); }
		public GroupWindowFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupWindowFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterGroupWindowFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitGroupWindowFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitGroupWindowFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupWindowFunctionNameContext groupWindowFunctionName() throws RecognitionException {
		GroupWindowFunctionNameContext _localctx = new GroupWindowFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_groupWindowFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			_la = _input.LA(1);
			if ( !(_la==KW_HOP || _la==KW_SESSION || _la==KW_TUMBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeAttrColumnContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TimeAttrColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeAttrColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTimeAttrColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTimeAttrColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTimeAttrColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeAttrColumnContext timeAttrColumn() throws RecognitionException {
		TimeAttrColumnContext _localctx = new TimeAttrColumnContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_timeAttrColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			uid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode KW_HAVING() { return getToken(FQLParser.KW_HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(KW_HAVING);
			setState(846);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode KW_WINDOW() { return getToken(FQLParser.KW_WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(KW_WINDOW);
			setState(849);
			namedWindow();
			setState(854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(850);
					match(COMMA);
					setState(851);
					namedWindow();
					}
					} 
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode KW_AS() { return getToken(FQLParser.KW_AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(858);
			match(KW_AS);
			setState(859);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowSpecContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public PartitionByClauseContext partitionByClause() {
			return getRuleContext(PartitionByClauseContext.class,0);
		}
		public OrderByCaluseContext orderByCaluse() {
			return getRuleContext(OrderByCaluseContext.class,0);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterWindowSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitWindowSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitWindowSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_windowSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -72075323663974416L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1729531790491648385L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -576478345160589313L) != 0) || _la==KW_DATE || _la==KW_LOCALTIMESTAMP || ((((_la - 399)) & ~0x3f) == 0 && ((1L << (_la - 399)) & 6341085867523702785L) != 0)) {
				{
				setState(861);
				((WindowSpecContext)_localctx).name = errorCapturingIdentifier();
				}
			}

			setState(864);
			match(LR_BRACKET);
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PARTITION) {
				{
				setState(865);
				partitionByClause();
				}
			}

			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ORDER) {
				{
				setState(868);
				orderByCaluse();
				}
			}

			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RANGE || _la==KW_ROWS) {
				{
				setState(871);
				windowFrame();
				}
			}

			setState(874);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchRecognizeClauseContext extends ParserRuleContext {
		public TerminalNode KW_MATCH_RECOGNIZE() { return getToken(FQLParser.KW_MATCH_RECOGNIZE, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public PatternVariablesDefinitionContext patternVariablesDefinition() {
			return getRuleContext(PatternVariablesDefinitionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public PartitionByClauseContext partitionByClause() {
			return getRuleContext(PartitionByClauseContext.class,0);
		}
		public OrderByCaluseContext orderByCaluse() {
			return getRuleContext(OrderByCaluseContext.class,0);
		}
		public MeasuresClauseContext measuresClause() {
			return getRuleContext(MeasuresClauseContext.class,0);
		}
		public OutputModeContext outputMode() {
			return getRuleContext(OutputModeContext.class,0);
		}
		public AfterMatchStrategyContext afterMatchStrategy() {
			return getRuleContext(AfterMatchStrategyContext.class,0);
		}
		public PatternDefinitionContext patternDefinition() {
			return getRuleContext(PatternDefinitionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(FQLParser.KW_AS, 0); }
		public MatchRecognizeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchRecognizeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMatchRecognizeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMatchRecognizeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMatchRecognizeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchRecognizeClauseContext matchRecognizeClause() throws RecognitionException {
		MatchRecognizeClauseContext _localctx = new MatchRecognizeClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_matchRecognizeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(KW_MATCH_RECOGNIZE);
			setState(877);
			match(LR_BRACKET);
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PARTITION) {
				{
				setState(878);
				partitionByClause();
				}
			}

			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ORDER) {
				{
				setState(881);
				orderByCaluse();
				}
			}

			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MEASURES) {
				{
				setState(884);
				measuresClause();
				}
			}

			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ALL || _la==KW_ONE) {
				{
				setState(887);
				outputMode();
				}
			}

			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AFTER) {
				{
				setState(890);
				afterMatchStrategy();
				}
			}

			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PATTERN) {
				{
				setState(893);
				patternDefinition();
				}
			}

			setState(896);
			patternVariablesDefinition();
			setState(897);
			match(RR_BRACKET);
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(898);
					match(KW_AS);
					}
				}

				setState(901);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByCaluseContext extends ParserRuleContext {
		public TerminalNode KW_ORDER() { return getToken(FQLParser.KW_ORDER, 0); }
		public TerminalNode KW_BY() { return getToken(FQLParser.KW_BY, 0); }
		public List<OrderItemDefinitionContext> orderItemDefinition() {
			return getRuleContexts(OrderItemDefinitionContext.class);
		}
		public OrderItemDefinitionContext orderItemDefinition(int i) {
			return getRuleContext(OrderItemDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public OrderByCaluseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByCaluse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterOrderByCaluse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitOrderByCaluse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitOrderByCaluse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByCaluseContext orderByCaluse() throws RecognitionException {
		OrderByCaluseContext _localctx = new OrderByCaluseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_orderByCaluse);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(KW_ORDER);
			setState(905);
			match(KW_BY);
			setState(906);
			orderItemDefinition();
			setState(911);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(907);
					match(COMMA);
					setState(908);
					orderItemDefinition();
					}
					} 
				}
				setState(913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderItemDefinitionContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_NULLS() { return getToken(FQLParser.KW_NULLS, 0); }
		public TerminalNode KW_ASC() { return getToken(FQLParser.KW_ASC, 0); }
		public TerminalNode KW_DESC() { return getToken(FQLParser.KW_DESC, 0); }
		public TerminalNode KW_LAST() { return getToken(FQLParser.KW_LAST, 0); }
		public TerminalNode KW_FIRST() { return getToken(FQLParser.KW_FIRST, 0); }
		public OrderItemDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderItemDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterOrderItemDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitOrderItemDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitOrderItemDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderItemDefinitionContext orderItemDefinition() throws RecognitionException {
		OrderItemDefinitionContext _localctx = new OrderItemDefinitionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_orderItemDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			expression();
			setState(916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(915);
				((OrderItemDefinitionContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==KW_ASC || _la==KW_DESC) ) {
					((OrderItemDefinitionContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(918);
				match(KW_NULLS);
				setState(919);
				((OrderItemDefinitionContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==KW_FIRST || _la==KW_LAST) ) {
					((OrderItemDefinitionContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseContext extends ParserRuleContext {
		public ExpressionContext limit;
		public TerminalNode KW_LIMIT() { return getToken(FQLParser.KW_LIMIT, 0); }
		public TerminalNode KW_ALL() { return getToken(FQLParser.KW_ALL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(KW_LIMIT);
			setState(925);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ALL:
				{
				setState(923);
				match(KW_ALL);
				}
				break;
			case KW_ADD:
			case KW_ADMIN:
			case KW_AFTER:
			case KW_ANALYZE:
			case KW_ASC:
			case KW_BEFORE:
			case KW_BYTES:
			case KW_CASCADE:
			case KW_CATALOG:
			case KW_CATALOGS:
			case KW_CENTURY:
			case KW_CHAIN:
			case KW_CHANGELOG_MODE:
			case KW_CHARACTERS:
			case KW_COMMENT:
			case KW_COMPACT:
			case KW_COLUMNS:
			case KW_CONSTRAINTS:
			case KW_CONSTRUCTOR:
			case KW_CUMULATE:
			case KW_DATA:
			case KW_DATABASE:
			case KW_DATABASES:
			case KW_DAYS:
			case KW_DECADE:
			case KW_DEFINED:
			case KW_DESC:
			case KW_DESCRIPTOR:
			case KW_DIV:
			case KW_ENCODING:
			case KW_ENFORCED:
			case KW_ENGINE:
			case KW_ERROR:
			case KW_ESTIMATED_COST:
			case KW_EXCEPTION:
			case KW_EXCLUDE:
			case KW_EXCLUDING:
			case KW_EXTENDED:
			case KW_FILE:
			case KW_FINAL:
			case KW_FIRST:
			case KW_FOLLOWING:
			case KW_FORMAT:
			case KW_FORTRAN:
			case KW_FOUND:
			case KW_FRAC_SECOND:
			case KW_FUNCTIONS:
			case KW_GENERAL:
			case KW_GENERATED:
			case KW_GO:
			case KW_GOTO:
			case KW_GRANTED:
			case KW_HOP:
			case KW_HOURS:
			case KW_IF:
			case KW_IGNORE:
			case KW_INCREMENT:
			case KW_INPUT:
			case KW_INVOKER:
			case KW_JAR:
			case KW_JARS:
			case KW_JAVA:
			case KW_JSON:
			case KW_JSON_EXECUTION_PLAN:
			case KW_KEY:
			case KW_KEY_MEMBER:
			case KW_KEY_TYPE:
			case KW_LABEL:
			case KW_LAST:
			case KW_LENGTH:
			case KW_LEVEL:
			case KW_LOAD:
			case KW_MAP:
			case KW_MICROSECOND:
			case KW_MILLENNIUM:
			case KW_MILLISECOND:
			case KW_MINUTES:
			case KW_MINVALUE:
			case KW_MODIFY:
			case KW_MODULES:
			case KW_MONTHS:
			case KW_NANOSECOND:
			case KW_NULLS:
			case KW_NUMBER:
			case KW_OPTION:
			case KW_OPTIONS:
			case KW_ORDERING:
			case KW_OUTPUT:
			case KW_OVERWRITE:
			case KW_OVERWRITING:
			case KW_PARTITIONED:
			case KW_PARTITIONS:
			case KW_PASSING:
			case KW_PAST:
			case KW_PATH:
			case KW_PLACING:
			case KW_PLAN:
			case KW_PRECEDING:
			case KW_PRESERVE:
			case KW_PRIOR:
			case KW_PRIVILEGES:
			case KW_PUBLIC:
			case KW_PYTHON:
			case KW_PYTHON_FILES:
			case KW_PYTHON_REQUIREMENTS:
			case KW_PYTHON_DEPENDENCIES:
			case KW_PYTHON_JAR:
			case KW_PYTHON_ARCHIVES:
			case KW_PYTHON_PARAMETER:
			case KW_QUARTER:
			case KW_RAW:
			case KW_READ:
			case KW_RELATIVE:
			case KW_REMOVE:
			case KW_RENAME:
			case KW_REPLACE:
			case KW_RESPECT:
			case KW_RESTART:
			case KW_RESTRICT:
			case KW_ROLE:
			case KW_ROW_COUNT:
			case KW_SCALA:
			case KW_SCALAR:
			case KW_SCALE:
			case KW_SCHEMA:
			case KW_SECONDS:
			case KW_SECTION:
			case KW_SECURITY:
			case KW_SELF:
			case KW_SERVER:
			case KW_SERVER_NAME:
			case KW_SESSION:
			case KW_SETS:
			case KW_SIMPLE:
			case KW_SIZE:
			case KW_SLIDE:
			case KW_SOURCE:
			case KW_SPACE:
			case KW_STATE:
			case KW_STATEMENT:
			case KW_STEP:
			case KW_STRING:
			case KW_STRUCTURE:
			case KW_STYLE:
			case KW_TABLES:
			case KW_TEMPORARY:
			case KW_TIMECOL:
			case KW_FLOOR:
			case KW_TIMESTAMP_LTZ:
			case KW_TIMESTAMPADD:
			case KW_TIMESTAMPDIFF:
			case KW_TO_TIMESTAMP:
			case KW_TRANSFORM:
			case KW_TUMBLE:
			case KW_TYPE:
			case KW_UNDER:
			case KW_UNLOAD:
			case KW_USAGE:
			case KW_USE:
			case KW_UTF16:
			case KW_UTF32:
			case KW_UTF8:
			case KW_VERSION:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_VIRTUAL:
			case KW_WATERMARK:
			case KW_WATERMARKS:
			case KW_WEEK:
			case KW_WORK:
			case KW_WRAPPER:
			case KW_YEARS:
			case KW_ZONE:
			case KW_ABS:
			case KW_ARRAY:
			case KW_AVG:
			case KW_CASE:
			case KW_CAST:
			case KW_CEIL:
			case KW_COALESCE:
			case KW_COLLECT:
			case KW_COUNT:
			case KW_DATE:
			case KW_DAY:
			case KW_EXISTS:
			case KW_FIRST_VALUE:
			case KW_FALSE:
			case KW_FROM_UNIXTIME:
			case KW_GROUPING:
			case KW_HOUR:
			case KW_INTERVAL:
			case KW_LAG:
			case KW_LAST_VALUE:
			case KW_LEAD:
			case KW_LEFT:
			case KW_LOCALTIMESTAMP:
			case KW_MINUTE:
			case KW_MONTH:
			case KW_NOT:
			case KW_NTILE:
			case KW_NULL:
			case KW_OVERLAY:
			case KW_PERCENT_RANK:
			case KW_POSITION:
			case KW_POWER:
			case KW_ROW_NUMBER:
			case KW_RANK:
			case KW_RIGHT:
			case KW_ROW:
			case KW_SECOND:
			case KW_SUBSTRING:
			case KW_SUM:
			case KW_TIME:
			case KW_TIMESTAMP:
			case KW_TIMESTAMP_3:
			case KW_TIMESTAMP_6:
			case KW_TIMESTAMP_9:
			case KW_TRUE:
			case KW_TRUNCATE:
			case KW_UPPER:
			case KW_USER:
			case KW_YEAR:
			case BIT_NOT_OP:
			case LR_BRACKET:
			case DOLLAR:
			case ASTERISK_SIGN:
			case HYPNEN_SIGN:
			case ADD_SIGN:
			case STRING_LITERAL:
			case DIG_LITERAL:
			case REAL_LITERAL:
			case ID_LITERAL:
				{
				setState(924);
				((LimitClauseContext)_localctx).limit = expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionByClauseContext extends ParserRuleContext {
		public TerminalNode KW_PARTITION() { return getToken(FQLParser.KW_PARTITION, 0); }
		public TerminalNode KW_BY() { return getToken(FQLParser.KW_BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public PartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterPartitionByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitPartitionByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitPartitionByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionByClauseContext partitionByClause() throws RecognitionException {
		PartitionByClauseContext _localctx = new PartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_partitionByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(KW_PARTITION);
			setState(928);
			match(KW_BY);
			setState(929);
			expression();
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(930);
				match(COMMA);
				setState(931);
				expression();
				}
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuantifiersContext extends ParserRuleContext {
		public TerminalNode ASTERISK_SIGN() { return getToken(FQLParser.ASTERISK_SIGN, 0); }
		public TerminalNode ADD_SIGN() { return getToken(FQLParser.ADD_SIGN, 0); }
		public TerminalNode QUESTION_MARK_SIGN() { return getToken(FQLParser.QUESTION_MARK_SIGN, 0); }
		public TerminalNode LB_BRACKET() { return getToken(FQLParser.LB_BRACKET, 0); }
		public List<TerminalNode> DIG_LITERAL() { return getTokens(FQLParser.DIG_LITERAL); }
		public TerminalNode DIG_LITERAL(int i) {
			return getToken(FQLParser.DIG_LITERAL, i);
		}
		public TerminalNode COMMA() { return getToken(FQLParser.COMMA, 0); }
		public TerminalNode RB_BRACKET() { return getToken(FQLParser.RB_BRACKET, 0); }
		public QuantifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQuantifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQuantifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQuantifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifiersContext quantifiers() throws RecognitionException {
		QuantifiersContext _localctx = new QuantifiersContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_quantifiers);
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(937);
				match(ASTERISK_SIGN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(938);
				match(ADD_SIGN);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(939);
				match(QUESTION_MARK_SIGN);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(940);
				match(LB_BRACKET);
				setState(941);
				match(DIG_LITERAL);
				setState(942);
				match(COMMA);
				setState(943);
				match(DIG_LITERAL);
				setState(944);
				match(RB_BRACKET);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(945);
				match(LB_BRACKET);
				setState(946);
				match(DIG_LITERAL);
				setState(947);
				match(COMMA);
				setState(948);
				match(RB_BRACKET);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(949);
				match(LB_BRACKET);
				setState(950);
				match(COMMA);
				setState(951);
				match(DIG_LITERAL);
				setState(952);
				match(RB_BRACKET);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MeasuresClauseContext extends ParserRuleContext {
		public TerminalNode KW_MEASURES() { return getToken(FQLParser.KW_MEASURES, 0); }
		public List<ProjectItemDefinitionContext> projectItemDefinition() {
			return getRuleContexts(ProjectItemDefinitionContext.class);
		}
		public ProjectItemDefinitionContext projectItemDefinition(int i) {
			return getRuleContext(ProjectItemDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public MeasuresClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measuresClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMeasuresClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMeasuresClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMeasuresClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasuresClauseContext measuresClause() throws RecognitionException {
		MeasuresClauseContext _localctx = new MeasuresClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_measuresClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(KW_MEASURES);
			setState(956);
			projectItemDefinition();
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(957);
				match(COMMA);
				setState(958);
				projectItemDefinition();
				}
				}
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternDefinitionContext extends ParserRuleContext {
		public TerminalNode KW_PATTERN() { return getToken(FQLParser.KW_PATTERN, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public List<PatternVariableContext> patternVariable() {
			return getRuleContexts(PatternVariableContext.class);
		}
		public PatternVariableContext patternVariable(int i) {
			return getRuleContext(PatternVariableContext.class,i);
		}
		public WithinClauseContext withinClause() {
			return getRuleContext(WithinClauseContext.class,0);
		}
		public PatternDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterPatternDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitPatternDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitPatternDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternDefinitionContext patternDefinition() throws RecognitionException {
		PatternDefinitionContext _localctx = new PatternDefinitionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_patternDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(KW_PATTERN);
			setState(965);
			match(LR_BRACKET);
			setState(967); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(966);
				patternVariable();
				}
				}
				setState(969); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIG_LITERAL || _la==ID_LITERAL );
			setState(971);
			match(RR_BRACKET);
			setState(973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WITHIN) {
				{
				setState(972);
				withinClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternVariableContext extends ParserRuleContext {
		public UnquotedIdentifierContext unquotedIdentifier() {
			return getRuleContext(UnquotedIdentifierContext.class,0);
		}
		public QuantifiersContext quantifiers() {
			return getRuleContext(QuantifiersContext.class,0);
		}
		public PatternVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterPatternVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitPatternVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitPatternVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternVariableContext patternVariable() throws RecognitionException {
		PatternVariableContext _localctx = new PatternVariableContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_patternVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			unquotedIdentifier();
			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 438)) & ~0x3f) == 0 && ((1L << (_la - 438)) & 271361L) != 0)) {
				{
				setState(976);
				quantifiers();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputModeContext extends ParserRuleContext {
		public TerminalNode KW_ALL() { return getToken(FQLParser.KW_ALL, 0); }
		public TerminalNode KW_ROWS() { return getToken(FQLParser.KW_ROWS, 0); }
		public TerminalNode KW_PER() { return getToken(FQLParser.KW_PER, 0); }
		public TerminalNode KW_MATCH() { return getToken(FQLParser.KW_MATCH, 0); }
		public TerminalNode KW_ONE() { return getToken(FQLParser.KW_ONE, 0); }
		public TerminalNode KW_ROW() { return getToken(FQLParser.KW_ROW, 0); }
		public OutputModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterOutputMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitOutputMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitOutputMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputModeContext outputMode() throws RecognitionException {
		OutputModeContext _localctx = new OutputModeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_outputMode);
		try {
			setState(987);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(979);
				match(KW_ALL);
				setState(980);
				match(KW_ROWS);
				setState(981);
				match(KW_PER);
				setState(982);
				match(KW_MATCH);
				}
				break;
			case KW_ONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
				match(KW_ONE);
				setState(984);
				match(KW_ROW);
				setState(985);
				match(KW_PER);
				setState(986);
				match(KW_MATCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AfterMatchStrategyContext extends ParserRuleContext {
		public TerminalNode KW_AFTER() { return getToken(FQLParser.KW_AFTER, 0); }
		public TerminalNode KW_MATCH() { return getToken(FQLParser.KW_MATCH, 0); }
		public TerminalNode KW_SKIP() { return getToken(FQLParser.KW_SKIP, 0); }
		public TerminalNode KW_PAST() { return getToken(FQLParser.KW_PAST, 0); }
		public TerminalNode KW_LAST() { return getToken(FQLParser.KW_LAST, 0); }
		public TerminalNode KW_ROW() { return getToken(FQLParser.KW_ROW, 0); }
		public TerminalNode KW_TO() { return getToken(FQLParser.KW_TO, 0); }
		public TerminalNode KW_NEXT() { return getToken(FQLParser.KW_NEXT, 0); }
		public UnquotedIdentifierContext unquotedIdentifier() {
			return getRuleContext(UnquotedIdentifierContext.class,0);
		}
		public TerminalNode KW_FIRST() { return getToken(FQLParser.KW_FIRST, 0); }
		public AfterMatchStrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afterMatchStrategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterAfterMatchStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitAfterMatchStrategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitAfterMatchStrategy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AfterMatchStrategyContext afterMatchStrategy() throws RecognitionException {
		AfterMatchStrategyContext _localctx = new AfterMatchStrategyContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_afterMatchStrategy);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				match(KW_AFTER);
				setState(990);
				match(KW_MATCH);
				setState(991);
				match(KW_SKIP);
				setState(992);
				match(KW_PAST);
				setState(993);
				match(KW_LAST);
				setState(994);
				match(KW_ROW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				match(KW_AFTER);
				setState(996);
				match(KW_MATCH);
				setState(997);
				match(KW_SKIP);
				setState(998);
				match(KW_TO);
				setState(999);
				match(KW_NEXT);
				setState(1000);
				match(KW_ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1001);
				match(KW_AFTER);
				setState(1002);
				match(KW_MATCH);
				setState(1003);
				match(KW_SKIP);
				setState(1004);
				match(KW_TO);
				setState(1005);
				match(KW_LAST);
				setState(1006);
				unquotedIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1007);
				match(KW_AFTER);
				setState(1008);
				match(KW_MATCH);
				setState(1009);
				match(KW_SKIP);
				setState(1010);
				match(KW_TO);
				setState(1011);
				match(KW_FIRST);
				setState(1012);
				unquotedIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternVariablesDefinitionContext extends ParserRuleContext {
		public TerminalNode KW_DEFINE() { return getToken(FQLParser.KW_DEFINE, 0); }
		public List<ProjectItemDefinitionContext> projectItemDefinition() {
			return getRuleContexts(ProjectItemDefinitionContext.class);
		}
		public ProjectItemDefinitionContext projectItemDefinition(int i) {
			return getRuleContext(ProjectItemDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public PatternVariablesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternVariablesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterPatternVariablesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitPatternVariablesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitPatternVariablesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternVariablesDefinitionContext patternVariablesDefinition() throws RecognitionException {
		PatternVariablesDefinitionContext _localctx = new PatternVariablesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_patternVariablesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(KW_DEFINE);
			setState(1016);
			projectItemDefinition();
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1017);
				match(COMMA);
				setState(1018);
				projectItemDefinition();
				}
				}
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowFrameContext extends ParserRuleContext {
		public TerminalNode KW_RANGE() { return getToken(FQLParser.KW_RANGE, 0); }
		public TerminalNode KW_BETWEEN() { return getToken(FQLParser.KW_BETWEEN, 0); }
		public TimeIntervalExpressionContext timeIntervalExpression() {
			return getRuleContext(TimeIntervalExpressionContext.class,0);
		}
		public FrameBoundContext frameBound() {
			return getRuleContext(FrameBoundContext.class,0);
		}
		public TerminalNode KW_ROWS() { return getToken(FQLParser.KW_ROWS, 0); }
		public TerminalNode DIG_LITERAL() { return getToken(FQLParser.DIG_LITERAL, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_windowFrame);
		try {
			setState(1033);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				match(KW_RANGE);
				setState(1025);
				match(KW_BETWEEN);
				setState(1026);
				timeIntervalExpression();
				setState(1027);
				frameBound();
				}
				break;
			case KW_ROWS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				match(KW_ROWS);
				setState(1030);
				match(KW_BETWEEN);
				setState(1031);
				match(DIG_LITERAL);
				setState(1032);
				frameBound();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FrameBoundContext extends ParserRuleContext {
		public TerminalNode KW_PRECEDING() { return getToken(FQLParser.KW_PRECEDING, 0); }
		public TerminalNode KW_AND() { return getToken(FQLParser.KW_AND, 0); }
		public TerminalNode KW_CURRENT() { return getToken(FQLParser.KW_CURRENT, 0); }
		public TerminalNode KW_ROW() { return getToken(FQLParser.KW_ROW, 0); }
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_frameBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(KW_PRECEDING);
			setState(1036);
			match(KW_AND);
			setState(1037);
			match(KW_CURRENT);
			setState(1038);
			match(KW_ROW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WithinClauseContext extends ParserRuleContext {
		public TerminalNode KW_WITHIN() { return getToken(FQLParser.KW_WITHIN, 0); }
		public TimeIntervalExpressionContext timeIntervalExpression() {
			return getRuleContext(TimeIntervalExpressionContext.class,0);
		}
		public WithinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterWithinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitWithinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitWithinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithinClauseContext withinClause() throws RecognitionException {
		WithinClauseContext _localctx = new WithinClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_withinClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(KW_WITHIN);
			setState(1041);
			timeIntervalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnalyzePartitionDefinitionContext extends ParserRuleContext {
		public TerminalNode KW_PARTITION() { return getToken(FQLParser.KW_PARTITION, 0); }
		public TableCanHasKeyPropertyListContext tableCanHasKeyPropertyList() {
			return getRuleContext(TableCanHasKeyPropertyListContext.class,0);
		}
		public AnalyzePartitionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyzePartitionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterAnalyzePartitionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitAnalyzePartitionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitAnalyzePartitionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnalyzePartitionDefinitionContext analyzePartitionDefinition() throws RecognitionException {
		AnalyzePartitionDefinitionContext _localctx = new AnalyzePartitionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_analyzePartitionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			match(KW_PARTITION);
			setState(1044);
			tableCanHasKeyPropertyList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfDefinitionClauseContext extends ParserRuleContext {
		public TerminalNode KW_PERIOD() { return getToken(FQLParser.KW_PERIOD, 0); }
		public TerminalNode KW_FOR() { return getToken(FQLParser.KW_FOR, 0); }
		public TerminalNode KW_SYSTEM_TIME() { return getToken(FQLParser.KW_SYSTEM_TIME, 0); }
		public SelfDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfDefinitionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSelfDefinitionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSelfDefinitionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSelfDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfDefinitionClauseContext selfDefinitionClause() throws RecognitionException {
		SelfDefinitionClauseContext _localctx = new SelfDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_selfDefinitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			match(KW_PERIOD);
			setState(1047);
			match(KW_FOR);
			setState(1048);
			match(KW_SYSTEM_TIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionDefinitionContext extends ParserRuleContext {
		public TerminalNode KW_PARTITIONED() { return getToken(FQLParser.KW_PARTITIONED, 0); }
		public TerminalNode KW_BY() { return getToken(FQLParser.KW_BY, 0); }
		public TransformListContext transformList() {
			return getRuleContext(TransformListContext.class,0);
		}
		public PartitionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterPartitionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitPartitionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitPartitionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionDefinitionContext partitionDefinition() throws RecognitionException {
		PartitionDefinitionContext _localctx = new PartitionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_partitionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			match(KW_PARTITIONED);
			setState(1051);
			match(KW_BY);
			setState(1052);
			transformList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransformListContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public List<TransformContext> transform() {
			return getRuleContexts(TransformContext.class);
		}
		public TransformContext transform(int i) {
			return getRuleContext(TransformContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public TransformListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransformList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransformList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransformList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformListContext transformList() throws RecognitionException {
		TransformListContext _localctx = new TransformListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_transformList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			match(LR_BRACKET);
			setState(1055);
			transform();
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1056);
				match(COMMA);
				setState(1057);
				transform();
				}
				}
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1063);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitIdentityTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitIdentityTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitApplyTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitApplyTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_transform);
		int _la;
		try {
			setState(1078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1065);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(1067);
				match(LR_BRACKET);
				setState(1068);
				transformArgument();
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1069);
					match(COMMA);
					setState(1070);
					transformArgument();
					}
					}
					setState(1075);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1076);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransformArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransformArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_transformArgument);
		try {
			setState(1082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LikeDefinitionContext extends ParserRuleContext {
		public TerminalNode KW_LIKE() { return getToken(FQLParser.KW_LIKE, 0); }
		public TablePathContext tablePath() {
			return getRuleContext(TablePathContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public List<LikeOptionContext> likeOption() {
			return getRuleContexts(LikeOptionContext.class);
		}
		public LikeOptionContext likeOption(int i) {
			return getRuleContext(LikeOptionContext.class,i);
		}
		public LikeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterLikeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitLikeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitLikeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeDefinitionContext likeDefinition() throws RecognitionException {
		LikeDefinitionContext _localctx = new LikeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_likeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			match(KW_LIKE);
			setState(1085);
			tablePath();
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(1086);
				match(LR_BRACKET);
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KW_EXCLUDING || _la==KW_OVERWRITING || _la==KW_INCLUDING) {
					{
					{
					setState(1087);
					likeOption();
					}
					}
					setState(1092);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1093);
				match(RR_BRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DistributedContext extends ParserRuleContext {
		public TerminalNode KW_DISTRIBUTED() { return getToken(FQLParser.KW_DISTRIBUTED, 0); }
		public TerminalNode KW_BY() { return getToken(FQLParser.KW_BY, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public TerminalNode KW_INTO() { return getToken(FQLParser.KW_INTO, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode KW_BUCKETS() { return getToken(FQLParser.KW_BUCKETS, 0); }
		public TerminalNode KW_HASH() { return getToken(FQLParser.KW_HASH, 0); }
		public DistributedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distributed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterDistributed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitDistributed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitDistributed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistributedContext distributed() throws RecognitionException {
		DistributedContext _localctx = new DistributedContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_distributed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			match(KW_DISTRIBUTED);
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_BY) {
				{
				setState(1097);
				match(KW_BY);
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_HASH) {
					{
					setState(1098);
					match(KW_HASH);
					}
				}

				setState(1101);
				match(LR_BRACKET);
				setState(1102);
				identifier();
				setState(1103);
				match(RR_BRACKET);
				}
			}

			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_INTO) {
				{
				setState(1107);
				match(KW_INTO);
				setState(1108);
				decimalLiteral();
				setState(1109);
				match(KW_BUCKETS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DistributionContext extends ParserRuleContext {
		public TerminalNode KW_DISTRIBUTION() { return getToken(FQLParser.KW_DISTRIBUTION, 0); }
		public TerminalNode KW_BY() { return getToken(FQLParser.KW_BY, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public TerminalNode KW_INTO() { return getToken(FQLParser.KW_INTO, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode KW_BUCKETS() { return getToken(FQLParser.KW_BUCKETS, 0); }
		public TerminalNode KW_HASH() { return getToken(FQLParser.KW_HASH, 0); }
		public DistributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterDistribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitDistribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitDistribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistributionContext distribution() throws RecognitionException {
		DistributionContext _localctx = new DistributionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_distribution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			match(KW_DISTRIBUTION);
			setState(1122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_BY) {
				{
				setState(1114);
				match(KW_BY);
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_HASH) {
					{
					setState(1115);
					match(KW_HASH);
					}
				}

				setState(1118);
				match(LR_BRACKET);
				setState(1119);
				identifier();
				setState(1120);
				match(RR_BRACKET);
				}
			}

			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_INTO) {
				{
				setState(1124);
				match(KW_INTO);
				setState(1125);
				decimalLiteral();
				setState(1126);
				match(KW_BUCKETS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LikeOptionContext extends ParserRuleContext {
		public TerminalNode KW_INCLUDING() { return getToken(FQLParser.KW_INCLUDING, 0); }
		public TerminalNode KW_EXCLUDING() { return getToken(FQLParser.KW_EXCLUDING, 0); }
		public TerminalNode KW_ALL() { return getToken(FQLParser.KW_ALL, 0); }
		public TerminalNode KW_CONSTRAINTS() { return getToken(FQLParser.KW_CONSTRAINTS, 0); }
		public TerminalNode KW_PARTITIONS() { return getToken(FQLParser.KW_PARTITIONS, 0); }
		public TerminalNode KW_OVERWRITING() { return getToken(FQLParser.KW_OVERWRITING, 0); }
		public TerminalNode KW_GENERATED() { return getToken(FQLParser.KW_GENERATED, 0); }
		public TerminalNode KW_OPTIONS() { return getToken(FQLParser.KW_OPTIONS, 0); }
		public TerminalNode KW_WATERMARKS() { return getToken(FQLParser.KW_WATERMARKS, 0); }
		public LikeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterLikeOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitLikeOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitLikeOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeOptionContext likeOption() throws RecognitionException {
		LikeOptionContext _localctx = new LikeOptionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_likeOption);
		int _la;
		try {
			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1130);
				_la = _input.LA(1);
				if ( !(_la==KW_EXCLUDING || _la==KW_INCLUDING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1131);
				_la = _input.LA(1);
				if ( !(_la==KW_CONSTRAINTS || _la==KW_PARTITIONS || _la==KW_ALL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1132);
				_la = _input.LA(1);
				if ( !(_la==KW_EXCLUDING || _la==KW_OVERWRITING || _la==KW_INCLUDING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1133);
				_la = _input.LA(1);
				if ( !(_la==KW_GENERATED || _la==KW_OPTIONS || _la==KW_WATERMARKS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnOptionDefinitionContext extends ParserRuleContext {
		public PhysicalColumnDefinitionContext physicalColumnDefinition() {
			return getRuleContext(PhysicalColumnDefinitionContext.class,0);
		}
		public MetadataColumnDefinitionContext metadataColumnDefinition() {
			return getRuleContext(MetadataColumnDefinitionContext.class,0);
		}
		public ComputedColumnDefinitionContext computedColumnDefinition() {
			return getRuleContext(ComputedColumnDefinitionContext.class,0);
		}
		public ColumnOptionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOptionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterColumnOptionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitColumnOptionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitColumnOptionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnOptionDefinitionContext columnOptionDefinition() throws RecognitionException {
		ColumnOptionDefinitionContext _localctx = new ColumnOptionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_columnOptionDefinition);
		try {
			setState(1139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1136);
				physicalColumnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1137);
				metadataColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1138);
				computedColumnDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PhysicalColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColumnTypeContext columnType() {
			return getRuleContext(ColumnTypeContext.class,0);
		}
		public ColumnConstraintContext columnConstraint() {
			return getRuleContext(ColumnConstraintContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public PhysicalColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physicalColumnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterPhysicalColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitPhysicalColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitPhysicalColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhysicalColumnDefinitionContext physicalColumnDefinition() throws RecognitionException {
		PhysicalColumnDefinitionContext _localctx = new PhysicalColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_physicalColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			columnName();
			setState(1142);
			columnType();
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONSTRAINT || ((((_la - 326)) & ~0x3f) == 0 && ((1L << (_la - 326)) & 8388617L) != 0)) {
				{
				setState(1143);
				columnConstraint();
				}
			}

			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(1146);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComputedColumnExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComputedColumnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computedColumnExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterComputedColumnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitComputedColumnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitComputedColumnExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputedColumnExpressionContext computedColumnExpression() throws RecognitionException {
		ComputedColumnExpressionContext _localctx = new ComputedColumnExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_computedColumnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WatermarkDefinitionContext extends ParserRuleContext {
		public TerminalNode KW_WATERMARK() { return getToken(FQLParser.KW_WATERMARK, 0); }
		public TerminalNode KW_FOR() { return getToken(FQLParser.KW_FOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode KW_AS() { return getToken(FQLParser.KW_AS, 0); }
		public List<UidContext> uid() {
			return getRuleContexts(UidContext.class);
		}
		public UidContext uid(int i) {
			return getRuleContext(UidContext.class,i);
		}
		public TimeIntervalExpressionContext timeIntervalExpression() {
			return getRuleContext(TimeIntervalExpressionContext.class,0);
		}
		public WatermarkDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_watermarkDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterWatermarkDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitWatermarkDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitWatermarkDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WatermarkDefinitionContext watermarkDefinition() throws RecognitionException {
		WatermarkDefinitionContext _localctx = new WatermarkDefinitionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_watermarkDefinition);
		int _la;
		try {
			setState(1168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1151);
				match(KW_WATERMARK);
				setState(1152);
				match(KW_FOR);
				setState(1153);
				expression();
				setState(1154);
				match(KW_AS);
				setState(1155);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1157);
				match(KW_WATERMARK);
				setState(1158);
				match(KW_FOR);
				setState(1161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1159);
					uid();
					}
					break;
				case 2:
					{
					setState(1160);
					expression();
					}
					break;
				}
				setState(1163);
				match(KW_AS);
				setState(1164);
				uid();
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_INTERVAL) {
					{
					setState(1165);
					timeIntervalExpression();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableConstraintContext extends ParserRuleContext {
		public TerminalNode KW_PRIMARY() { return getToken(FQLParser.KW_PRIMARY, 0); }
		public TerminalNode KW_KEY() { return getToken(FQLParser.KW_KEY, 0); }
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public TerminalNode KW_NOT() { return getToken(FQLParser.KW_NOT, 0); }
		public TerminalNode KW_ENFORCED() { return getToken(FQLParser.KW_ENFORCED, 0); }
		public TerminalNode KW_CONSTRAINT() { return getToken(FQLParser.KW_CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTableConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTableConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTableConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_tableConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONSTRAINT) {
				{
				setState(1170);
				match(KW_CONSTRAINT);
				setState(1171);
				constraintName();
				}
			}

			setState(1174);
			match(KW_PRIMARY);
			setState(1175);
			match(KW_KEY);
			setState(1176);
			columnNameList();
			setState(1177);
			match(KW_NOT);
			setState(1178);
			match(KW_ENFORCED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstraintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterConstraintName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitConstraintName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitConstraintName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintNameContext constraintName() throws RecognitionException {
		ConstraintNameContext _localctx = new ConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_constraintName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesDefinitionContext extends ParserRuleContext {
		public TerminalNode KW_VALUES() { return getToken(FQLParser.KW_VALUES, 0); }
		public List<ValuesRowDefinitionContext> valuesRowDefinition() {
			return getRuleContexts(ValuesRowDefinitionContext.class);
		}
		public ValuesRowDefinitionContext valuesRowDefinition(int i) {
			return getRuleContext(ValuesRowDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public ValuesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterValuesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitValuesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitValuesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesDefinitionContext valuesDefinition() throws RecognitionException {
		ValuesDefinitionContext _localctx = new ValuesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_valuesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(KW_VALUES);
			setState(1183);
			valuesRowDefinition();
			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1184);
				match(COMMA);
				setState(1185);
				valuesRowDefinition();
				}
				}
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesRowDefinitionContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public ValuesRowDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesRowDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterValuesRowDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitValuesRowDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitValuesRowDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesRowDefinitionContext valuesRowDefinition() throws RecognitionException {
		ValuesRowDefinitionContext _localctx = new ValuesRowDefinitionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_valuesRowDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			match(LR_BRACKET);
			setState(1192);
			constant();
			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1193);
				match(COMMA);
				setState(1194);
				constant();
				}
				}
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1200);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LengthOneDimensionContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public LengthOneDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthOneDimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterLengthOneDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitLengthOneDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitLengthOneDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthOneDimensionContext lengthOneDimension() throws RecognitionException {
		LengthOneDimensionContext _localctx = new LengthOneDimensionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_lengthOneDimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			match(LR_BRACKET);
			setState(1203);
			decimalLiteral();
			setState(1204);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LengthTwoOptionalDimensionContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public List<DecimalLiteralContext> decimalLiteral() {
			return getRuleContexts(DecimalLiteralContext.class);
		}
		public DecimalLiteralContext decimalLiteral(int i) {
			return getRuleContext(DecimalLiteralContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(FQLParser.COMMA, 0); }
		public LengthTwoOptionalDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthTwoOptionalDimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterLengthTwoOptionalDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitLengthTwoOptionalDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitLengthTwoOptionalDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthTwoOptionalDimensionContext lengthTwoOptionalDimension() throws RecognitionException {
		LengthTwoOptionalDimensionContext _localctx = new LengthTwoOptionalDimensionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_lengthTwoOptionalDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			match(LR_BRACKET);
			setState(1207);
			decimalLiteral();
			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1208);
				match(COMMA);
				setState(1209);
				decimalLiteral();
				}
			}

			setState(1212);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LengthTwoStringDimensionContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(FQLParser.COMMA, 0); }
		public LengthTwoStringDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthTwoStringDimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterLengthTwoStringDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitLengthTwoStringDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitLengthTwoStringDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthTwoStringDimensionContext lengthTwoStringDimension() throws RecognitionException {
		LengthTwoStringDimensionContext _localctx = new LengthTwoStringDimensionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_lengthTwoStringDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(LR_BRACKET);
			setState(1215);
			stringLiteral();
			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1216);
				match(COMMA);
				setState(1217);
				stringLiteral();
				}
			}

			setState(1220);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LengthOneTypeDimensionContext extends ParserRuleContext {
		public LengthOneTypeDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthOneTypeDimension; }
	 
		public LengthOneTypeDimensionContext() { }
		public void copyFrom(LengthOneTypeDimensionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LengthSymbolsTypeDimensionContext extends LengthOneTypeDimensionContext {
		public TerminalNode LESS_SYMBOL() { return getToken(FQLParser.LESS_SYMBOL, 0); }
		public List<ColumnTypeContext> columnType() {
			return getRuleContexts(ColumnTypeContext.class);
		}
		public ColumnTypeContext columnType(int i) {
			return getRuleContext(ColumnTypeContext.class,i);
		}
		public TerminalNode GREATER_SYMBOL() { return getToken(FQLParser.GREATER_SYMBOL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public LengthSymbolsTypeDimensionContext(LengthOneTypeDimensionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterLengthSymbolsTypeDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitLengthSymbolsTypeDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitLengthSymbolsTypeDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthOneTypeDimensionContext lengthOneTypeDimension() throws RecognitionException {
		LengthOneTypeDimensionContext _localctx = new LengthOneTypeDimensionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_lengthOneTypeDimension);
		int _la;
		try {
			_localctx = new LengthSymbolsTypeDimensionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			match(LESS_SYMBOL);
			setState(1223);
			columnType();
			setState(1228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1224);
				match(COMMA);
				setState(1225);
				columnType();
				}
				}
				setState(1230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1231);
			match(GREATER_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapTypeDimensionContext extends ParserRuleContext {
		public TerminalNode LESS_SYMBOL() { return getToken(FQLParser.LESS_SYMBOL, 0); }
		public List<ColumnTypeContext> columnType() {
			return getRuleContexts(ColumnTypeContext.class);
		}
		public ColumnTypeContext columnType(int i) {
			return getRuleContext(ColumnTypeContext.class,i);
		}
		public TerminalNode GREATER_SYMBOL() { return getToken(FQLParser.GREATER_SYMBOL, 0); }
		public TerminalNode COMMA() { return getToken(FQLParser.COMMA, 0); }
		public MapTypeDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapTypeDimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapTypeDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapTypeDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapTypeDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapTypeDimensionContext mapTypeDimension() throws RecognitionException {
		MapTypeDimensionContext _localctx = new MapTypeDimensionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_mapTypeDimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			match(LESS_SYMBOL);
			setState(1234);
			columnType();
			{
			setState(1235);
			match(COMMA);
			setState(1236);
			columnType();
			}
			setState(1238);
			match(GREATER_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowTypeDimensionContext extends ParserRuleContext {
		public RowTypeDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowTypeDimension; }
	 
		public RowTypeDimensionContext() { }
		public void copyFrom(RowTypeDimensionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowSymbolsTypeDimensionContext extends RowTypeDimensionContext {
		public TerminalNode LESS_SYMBOL() { return getToken(FQLParser.LESS_SYMBOL, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<ColumnTypeContext> columnType() {
			return getRuleContexts(ColumnTypeContext.class);
		}
		public ColumnTypeContext columnType(int i) {
			return getRuleContext(ColumnTypeContext.class,i);
		}
		public TerminalNode GREATER_SYMBOL() { return getToken(FQLParser.GREATER_SYMBOL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public RowSymbolsTypeDimensionContext(RowTypeDimensionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterRowSymbolsTypeDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitRowSymbolsTypeDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitRowSymbolsTypeDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowTypeDimensionContext rowTypeDimension() throws RecognitionException {
		RowTypeDimensionContext _localctx = new RowTypeDimensionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_rowTypeDimension);
		int _la;
		try {
			_localctx = new RowSymbolsTypeDimensionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			match(LESS_SYMBOL);
			setState(1241);
			columnName();
			setState(1242);
			columnType();
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1243);
				match(COMMA);
				setState(1244);
				columnName();
				setState(1245);
				columnType();
				}
				}
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1252);
			match(GREATER_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnConstraintContext extends ParserRuleContext {
		public TerminalNode KW_PRIMARY() { return getToken(FQLParser.KW_PRIMARY, 0); }
		public TerminalNode KW_KEY() { return getToken(FQLParser.KW_KEY, 0); }
		public TerminalNode KW_CONSTRAINT() { return getToken(FQLParser.KW_CONSTRAINT, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public TerminalNode KW_NOT() { return getToken(FQLParser.KW_NOT, 0); }
		public TerminalNode KW_ENFORCED() { return getToken(FQLParser.KW_ENFORCED, 0); }
		public TerminalNode KW_NULL() { return getToken(FQLParser.KW_NULL, 0); }
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterColumnConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitColumnConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitColumnConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_columnConstraint);
		int _la;
		try {
			setState(1268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CONSTRAINT:
			case KW_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_CONSTRAINT) {
					{
					setState(1254);
					match(KW_CONSTRAINT);
					setState(1255);
					constraintName();
					}
				}

				setState(1258);
				match(KW_PRIMARY);
				setState(1259);
				match(KW_KEY);
				setState(1262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(1260);
					match(KW_NOT);
					setState(1261);
					match(KW_ENFORCED);
					}
				}

				}
				break;
			case KW_NOT:
			case KW_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(1264);
					match(KW_NOT);
					}
				}

				setState(1267);
				match(KW_NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode KW_COMMENT() { return getToken(FQLParser.KW_COMMENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FQLParser.STRING_LITERAL, 0); }
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitCommentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitCommentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(KW_COMMENT);
			setState(1271);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MetadataColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColumnTypeContext columnType() {
			return getRuleContext(ColumnTypeContext.class,0);
		}
		public TerminalNode KW_METADATA() { return getToken(FQLParser.KW_METADATA, 0); }
		public TerminalNode KW_FROM() { return getToken(FQLParser.KW_FROM, 0); }
		public MetadataKeyContext metadataKey() {
			return getRuleContext(MetadataKeyContext.class,0);
		}
		public TerminalNode KW_VIRTUAL() { return getToken(FQLParser.KW_VIRTUAL, 0); }
		public MetadataColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataColumnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMetadataColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMetadataColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMetadataColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataColumnDefinitionContext metadataColumnDefinition() throws RecognitionException {
		MetadataColumnDefinitionContext _localctx = new MetadataColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_metadataColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			columnName();
			setState(1274);
			columnType();
			setState(1275);
			match(KW_METADATA);
			setState(1278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FROM) {
				{
				setState(1276);
				match(KW_FROM);
				setState(1277);
				metadataKey();
				}
			}

			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_VIRTUAL) {
				{
				setState(1280);
				match(KW_VIRTUAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MetadataKeyContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(FQLParser.STRING_LITERAL, 0); }
		public MetadataKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMetadataKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMetadataKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMetadataKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataKeyContext metadataKey() throws RecognitionException {
		MetadataKeyContext _localctx = new MetadataKeyContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_metadataKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComputedColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(FQLParser.KW_AS, 0); }
		public ComputedColumnExpressionContext computedColumnExpression() {
			return getRuleContext(ComputedColumnExpressionContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ComputedColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computedColumnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterComputedColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitComputedColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitComputedColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputedColumnDefinitionContext computedColumnDefinition() throws RecognitionException {
		ComputedColumnDefinitionContext _localctx = new ComputedColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_computedColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			columnName();
			setState(1286);
			match(KW_AS);
			setState(1287);
			computedColumnExpression();
			setState(1289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(1288);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_columnName);
		try {
			setState(1293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1291);
				uid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1292);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameListContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public ColumnNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterColumnNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitColumnNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitColumnNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameListContext columnNameList() throws RecognitionException {
		ColumnNameListContext _localctx = new ColumnNameListContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_columnNameList);
		int _la;
		try {
			setState(1314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1295);
				match(LR_BRACKET);
				setState(1296);
				columnName();
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1297);
					match(COMMA);
					setState(1298);
					columnName();
					}
					}
					setState(1303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1304);
				match(RR_BRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1306);
				columnName();
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1307);
					match(COMMA);
					setState(1308);
					columnName();
					}
					}
					setState(1313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnTypeContext extends ParserRuleContext {
		public Token typeName;
		public Token type;
		public TerminalNode KW_DATE() { return getToken(FQLParser.KW_DATE, 0); }
		public TerminalNode KW_BOOLEAN() { return getToken(FQLParser.KW_BOOLEAN, 0); }
		public TerminalNode KW_NULL() { return getToken(FQLParser.KW_NULL, 0); }
		public TerminalNode KW_CHAR() { return getToken(FQLParser.KW_CHAR, 0); }
		public TerminalNode KW_VARCHAR() { return getToken(FQLParser.KW_VARCHAR, 0); }
		public TerminalNode KW_STRING() { return getToken(FQLParser.KW_STRING, 0); }
		public TerminalNode KW_BINARY() { return getToken(FQLParser.KW_BINARY, 0); }
		public TerminalNode KW_VARBINARY() { return getToken(FQLParser.KW_VARBINARY, 0); }
		public TerminalNode KW_BYTES() { return getToken(FQLParser.KW_BYTES, 0); }
		public TerminalNode KW_TINYINT() { return getToken(FQLParser.KW_TINYINT, 0); }
		public TerminalNode KW_SMALLINT() { return getToken(FQLParser.KW_SMALLINT, 0); }
		public TerminalNode KW_INT() { return getToken(FQLParser.KW_INT, 0); }
		public TerminalNode KW_INTEGER() { return getToken(FQLParser.KW_INTEGER, 0); }
		public TerminalNode KW_BIGINT() { return getToken(FQLParser.KW_BIGINT, 0); }
		public TerminalNode KW_TIME() { return getToken(FQLParser.KW_TIME, 0); }
		public TerminalNode KW_TIMESTAMP_LTZ() { return getToken(FQLParser.KW_TIMESTAMP_LTZ, 0); }
		public TerminalNode KW_DATETIME() { return getToken(FQLParser.KW_DATETIME, 0); }
		public LengthOneDimensionContext lengthOneDimension() {
			return getRuleContext(LengthOneDimensionContext.class,0);
		}
		public TerminalNode KW_TIMESTAMP() { return getToken(FQLParser.KW_TIMESTAMP, 0); }
		public TerminalNode KW_ZONE() { return getToken(FQLParser.KW_ZONE, 0); }
		public TerminalNode KW_WITHOUT() { return getToken(FQLParser.KW_WITHOUT, 0); }
		public TerminalNode KW_WITH() { return getToken(FQLParser.KW_WITH, 0); }
		public TerminalNode KW_LOCAL() { return getToken(FQLParser.KW_LOCAL, 0); }
		public TerminalNode KW_TIMESTAMP_3() { return getToken(FQLParser.KW_TIMESTAMP_3, 0); }
		public TerminalNode KW_TIMESTAMP_6() { return getToken(FQLParser.KW_TIMESTAMP_6, 0); }
		public TerminalNode KW_TIMESTAMP_9() { return getToken(FQLParser.KW_TIMESTAMP_9, 0); }
		public TerminalNode KW_DECIMAL() { return getToken(FQLParser.KW_DECIMAL, 0); }
		public TerminalNode KW_DEC() { return getToken(FQLParser.KW_DEC, 0); }
		public TerminalNode KW_NUMERIC() { return getToken(FQLParser.KW_NUMERIC, 0); }
		public TerminalNode KW_FLOAT() { return getToken(FQLParser.KW_FLOAT, 0); }
		public TerminalNode KW_DOUBLE() { return getToken(FQLParser.KW_DOUBLE, 0); }
		public LengthTwoOptionalDimensionContext lengthTwoOptionalDimension() {
			return getRuleContext(LengthTwoOptionalDimensionContext.class,0);
		}
		public TerminalNode KW_ARRAY() { return getToken(FQLParser.KW_ARRAY, 0); }
		public TerminalNode KW_MULTISET() { return getToken(FQLParser.KW_MULTISET, 0); }
		public LengthOneTypeDimensionContext lengthOneTypeDimension() {
			return getRuleContext(LengthOneTypeDimensionContext.class,0);
		}
		public TerminalNode KW_MAP() { return getToken(FQLParser.KW_MAP, 0); }
		public MapTypeDimensionContext mapTypeDimension() {
			return getRuleContext(MapTypeDimensionContext.class,0);
		}
		public TerminalNode KW_ROW() { return getToken(FQLParser.KW_ROW, 0); }
		public RowTypeDimensionContext rowTypeDimension() {
			return getRuleContext(RowTypeDimensionContext.class,0);
		}
		public TerminalNode KW_RAW() { return getToken(FQLParser.KW_RAW, 0); }
		public LengthTwoStringDimensionContext lengthTwoStringDimension() {
			return getRuleContext(LengthTwoStringDimensionContext.class,0);
		}
		public ColumnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterColumnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitColumnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitColumnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnTypeContext columnType() throws RecognitionException {
		ColumnTypeContext _localctx = new ColumnTypeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_columnType);
		int _la;
		try {
			setState(1389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_BOOLEAN:
			case KW_DATE:
			case KW_NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1316);
				((ColumnTypeContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==KW_BOOLEAN || _la==KW_DATE || _la==KW_NULL) ) {
					((ColumnTypeContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case KW_BYTES:
			case KW_STRING:
			case KW_TIMESTAMP_LTZ:
			case KW_BIGINT:
			case KW_BINARY:
			case KW_CHAR:
			case KW_DATETIME:
			case KW_INT:
			case KW_INTEGER:
			case KW_SMALLINT:
			case KW_TIME:
			case KW_TINYINT:
			case KW_VARBINARY:
			case KW_VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1317);
				((ColumnTypeContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==KW_BYTES || ((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & 2306687434143826049L) != 0) || ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & 1688849860263937L) != 0) || ((((_la - 369)) & ~0x3f) == 0 && ((1L << (_la - 369)) & 51539877889L) != 0)) ) {
					((ColumnTypeContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(1318);
					lengthOneDimension();
					}
				}

				}
				break;
			case KW_TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1321);
				((ColumnTypeContext)_localctx).typeName = match(KW_TIMESTAMP);
				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(1322);
					lengthOneDimension();
					}
				}

				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WITH || _la==KW_WITHOUT) {
					{
					setState(1325);
					_la = _input.LA(1);
					if ( !(_la==KW_WITH || _la==KW_WITHOUT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1327);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_LOCAL) {
						{
						setState(1326);
						match(KW_LOCAL);
						}
					}

					setState(1329);
					match(KW_TIME);
					setState(1330);
					match(KW_ZONE);
					}
				}

				}
				break;
			case KW_TIMESTAMP_3:
				enterOuterAlt(_localctx, 4);
				{
				setState(1333);
				((ColumnTypeContext)_localctx).typeName = match(KW_TIMESTAMP_3);
				setState(1335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(1334);
					lengthOneDimension();
					}
				}

				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WITH || _la==KW_WITHOUT) {
					{
					setState(1337);
					_la = _input.LA(1);
					if ( !(_la==KW_WITH || _la==KW_WITHOUT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1339);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_LOCAL) {
						{
						setState(1338);
						match(KW_LOCAL);
						}
					}

					setState(1341);
					match(KW_TIME);
					setState(1342);
					match(KW_ZONE);
					}
				}

				}
				break;
			case KW_TIMESTAMP_6:
				enterOuterAlt(_localctx, 5);
				{
				setState(1345);
				((ColumnTypeContext)_localctx).typeName = match(KW_TIMESTAMP_6);
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(1346);
					lengthOneDimension();
					}
				}

				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WITH || _la==KW_WITHOUT) {
					{
					setState(1349);
					_la = _input.LA(1);
					if ( !(_la==KW_WITH || _la==KW_WITHOUT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1351);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_LOCAL) {
						{
						setState(1350);
						match(KW_LOCAL);
						}
					}

					setState(1353);
					match(KW_TIME);
					setState(1354);
					match(KW_ZONE);
					}
				}

				}
				break;
			case KW_TIMESTAMP_9:
				enterOuterAlt(_localctx, 6);
				{
				setState(1357);
				((ColumnTypeContext)_localctx).typeName = match(KW_TIMESTAMP_9);
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(1358);
					lengthOneDimension();
					}
				}

				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WITH || _la==KW_WITHOUT) {
					{
					setState(1361);
					_la = _input.LA(1);
					if ( !(_la==KW_WITH || _la==KW_WITHOUT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1363);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_LOCAL) {
						{
						setState(1362);
						match(KW_LOCAL);
						}
					}

					setState(1365);
					match(KW_TIME);
					setState(1366);
					match(KW_ZONE);
					}
				}

				}
				break;
			case KW_DEC:
			case KW_DECIMAL:
			case KW_DOUBLE:
			case KW_FLOAT:
			case KW_NUMERIC:
				enterOuterAlt(_localctx, 7);
				{
				setState(1369);
				((ColumnTypeContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 245)) & ~0x3f) == 0 && ((1L << (_la - 245)) & 268437507L) != 0) || _la==KW_NUMERIC) ) {
					((ColumnTypeContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(1370);
					lengthTwoOptionalDimension();
					}
				}

				}
				break;
			case KW_ARRAY:
			case KW_MULTISET:
				enterOuterAlt(_localctx, 8);
				{
				setState(1373);
				((ColumnTypeContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==KW_ARRAY || _la==KW_MULTISET) ) {
					((ColumnTypeContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS_SYMBOL) {
					{
					setState(1374);
					lengthOneTypeDimension();
					}
				}

				}
				break;
			case KW_MAP:
				enterOuterAlt(_localctx, 9);
				{
				setState(1377);
				((ColumnTypeContext)_localctx).type = match(KW_MAP);
				setState(1379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS_SYMBOL) {
					{
					setState(1378);
					mapTypeDimension();
					}
				}

				}
				break;
			case KW_ROW:
				enterOuterAlt(_localctx, 10);
				{
				setState(1381);
				((ColumnTypeContext)_localctx).type = match(KW_ROW);
				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS_SYMBOL) {
					{
					setState(1382);
					rowTypeDimension();
					}
				}

				}
				break;
			case KW_RAW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1385);
				((ColumnTypeContext)_localctx).type = match(KW_RAW);
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(1386);
					lengthTwoStringDimension();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode KW_NOT() { return getToken(FQLParser.KW_NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode KW_EXISTS() { return getToken(FQLParser.KW_EXISTS, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public QueryStatementContext queryStatement() {
			return getRuleContext(QueryStatementContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalNestedContext extends BooleanExpressionContext {
		public Token kind;
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode KW_IS() { return getToken(FQLParser.KW_IS, 0); }
		public TerminalNode KW_TRUE() { return getToken(FQLParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(FQLParser.KW_FALSE, 0); }
		public TerminalNode KW_UNKNOWN() { return getToken(FQLParser.KW_UNKNOWN, 0); }
		public TerminalNode KW_NULL() { return getToken(FQLParser.KW_NULL, 0); }
		public TerminalNode KW_NOT() { return getToken(FQLParser.KW_NOT, 0); }
		public LogicalNestedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterLogicalNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitLogicalNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitLogicalNested(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode KW_AND() { return getToken(FQLParser.KW_AND, 0); }
		public TerminalNode KW_OR() { return getToken(FQLParser.KW_OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 186;
		enterRecursionRule(_localctx, 186, RULE_booleanExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1394);
				match(KW_NOT);
				setState(1395);
				booleanExpression(6);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1396);
				match(KW_EXISTS);
				setState(1397);
				match(LR_BRACKET);
				setState(1398);
				queryStatement(0);
				setState(1399);
				match(RR_BRACKET);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1401);
				valueExpression(0);
				setState(1403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1402);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1419);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1407);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1408);
						((LogicalBinaryContext)_localctx).operator = match(KW_AND);
						setState(1409);
						((LogicalBinaryContext)_localctx).right = booleanExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1410);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1411);
						((LogicalBinaryContext)_localctx).operator = match(KW_OR);
						setState(1412);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new LogicalNestedContext(new BooleanExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1413);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1414);
						match(KW_IS);
						setState(1416);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KW_NOT) {
							{
							setState(1415);
							match(KW_NOT);
							}
						}

						setState(1418);
						((LogicalNestedContext)_localctx).kind = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==KW_FALSE || _la==KW_NULL || _la==KW_TRUE || _la==KW_UNKNOWN) ) {
							((LogicalNestedContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(1423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public ValueExpressionContext right;
		public TerminalNode KW_AND() { return getToken(FQLParser.KW_AND, 0); }
		public TerminalNode KW_BETWEEN() { return getToken(FQLParser.KW_BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode KW_NOT() { return getToken(FQLParser.KW_NOT, 0); }
		public TerminalNode KW_ASYMMETRIC() { return getToken(FQLParser.KW_ASYMMETRIC, 0); }
		public TerminalNode KW_SYMMETRIC() { return getToken(FQLParser.KW_SYMMETRIC, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public TerminalNode KW_IN() { return getToken(FQLParser.KW_IN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public QueryStatementContext queryStatement() {
			return getRuleContext(QueryStatementContext.class,0);
		}
		public TerminalNode KW_EXISTS() { return getToken(FQLParser.KW_EXISTS, 0); }
		public TerminalNode KW_RLIKE() { return getToken(FQLParser.KW_RLIKE, 0); }
		public LikePredicateContext likePredicate() {
			return getRuleContext(LikePredicateContext.class,0);
		}
		public TerminalNode KW_IS() { return getToken(FQLParser.KW_IS, 0); }
		public TerminalNode KW_TRUE() { return getToken(FQLParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(FQLParser.KW_FALSE, 0); }
		public TerminalNode KW_UNKNOWN() { return getToken(FQLParser.KW_UNKNOWN, 0); }
		public TerminalNode KW_NULL() { return getToken(FQLParser.KW_NULL, 0); }
		public TerminalNode KW_FROM() { return getToken(FQLParser.KW_FROM, 0); }
		public TerminalNode KW_DISTINCT() { return getToken(FQLParser.KW_DISTINCT, 0); }
		public TerminalNode KW_TO() { return getToken(FQLParser.KW_TO, 0); }
		public TerminalNode KW_SIMILAR() { return getToken(FQLParser.KW_SIMILAR, 0); }
		public TerminalNode KW_ESCAPE() { return getToken(FQLParser.KW_ESCAPE, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_predicate);
		int _la;
		try {
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(1424);
					match(KW_NOT);
					}
				}

				setState(1427);
				((PredicateContext)_localctx).kind = match(KW_BETWEEN);
				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ASYMMETRIC || _la==KW_SYMMETRIC) {
					{
					setState(1428);
					_la = _input.LA(1);
					if ( !(_la==KW_ASYMMETRIC || _la==KW_SYMMETRIC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1431);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1432);
				match(KW_AND);
				setState(1433);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(1435);
					match(KW_NOT);
					}
				}

				setState(1438);
				((PredicateContext)_localctx).kind = match(KW_IN);
				setState(1439);
				match(LR_BRACKET);
				setState(1440);
				expression();
				setState(1445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1441);
					match(COMMA);
					setState(1442);
					expression();
					}
					}
					setState(1447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1448);
				match(RR_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(1450);
					match(KW_NOT);
					}
				}

				setState(1453);
				((PredicateContext)_localctx).kind = match(KW_IN);
				setState(1454);
				match(LR_BRACKET);
				setState(1455);
				queryStatement(0);
				setState(1456);
				match(RR_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1458);
				((PredicateContext)_localctx).kind = match(KW_EXISTS);
				setState(1459);
				match(LR_BRACKET);
				setState(1460);
				queryStatement(0);
				setState(1461);
				match(RR_BRACKET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(1463);
					match(KW_NOT);
					}
				}

				setState(1466);
				((PredicateContext)_localctx).kind = match(KW_RLIKE);
				setState(1467);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1468);
				likePredicate();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1469);
				match(KW_IS);
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(1470);
					match(KW_NOT);
					}
				}

				setState(1473);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==KW_FALSE || _la==KW_NULL || _la==KW_TRUE || _la==KW_UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1474);
				match(KW_IS);
				setState(1476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(1475);
					match(KW_NOT);
					}
				}

				setState(1478);
				((PredicateContext)_localctx).kind = match(KW_DISTINCT);
				setState(1479);
				match(KW_FROM);
				setState(1480);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(1481);
					match(KW_NOT);
					}
				}

				setState(1484);
				((PredicateContext)_localctx).kind = match(KW_SIMILAR);
				setState(1485);
				match(KW_TO);
				setState(1486);
				((PredicateContext)_localctx).right = valueExpression(0);
				setState(1489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1487);
					match(KW_ESCAPE);
					setState(1488);
					stringLiteral();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LikePredicateContext extends ParserRuleContext {
		public Token kind;
		public Token quantifier;
		public ValueExpressionContext pattern;
		public TerminalNode KW_LIKE() { return getToken(FQLParser.KW_LIKE, 0); }
		public TerminalNode KW_ANY() { return getToken(FQLParser.KW_ANY, 0); }
		public TerminalNode KW_ALL() { return getToken(FQLParser.KW_ALL, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode KW_NOT() { return getToken(FQLParser.KW_NOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode KW_ESCAPE() { return getToken(FQLParser.KW_ESCAPE, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LikePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterLikePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitLikePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitLikePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikePredicateContext likePredicate() throws RecognitionException {
		LikePredicateContext _localctx = new LikePredicateContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_likePredicate);
		int _la;
		try {
			setState(1522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(1493);
					match(KW_NOT);
					}
				}

				setState(1496);
				((LikePredicateContext)_localctx).kind = match(KW_LIKE);
				setState(1497);
				((LikePredicateContext)_localctx).quantifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==KW_ALL || _la==KW_ANY) ) {
					((LikePredicateContext)_localctx).quantifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1511);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1498);
					match(LR_BRACKET);
					setState(1499);
					match(RR_BRACKET);
					}
					break;
				case 2:
					{
					setState(1500);
					match(LR_BRACKET);
					setState(1501);
					expression();
					setState(1506);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1502);
						match(COMMA);
						setState(1503);
						expression();
						}
						}
						setState(1508);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1509);
					match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(1513);
					match(KW_NOT);
					}
				}

				setState(1516);
				((LikePredicateContext)_localctx).kind = match(KW_LIKE);
				setState(1517);
				((LikePredicateContext)_localctx).pattern = valueExpression(0);
				setState(1520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1518);
					match(KW_ESCAPE);
					setState(1519);
					stringLiteral();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK_SIGN() { return getToken(FQLParser.ASTERISK_SIGN, 0); }
		public TerminalNode SLASH_SIGN() { return getToken(FQLParser.SLASH_SIGN, 0); }
		public TerminalNode PENCENT_SIGN() { return getToken(FQLParser.PENCENT_SIGN, 0); }
		public TerminalNode KW_DIV() { return getToken(FQLParser.KW_DIV, 0); }
		public TerminalNode ADD_SIGN() { return getToken(FQLParser.ADD_SIGN, 0); }
		public TerminalNode HYPNEN_SIGN() { return getToken(FQLParser.HYPNEN_SIGN, 0); }
		public TerminalNode DOUBLE_VERTICAL_SIGN() { return getToken(FQLParser.DOUBLE_VERTICAL_SIGN, 0); }
		public TerminalNode BIT_AND_OP() { return getToken(FQLParser.BIT_AND_OP, 0); }
		public TerminalNode BIT_XOR_OP() { return getToken(FQLParser.BIT_XOR_OP, 0); }
		public TerminalNode BIT_OR_OP() { return getToken(FQLParser.BIT_OR_OP, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode HYPNEN_SIGN() { return getToken(FQLParser.HYPNEN_SIGN, 0); }
		public TerminalNode ADD_SIGN() { return getToken(FQLParser.ADD_SIGN, 0); }
		public TerminalNode BIT_NOT_OP() { return getToken(FQLParser.BIT_NOT_OP, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 192;
		enterRecursionRule(_localctx, 192, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1525);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1526);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 425)) & ~0x3f) == 0 && ((1L << (_la - 425)) & 100663297L) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1527);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1549);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1530);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1531);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==KW_DIV || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & 145L) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1532);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1533);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1534);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & 11L) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1535);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1536);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1537);
						((ArithmeticBinaryContext)_localctx).operator = match(BIT_AND_OP);
						setState(1538);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1539);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1540);
						((ArithmeticBinaryContext)_localctx).operator = match(BIT_XOR_OP);
						setState(1541);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1542);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1543);
						((ArithmeticBinaryContext)_localctx).operator = match(BIT_OR_OP);
						setState(1544);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1545);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1546);
						comparisonOperator();
						setState(1547);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(1553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DereferenceContext extends PrimaryExpressionContext {
		public DereferenceDefinitionContext dereferenceDefinition() {
			return getRuleContext(DereferenceDefinitionContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode KW_CASE() { return getToken(FQLParser.KW_CASE, 0); }
		public TerminalNode KW_END() { return getToken(FQLParser.KW_END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode KW_ELSE() { return getToken(FQLParser.KW_ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode KW_LAST() { return getToken(FQLParser.KW_LAST, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public TerminalNode KW_IGNORE() { return getToken(FQLParser.KW_IGNORE, 0); }
		public TerminalNode KW_NULLS() { return getToken(FQLParser.KW_NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK_SIGN() { return getToken(FQLParser.ASTERISK_SIGN, 0); }
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(FQLParser.DOT, 0); }
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public TerminalNode LS_BRACKET() { return getToken(FQLParser.LS_BRACKET, 0); }
		public TerminalNode RS_BRACKET() { return getToken(FQLParser.RS_BRACKET, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallFilterContext extends PrimaryExpressionContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public FunctionParamContext functionParam() {
			return getRuleContext(FunctionParamContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FilterClauseContext filterClause() {
			return getRuleContext(FilterClauseContext.class,0);
		}
		public FunctionCallFilterContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFunctionCallFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFunctionCallFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFunctionCallFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public QueryStatementContext queryStatement() {
			return getRuleContext(QueryStatementContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode KW_CAST() { return getToken(FQLParser.KW_CAST, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(FQLParser.KW_AS, 0); }
		public ColumnTypeContext columnType() {
			return getRuleContext(ColumnTypeContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public EmptyExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterEmptyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitEmptyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitEmptyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexDataTypeFieldExpressionContext extends PrimaryExpressionContext {
		public ComplexDataTypeExpressionContext complexDataTypeExpression() {
			return getRuleContext(ComplexDataTypeExpressionContext.class,0);
		}
		public ComplexDataTypeFieldExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterComplexDataTypeFieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitComplexDataTypeFieldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitComplexDataTypeFieldExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public List<FunctionParamContext> functionParam() {
			return getRuleContexts(FunctionParamContext.class);
		}
		public FunctionParamContext functionParam(int i) {
			return getRuleContext(FunctionParamContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public TerminalNode KW_TO() { return getToken(FQLParser.KW_TO, 0); }
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode KW_CASE() { return getToken(FQLParser.KW_CASE, 0); }
		public TerminalNode KW_END() { return getToken(FQLParser.KW_END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode KW_ELSE() { return getToken(FQLParser.KW_ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode KW_POSITION() { return getToken(FQLParser.KW_POSITION, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public TerminalNode KW_IN() { return getToken(FQLParser.KW_IN, 0); }
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode KW_FIRST() { return getToken(FQLParser.KW_FIRST, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public TerminalNode KW_IGNORE() { return getToken(FQLParser.KW_IGNORE, 0); }
		public TerminalNode KW_NULLS() { return getToken(FQLParser.KW_NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1555);
				match(KW_CASE);
				setState(1557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1556);
					whenClause();
					}
					}
					setState(1559); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KW_WHEN );
				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(1561);
					match(KW_ELSE);
					setState(1562);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1565);
				match(KW_END);
				}
				break;
			case 2:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1567);
				match(KW_CASE);
				setState(1568);
				((SimpleCaseContext)_localctx).value = expression();
				setState(1570); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1569);
					whenClause();
					}
					}
					setState(1572); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KW_WHEN );
				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(1574);
					match(KW_ELSE);
					setState(1575);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1578);
				match(KW_END);
				}
				break;
			case 3:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1580);
				match(KW_CAST);
				setState(1581);
				match(LR_BRACKET);
				setState(1582);
				expression();
				setState(1583);
				match(KW_AS);
				setState(1584);
				columnType();
				setState(1585);
				match(RR_BRACKET);
				}
				break;
			case 4:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1587);
				match(KW_FIRST);
				setState(1588);
				match(LR_BRACKET);
				setState(1589);
				expression();
				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_IGNORE) {
					{
					setState(1590);
					match(KW_IGNORE);
					setState(1591);
					match(KW_NULLS);
					}
				}

				setState(1594);
				match(RR_BRACKET);
				}
				break;
			case 5:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1596);
				match(KW_LAST);
				setState(1597);
				match(LR_BRACKET);
				setState(1598);
				expression();
				setState(1601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_IGNORE) {
					{
					setState(1599);
					match(KW_IGNORE);
					setState(1600);
					match(KW_NULLS);
					}
				}

				setState(1603);
				match(RR_BRACKET);
				}
				break;
			case 6:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1605);
				match(KW_POSITION);
				setState(1606);
				match(LR_BRACKET);
				setState(1607);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(1608);
				match(KW_IN);
				setState(1609);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(1610);
				match(RR_BRACKET);
				}
				break;
			case 7:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1612);
				constant();
				}
				break;
			case 8:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1613);
				match(ASTERISK_SIGN);
				}
				break;
			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1614);
				uid();
				setState(1615);
				match(DOT);
				setState(1616);
				match(ASTERISK_SIGN);
				}
				break;
			case 10:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1618);
				match(LR_BRACKET);
				setState(1619);
				queryStatement(0);
				setState(1620);
				match(RR_BRACKET);
				}
				break;
			case 11:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1622);
				functionName();
				setState(1623);
				match(LR_BRACKET);
				setState(1635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -72057594038976528L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1729531790491648385L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -17592857165825L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 4617319959075752067L) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & -3438479683391781839L) != 0) || ((((_la - 340)) & ~0x3f) == 0 && ((1L << (_la - 340)) & 724652942384732577L) != 0) || ((((_la - 411)) & ~0x3f) == 0 && ((1L << (_la - 411)) & 2112853360263169L) != 0)) {
					{
					setState(1625);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
					case 1:
						{
						setState(1624);
						setQuantifier();
						}
						break;
					}
					setState(1627);
					functionParam();
					setState(1632);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1628);
						match(COMMA);
						setState(1629);
						functionParam();
						}
						}
						setState(1634);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1637);
				match(RR_BRACKET);
				}
				break;
			case 12:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1639);
				functionName();
				setState(1640);
				match(LR_BRACKET);
				setState(1641);
				functionParam();
				setState(1642);
				match(KW_TO);
				setState(1643);
				functionParam();
				setState(1644);
				match(RR_BRACKET);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1646);
				functionName();
				setState(1647);
				match(LR_BRACKET);
				setState(1649);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1648);
					setQuantifier();
					}
					break;
				}
				setState(1651);
				functionParam();
				setState(1652);
				match(RR_BRACKET);
				setState(1654);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1653);
					filterClause();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1656);
				identifier();
				}
				break;
			case 15:
				{
				_localctx = new DereferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1657);
				dereferenceDefinition();
				}
				break;
			case 16:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1658);
				match(LR_BRACKET);
				setState(1659);
				expression();
				setState(1660);
				match(RR_BRACKET);
				}
				break;
			case 17:
				{
				_localctx = new EmptyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1662);
				match(LR_BRACKET);
				setState(1663);
				match(RR_BRACKET);
				}
				break;
			case 18:
				{
				_localctx = new ComplexDataTypeFieldExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1664);
				complexDataTypeExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
					((SubscriptContext)_localctx).value = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
					setState(1667);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(1668);
					match(LS_BRACKET);
					setState(1669);
					((SubscriptContext)_localctx).index = valueExpression(0);
					setState(1670);
					match(RS_BRACKET);
					}
					} 
				}
				setState(1676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexDataTypeExpressionContext extends ParserRuleContext {
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public RowExpressionContext rowExpression() {
			return getRuleContext(RowExpressionContext.class,0);
		}
		public MapExpressionContext mapExpression() {
			return getRuleContext(MapExpressionContext.class,0);
		}
		public ComplexDataTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexDataTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterComplexDataTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitComplexDataTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitComplexDataTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexDataTypeExpressionContext complexDataTypeExpression() throws RecognitionException {
		ComplexDataTypeExpressionContext _localctx = new ComplexDataTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_complexDataTypeExpression);
		try {
			setState(1680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1677);
				arrayExpression();
				}
				break;
			case KW_ROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1678);
				rowExpression();
				}
				break;
			case KW_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1679);
				mapExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpressionContext extends ParserRuleContext {
		public TerminalNode KW_ARRAY() { return getToken(FQLParser.KW_ARRAY, 0); }
		public TerminalNode LS_BRACKET() { return getToken(FQLParser.LS_BRACKET, 0); }
		public List<DataTypeExpressionContext> dataTypeExpression() {
			return getRuleContexts(DataTypeExpressionContext.class);
		}
		public DataTypeExpressionContext dataTypeExpression(int i) {
			return getRuleContext(DataTypeExpressionContext.class,i);
		}
		public TerminalNode RS_BRACKET() { return getToken(FQLParser.RS_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public ArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_arrayExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			match(KW_ARRAY);
			setState(1683);
			match(LS_BRACKET);
			setState(1684);
			dataTypeExpression();
			setState(1689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1685);
				match(COMMA);
				setState(1686);
				dataTypeExpression();
				}
				}
				setState(1691);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1692);
			match(RS_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowExpressionContext extends ParserRuleContext {
		public TerminalNode KW_ROW() { return getToken(FQLParser.KW_ROW, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public List<DataTypeExpressionContext> dataTypeExpression() {
			return getRuleContexts(DataTypeExpressionContext.class);
		}
		public DataTypeExpressionContext dataTypeExpression(int i) {
			return getRuleContext(DataTypeExpressionContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public RowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterRowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitRowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitRowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowExpressionContext rowExpression() throws RecognitionException {
		RowExpressionContext _localctx = new RowExpressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_rowExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			match(KW_ROW);
			setState(1695);
			match(LR_BRACKET);
			setState(1696);
			dataTypeExpression();
			setState(1701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1697);
				match(COMMA);
				setState(1698);
				dataTypeExpression();
				}
				}
				setState(1703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1704);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapExpressionContext extends ParserRuleContext {
		public TerminalNode KW_MAP() { return getToken(FQLParser.KW_MAP, 0); }
		public TerminalNode LS_BRACKET() { return getToken(FQLParser.LS_BRACKET, 0); }
		public List<DataTypeExpressionContext> dataTypeExpression() {
			return getRuleContexts(DataTypeExpressionContext.class);
		}
		public DataTypeExpressionContext dataTypeExpression(int i) {
			return getRuleContext(DataTypeExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(FQLParser.COMMA, 0); }
		public TerminalNode RS_BRACKET() { return getToken(FQLParser.RS_BRACKET, 0); }
		public MapExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapExpressionContext mapExpression() throws RecognitionException {
		MapExpressionContext _localctx = new MapExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_mapExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			match(KW_MAP);
			setState(1707);
			match(LS_BRACKET);
			setState(1708);
			dataTypeExpression();
			setState(1709);
			match(COMMA);
			setState(1710);
			dataTypeExpression();
			setState(1711);
			match(RS_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeExpressionContext extends ParserRuleContext {
		public ColumnAliasContext columnAlias() {
			return getRuleContext(ColumnAliasContext.class,0);
		}
		public ComplexDataTypeExpressionContext complexDataTypeExpression() {
			return getRuleContext(ComplexDataTypeExpressionContext.class,0);
		}
		public DataTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterDataTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitDataTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitDataTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeExpressionContext dataTypeExpression() throws RecognitionException {
		DataTypeExpressionContext _localctx = new DataTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_dataTypeExpression);
		try {
			setState(1715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1713);
				columnAlias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1714);
				complexDataTypeExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNameContext extends ParserRuleContext {
		public ReservedKeywordsUsedAsFuncNameContext reservedKeywordsUsedAsFuncName() {
			return getRuleContext(ReservedKeywordsUsedAsFuncNameContext.class,0);
		}
		public NonReservedKeywordsContext nonReservedKeywords() {
			return getRuleContext(NonReservedKeywordsContext.class,0);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_functionName);
		try {
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1717);
				reservedKeywordsUsedAsFuncName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1718);
				nonReservedKeywords();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1719);
				uid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParamContext extends ParserRuleContext {
		public ReservedKeywordsUsedAsFuncParamContext reservedKeywordsUsedAsFuncParam() {
			return getRuleContext(ReservedKeywordsUsedAsFuncParamContext.class,0);
		}
		public TimeIntervalUnitContext timeIntervalUnit() {
			return getRuleContext(TimeIntervalUnitContext.class,0);
		}
		public TimePointUnitContext timePointUnit() {
			return getRuleContext(TimePointUnitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FilterClauseContext filterClause() {
			return getRuleContext(FilterClauseContext.class,0);
		}
		public FunctionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFunctionParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFunctionParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFunctionParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParamContext functionParam() throws RecognitionException {
		FunctionParamContext _localctx = new FunctionParamContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_functionParam);
		try {
			setState(1727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1722);
				reservedKeywordsUsedAsFuncParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1723);
				timeIntervalUnit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1724);
				timePointUnit();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1725);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1726);
				filterClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilterClauseContext extends ParserRuleContext {
		public TerminalNode KW_FILTER() { return getToken(FQLParser.KW_FILTER, 0); }
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public TerminalNode KW_WHERE() { return getToken(FQLParser.KW_WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public FilterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFilterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFilterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFilterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterClauseContext filterClause() throws RecognitionException {
		FilterClauseContext _localctx = new FilterClauseContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_filterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			match(KW_FILTER);
			setState(1730);
			match(LR_BRACKET);
			setState(1731);
			match(KW_WHERE);
			setState(1732);
			booleanExpression(0);
			setState(1733);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DereferenceDefinitionContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public DereferenceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dereferenceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterDereferenceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitDereferenceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitDereferenceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DereferenceDefinitionContext dereferenceDefinition() throws RecognitionException {
		DereferenceDefinitionContext _localctx = new DereferenceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_dereferenceDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
			uid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CorrelationNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CorrelationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correlationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterCorrelationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitCorrelationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitCorrelationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorrelationNameContext correlationName() throws RecognitionException {
		CorrelationNameContext _localctx = new CorrelationNameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_correlationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceDefinitionContext dereferenceDefinition() {
			return getRuleContext(DereferenceDefinitionContext.class,0);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_qualifiedName);
		try {
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1739);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1740);
				dereferenceDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeIntervalExpressionContext extends ParserRuleContext {
		public TerminalNode KW_INTERVAL() { return getToken(FQLParser.KW_INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
		}
		public TimeIntervalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeIntervalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTimeIntervalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTimeIntervalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTimeIntervalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeIntervalExpressionContext timeIntervalExpression() throws RecognitionException {
		TimeIntervalExpressionContext _localctx = new TimeIntervalExpressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_timeIntervalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			match(KW_INTERVAL);
			setState(1746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1744);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(1745);
				errorCapturingUnitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitErrorCapturingMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			multiUnitsInterval();
			setState(1750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1749);
				unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<TimeIntervalUnitContext> timeIntervalUnit() {
			return getRuleContexts(TimeIntervalUnitContext.class);
		}
		public TimeIntervalUnitContext timeIntervalUnit(int i) {
			return getRuleContext(TimeIntervalUnitContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1755); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1752);
					intervalValue();
					setState(1753);
					timeIntervalUnit();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1757); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitErrorCapturingUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(1762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1760);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(1761);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public TimeIntervalUnitContext from;
		public TimeIntervalUnitContext to;
		public TerminalNode KW_TO() { return getToken(FQLParser.KW_TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<TimeIntervalUnitContext> timeIntervalUnit() {
			return getRuleContexts(TimeIntervalUnitContext.class);
		}
		public TimeIntervalUnitContext timeIntervalUnit(int i) {
			return getRuleContext(TimeIntervalUnitContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(1765);
			((UnitToUnitIntervalContext)_localctx).from = timeIntervalUnit();
			setState(1766);
			match(KW_TO);
			setState(1767);
			((UnitToUnitIntervalContext)_localctx).to = timeIntervalUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode DIG_LITERAL() { return getToken(FQLParser.DIG_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(FQLParser.REAL_LITERAL, 0); }
		public TerminalNode ADD_SIGN() { return getToken(FQLParser.ADD_SIGN, 0); }
		public TerminalNode HYPNEN_SIGN() { return getToken(FQLParser.HYPNEN_SIGN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FQLParser.STRING_LITERAL, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_intervalValue);
		int _la;
		try {
			setState(1774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HYPNEN_SIGN:
			case ADD_SIGN:
			case DIG_LITERAL:
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPNEN_SIGN || _la==ADD_SIGN) {
					{
					setState(1769);
					_la = _input.LA(1);
					if ( !(_la==HYPNEN_SIGN || _la==ADD_SIGN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1772);
				_la = _input.LA(1);
				if ( !(_la==DIG_LITERAL || _la==REAL_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1773);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(FQLParser.KW_AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ColumnAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterColumnAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitColumnAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitColumnAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasContext columnAlias() throws RecognitionException {
		ColumnAliasContext _localctx = new ColumnAliasContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_columnAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(1776);
				match(KW_AS);
				}
			}

			setState(1779);
			identifier();
			setState(1781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(1780);
				identifierList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(FQLParser.KW_AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_tableAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(1783);
				match(KW_AS);
				}
			}

			setState(1786);
			identifier();
			setState(1788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1787);
				identifierList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			identifier();
			setState(1791);
			errorCapturingIdentifierExtra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> KW_MINUS() { return getTokens(FQLParser.KW_MINUS); }
		public TerminalNode KW_MINUS(int i) {
			return getToken(FQLParser.KW_MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_errorCapturingIdentifierExtra);
		int _la;
		try {
			setState(1800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MINUS:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1795); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1793);
					match(KW_MINUS);
					setState(1794);
					identifier();
					}
					}
					setState(1797); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KW_MINUS );
				}
				break;
			case KW_ADD:
			case KW_ADMIN:
			case KW_AFTER:
			case KW_ANALYZE:
			case KW_ASC:
			case KW_BEFORE:
			case KW_BYTES:
			case KW_CASCADE:
			case KW_CATALOG:
			case KW_CATALOGS:
			case KW_CENTURY:
			case KW_CHAIN:
			case KW_CHANGELOG_MODE:
			case KW_CHARACTERS:
			case KW_COMMENT:
			case KW_COMPACT:
			case KW_COLUMNS:
			case KW_CONSTRAINTS:
			case KW_CONSTRUCTOR:
			case KW_CUMULATE:
			case KW_DATA:
			case KW_DATABASE:
			case KW_DATABASES:
			case KW_DAYS:
			case KW_DECADE:
			case KW_DEFINED:
			case KW_DESC:
			case KW_DESCRIPTOR:
			case KW_DIV:
			case KW_ENCODING:
			case KW_ENFORCED:
			case KW_ENGINE:
			case KW_ERROR:
			case KW_ESTIMATED_COST:
			case KW_EXCEPTION:
			case KW_EXCLUDE:
			case KW_EXCLUDING:
			case KW_EXTENDED:
			case KW_FILE:
			case KW_FINAL:
			case KW_FIRST:
			case KW_FOLLOWING:
			case KW_FORMAT:
			case KW_FORTRAN:
			case KW_FOUND:
			case KW_FRAC_SECOND:
			case KW_FUNCTIONS:
			case KW_GENERAL:
			case KW_GENERATED:
			case KW_GO:
			case KW_GOTO:
			case KW_GRANTED:
			case KW_HOP:
			case KW_HOURS:
			case KW_IF:
			case KW_IGNORE:
			case KW_INCREMENT:
			case KW_INPUT:
			case KW_INVOKER:
			case KW_JAR:
			case KW_JARS:
			case KW_JAVA:
			case KW_JSON:
			case KW_JSON_EXECUTION_PLAN:
			case KW_KEY:
			case KW_KEY_MEMBER:
			case KW_KEY_TYPE:
			case KW_LABEL:
			case KW_LAST:
			case KW_LENGTH:
			case KW_LEVEL:
			case KW_LOAD:
			case KW_MAP:
			case KW_MICROSECOND:
			case KW_MILLENNIUM:
			case KW_MILLISECOND:
			case KW_MINUTES:
			case KW_MINVALUE:
			case KW_MODIFY:
			case KW_MODULES:
			case KW_MONTHS:
			case KW_NANOSECOND:
			case KW_NULLS:
			case KW_NUMBER:
			case KW_OPTION:
			case KW_OPTIONS:
			case KW_ORDERING:
			case KW_OUTPUT:
			case KW_OVERWRITE:
			case KW_OVERWRITING:
			case KW_PARTITIONED:
			case KW_PARTITIONS:
			case KW_PASSING:
			case KW_PAST:
			case KW_PATH:
			case KW_PLACING:
			case KW_PLAN:
			case KW_PRECEDING:
			case KW_PRESERVE:
			case KW_PRIOR:
			case KW_PRIVILEGES:
			case KW_PUBLIC:
			case KW_PYTHON:
			case KW_PYTHON_FILES:
			case KW_PYTHON_REQUIREMENTS:
			case KW_PYTHON_DEPENDENCIES:
			case KW_PYTHON_JAR:
			case KW_PYTHON_ARCHIVES:
			case KW_PYTHON_PARAMETER:
			case KW_QUARTER:
			case KW_RAW:
			case KW_READ:
			case KW_RELATIVE:
			case KW_REMOVE:
			case KW_RENAME:
			case KW_REPLACE:
			case KW_RESPECT:
			case KW_RESTART:
			case KW_RESTRICT:
			case KW_ROLE:
			case KW_ROW_COUNT:
			case KW_SCALA:
			case KW_SCALAR:
			case KW_SCALE:
			case KW_SCHEMA:
			case KW_SECONDS:
			case KW_SECTION:
			case KW_SECURITY:
			case KW_SELF:
			case KW_SERVER:
			case KW_SERVER_NAME:
			case KW_SESSION:
			case KW_SETS:
			case KW_SIMPLE:
			case KW_SIZE:
			case KW_SLIDE:
			case KW_SOURCE:
			case KW_SPACE:
			case KW_STATE:
			case KW_STATEMENT:
			case KW_STEP:
			case KW_STRING:
			case KW_STRUCTURE:
			case KW_STYLE:
			case KW_TABLES:
			case KW_TEMPORARY:
			case KW_TIMECOL:
			case KW_FLOOR:
			case KW_TIMESTAMP_LTZ:
			case KW_TIMESTAMPADD:
			case KW_TIMESTAMPDIFF:
			case KW_TO_TIMESTAMP:
			case KW_TRANSFORM:
			case KW_TUMBLE:
			case KW_TYPE:
			case KW_UNDER:
			case KW_UNLOAD:
			case KW_USAGE:
			case KW_USE:
			case KW_UTF16:
			case KW_UTF32:
			case KW_UTF8:
			case KW_VERSION:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_VIRTUAL:
			case KW_WATERMARK:
			case KW_WATERMARKS:
			case KW_WEEK:
			case KW_WORK:
			case KW_WRAPPER:
			case KW_YEARS:
			case KW_ZONE:
			case KW_AS:
			case KW_DATE:
			case KW_LOCALTIMESTAMP:
			case KW_USER:
			case LR_BRACKET:
			case DOLLAR:
			case STRING_LITERAL:
			case DIG_LITERAL:
			case ID_LITERAL:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			match(LR_BRACKET);
			setState(1803);
			identifierSeq();
			setState(1804);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_identifierSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			identifier();
			setState(1811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1807);
				match(COMMA);
				setState(1808);
				identifier();
				}
				}
				setState(1813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierAlternativeContext extends IdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonReservedKeywordsAlternativeContext extends IdentifierContext {
		public NonReservedKeywordsContext nonReservedKeywords() {
			return getRuleContext(NonReservedKeywordsContext.class,0);
		}
		public NonReservedKeywordsAlternativeContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterNonReservedKeywordsAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitNonReservedKeywordsAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitNonReservedKeywordsAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnquotedIdentifierAlternativeContext extends IdentifierContext {
		public UnquotedIdentifierContext unquotedIdentifier() {
			return getRuleContext(UnquotedIdentifierContext.class,0);
		}
		public UnquotedIdentifierAlternativeContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterUnquotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitUnquotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitUnquotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UrefVarAlternativeContext extends IdentifierContext {
		public RefVarContext refVar() {
			return getRuleContext(RefVarContext.class,0);
		}
		public UrefVarAlternativeContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterUrefVarAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitUrefVarAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitUrefVarAlternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_identifier);
		try {
			setState(1818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIG_LITERAL:
			case ID_LITERAL:
				_localctx = new UnquotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1814);
				unquotedIdentifier();
				}
				break;
			case STRING_LITERAL:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1815);
				quotedIdentifier();
				}
				break;
			case KW_ADD:
			case KW_ADMIN:
			case KW_AFTER:
			case KW_ANALYZE:
			case KW_ASC:
			case KW_BEFORE:
			case KW_BYTES:
			case KW_CASCADE:
			case KW_CATALOG:
			case KW_CATALOGS:
			case KW_CENTURY:
			case KW_CHAIN:
			case KW_CHANGELOG_MODE:
			case KW_CHARACTERS:
			case KW_COMMENT:
			case KW_COMPACT:
			case KW_COLUMNS:
			case KW_CONSTRAINTS:
			case KW_CONSTRUCTOR:
			case KW_CUMULATE:
			case KW_DATA:
			case KW_DATABASE:
			case KW_DATABASES:
			case KW_DAYS:
			case KW_DECADE:
			case KW_DEFINED:
			case KW_DESC:
			case KW_DESCRIPTOR:
			case KW_DIV:
			case KW_ENCODING:
			case KW_ENFORCED:
			case KW_ENGINE:
			case KW_ERROR:
			case KW_ESTIMATED_COST:
			case KW_EXCEPTION:
			case KW_EXCLUDE:
			case KW_EXCLUDING:
			case KW_EXTENDED:
			case KW_FILE:
			case KW_FINAL:
			case KW_FIRST:
			case KW_FOLLOWING:
			case KW_FORMAT:
			case KW_FORTRAN:
			case KW_FOUND:
			case KW_FRAC_SECOND:
			case KW_FUNCTIONS:
			case KW_GENERAL:
			case KW_GENERATED:
			case KW_GO:
			case KW_GOTO:
			case KW_GRANTED:
			case KW_HOP:
			case KW_HOURS:
			case KW_IF:
			case KW_IGNORE:
			case KW_INCREMENT:
			case KW_INPUT:
			case KW_INVOKER:
			case KW_JAR:
			case KW_JARS:
			case KW_JAVA:
			case KW_JSON:
			case KW_JSON_EXECUTION_PLAN:
			case KW_KEY:
			case KW_KEY_MEMBER:
			case KW_KEY_TYPE:
			case KW_LABEL:
			case KW_LAST:
			case KW_LENGTH:
			case KW_LEVEL:
			case KW_LOAD:
			case KW_MAP:
			case KW_MICROSECOND:
			case KW_MILLENNIUM:
			case KW_MILLISECOND:
			case KW_MINUTES:
			case KW_MINVALUE:
			case KW_MODIFY:
			case KW_MODULES:
			case KW_MONTHS:
			case KW_NANOSECOND:
			case KW_NULLS:
			case KW_NUMBER:
			case KW_OPTION:
			case KW_OPTIONS:
			case KW_ORDERING:
			case KW_OUTPUT:
			case KW_OVERWRITE:
			case KW_OVERWRITING:
			case KW_PARTITIONED:
			case KW_PARTITIONS:
			case KW_PASSING:
			case KW_PAST:
			case KW_PATH:
			case KW_PLACING:
			case KW_PLAN:
			case KW_PRECEDING:
			case KW_PRESERVE:
			case KW_PRIOR:
			case KW_PRIVILEGES:
			case KW_PUBLIC:
			case KW_PYTHON:
			case KW_PYTHON_FILES:
			case KW_PYTHON_REQUIREMENTS:
			case KW_PYTHON_DEPENDENCIES:
			case KW_PYTHON_JAR:
			case KW_PYTHON_ARCHIVES:
			case KW_PYTHON_PARAMETER:
			case KW_QUARTER:
			case KW_RAW:
			case KW_READ:
			case KW_RELATIVE:
			case KW_REMOVE:
			case KW_RENAME:
			case KW_REPLACE:
			case KW_RESPECT:
			case KW_RESTART:
			case KW_RESTRICT:
			case KW_ROLE:
			case KW_ROW_COUNT:
			case KW_SCALA:
			case KW_SCALAR:
			case KW_SCALE:
			case KW_SCHEMA:
			case KW_SECONDS:
			case KW_SECTION:
			case KW_SECURITY:
			case KW_SELF:
			case KW_SERVER:
			case KW_SERVER_NAME:
			case KW_SESSION:
			case KW_SETS:
			case KW_SIMPLE:
			case KW_SIZE:
			case KW_SLIDE:
			case KW_SOURCE:
			case KW_SPACE:
			case KW_STATE:
			case KW_STATEMENT:
			case KW_STEP:
			case KW_STRING:
			case KW_STRUCTURE:
			case KW_STYLE:
			case KW_TABLES:
			case KW_TEMPORARY:
			case KW_TIMECOL:
			case KW_FLOOR:
			case KW_TIMESTAMP_LTZ:
			case KW_TIMESTAMPADD:
			case KW_TIMESTAMPDIFF:
			case KW_TO_TIMESTAMP:
			case KW_TRANSFORM:
			case KW_TUMBLE:
			case KW_TYPE:
			case KW_UNDER:
			case KW_UNLOAD:
			case KW_USAGE:
			case KW_USE:
			case KW_UTF16:
			case KW_UTF32:
			case KW_UTF8:
			case KW_VERSION:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_VIRTUAL:
			case KW_WATERMARK:
			case KW_WATERMARKS:
			case KW_WEEK:
			case KW_WORK:
			case KW_WRAPPER:
			case KW_YEARS:
			case KW_ZONE:
			case KW_DATE:
			case KW_LOCALTIMESTAMP:
			case KW_USER:
				_localctx = new NonReservedKeywordsAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1816);
				nonReservedKeywords();
				}
				break;
			case DOLLAR:
				_localctx = new UrefVarAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1817);
				refVar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RefVarContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(FQLParser.DOLLAR, 0); }
		public TerminalNode LB_BRACKET() { return getToken(FQLParser.LB_BRACKET, 0); }
		public UnquotedIdentifierContext unquotedIdentifier() {
			return getRuleContext(UnquotedIdentifierContext.class,0);
		}
		public TerminalNode RB_BRACKET() { return getToken(FQLParser.RB_BRACKET, 0); }
		public RefVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterRefVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitRefVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitRefVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefVarContext refVar() throws RecognitionException {
		RefVarContext _localctx = new RefVarContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_refVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			match(DOLLAR);
			setState(1821);
			match(LB_BRACKET);
			setState(1822);
			unquotedIdentifier();
			setState(1823);
			match(RB_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnquotedIdentifierContext extends ParserRuleContext {
		public TerminalNode DIG_LITERAL() { return getToken(FQLParser.DIG_LITERAL, 0); }
		public TerminalNode ID_LITERAL() { return getToken(FQLParser.ID_LITERAL, 0); }
		public UnquotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unquotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnquotedIdentifierContext unquotedIdentifier() throws RecognitionException {
		UnquotedIdentifierContext _localctx = new UnquotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_unquotedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			_la = _input.LA(1);
			if ( !(_la==DIG_LITERAL || _la==ID_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(FQLParser.STRING_LITERAL, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1827);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode KW_WHEN() { return getToken(FQLParser.KW_WHEN, 0); }
		public TerminalNode KW_THEN() { return getToken(FQLParser.KW_THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			match(KW_WHEN);
			setState(1830);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1831);
			match(KW_THEN);
			setState(1832);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatalogPathContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public CatalogPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catalogPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterCatalogPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitCatalogPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitCatalogPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatalogPathContext catalogPath() throws RecognitionException {
		CatalogPathContext _localctx = new CatalogPathContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_catalogPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			uid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DatabasePathContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public DatabasePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databasePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterDatabasePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitDatabasePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitDatabasePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabasePathContext databasePath() throws RecognitionException {
		DatabasePathContext _localctx = new DatabasePathContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_databasePath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			uid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DatabasePathCreateContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public DatabasePathCreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databasePathCreate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterDatabasePathCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitDatabasePathCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitDatabasePathCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabasePathCreateContext databasePathCreate() throws RecognitionException {
		DatabasePathCreateContext _localctx = new DatabasePathCreateContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_databasePathCreate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			uid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePathCreateContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TablePathCreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePathCreate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTablePathCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTablePathCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTablePathCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePathCreateContext tablePathCreate() throws RecognitionException {
		TablePathCreateContext _localctx = new TablePathCreateContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_tablePathCreate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			uid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePathContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TablePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTablePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTablePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTablePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePathContext tablePath() throws RecognitionException {
		TablePathContext _localctx = new TablePathContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_tablePath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			uid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UidContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(FQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FQLParser.DOT, i);
		}
		public UidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterUid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitUid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitUid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UidContext uid() throws RecognitionException {
		UidContext _localctx = new UidContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_uid);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			identifier();
			setState(1849);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1845);
					match(DOT);
					setState(1846);
					identifier();
					}
					} 
				}
				setState(1851);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WithOptionContext extends ParserRuleContext {
		public TerminalNode KW_WITH() { return getToken(FQLParser.KW_WITH, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public WithOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterWithOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitWithOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitWithOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithOptionContext withOption() throws RecognitionException {
		WithOptionContext _localctx = new WithOptionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_withOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			match(KW_WITH);
			setState(1853);
			tablePropertyList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfNotExistsContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(FQLParser.KW_IF, 0); }
		public TerminalNode KW_NOT() { return getToken(FQLParser.KW_NOT, 0); }
		public TerminalNode KW_EXISTS() { return getToken(FQLParser.KW_EXISTS, 0); }
		public IfNotExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNotExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterIfNotExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitIfNotExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitIfNotExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNotExistsContext ifNotExists() throws RecognitionException {
		IfNotExistsContext _localctx = new IfNotExistsContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_ifNotExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1855);
			match(KW_IF);
			setState(1856);
			match(KW_NOT);
			setState(1857);
			match(KW_EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfExistsContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(FQLParser.KW_IF, 0); }
		public TerminalNode KW_EXISTS() { return getToken(FQLParser.KW_EXISTS, 0); }
		public IfExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterIfExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitIfExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitIfExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExistsContext ifExists() throws RecognitionException {
		IfExistsContext _localctx = new IfExistsContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_ifExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			match(KW_IF);
			setState(1860);
			match(KW_EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableCanHasKeyPropertyListContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public List<TablePropertyKeyContext> tablePropertyKey() {
			return getRuleContexts(TablePropertyKeyContext.class);
		}
		public TablePropertyKeyContext tablePropertyKey(int i) {
			return getRuleContext(TablePropertyKeyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public TableCanHasKeyPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableCanHasKeyPropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTableCanHasKeyPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTableCanHasKeyPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTableCanHasKeyPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableCanHasKeyPropertyListContext tableCanHasKeyPropertyList() throws RecognitionException {
		TableCanHasKeyPropertyListContext _localctx = new TableCanHasKeyPropertyListContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_tableCanHasKeyPropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			match(LR_BRACKET);
			setState(1865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1863);
				tableProperty();
				}
				break;
			case 2:
				{
				setState(1864);
				tablePropertyKey();
				}
				break;
			}
			setState(1874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1867);
				match(COMMA);
				setState(1870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1868);
					tableProperty();
					}
					break;
				case 2:
					{
					setState(1869);
					tablePropertyKey();
					}
					break;
				}
				}
				}
				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1877);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePropertyListContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(FQLParser.LR_BRACKET, 0); }
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(FQLParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			match(LR_BRACKET);
			setState(1880);
			tableProperty();
			setState(1885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1881);
				match(COMMA);
				setState(1882);
				tableProperty();
				}
				}
				setState(1887);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1888);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TerminalNode EQUAL_SYMBOL() { return getToken(FQLParser.EQUAL_SYMBOL, 0); }
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_tableProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1890);
			tablePropertyKey();
			setState(1891);
			match(EQUAL_SYMBOL);
			setState(1892);
			tablePropertyValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePropertyKeyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<DereferenceDefinitionContext> dereferenceDefinition() {
			return getRuleContexts(DereferenceDefinitionContext.class);
		}
		public DereferenceDefinitionContext dereferenceDefinition(int i) {
			return getRuleContext(DereferenceDefinitionContext.class,i);
		}
		public List<TerminalNode> HYPNEN_SIGN() { return getTokens(FQLParser.HYPNEN_SIGN); }
		public TerminalNode HYPNEN_SIGN(int i) {
			return getToken(FQLParser.HYPNEN_SIGN, i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(FQLParser.STRING_LITERAL, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1894);
				identifier();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1895);
				dereferenceDefinition();
				setState(1900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HYPNEN_SIGN) {
					{
					{
					setState(1896);
					match(HYPNEN_SIGN);
					setState(1897);
					dereferenceDefinition();
					}
					}
					setState(1902);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1903);
				match(STRING_LITERAL);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode DIG_LITERAL() { return getToken(FQLParser.DIG_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(FQLParser.REAL_LITERAL, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(FQLParser.STRING_LITERAL, 0); }
		public UnquotedIdentifierContext unquotedIdentifier() {
			return getRuleContext(UnquotedIdentifierContext.class,0);
		}
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_tablePropertyValue);
		try {
			setState(1911);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1906);
				match(DIG_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1907);
				match(REAL_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1908);
				booleanLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1909);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1910);
				unquotedIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL_SYMBOL() { return getToken(FQLParser.EQUAL_SYMBOL, 0); }
		public TerminalNode GREATER_SYMBOL() { return getToken(FQLParser.GREATER_SYMBOL, 0); }
		public TerminalNode LESS_SYMBOL() { return getToken(FQLParser.LESS_SYMBOL, 0); }
		public TerminalNode EXCLAMATION_SYMBOL() { return getToken(FQLParser.EXCLAMATION_SYMBOL, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_comparisonOperator);
		try {
			setState(1927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1913);
				match(EQUAL_SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1914);
				match(GREATER_SYMBOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1915);
				match(LESS_SYMBOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1916);
				match(LESS_SYMBOL);
				setState(1917);
				match(EQUAL_SYMBOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1918);
				match(GREATER_SYMBOL);
				setState(1919);
				match(EQUAL_SYMBOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1920);
				match(LESS_SYMBOL);
				setState(1921);
				match(GREATER_SYMBOL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1922);
				match(EXCLAMATION_SYMBOL);
				setState(1923);
				match(EQUAL_SYMBOL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1924);
				match(LESS_SYMBOL);
				setState(1925);
				match(EQUAL_SYMBOL);
				setState(1926);
				match(GREATER_SYMBOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TimeIntervalExpressionContext timeIntervalExpression() {
			return getRuleContext(TimeIntervalExpressionContext.class,0);
		}
		public TimePointLiteralContext timePointLiteral() {
			return getRuleContext(TimePointLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode HYPNEN_SIGN() { return getToken(FQLParser.HYPNEN_SIGN, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode REAL_LITERAL() { return getToken(FQLParser.REAL_LITERAL, 0); }
		public TerminalNode KW_NULL() { return getToken(FQLParser.KW_NULL, 0); }
		public TerminalNode KW_NOT() { return getToken(FQLParser.KW_NOT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_constant);
		int _la;
		try {
			setState(1942);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_INTERVAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1929);
				timeIntervalExpression();
				}
				break;
			case KW_MICROSECOND:
			case KW_MILLISECOND:
			case KW_QUARTER:
			case KW_WEEK:
			case KW_DAY:
			case KW_HOUR:
			case KW_MINUTE:
			case KW_MONTH:
			case KW_SECOND:
			case KW_YEAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1930);
				timePointLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1931);
				stringLiteral();
				}
				break;
			case HYPNEN_SIGN:
			case DIG_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPNEN_SIGN) {
					{
					setState(1932);
					match(HYPNEN_SIGN);
					}
				}

				setState(1935);
				decimalLiteral();
				}
				break;
			case KW_FALSE:
			case KW_TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1936);
				booleanLiteral();
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1937);
				match(REAL_LITERAL);
				}
				break;
			case KW_NOT:
			case KW_NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NOT) {
					{
					setState(1938);
					match(KW_NOT);
					}
				}

				setState(1941);
				match(KW_NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimePointLiteralContext extends ParserRuleContext {
		public TimePointUnitContext timePointUnit() {
			return getRuleContext(TimePointUnitContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TimePointLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timePointLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTimePointLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTimePointLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTimePointLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimePointLiteralContext timePointLiteral() throws RecognitionException {
		TimePointLiteralContext _localctx = new TimePointLiteralContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_timePointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
			timePointUnit();
			setState(1945);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(FQLParser.STRING_LITERAL, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DIG_LITERAL() { return getToken(FQLParser.DIG_LITERAL, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
			match(DIG_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode KW_TRUE() { return getToken(FQLParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(FQLParser.KW_FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951);
			_la = _input.LA(1);
			if ( !(_la==KW_FALSE || _la==KW_TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode KW_DISTINCT() { return getToken(FQLParser.KW_DISTINCT, 0); }
		public TerminalNode KW_ALL() { return getToken(FQLParser.KW_ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1953);
			_la = _input.LA(1);
			if ( !(_la==KW_ALL || _la==KW_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimePointUnitContext extends ParserRuleContext {
		public TerminalNode KW_YEAR() { return getToken(FQLParser.KW_YEAR, 0); }
		public TerminalNode KW_QUARTER() { return getToken(FQLParser.KW_QUARTER, 0); }
		public TerminalNode KW_MONTH() { return getToken(FQLParser.KW_MONTH, 0); }
		public TerminalNode KW_WEEK() { return getToken(FQLParser.KW_WEEK, 0); }
		public TerminalNode KW_DAY() { return getToken(FQLParser.KW_DAY, 0); }
		public TerminalNode KW_HOUR() { return getToken(FQLParser.KW_HOUR, 0); }
		public TerminalNode KW_MINUTE() { return getToken(FQLParser.KW_MINUTE, 0); }
		public TerminalNode KW_SECOND() { return getToken(FQLParser.KW_SECOND, 0); }
		public TerminalNode KW_MILLISECOND() { return getToken(FQLParser.KW_MILLISECOND, 0); }
		public TerminalNode KW_MICROSECOND() { return getToken(FQLParser.KW_MICROSECOND, 0); }
		public TimePointUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timePointUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTimePointUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTimePointUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTimePointUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimePointUnitContext timePointUnit() throws RecognitionException {
		TimePointUnitContext _localctx = new TimePointUnitContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_timePointUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 274877906949L) != 0) || _la==KW_WEEK || _la==KW_DAY || ((((_la - 285)) & ~0x3f) == 0 && ((1L << (_la - 285)) & 38654705665L) != 0) || _la==KW_SECOND || _la==KW_YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeIntervalUnitContext extends ParserRuleContext {
		public TerminalNode KW_MILLENNIUM() { return getToken(FQLParser.KW_MILLENNIUM, 0); }
		public TerminalNode KW_CENTURY() { return getToken(FQLParser.KW_CENTURY, 0); }
		public TerminalNode KW_DECADE() { return getToken(FQLParser.KW_DECADE, 0); }
		public TerminalNode KW_YEAR() { return getToken(FQLParser.KW_YEAR, 0); }
		public TerminalNode KW_YEARS() { return getToken(FQLParser.KW_YEARS, 0); }
		public TerminalNode KW_QUARTER() { return getToken(FQLParser.KW_QUARTER, 0); }
		public TerminalNode KW_MONTH() { return getToken(FQLParser.KW_MONTH, 0); }
		public TerminalNode KW_MONTHS() { return getToken(FQLParser.KW_MONTHS, 0); }
		public TerminalNode KW_WEEK() { return getToken(FQLParser.KW_WEEK, 0); }
		public TerminalNode KW_WEEKS() { return getToken(FQLParser.KW_WEEKS, 0); }
		public TerminalNode KW_DAY() { return getToken(FQLParser.KW_DAY, 0); }
		public TerminalNode KW_DAYS() { return getToken(FQLParser.KW_DAYS, 0); }
		public TerminalNode KW_HOUR() { return getToken(FQLParser.KW_HOUR, 0); }
		public TerminalNode KW_HOURS() { return getToken(FQLParser.KW_HOURS, 0); }
		public TerminalNode KW_MINUTE() { return getToken(FQLParser.KW_MINUTE, 0); }
		public TerminalNode KW_MINUTES() { return getToken(FQLParser.KW_MINUTES, 0); }
		public TerminalNode KW_SECOND() { return getToken(FQLParser.KW_SECOND, 0); }
		public TerminalNode KW_SECONDS() { return getToken(FQLParser.KW_SECONDS, 0); }
		public TerminalNode KW_MILLISECOND() { return getToken(FQLParser.KW_MILLISECOND, 0); }
		public TerminalNode KW_MICROSECOND() { return getToken(FQLParser.KW_MICROSECOND, 0); }
		public TerminalNode KW_NANOSECOND() { return getToken(FQLParser.KW_NANOSECOND, 0); }
		public TerminalNode KW_EPOCH() { return getToken(FQLParser.KW_EPOCH, 0); }
		public TimeIntervalUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeIntervalUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTimeIntervalUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTimeIntervalUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTimeIntervalUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeIntervalUnitContext timeIntervalUnit() throws RecognitionException {
		TimeIntervalUnitContext _localctx = new TimeIntervalUnitContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_timeIntervalUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843147457970176L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 72057868915835279L) != 0) || ((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & 288230376151711763L) != 0) || ((((_la - 285)) & ~0x3f) == 0 && ((1L << (_la - 285)) & 38654705665L) != 0) || _la==KW_SECOND || _la==KW_YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReservedKeywordsUsedAsFuncParamContext extends ParserRuleContext {
		public TerminalNode KW_LEADING() { return getToken(FQLParser.KW_LEADING, 0); }
		public TerminalNode KW_TRAILING() { return getToken(FQLParser.KW_TRAILING, 0); }
		public TerminalNode KW_BOTH() { return getToken(FQLParser.KW_BOTH, 0); }
		public TerminalNode KW_ALL() { return getToken(FQLParser.KW_ALL, 0); }
		public TerminalNode KW_DISTINCT() { return getToken(FQLParser.KW_DISTINCT, 0); }
		public TerminalNode ASTERISK_SIGN() { return getToken(FQLParser.ASTERISK_SIGN, 0); }
		public ReservedKeywordsUsedAsFuncParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedKeywordsUsedAsFuncParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterReservedKeywordsUsedAsFuncParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitReservedKeywordsUsedAsFuncParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitReservedKeywordsUsedAsFuncParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedKeywordsUsedAsFuncParamContext reservedKeywordsUsedAsFuncParam() throws RecognitionException {
		ReservedKeywordsUsedAsFuncParamContext _localctx = new ReservedKeywordsUsedAsFuncParamContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_reservedKeywordsUsedAsFuncParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			_la = _input.LA(1);
			if ( !(((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & 2305843009213956097L) != 0) || _la==KW_LEADING || _la==KW_TRAILING || _la==ASTERISK_SIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReservedKeywordsUsedAsFuncNameContext extends ParserRuleContext {
		public TerminalNode KW_ABS() { return getToken(FQLParser.KW_ABS, 0); }
		public TerminalNode KW_ARRAY() { return getToken(FQLParser.KW_ARRAY, 0); }
		public TerminalNode KW_AVG() { return getToken(FQLParser.KW_AVG, 0); }
		public TerminalNode KW_CAST() { return getToken(FQLParser.KW_CAST, 0); }
		public TerminalNode KW_CEIL() { return getToken(FQLParser.KW_CEIL, 0); }
		public TerminalNode KW_COALESCE() { return getToken(FQLParser.KW_COALESCE, 0); }
		public TerminalNode KW_COLLECT() { return getToken(FQLParser.KW_COLLECT, 0); }
		public TerminalNode KW_COUNT() { return getToken(FQLParser.KW_COUNT, 0); }
		public TerminalNode KW_DATE() { return getToken(FQLParser.KW_DATE, 0); }
		public TerminalNode KW_FIRST_VALUE() { return getToken(FQLParser.KW_FIRST_VALUE, 0); }
		public TerminalNode KW_FROM_UNIXTIME() { return getToken(FQLParser.KW_FROM_UNIXTIME, 0); }
		public TerminalNode KW_GROUPING() { return getToken(FQLParser.KW_GROUPING, 0); }
		public TerminalNode KW_HOUR() { return getToken(FQLParser.KW_HOUR, 0); }
		public TerminalNode KW_IF() { return getToken(FQLParser.KW_IF, 0); }
		public TerminalNode KW_LEAD() { return getToken(FQLParser.KW_LEAD, 0); }
		public TerminalNode KW_LAG() { return getToken(FQLParser.KW_LAG, 0); }
		public TerminalNode KW_LAST_VALUE() { return getToken(FQLParser.KW_LAST_VALUE, 0); }
		public TerminalNode KW_LEFT() { return getToken(FQLParser.KW_LEFT, 0); }
		public TerminalNode KW_NTILE() { return getToken(FQLParser.KW_NTILE, 0); }
		public TerminalNode KW_MAP() { return getToken(FQLParser.KW_MAP, 0); }
		public TerminalNode KW_MINUTE() { return getToken(FQLParser.KW_MINUTE, 0); }
		public TerminalNode KW_MONTH() { return getToken(FQLParser.KW_MONTH, 0); }
		public TerminalNode KW_OVERLAY() { return getToken(FQLParser.KW_OVERLAY, 0); }
		public TerminalNode KW_POSITION() { return getToken(FQLParser.KW_POSITION, 0); }
		public TerminalNode KW_PERCENT_RANK() { return getToken(FQLParser.KW_PERCENT_RANK, 0); }
		public TerminalNode KW_POWER() { return getToken(FQLParser.KW_POWER, 0); }
		public TerminalNode KW_QUARTER() { return getToken(FQLParser.KW_QUARTER, 0); }
		public TerminalNode KW_RANK() { return getToken(FQLParser.KW_RANK, 0); }
		public TerminalNode KW_ROW_NUMBER() { return getToken(FQLParser.KW_ROW_NUMBER, 0); }
		public TerminalNode KW_RIGHT() { return getToken(FQLParser.KW_RIGHT, 0); }
		public TerminalNode KW_SECOND() { return getToken(FQLParser.KW_SECOND, 0); }
		public TerminalNode KW_SUBSTRING() { return getToken(FQLParser.KW_SUBSTRING, 0); }
		public TerminalNode KW_SUM() { return getToken(FQLParser.KW_SUM, 0); }
		public TerminalNode KW_TIME() { return getToken(FQLParser.KW_TIME, 0); }
		public TerminalNode KW_TIMESTAMP() { return getToken(FQLParser.KW_TIMESTAMP, 0); }
		public TerminalNode KW_TIMESTAMP_3() { return getToken(FQLParser.KW_TIMESTAMP_3, 0); }
		public TerminalNode KW_TIMESTAMP_6() { return getToken(FQLParser.KW_TIMESTAMP_6, 0); }
		public TerminalNode KW_TIMESTAMP_9() { return getToken(FQLParser.KW_TIMESTAMP_9, 0); }
		public TerminalNode KW_TRUNCATE() { return getToken(FQLParser.KW_TRUNCATE, 0); }
		public TerminalNode KW_UPPER() { return getToken(FQLParser.KW_UPPER, 0); }
		public TerminalNode KW_WEEK() { return getToken(FQLParser.KW_WEEK, 0); }
		public TerminalNode KW_YEAR() { return getToken(FQLParser.KW_YEAR, 0); }
		public ReservedKeywordsUsedAsFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedKeywordsUsedAsFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterReservedKeywordsUsedAsFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitReservedKeywordsUsedAsFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitReservedKeywordsUsedAsFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedKeywordsUsedAsFuncNameContext reservedKeywordsUsedAsFuncName() throws RecognitionException {
		ReservedKeywordsUsedAsFuncNameContext _localctx = new ReservedKeywordsUsedAsFuncNameContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_reservedKeywordsUsedAsFuncName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1961);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 576460752304472065L) != 0) || ((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & 72341824236298305L) != 0) || ((((_la - 270)) & ~0x3f) == 0 && ((1L << (_la - 270)) & 289497061328457793L) != 0) || ((((_la - 340)) & ~0x3f) == 0 && ((1L << (_la - 340)) & 146503340220520865L) != 0) || _la==KW_YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonReservedKeywordsContext extends ParserRuleContext {
		public TerminalNode KW_ADD() { return getToken(FQLParser.KW_ADD, 0); }
		public TerminalNode KW_ADMIN() { return getToken(FQLParser.KW_ADMIN, 0); }
		public TerminalNode KW_AFTER() { return getToken(FQLParser.KW_AFTER, 0); }
		public TerminalNode KW_ANALYZE() { return getToken(FQLParser.KW_ANALYZE, 0); }
		public TerminalNode KW_ASC() { return getToken(FQLParser.KW_ASC, 0); }
		public TerminalNode KW_BEFORE() { return getToken(FQLParser.KW_BEFORE, 0); }
		public TerminalNode KW_BYTES() { return getToken(FQLParser.KW_BYTES, 0); }
		public TerminalNode KW_CASCADE() { return getToken(FQLParser.KW_CASCADE, 0); }
		public TerminalNode KW_CATALOG() { return getToken(FQLParser.KW_CATALOG, 0); }
		public TerminalNode KW_CATALOGS() { return getToken(FQLParser.KW_CATALOGS, 0); }
		public TerminalNode KW_CENTURY() { return getToken(FQLParser.KW_CENTURY, 0); }
		public TerminalNode KW_CHAIN() { return getToken(FQLParser.KW_CHAIN, 0); }
		public TerminalNode KW_CHANGELOG_MODE() { return getToken(FQLParser.KW_CHANGELOG_MODE, 0); }
		public TerminalNode KW_CHARACTERS() { return getToken(FQLParser.KW_CHARACTERS, 0); }
		public TerminalNode KW_COMMENT() { return getToken(FQLParser.KW_COMMENT, 0); }
		public TerminalNode KW_COMPACT() { return getToken(FQLParser.KW_COMPACT, 0); }
		public TerminalNode KW_COLUMNS() { return getToken(FQLParser.KW_COLUMNS, 0); }
		public TerminalNode KW_CONSTRAINTS() { return getToken(FQLParser.KW_CONSTRAINTS, 0); }
		public TerminalNode KW_CONSTRUCTOR() { return getToken(FQLParser.KW_CONSTRUCTOR, 0); }
		public TerminalNode KW_CUMULATE() { return getToken(FQLParser.KW_CUMULATE, 0); }
		public TerminalNode KW_DATA() { return getToken(FQLParser.KW_DATA, 0); }
		public TerminalNode KW_DATE() { return getToken(FQLParser.KW_DATE, 0); }
		public TerminalNode KW_DATABASE() { return getToken(FQLParser.KW_DATABASE, 0); }
		public TerminalNode KW_DATABASES() { return getToken(FQLParser.KW_DATABASES, 0); }
		public TerminalNode KW_DAYS() { return getToken(FQLParser.KW_DAYS, 0); }
		public TerminalNode KW_DECADE() { return getToken(FQLParser.KW_DECADE, 0); }
		public TerminalNode KW_DEFINED() { return getToken(FQLParser.KW_DEFINED, 0); }
		public TerminalNode KW_DESC() { return getToken(FQLParser.KW_DESC, 0); }
		public TerminalNode KW_DESCRIPTOR() { return getToken(FQLParser.KW_DESCRIPTOR, 0); }
		public TerminalNode KW_DIV() { return getToken(FQLParser.KW_DIV, 0); }
		public TerminalNode KW_ENCODING() { return getToken(FQLParser.KW_ENCODING, 0); }
		public TerminalNode KW_ENFORCED() { return getToken(FQLParser.KW_ENFORCED, 0); }
		public TerminalNode KW_ENGINE() { return getToken(FQLParser.KW_ENGINE, 0); }
		public TerminalNode KW_ERROR() { return getToken(FQLParser.KW_ERROR, 0); }
		public TerminalNode KW_ESTIMATED_COST() { return getToken(FQLParser.KW_ESTIMATED_COST, 0); }
		public TerminalNode KW_EXCEPTION() { return getToken(FQLParser.KW_EXCEPTION, 0); }
		public TerminalNode KW_EXCLUDE() { return getToken(FQLParser.KW_EXCLUDE, 0); }
		public TerminalNode KW_EXCLUDING() { return getToken(FQLParser.KW_EXCLUDING, 0); }
		public TerminalNode KW_EXTENDED() { return getToken(FQLParser.KW_EXTENDED, 0); }
		public TerminalNode KW_FILE() { return getToken(FQLParser.KW_FILE, 0); }
		public TerminalNode KW_FINAL() { return getToken(FQLParser.KW_FINAL, 0); }
		public TerminalNode KW_FIRST() { return getToken(FQLParser.KW_FIRST, 0); }
		public TerminalNode KW_FOLLOWING() { return getToken(FQLParser.KW_FOLLOWING, 0); }
		public TerminalNode KW_FORMAT() { return getToken(FQLParser.KW_FORMAT, 0); }
		public TerminalNode KW_FORTRAN() { return getToken(FQLParser.KW_FORTRAN, 0); }
		public TerminalNode KW_FOUND() { return getToken(FQLParser.KW_FOUND, 0); }
		public TerminalNode KW_FRAC_SECOND() { return getToken(FQLParser.KW_FRAC_SECOND, 0); }
		public TerminalNode KW_FUNCTIONS() { return getToken(FQLParser.KW_FUNCTIONS, 0); }
		public TerminalNode KW_GENERAL() { return getToken(FQLParser.KW_GENERAL, 0); }
		public TerminalNode KW_GENERATED() { return getToken(FQLParser.KW_GENERATED, 0); }
		public TerminalNode KW_GO() { return getToken(FQLParser.KW_GO, 0); }
		public TerminalNode KW_GOTO() { return getToken(FQLParser.KW_GOTO, 0); }
		public TerminalNode KW_GRANTED() { return getToken(FQLParser.KW_GRANTED, 0); }
		public TerminalNode KW_HOP() { return getToken(FQLParser.KW_HOP, 0); }
		public TerminalNode KW_HOURS() { return getToken(FQLParser.KW_HOURS, 0); }
		public TerminalNode KW_IF() { return getToken(FQLParser.KW_IF, 0); }
		public TerminalNode KW_IGNORE() { return getToken(FQLParser.KW_IGNORE, 0); }
		public TerminalNode KW_INCREMENT() { return getToken(FQLParser.KW_INCREMENT, 0); }
		public TerminalNode KW_INPUT() { return getToken(FQLParser.KW_INPUT, 0); }
		public TerminalNode KW_INVOKER() { return getToken(FQLParser.KW_INVOKER, 0); }
		public TerminalNode KW_JAR() { return getToken(FQLParser.KW_JAR, 0); }
		public TerminalNode KW_JARS() { return getToken(FQLParser.KW_JARS, 0); }
		public TerminalNode KW_JAVA() { return getToken(FQLParser.KW_JAVA, 0); }
		public TerminalNode KW_JSON() { return getToken(FQLParser.KW_JSON, 0); }
		public TerminalNode KW_JSON_EXECUTION_PLAN() { return getToken(FQLParser.KW_JSON_EXECUTION_PLAN, 0); }
		public TerminalNode KW_KEY() { return getToken(FQLParser.KW_KEY, 0); }
		public TerminalNode KW_KEY_MEMBER() { return getToken(FQLParser.KW_KEY_MEMBER, 0); }
		public TerminalNode KW_KEY_TYPE() { return getToken(FQLParser.KW_KEY_TYPE, 0); }
		public TerminalNode KW_LABEL() { return getToken(FQLParser.KW_LABEL, 0); }
		public TerminalNode KW_LAST() { return getToken(FQLParser.KW_LAST, 0); }
		public TerminalNode KW_LENGTH() { return getToken(FQLParser.KW_LENGTH, 0); }
		public TerminalNode KW_LEVEL() { return getToken(FQLParser.KW_LEVEL, 0); }
		public TerminalNode KW_LOAD() { return getToken(FQLParser.KW_LOAD, 0); }
		public TerminalNode KW_LOCALTIMESTAMP() { return getToken(FQLParser.KW_LOCALTIMESTAMP, 0); }
		public TerminalNode KW_MAP() { return getToken(FQLParser.KW_MAP, 0); }
		public TerminalNode KW_MICROSECOND() { return getToken(FQLParser.KW_MICROSECOND, 0); }
		public TerminalNode KW_MILLENNIUM() { return getToken(FQLParser.KW_MILLENNIUM, 0); }
		public TerminalNode KW_MILLISECOND() { return getToken(FQLParser.KW_MILLISECOND, 0); }
		public TerminalNode KW_MINUTES() { return getToken(FQLParser.KW_MINUTES, 0); }
		public TerminalNode KW_MINVALUE() { return getToken(FQLParser.KW_MINVALUE, 0); }
		public TerminalNode KW_MODIFY() { return getToken(FQLParser.KW_MODIFY, 0); }
		public TerminalNode KW_MODULES() { return getToken(FQLParser.KW_MODULES, 0); }
		public TerminalNode KW_MONTHS() { return getToken(FQLParser.KW_MONTHS, 0); }
		public TerminalNode KW_NANOSECOND() { return getToken(FQLParser.KW_NANOSECOND, 0); }
		public TerminalNode KW_NULLS() { return getToken(FQLParser.KW_NULLS, 0); }
		public TerminalNode KW_NUMBER() { return getToken(FQLParser.KW_NUMBER, 0); }
		public TerminalNode KW_OPTION() { return getToken(FQLParser.KW_OPTION, 0); }
		public TerminalNode KW_OPTIONS() { return getToken(FQLParser.KW_OPTIONS, 0); }
		public TerminalNode KW_ORDERING() { return getToken(FQLParser.KW_ORDERING, 0); }
		public TerminalNode KW_OUTPUT() { return getToken(FQLParser.KW_OUTPUT, 0); }
		public TerminalNode KW_OVERWRITE() { return getToken(FQLParser.KW_OVERWRITE, 0); }
		public TerminalNode KW_OVERWRITING() { return getToken(FQLParser.KW_OVERWRITING, 0); }
		public TerminalNode KW_PARTITIONED() { return getToken(FQLParser.KW_PARTITIONED, 0); }
		public TerminalNode KW_PARTITIONS() { return getToken(FQLParser.KW_PARTITIONS, 0); }
		public TerminalNode KW_PASSING() { return getToken(FQLParser.KW_PASSING, 0); }
		public TerminalNode KW_PAST() { return getToken(FQLParser.KW_PAST, 0); }
		public TerminalNode KW_PATH() { return getToken(FQLParser.KW_PATH, 0); }
		public TerminalNode KW_PLACING() { return getToken(FQLParser.KW_PLACING, 0); }
		public TerminalNode KW_PLAN() { return getToken(FQLParser.KW_PLAN, 0); }
		public TerminalNode KW_PRECEDING() { return getToken(FQLParser.KW_PRECEDING, 0); }
		public TerminalNode KW_PRESERVE() { return getToken(FQLParser.KW_PRESERVE, 0); }
		public TerminalNode KW_PRIOR() { return getToken(FQLParser.KW_PRIOR, 0); }
		public TerminalNode KW_PRIVILEGES() { return getToken(FQLParser.KW_PRIVILEGES, 0); }
		public TerminalNode KW_PUBLIC() { return getToken(FQLParser.KW_PUBLIC, 0); }
		public TerminalNode KW_PYTHON() { return getToken(FQLParser.KW_PYTHON, 0); }
		public TerminalNode KW_PYTHON_FILES() { return getToken(FQLParser.KW_PYTHON_FILES, 0); }
		public TerminalNode KW_PYTHON_REQUIREMENTS() { return getToken(FQLParser.KW_PYTHON_REQUIREMENTS, 0); }
		public TerminalNode KW_PYTHON_DEPENDENCIES() { return getToken(FQLParser.KW_PYTHON_DEPENDENCIES, 0); }
		public TerminalNode KW_PYTHON_JAR() { return getToken(FQLParser.KW_PYTHON_JAR, 0); }
		public TerminalNode KW_PYTHON_ARCHIVES() { return getToken(FQLParser.KW_PYTHON_ARCHIVES, 0); }
		public TerminalNode KW_PYTHON_PARAMETER() { return getToken(FQLParser.KW_PYTHON_PARAMETER, 0); }
		public TerminalNode KW_QUARTER() { return getToken(FQLParser.KW_QUARTER, 0); }
		public TerminalNode KW_RAW() { return getToken(FQLParser.KW_RAW, 0); }
		public TerminalNode KW_READ() { return getToken(FQLParser.KW_READ, 0); }
		public TerminalNode KW_RELATIVE() { return getToken(FQLParser.KW_RELATIVE, 0); }
		public TerminalNode KW_REMOVE() { return getToken(FQLParser.KW_REMOVE, 0); }
		public TerminalNode KW_RENAME() { return getToken(FQLParser.KW_RENAME, 0); }
		public TerminalNode KW_REPLACE() { return getToken(FQLParser.KW_REPLACE, 0); }
		public TerminalNode KW_RESPECT() { return getToken(FQLParser.KW_RESPECT, 0); }
		public TerminalNode KW_RESTART() { return getToken(FQLParser.KW_RESTART, 0); }
		public TerminalNode KW_RESTRICT() { return getToken(FQLParser.KW_RESTRICT, 0); }
		public TerminalNode KW_ROLE() { return getToken(FQLParser.KW_ROLE, 0); }
		public TerminalNode KW_ROW_COUNT() { return getToken(FQLParser.KW_ROW_COUNT, 0); }
		public TerminalNode KW_SCALA() { return getToken(FQLParser.KW_SCALA, 0); }
		public TerminalNode KW_SCALAR() { return getToken(FQLParser.KW_SCALAR, 0); }
		public TerminalNode KW_SCALE() { return getToken(FQLParser.KW_SCALE, 0); }
		public TerminalNode KW_SCHEMA() { return getToken(FQLParser.KW_SCHEMA, 0); }
		public TerminalNode KW_SECONDS() { return getToken(FQLParser.KW_SECONDS, 0); }
		public TerminalNode KW_SECTION() { return getToken(FQLParser.KW_SECTION, 0); }
		public TerminalNode KW_SECURITY() { return getToken(FQLParser.KW_SECURITY, 0); }
		public TerminalNode KW_SELF() { return getToken(FQLParser.KW_SELF, 0); }
		public TerminalNode KW_SERVER() { return getToken(FQLParser.KW_SERVER, 0); }
		public TerminalNode KW_SERVER_NAME() { return getToken(FQLParser.KW_SERVER_NAME, 0); }
		public TerminalNode KW_SESSION() { return getToken(FQLParser.KW_SESSION, 0); }
		public TerminalNode KW_SETS() { return getToken(FQLParser.KW_SETS, 0); }
		public TerminalNode KW_SIMPLE() { return getToken(FQLParser.KW_SIMPLE, 0); }
		public TerminalNode KW_SIZE() { return getToken(FQLParser.KW_SIZE, 0); }
		public TerminalNode KW_SLIDE() { return getToken(FQLParser.KW_SLIDE, 0); }
		public TerminalNode KW_SOURCE() { return getToken(FQLParser.KW_SOURCE, 0); }
		public TerminalNode KW_SPACE() { return getToken(FQLParser.KW_SPACE, 0); }
		public TerminalNode KW_STATE() { return getToken(FQLParser.KW_STATE, 0); }
		public TerminalNode KW_STATEMENT() { return getToken(FQLParser.KW_STATEMENT, 0); }
		public TerminalNode KW_STEP() { return getToken(FQLParser.KW_STEP, 0); }
		public TerminalNode KW_STRING() { return getToken(FQLParser.KW_STRING, 0); }
		public TerminalNode KW_STRUCTURE() { return getToken(FQLParser.KW_STRUCTURE, 0); }
		public TerminalNode KW_STYLE() { return getToken(FQLParser.KW_STYLE, 0); }
		public TerminalNode KW_TABLES() { return getToken(FQLParser.KW_TABLES, 0); }
		public TerminalNode KW_TEMPORARY() { return getToken(FQLParser.KW_TEMPORARY, 0); }
		public TerminalNode KW_TIMECOL() { return getToken(FQLParser.KW_TIMECOL, 0); }
		public TerminalNode KW_FLOOR() { return getToken(FQLParser.KW_FLOOR, 0); }
		public TerminalNode KW_TIMESTAMP_LTZ() { return getToken(FQLParser.KW_TIMESTAMP_LTZ, 0); }
		public TerminalNode KW_TIMESTAMPADD() { return getToken(FQLParser.KW_TIMESTAMPADD, 0); }
		public TerminalNode KW_TIMESTAMPDIFF() { return getToken(FQLParser.KW_TIMESTAMPDIFF, 0); }
		public TerminalNode KW_TO_TIMESTAMP() { return getToken(FQLParser.KW_TO_TIMESTAMP, 0); }
		public TerminalNode KW_TRANSFORM() { return getToken(FQLParser.KW_TRANSFORM, 0); }
		public TerminalNode KW_TUMBLE() { return getToken(FQLParser.KW_TUMBLE, 0); }
		public TerminalNode KW_TYPE() { return getToken(FQLParser.KW_TYPE, 0); }
		public TerminalNode KW_UNDER() { return getToken(FQLParser.KW_UNDER, 0); }
		public TerminalNode KW_UNLOAD() { return getToken(FQLParser.KW_UNLOAD, 0); }
		public TerminalNode KW_USAGE() { return getToken(FQLParser.KW_USAGE, 0); }
		public TerminalNode KW_USE() { return getToken(FQLParser.KW_USE, 0); }
		public TerminalNode KW_USER() { return getToken(FQLParser.KW_USER, 0); }
		public TerminalNode KW_UTF16() { return getToken(FQLParser.KW_UTF16, 0); }
		public TerminalNode KW_UTF32() { return getToken(FQLParser.KW_UTF32, 0); }
		public TerminalNode KW_UTF8() { return getToken(FQLParser.KW_UTF8, 0); }
		public TerminalNode KW_VERSION() { return getToken(FQLParser.KW_VERSION, 0); }
		public TerminalNode KW_VIEW() { return getToken(FQLParser.KW_VIEW, 0); }
		public TerminalNode KW_VIEWS() { return getToken(FQLParser.KW_VIEWS, 0); }
		public TerminalNode KW_VIRTUAL() { return getToken(FQLParser.KW_VIRTUAL, 0); }
		public TerminalNode KW_WATERMARK() { return getToken(FQLParser.KW_WATERMARK, 0); }
		public TerminalNode KW_WATERMARKS() { return getToken(FQLParser.KW_WATERMARKS, 0); }
		public TerminalNode KW_WEEK() { return getToken(FQLParser.KW_WEEK, 0); }
		public TerminalNode KW_WORK() { return getToken(FQLParser.KW_WORK, 0); }
		public TerminalNode KW_WRAPPER() { return getToken(FQLParser.KW_WRAPPER, 0); }
		public TerminalNode KW_YEARS() { return getToken(FQLParser.KW_YEARS, 0); }
		public TerminalNode KW_ZONE() { return getToken(FQLParser.KW_ZONE, 0); }
		public NonReservedKeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReservedKeywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterNonReservedKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitNonReservedKeywords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitNonReservedKeywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedKeywordsContext nonReservedKeywords() throws RecognitionException {
		NonReservedKeywordsContext _localctx = new NonReservedKeywordsContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_nonReservedKeywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1963);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -72075323663974416L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1729531790491648385L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -576478345160589313L) != 0) || _la==KW_DATE || _la==KW_LOCALTIMESTAMP || _la==KW_USER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProjectItemDefinitionContext extends ParserRuleContext {
		public ProjectItemDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectItemDefinition; }
	 
		public ProjectItemDefinitionContext() { }
		public void copyFrom(ProjectItemDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommonContext extends ProjectItemDefinitionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode KW_AS() { return getToken(FQLParser.KW_AS, 0); }
		public CommonContext(ProjectItemDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterCommon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitCommon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitCommon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlinkStyleProjectItemContext extends ProjectItemDefinitionContext {
		public OverWindowItemContext overWindowItem() {
			return getRuleContext(OverWindowItemContext.class,0);
		}
		public FlinkStyleProjectItemContext(ProjectItemDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFlinkStyleProjectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFlinkStyleProjectItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFlinkStyleProjectItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectItemDefinitionContext projectItemDefinition() throws RecognitionException {
		ProjectItemDefinitionContext _localctx = new ProjectItemDefinitionContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_projectItemDefinition);
		int _la;
		try {
			setState(1973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				_localctx = new FlinkStyleProjectItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1965);
				overWindowItem();
				}
				}
				break;
			case 2:
				_localctx = new CommonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1966);
				expression();
				setState(1971);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1968);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_AS) {
						{
						setState(1967);
						match(KW_AS);
						}
					}

					setState(1970);
					expression();
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStatementContext extends ParserRuleContext {
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
	 
		public SelectStatementContext() { }
		public void copyFrom(SelectStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommonSQLContext extends SelectStatementContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public CommonSQLContext(SelectStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterCommonSQL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitCommonSQL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitCommonSQL(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectWithMatchRecognizeContext extends SelectStatementContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public MatchRecognizeClauseContext matchRecognizeClause() {
			return getRuleContext(MatchRecognizeClauseContext.class,0);
		}
		public SelectWithMatchRecognizeContext(SelectStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSelectWithMatchRecognize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSelectWithMatchRecognize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSelectWithMatchRecognize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_selectStatement);
		try {
			setState(1993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				_localctx = new CommonSQLContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1975);
				selectClause();
				setState(1976);
				fromClause();
				setState(1978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1977);
					whereClause();
					}
					break;
				}
				setState(1981);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1980);
					groupByClause();
					}
					break;
				}
				setState(1984);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1983);
					havingClause();
					}
					break;
				}
				setState(1987);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1986);
					windowClause();
					}
					break;
				}
				}
				}
				break;
			case 2:
				_localctx = new SelectWithMatchRecognizeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1989);
				selectClause();
				setState(1990);
				fromClause();
				setState(1991);
				matchRecognizeClause();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode KW_SELECT() { return getToken(FQLParser.KW_SELECT, 0); }
		public TerminalNode ASTERISK_SIGN() { return getToken(FQLParser.ASTERISK_SIGN, 0); }
		public List<ProjectItemDefinitionContext> projectItemDefinition() {
			return getRuleContexts(ProjectItemDefinitionContext.class);
		}
		public ProjectItemDefinitionContext projectItemDefinition(int i) {
			return getRuleContext(ProjectItemDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			match(KW_SELECT);
			setState(2005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1996);
				match(ASTERISK_SIGN);
				}
				break;
			case 2:
				{
				setState(1997);
				projectItemDefinition();
				setState(2002);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1998);
						match(COMMA);
						setState(1999);
						projectItemDefinition();
						}
						} 
					}
					setState(2004);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertStatementContext extends ParserRuleContext {
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
	 
		public InsertStatementContext() { }
		public void copyFrom(InsertStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommonInsertContext extends InsertStatementContext {
		public InsertSimpleStatementContext insertSimpleStatement() {
			return getRuleContext(InsertSimpleStatementContext.class,0);
		}
		public TerminalNode KW_EXECUTE() { return getToken(FQLParser.KW_EXECUTE, 0); }
		public CommonInsertContext(InsertStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterCommonInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitCommonInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitCommonInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_insertStatement);
		int _la;
		try {
			_localctx = new CommonInsertContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_EXECUTE) {
				{
				setState(2007);
				match(KW_EXECUTE);
				}
			}

			setState(2010);
			insertSimpleStatement();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinOpContext extends ParserRuleContext {
		public FlinkJoinOpContext flinkJoinOp() {
			return getRuleContext(FlinkJoinOpContext.class,0);
		}
		public JoinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterJoinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitJoinOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitJoinOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinOpContext joinOp() throws RecognitionException {
		JoinOpContext _localctx = new JoinOpContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_joinOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2012);
			flinkJoinOp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableExpressionContext extends ParserRuleContext {
		public List<TableReferenceContext> tableReference() {
			return getRuleContexts(TableReferenceContext.class);
		}
		public TableReferenceContext tableReference(int i) {
			return getRuleContext(TableReferenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FQLParser.COMMA, i);
		}
		public InlineDataValueClauseContext inlineDataValueClause() {
			return getRuleContext(InlineDataValueClauseContext.class,0);
		}
		public WindowTVFClauseContext windowTVFClause() {
			return getRuleContext(WindowTVFClauseContext.class,0);
		}
		public List<TableExpressionContext> tableExpression() {
			return getRuleContexts(TableExpressionContext.class);
		}
		public TableExpressionContext tableExpression(int i) {
			return getRuleContext(TableExpressionContext.class,i);
		}
		public TerminalNode KW_CROSS() { return getToken(FQLParser.KW_CROSS, 0); }
		public TerminalNode KW_JOIN() { return getToken(FQLParser.KW_JOIN, 0); }
		public TerminalNode KW_NATURAL() { return getToken(FQLParser.KW_NATURAL, 0); }
		public JoinOpContext joinOp() {
			return getRuleContext(JoinOpContext.class,0);
		}
		public TerminalNode KW_OUTER() { return getToken(FQLParser.KW_OUTER, 0); }
		public TerminalNode KW_SEMI() { return getToken(FQLParser.KW_SEMI, 0); }
		public JoinConditionContext joinCondition() {
			return getRuleContext(JoinConditionContext.class,0);
		}
		public TableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExpressionContext tableExpression() throws RecognitionException {
		return tableExpression(0);
	}

	private TableExpressionContext tableExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TableExpressionContext _localctx = new TableExpressionContext(_ctx, _parentState);
		TableExpressionContext _prevctx = _localctx;
		int _startState = 314;
		enterRecursionRule(_localctx, 314, RULE_tableExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(2015);
				tableReference();
				setState(2020);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2016);
						match(COMMA);
						setState(2017);
						tableReference();
						}
						} 
					}
					setState(2022);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(2023);
				inlineDataValueClause();
				}
				break;
			case 3:
				{
				setState(2024);
				windowTVFClause();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2058);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2056);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
					case 1:
						{
						_localctx = new TableExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_tableExpression);
						setState(2027);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2028);
						match(KW_CROSS);
						setState(2029);
						match(KW_JOIN);
						setState(2030);
						tableExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new TableExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_tableExpression);
						setState(2031);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2033);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KW_NATURAL) {
							{
							setState(2032);
							match(KW_NATURAL);
							}
						}

						setState(2036);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 277)) & ~0x3f) == 0 && ((1L << (_la - 277)) & 268439553L) != 0) || _la==KW_RIGHT) {
							{
							setState(2035);
							joinOp();
							}
						}

						setState(2039);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KW_OUTER) {
							{
							setState(2038);
							match(KW_OUTER);
							}
						}

						setState(2042);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KW_SEMI) {
							{
							setState(2041);
							match(KW_SEMI);
							}
						}

						setState(2044);
						match(KW_JOIN);
						setState(2045);
						tableExpression(0);
						setState(2047);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
						case 1:
							{
							setState(2046);
							joinCondition();
							}
							break;
						}
						setState(2053);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(2049);
								match(COMMA);
								setState(2050);
								tableReference();
								}
								} 
							}
							setState(2055);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(2060);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableContext extends ParserRuleContext {
		public SimpleCreateTableContext simpleCreateTable() {
			return getRuleContext(SimpleCreateTableContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			simpleCreateTable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OverWindowItemContext extends ParserRuleContext {
		public OverWindowItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overWindowItem; }
	 
		public OverWindowItemContext() { }
		public void copyFrom(OverWindowItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Flink_common2Context extends OverWindowItemContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode KW_OVER() { return getToken(FQLParser.KW_OVER, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(FQLParser.KW_AS, 0); }
		public Flink_common2Context(OverWindowItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFlink_common2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFlink_common2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFlink_common2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Flink_commnContext extends OverWindowItemContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode KW_OVER() { return getToken(FQLParser.KW_OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(FQLParser.KW_AS, 0); }
		public Flink_commnContext(OverWindowItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFlink_commn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFlink_commn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFlink_commn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverWindowItemContext overWindowItem() throws RecognitionException {
		OverWindowItemContext _localctx = new OverWindowItemContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_overWindowItem);
		int _la;
		try {
			setState(2079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				_localctx = new Flink_commnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2063);
				primaryExpression(0);
				setState(2064);
				match(KW_OVER);
				setState(2065);
				windowSpec();
				setState(2067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(2066);
					match(KW_AS);
					}
				}

				setState(2069);
				identifier();
				}
				break;
			case 2:
				_localctx = new Flink_common2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2071);
				primaryExpression(0);
				setState(2072);
				match(KW_OVER);
				setState(2073);
				errorCapturingIdentifier();
				setState(2075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(2074);
					match(KW_AS);
					}
				}

				setState(2077);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return queryStatement_sempred((QueryStatementContext)_localctx, predIndex);
		case 93:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 96:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 97:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 157:
			return tableExpression_sempred((TableExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryStatement_sempred(QueryStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean tableExpression_sempred(TableExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u01cd\u0822\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u0146\b\u0001\n\u0001\f\u0001\u0149\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0151\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u015b\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u015f\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0163\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u016a\b\u0007\n\u0007\f\u0007\u016d\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0171\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0175\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0179\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u017d\b\u0007\u0001\u0007\u0003\u0007"+
		"\u0180\b\u0007\u0001\u0007\u0003\u0007\u0183\b\u0007\u0001\u0007\u0003"+
		"\u0007\u0186\b\u0007\u0001\u0007\u0003\u0007\u0189\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u018f\b\b\u0003\b\u0191\b\b\u0001\b\u0001\b"+
		"\u0003\b\u0195\b\b\u0001\b\u0003\b\u0198\b\b\u0001\b\u0001\b\u0003\b\u019c"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u01a4\b\n"+
		"\u0001\n\u0003\n\u01a7\b\n\u0001\n\u0003\n\u01aa\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u01af\b\n\u0001\n\u0001\n\u0003\n\u01b3\b\n\u0001\n\u0003\n"+
		"\u01b6\b\n\u0005\n\u01b8\b\n\n\n\f\n\u01bb\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u01c1\b\u000b\n\u000b\f\u000b\u01c4"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u01cb\b\f\n\f"+
		"\f\f\u01ce\t\f\u0001\f\u0001\f\u0003\f\u01d2\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u01e0\b\u000e\n\u000e\f\u000e\u01e3"+
		"\t\u000e\u0001\u000e\u0003\u000e\u01e6\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u01ed\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0003\u0012\u01f2\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u01f6\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01fa\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0204\b\u0012\n\u0012\f\u0012"+
		"\u0207\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u020d\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u021b\b\u0012\n\u0012\f\u0012\u021e\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0228\b\u0012\n\u0012\f\u0012\u022b\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0234\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u023e\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0250\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0258\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u025e\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0265\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u026e\b\u0018\u0001\u0018\u0003\u0018\u0271\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u027b\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0281\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0288\b\u0019\u0001\u0019\u0003\u0019\u028b"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0290\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0299\b\u0019\u0001\u0019\u0003\u0019\u029c\b"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u02a6\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u02ac\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u02b3\b\u001a\u0001"+
		"\u001a\u0003\u001a\u02b6\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u02bb\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u02c7\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u02cf\b\u001b\n\u001b\f\u001b\u02d2\t\u001b"+
		"\u0003\u001b\u02d4\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u02d9\b\u001b\u0001\u001b\u0003\u001b\u02dc\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u02e1\b\u001b\u0001\u001b\u0003\u001b\u02e4"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u02f9\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0005 \u0309\b \n \f \u030c\t \u0001 \u0001"+
		" \u0003 \u0310\b \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u031d\b\"\n\"\f\"\u0320\t\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0329\b\"\n"+
		"\"\f\"\u032c\t\"\u0001\"\u0001\"\u0003\"\u0330\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0005#\u0337\b#\n#\f#\u033a\t#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001*\u0005*\u0355\b*\n*\f*\u0358\t*\u0001+\u0001+\u0001+\u0001+\u0001"+
		",\u0003,\u035f\b,\u0001,\u0001,\u0003,\u0363\b,\u0001,\u0003,\u0366\b"+
		",\u0001,\u0003,\u0369\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0003-\u0370"+
		"\b-\u0001-\u0003-\u0373\b-\u0001-\u0003-\u0376\b-\u0001-\u0003-\u0379"+
		"\b-\u0001-\u0003-\u037c\b-\u0001-\u0003-\u037f\b-\u0001-\u0001-\u0001"+
		"-\u0003-\u0384\b-\u0001-\u0003-\u0387\b-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0005.\u038e\b.\n.\f.\u0391\t.\u0001/\u0001/\u0003/\u0395\b/\u0001/"+
		"\u0001/\u0003/\u0399\b/\u00010\u00010\u00010\u00030\u039e\b0\u00011\u0001"+
		"1\u00011\u00011\u00011\u00051\u03a5\b1\n1\f1\u03a8\t1\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00032\u03ba\b2\u00013\u00013\u00013\u00013\u0005"+
		"3\u03c0\b3\n3\f3\u03c3\t3\u00014\u00014\u00014\u00044\u03c8\b4\u000b4"+
		"\f4\u03c9\u00014\u00014\u00034\u03ce\b4\u00015\u00015\u00035\u03d2\b5"+
		"\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u03dc"+
		"\b6\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00037\u03f6\b7\u00018\u00018\u00018\u0001"+
		"8\u00058\u03fc\b8\n8\f8\u03ff\t8\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00039\u040a\b9\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001"+
		"=\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0005?\u0423"+
		"\b?\n?\f?\u0426\t?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0005@\u0430\b@\n@\f@\u0433\t@\u0001@\u0001@\u0003@\u0437\b@\u0001A"+
		"\u0001A\u0003A\u043b\bA\u0001B\u0001B\u0001B\u0001B\u0005B\u0441\bB\n"+
		"B\fB\u0444\tB\u0001B\u0003B\u0447\bB\u0001C\u0001C\u0001C\u0003C\u044c"+
		"\bC\u0001C\u0001C\u0001C\u0001C\u0003C\u0452\bC\u0001C\u0001C\u0001C\u0001"+
		"C\u0003C\u0458\bC\u0001D\u0001D\u0001D\u0003D\u045d\bD\u0001D\u0001D\u0001"+
		"D\u0001D\u0003D\u0463\bD\u0001D\u0001D\u0001D\u0001D\u0003D\u0469\bD\u0001"+
		"E\u0001E\u0001E\u0001E\u0003E\u046f\bE\u0001F\u0001F\u0001F\u0003F\u0474"+
		"\bF\u0001G\u0001G\u0001G\u0003G\u0479\bG\u0001G\u0003G\u047c\bG\u0001"+
		"H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0003I\u048a\bI\u0001I\u0001I\u0001I\u0003I\u048f\bI\u0003I\u0491"+
		"\bI\u0001J\u0001J\u0003J\u0495\bJ\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0005L\u04a3\bL\nL\fL\u04a6"+
		"\tL\u0001M\u0001M\u0001M\u0001M\u0005M\u04ac\bM\nM\fM\u04af\tM\u0001M"+
		"\u0001M\u0001N\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0003"+
		"O\u04bb\bO\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0003P\u04c3\bP\u0001"+
		"P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0005Q\u04cb\bQ\nQ\fQ\u04ce\tQ\u0001"+
		"Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0005S\u04e0\bS\nS\fS\u04e3\tS\u0001"+
		"S\u0001S\u0001T\u0001T\u0003T\u04e9\bT\u0001T\u0001T\u0001T\u0001T\u0003"+
		"T\u04ef\bT\u0001T\u0003T\u04f2\bT\u0001T\u0003T\u04f5\bT\u0001U\u0001"+
		"U\u0001U\u0001V\u0001V\u0001V\u0001V\u0001V\u0003V\u04ff\bV\u0001V\u0003"+
		"V\u0502\bV\u0001W\u0001W\u0001X\u0001X\u0001X\u0001X\u0003X\u050a\bX\u0001"+
		"Y\u0001Y\u0003Y\u050e\bY\u0001Z\u0001Z\u0001Z\u0001Z\u0005Z\u0514\bZ\n"+
		"Z\fZ\u0517\tZ\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0005Z\u051e\bZ\nZ\f"+
		"Z\u0521\tZ\u0003Z\u0523\bZ\u0001[\u0001[\u0001[\u0003[\u0528\b[\u0001"+
		"[\u0001[\u0003[\u052c\b[\u0001[\u0001[\u0003[\u0530\b[\u0001[\u0001[\u0003"+
		"[\u0534\b[\u0001[\u0001[\u0003[\u0538\b[\u0001[\u0001[\u0003[\u053c\b"+
		"[\u0001[\u0001[\u0003[\u0540\b[\u0001[\u0001[\u0003[\u0544\b[\u0001[\u0001"+
		"[\u0003[\u0548\b[\u0001[\u0001[\u0003[\u054c\b[\u0001[\u0001[\u0003[\u0550"+
		"\b[\u0001[\u0001[\u0003[\u0554\b[\u0001[\u0001[\u0003[\u0558\b[\u0001"+
		"[\u0001[\u0003[\u055c\b[\u0001[\u0001[\u0003[\u0560\b[\u0001[\u0001[\u0003"+
		"[\u0564\b[\u0001[\u0001[\u0003[\u0568\b[\u0001[\u0001[\u0003[\u056c\b"+
		"[\u0003[\u056e\b[\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0003]\u057c\b]\u0003]\u057e\b]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0003]\u0589\b]\u0001"+
		"]\u0005]\u058c\b]\n]\f]\u058f\t]\u0001^\u0003^\u0592\b^\u0001^\u0001^"+
		"\u0003^\u0596\b^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u059d\b^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0005^\u05a4\b^\n^\f^\u05a7\t^\u0001^\u0001"+
		"^\u0001^\u0003^\u05ac\b^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0003^\u05b9\b^\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0003^\u05c0\b^\u0001^\u0001^\u0001^\u0003^\u05c5\b^\u0001^\u0001"+
		"^\u0001^\u0001^\u0003^\u05cb\b^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003"+
		"^\u05d2\b^\u0003^\u05d4\b^\u0001_\u0003_\u05d7\b_\u0001_\u0001_\u0001"+
		"_\u0001_\u0001_\u0001_\u0001_\u0001_\u0005_\u05e1\b_\n_\f_\u05e4\t_\u0001"+
		"_\u0001_\u0003_\u05e8\b_\u0001_\u0003_\u05eb\b_\u0001_\u0001_\u0001_\u0001"+
		"_\u0003_\u05f1\b_\u0003_\u05f3\b_\u0001`\u0001`\u0001`\u0001`\u0003`\u05f9"+
		"\b`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001"+
		"`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0005"+
		"`\u060e\b`\n`\f`\u0611\t`\u0001a\u0001a\u0001a\u0004a\u0616\ba\u000ba"+
		"\fa\u0617\u0001a\u0001a\u0003a\u061c\ba\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0004a\u0623\ba\u000ba\fa\u0624\u0001a\u0001a\u0003a\u0629\ba\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0003a\u0639\ba\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0003a\u0642\ba\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0003a\u065a\ba\u0001a\u0001"+
		"a\u0001a\u0005a\u065f\ba\na\fa\u0662\ta\u0003a\u0664\ba\u0001a\u0001a"+
		"\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0003a\u0672\ba\u0001a\u0001a\u0001a\u0003a\u0677\ba\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0003a\u0682\ba\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0005a\u0689\ba\na\fa\u068c\ta\u0001b\u0001b\u0001"+
		"b\u0003b\u0691\bb\u0001c\u0001c\u0001c\u0001c\u0001c\u0005c\u0698\bc\n"+
		"c\fc\u069b\tc\u0001c\u0001c\u0001d\u0001d\u0001d\u0001d\u0001d\u0005d"+
		"\u06a4\bd\nd\fd\u06a7\td\u0001d\u0001d\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001f\u0001f\u0003f\u06b4\bf\u0001g\u0001g\u0001g\u0003"+
		"g\u06b9\bg\u0001h\u0001h\u0001h\u0001h\u0001h\u0003h\u06c0\bh\u0001i\u0001"+
		"i\u0001i\u0001i\u0001i\u0001i\u0001j\u0001j\u0001k\u0001k\u0001l\u0001"+
		"l\u0003l\u06ce\bl\u0001m\u0001m\u0001m\u0003m\u06d3\bm\u0001n\u0001n\u0003"+
		"n\u06d7\bn\u0001o\u0001o\u0001o\u0004o\u06dc\bo\u000bo\fo\u06dd\u0001"+
		"p\u0001p\u0001p\u0003p\u06e3\bp\u0001q\u0001q\u0001q\u0001q\u0001q\u0001"+
		"r\u0003r\u06eb\br\u0001r\u0001r\u0003r\u06ef\br\u0001s\u0003s\u06f2\b"+
		"s\u0001s\u0001s\u0003s\u06f6\bs\u0001t\u0003t\u06f9\bt\u0001t\u0001t\u0003"+
		"t\u06fd\bt\u0001u\u0001u\u0001u\u0001v\u0001v\u0004v\u0704\bv\u000bv\f"+
		"v\u0705\u0001v\u0003v\u0709\bv\u0001w\u0001w\u0001w\u0001w\u0001x\u0001"+
		"x\u0001x\u0005x\u0712\bx\nx\fx\u0715\tx\u0001y\u0001y\u0001y\u0001y\u0003"+
		"y\u071b\by\u0001z\u0001z\u0001z\u0001z\u0001z\u0001{\u0001{\u0001|\u0001"+
		"|\u0001}\u0001}\u0001}\u0001}\u0001}\u0001~\u0001~\u0001\u007f\u0001\u007f"+
		"\u0001\u0080\u0001\u0080\u0001\u0081\u0001\u0081\u0001\u0082\u0001\u0082"+
		"\u0001\u0083\u0001\u0083\u0001\u0083\u0005\u0083\u0738\b\u0083\n\u0083"+
		"\f\u0083\u073b\t\u0083\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0085"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0086\u0001\u0086\u0001\u0086"+
		"\u0001\u0087\u0001\u0087\u0001\u0087\u0003\u0087\u074a\b\u0087\u0001\u0087"+
		"\u0001\u0087\u0001\u0087\u0003\u0087\u074f\b\u0087\u0005\u0087\u0751\b"+
		"\u0087\n\u0087\f\u0087\u0754\t\u0087\u0001\u0087\u0001\u0087\u0001\u0088"+
		"\u0001\u0088\u0001\u0088\u0001\u0088\u0005\u0088\u075c\b\u0088\n\u0088"+
		"\f\u0088\u075f\t\u0088\u0001\u0088\u0001\u0088\u0001\u0089\u0001\u0089"+
		"\u0001\u0089\u0001\u0089\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0005\u008a\u076b\b\u008a\n\u008a\f\u008a\u076e\t\u008a\u0001\u008a\u0003"+
		"\u008a\u0771\b\u008a\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001"+
		"\u008b\u0003\u008b\u0778\b\u008b\u0001\u008c\u0001\u008c\u0001\u008c\u0001"+
		"\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001"+
		"\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0003\u008c\u0788"+
		"\b\u008c\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u078e"+
		"\b\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u0794"+
		"\b\u008d\u0001\u008d\u0003\u008d\u0797\b\u008d\u0001\u008e\u0001\u008e"+
		"\u0001\u008e\u0001\u008f\u0001\u008f\u0001\u0090\u0001\u0090\u0001\u0091"+
		"\u0001\u0091\u0001\u0092\u0001\u0092\u0001\u0093\u0001\u0093\u0001\u0094"+
		"\u0001\u0094\u0001\u0095\u0001\u0095\u0001\u0096\u0001\u0096\u0001\u0097"+
		"\u0001\u0097\u0001\u0098\u0001\u0098\u0001\u0098\u0003\u0098\u07b1\b\u0098"+
		"\u0001\u0098\u0003\u0098\u07b4\b\u0098\u0003\u0098\u07b6\b\u0098\u0001"+
		"\u0099\u0001\u0099\u0001\u0099\u0003\u0099\u07bb\b\u0099\u0001\u0099\u0003"+
		"\u0099\u07be\b\u0099\u0001\u0099\u0003\u0099\u07c1\b\u0099\u0001\u0099"+
		"\u0003\u0099\u07c4\b\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099"+
		"\u0003\u0099\u07ca\b\u0099\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a"+
		"\u0001\u009a\u0005\u009a\u07d1\b\u009a\n\u009a\f\u009a\u07d4\t\u009a\u0003"+
		"\u009a\u07d6\b\u009a\u0001\u009b\u0003\u009b\u07d9\b\u009b\u0001\u009b"+
		"\u0001\u009b\u0001\u009c\u0001\u009c\u0001\u009d\u0001\u009d\u0001\u009d"+
		"\u0001\u009d\u0005\u009d\u07e3\b\u009d\n\u009d\f\u009d\u07e6\t\u009d\u0001"+
		"\u009d\u0001\u009d\u0003\u009d\u07ea\b\u009d\u0001\u009d\u0001\u009d\u0001"+
		"\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0003\u009d\u07f2\b\u009d\u0001"+
		"\u009d\u0003\u009d\u07f5\b\u009d\u0001\u009d\u0003\u009d\u07f8\b\u009d"+
		"\u0001\u009d\u0003\u009d\u07fb\b\u009d\u0001\u009d\u0001\u009d\u0001\u009d"+
		"\u0003\u009d\u0800\b\u009d\u0001\u009d\u0001\u009d\u0005\u009d\u0804\b"+
		"\u009d\n\u009d\f\u009d\u0807\t\u009d\u0005\u009d\u0809\b\u009d\n\u009d"+
		"\f\u009d\u080c\t\u009d\u0001\u009e\u0001\u009e\u0001\u009f\u0001\u009f"+
		"\u0001\u009f\u0001\u009f\u0003\u009f\u0814\b\u009f\u0001\u009f\u0001\u009f"+
		"\u0001\u009f\u0001\u009f\u0001\u009f\u0001\u009f\u0003\u009f\u081c\b\u009f"+
		"\u0001\u009f\u0001\u009f\u0003\u009f\u0820\b\u009f\u0001\u009f\u0000\u0005"+
		"\u0014\u00ba\u00c0\u00c2\u013a\u00a0\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0000!\u0003\u0000\u0108\u0108\u0126\u0126"+
		"\u0188\u0188\u0004\u0000\u0115\u0115\u0121\u0121\u0131\u0131\u0163\u0163"+
		"\u0004\u0000\u0018\u0018<<\u0092\u0092\u00aa\u00aa\u0005\u0000\u0019\u0019"+
		"\u0095\u0096\u009c\u009c\u00a3\u00a3\u014c\u014c\u0002\u0000\u00ed\u00ed"+
		"\u0166\u0166\u0003\u0000<<\u0092\u0092\u00aa\u00aa\u0002\u0000\b\b\u001f"+
		"\u001f\u0002\u0000//NN\u0002\u0000**\u0120\u0120\u0003\u0000\u0016\u0016"+
		"ee\u00c1\u00c1\u0003\u0000**cc\u0120\u0120\u0003\u000077__\u00b9\u00b9"+
		"\u0003\u0000\u00d2\u00d2\u00f2\u00f2\u0149\u0149\u000b\u0000\n\n\u009e"+
		"\u009e\u00a5\u00a5\u00ce\u00cf\u00db\u00db\u00f3\u00f3\u0124\u0125\u0171"+
		"\u0171\u017e\u017e\u0183\u0183\u0193\u0194\u0002\u0000\u0198\u0198\u019a"+
		"\u019a\u0004\u0000\u00f5\u00f6\u0100\u0100\u0111\u0111\u014a\u014a\u0002"+
		"\u0000\u00c7\u00c7\u0141\u0141\u0004\u0000\u010f\u010f\u0149\u0149\u0186"+
		"\u0186\u018a\u018a\u0002\u0000\u00c9\u00c9\u0176\u0176\u0002\u0000\u00c1"+
		"\u00c1\u00c5\u00c5\u0002\u0000\u01a9\u01a9\u01c2\u01c3\u0004\u0000!!\u01c0"+
		"\u01c0\u01c4\u01c4\u01c7\u01c7\u0002\u0000\u01c2\u01c3\u01c5\u01c5\u0001"+
		"\u0000\u01c2\u01c3\u0001\u0000\u01cb\u01cc\u0002\u0000\u01cb\u01cb\u01cd"+
		"\u01cd\u0002\u0000\u010f\u010f\u0186\u0186\u0002\u0000\u00c1\u00c1\u00fe"+
		"\u00fe\n\u0000SSUUyy\u00ba\u00ba\u00f4\u00f4\u011d\u011d\u013d\u013d\u0140"+
		"\u0140\u016a\u016a\u019b\u019b\u0010\u0000\u000e\u000e\u001c\u001d%%="+
		"=SVZ[yy\u008b\u008b\u00ba\u00bb\u00be\u00be\u00f4\u00f4\u011d\u011d\u013d"+
		"\u013d\u0140\u0140\u016a\u016a\u019b\u019b\u0006\u0000\u00c1\u00c1\u00d3"+
		"\u00d3\u00fe\u00fe\u0130\u0130\u0185\u0185\u01c0\u01c0!\u0000>>RRyy\u00ba"+
		"\u00ba\u00c0\u00c0\u00c7\u00c7\u00cb\u00cb\u00d9\u00da\u00e1\u00e1\u00e3"+
		"\u00e3\u00ea\u00ea\u00f2\u00f2\u010e\u010e\u0114\u0114\u011a\u011a\u011d"+
		"\u011d\u012b\u012b\u012e\u012f\u0131\u0131\u013d\u013d\u0140\u0140\u0148"+
		"\u0148\u0154\u0154\u0159\u0159\u015b\u015c\u015f\u0160\u0163\u0163\u016a"+
		"\u016a\u0174\u0175\u017e\u0182\u0187\u0187\u018d\u018d\u019b\u019b\u0011"+
		"\u0000\u0004\u0013\u0015$&+-79FIjlnpz}\u008e\u0090\u009a\u009c\u009c\u009e"+
		"\u00ab\u00ad\u00ba\u00bc\u00bf\u00f2\u00f2\u0136\u0136\u018f\u018f\u08cf"+
		"\u0000\u0140\u0001\u0000\u0000\u0000\u0002\u0147\u0001\u0000\u0000\u0000"+
		"\u0004\u0150\u0001\u0000\u0000\u0000\u0006\u0152\u0001\u0000\u0000\u0000"+
		"\b\u0154\u0001\u0000\u0000\u0000\n\u0156\u0001\u0000\u0000\u0000\f\u015a"+
		"\u0001\u0000\u0000\u0000\u000e\u015c\u0001\u0000\u0000\u0000\u0010\u018a"+
		"\u0001\u0000\u0000\u0000\u0012\u019d\u0001\u0000\u0000\u0000\u0014\u01a0"+
		"\u0001\u0000\u0000\u0000\u0016\u01bc\u0001\u0000\u0000\u0000\u0018\u01c5"+
		"\u0001\u0000\u0000\u0000\u001a\u01d8\u0001\u0000\u0000\u0000\u001c\u01da"+
		"\u0001\u0000\u0000\u0000\u001e\u01e7\u0001\u0000\u0000\u0000 \u01ea\u0001"+
		"\u0000\u0000\u0000\"\u01ee\u0001\u0000\u0000\u0000$\u0233\u0001\u0000"+
		"\u0000\u0000&\u023d\u0001\u0000\u0000\u0000(\u023f\u0001\u0000\u0000\u0000"+
		"*\u0241\u0001\u0000\u0000\u0000,\u0246\u0001\u0000\u0000\u0000.\u024f"+
		"\u0001\u0000\u0000\u00000\u0251\u0001\u0000\u0000\u00002\u0274\u0001\u0000"+
		"\u0000\u00004\u029f\u0001\u0000\u0000\u00006\u02c0\u0001\u0000\u0000\u0000"+
		"8\u02e7\u0001\u0000\u0000\u0000:\u02f8\u0001\u0000\u0000\u0000<\u02fa"+
		"\u0001\u0000\u0000\u0000>\u02fc\u0001\u0000\u0000\u0000@\u030f\u0001\u0000"+
		"\u0000\u0000B\u0311\u0001\u0000\u0000\u0000D\u032f\u0001\u0000\u0000\u0000"+
		"F\u0331\u0001\u0000\u0000\u0000H\u033d\u0001\u0000\u0000\u0000J\u0340"+
		"\u0001\u0000\u0000\u0000L\u0342\u0001\u0000\u0000\u0000N\u0349\u0001\u0000"+
		"\u0000\u0000P\u034b\u0001\u0000\u0000\u0000R\u034d\u0001\u0000\u0000\u0000"+
		"T\u0350\u0001\u0000\u0000\u0000V\u0359\u0001\u0000\u0000\u0000X\u035e"+
		"\u0001\u0000\u0000\u0000Z\u036c\u0001\u0000\u0000\u0000\\\u0388\u0001"+
		"\u0000\u0000\u0000^\u0392\u0001\u0000\u0000\u0000`\u039a\u0001\u0000\u0000"+
		"\u0000b\u039f\u0001\u0000\u0000\u0000d\u03b9\u0001\u0000\u0000\u0000f"+
		"\u03bb\u0001\u0000\u0000\u0000h\u03c4\u0001\u0000\u0000\u0000j\u03cf\u0001"+
		"\u0000\u0000\u0000l\u03db\u0001\u0000\u0000\u0000n\u03f5\u0001\u0000\u0000"+
		"\u0000p\u03f7\u0001\u0000\u0000\u0000r\u0409\u0001\u0000\u0000\u0000t"+
		"\u040b\u0001\u0000\u0000\u0000v\u0410\u0001\u0000\u0000\u0000x\u0413\u0001"+
		"\u0000\u0000\u0000z\u0416\u0001\u0000\u0000\u0000|\u041a\u0001\u0000\u0000"+
		"\u0000~\u041e\u0001\u0000\u0000\u0000\u0080\u0436\u0001\u0000\u0000\u0000"+
		"\u0082\u043a\u0001\u0000\u0000\u0000\u0084\u043c\u0001\u0000\u0000\u0000"+
		"\u0086\u0448\u0001\u0000\u0000\u0000\u0088\u0459\u0001\u0000\u0000\u0000"+
		"\u008a\u046e\u0001\u0000\u0000\u0000\u008c\u0473\u0001\u0000\u0000\u0000"+
		"\u008e\u0475\u0001\u0000\u0000\u0000\u0090\u047d\u0001\u0000\u0000\u0000"+
		"\u0092\u0490\u0001\u0000\u0000\u0000\u0094\u0494\u0001\u0000\u0000\u0000"+
		"\u0096\u049c\u0001\u0000\u0000\u0000\u0098\u049e\u0001\u0000\u0000\u0000"+
		"\u009a\u04a7\u0001\u0000\u0000\u0000\u009c\u04b2\u0001\u0000\u0000\u0000"+
		"\u009e\u04b6\u0001\u0000\u0000\u0000\u00a0\u04be\u0001\u0000\u0000\u0000"+
		"\u00a2\u04c6\u0001\u0000\u0000\u0000\u00a4\u04d1\u0001\u0000\u0000\u0000"+
		"\u00a6\u04d8\u0001\u0000\u0000\u0000\u00a8\u04f4\u0001\u0000\u0000\u0000"+
		"\u00aa\u04f6\u0001\u0000\u0000\u0000\u00ac\u04f9\u0001\u0000\u0000\u0000"+
		"\u00ae\u0503\u0001\u0000\u0000\u0000\u00b0\u0505\u0001\u0000\u0000\u0000"+
		"\u00b2\u050d\u0001\u0000\u0000\u0000\u00b4\u0522\u0001\u0000\u0000\u0000"+
		"\u00b6\u056d\u0001\u0000\u0000\u0000\u00b8\u056f\u0001\u0000\u0000\u0000"+
		"\u00ba\u057d\u0001\u0000\u0000\u0000\u00bc\u05d3\u0001\u0000\u0000\u0000"+
		"\u00be\u05f2\u0001\u0000\u0000\u0000\u00c0\u05f8\u0001\u0000\u0000\u0000"+
		"\u00c2\u0681\u0001\u0000\u0000\u0000\u00c4\u0690\u0001\u0000\u0000\u0000"+
		"\u00c6\u0692\u0001\u0000\u0000\u0000\u00c8\u069e\u0001\u0000\u0000\u0000"+
		"\u00ca\u06aa\u0001\u0000\u0000\u0000\u00cc\u06b3\u0001\u0000\u0000\u0000"+
		"\u00ce\u06b8\u0001\u0000\u0000\u0000\u00d0\u06bf\u0001\u0000\u0000\u0000"+
		"\u00d2\u06c1\u0001\u0000\u0000\u0000\u00d4\u06c7\u0001\u0000\u0000\u0000"+
		"\u00d6\u06c9\u0001\u0000\u0000\u0000\u00d8\u06cd\u0001\u0000\u0000\u0000"+
		"\u00da\u06cf\u0001\u0000\u0000\u0000\u00dc\u06d4\u0001\u0000\u0000\u0000"+
		"\u00de\u06db\u0001\u0000\u0000\u0000\u00e0\u06df\u0001\u0000\u0000\u0000"+
		"\u00e2\u06e4\u0001\u0000\u0000\u0000\u00e4\u06ee\u0001\u0000\u0000\u0000"+
		"\u00e6\u06f1\u0001\u0000\u0000\u0000\u00e8\u06f8\u0001\u0000\u0000\u0000"+
		"\u00ea\u06fe\u0001\u0000\u0000\u0000\u00ec\u0708\u0001\u0000\u0000\u0000"+
		"\u00ee\u070a\u0001\u0000\u0000\u0000\u00f0\u070e\u0001\u0000\u0000\u0000"+
		"\u00f2\u071a\u0001\u0000\u0000\u0000\u00f4\u071c\u0001\u0000\u0000\u0000"+
		"\u00f6\u0721\u0001\u0000\u0000\u0000\u00f8\u0723\u0001\u0000\u0000\u0000"+
		"\u00fa\u0725\u0001\u0000\u0000\u0000\u00fc\u072a\u0001\u0000\u0000\u0000"+
		"\u00fe\u072c\u0001\u0000\u0000\u0000\u0100\u072e\u0001\u0000\u0000\u0000"+
		"\u0102\u0730\u0001\u0000\u0000\u0000\u0104\u0732\u0001\u0000\u0000\u0000"+
		"\u0106\u0734\u0001\u0000\u0000\u0000\u0108\u073c\u0001\u0000\u0000\u0000"+
		"\u010a\u073f\u0001\u0000\u0000\u0000\u010c\u0743\u0001\u0000\u0000\u0000"+
		"\u010e\u0746\u0001\u0000\u0000\u0000\u0110\u0757\u0001\u0000\u0000\u0000"+
		"\u0112\u0762\u0001\u0000\u0000\u0000\u0114\u0770\u0001\u0000\u0000\u0000"+
		"\u0116\u0777\u0001\u0000\u0000\u0000\u0118\u0787\u0001\u0000\u0000\u0000"+
		"\u011a\u0796\u0001\u0000\u0000\u0000\u011c\u0798\u0001\u0000\u0000\u0000"+
		"\u011e\u079b\u0001\u0000\u0000\u0000\u0120\u079d\u0001\u0000\u0000\u0000"+
		"\u0122\u079f\u0001\u0000\u0000\u0000\u0124\u07a1\u0001\u0000\u0000\u0000"+
		"\u0126\u07a3\u0001\u0000\u0000\u0000\u0128\u07a5\u0001\u0000\u0000\u0000"+
		"\u012a\u07a7\u0001\u0000\u0000\u0000\u012c\u07a9\u0001\u0000\u0000\u0000"+
		"\u012e\u07ab\u0001\u0000\u0000\u0000\u0130\u07b5\u0001\u0000\u0000\u0000"+
		"\u0132\u07c9\u0001\u0000\u0000\u0000\u0134\u07cb\u0001\u0000\u0000\u0000"+
		"\u0136\u07d8\u0001\u0000\u0000\u0000\u0138\u07dc\u0001\u0000\u0000\u0000"+
		"\u013a\u07e9\u0001\u0000\u0000\u0000\u013c\u080d\u0001\u0000\u0000\u0000"+
		"\u013e\u081f\u0001\u0000\u0000\u0000\u0140\u0141\u0003\u0002\u0001\u0000"+
		"\u0141\u0142\u0005\u0000\u0000\u0001\u0142\u0001\u0001\u0000\u0000\u0000"+
		"\u0143\u0146\u0003\u0004\u0002\u0000\u0144\u0146\u0003\u0006\u0003\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000"+
		"\u0146\u0149\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0003\u0001\u0000\u0000\u0000"+
		"\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u014b\u0003\b\u0004\u0000\u014b"+
		"\u014c\u0005\u01b9\u0000\u0000\u014c\u0151\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0003\f\u0006\u0000\u014e\u014f\u0005\u01b9\u0000\u0000\u014f\u0151"+
		"\u0001\u0000\u0000\u0000\u0150\u014a\u0001\u0000\u0000\u0000\u0150\u014d"+
		"\u0001\u0000\u0000\u0000\u0151\u0005\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0005\u01b9\u0000\u0000\u0153\u0007\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0003\n\u0005\u0000\u0155\t\u0001\u0000\u0000\u0000\u0156\u0157\u0003"+
		"\u013c\u009e\u0000\u0157\u000b\u0001\u0000\u0000\u0000\u0158\u015b\u0003"+
		"\u0014\n\u0000\u0159\u015b\u0003\u0136\u009b\u0000\u015a\u0158\u0001\u0000"+
		"\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015b\r\u0001\u0000\u0000"+
		"\u0000\u015c\u015e\u0005\u00eb\u0000\u0000\u015d\u015f\u0005\u00a2\u0000"+
		"\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0162\u0005\u017a\u0000"+
		"\u0000\u0161\u0163\u0003\u010a\u0085\u0000\u0162\u0161\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0003\u0102\u0081\u0000\u0165\u0166\u0005\u01b4\u0000"+
		"\u0000\u0166\u016b\u0003\u008cF\u0000\u0167\u0168\u0005\u01b8\u0000\u0000"+
		"\u0168\u016a\u0003\u008cF\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a"+
		"\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0001\u0000\u0000\u0000\u016c\u0170\u0001\u0000\u0000\u0000\u016d"+
		"\u016b\u0001\u0000\u0000\u0000\u016e\u016f\u0005\u01b8\u0000\u0000\u016f"+
		"\u0171\u0003\u0092I\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0001\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0005\u01b8\u0000\u0000\u0173\u0175\u0003\u0094J\u0000\u0174\u0172\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0178\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0005\u01b8\u0000\u0000\u0177\u0179\u0003"+
		"z=\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017c\u0005\u01b5\u0000"+
		"\u0000\u017b\u017d\u0003\u00aaU\u0000\u017c\u017b\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017f\u0001\u0000\u0000\u0000"+
		"\u017e\u0180\u0003|>\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f\u0180"+
		"\u0001\u0000\u0000\u0000\u0180\u0182\u0001\u0000\u0000\u0000\u0181\u0183"+
		"\u0003\u0108\u0084\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0182\u0183"+
		"\u0001\u0000\u0000\u0000\u0183\u0185\u0001\u0000\u0000\u0000\u0184\u0186"+
		"\u0003\u0084B\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0185\u0186\u0001"+
		"\u0000\u0000\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0189\u0003"+
		"\u0086C\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000"+
		"\u0000\u0000\u0189\u000f\u0001\u0000\u0000\u0000\u018a\u0190\u0005\u0123"+
		"\u0000\u0000\u018b\u0191\u0005\u0128\u0000\u0000\u018c\u018e\u0005b\u0000"+
		"\u0000\u018d\u018f\u0005\u017a\u0000\u0000\u018e\u018d\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0191\u0001\u0000\u0000"+
		"\u0000\u0190\u018b\u0001\u0000\u0000\u0000\u0190\u018c\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u019b\u0003\u0104\u0082"+
		"\u0000\u0193\u0195\u0003\u0012\t\u0000\u0194\u0193\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0197\u0001\u0000\u0000\u0000"+
		"\u0196\u0198\u0003\u00b4Z\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0197"+
		"\u0198\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199"+
		"\u019c\u0003\u0014\n\u0000\u019a\u019c\u0003\u0098L\u0000\u019b\u0194"+
		"\u0001\u0000\u0000\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019c\u0011"+
		"\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u0155\u0000\u0000\u019e\u019f"+
		"\u0003\u0110\u0088\u0000\u019f\u0013\u0001\u0000\u0000\u0000\u01a0\u01a3"+
		"\u0006\n\uffff\uffff\u0000\u01a1\u01a4\u0003\u0134\u009a\u0000\u01a2\u01a4"+
		"\u0003\u0132\u0099\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a7"+
		"\u0003\\.\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a9\u0001\u0000\u0000\u0000\u01a8\u01aa\u0003"+
		"`0\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000"+
		"\u0000\u01aa\u01b9\u0001\u0000\u0000\u0000\u01ab\u01ac\n\u0002\u0000\u0000"+
		"\u01ac\u01ae\u0007\u0000\u0000\u0000\u01ad\u01af\u0005\u00c1\u0000\u0000"+
		"\u01ae\u01ad\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000"+
		"\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b2\u0003\u0014\n\u0000\u01b1"+
		"\u01b3\u0003\\.\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b2\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b5\u0001\u0000\u0000\u0000\u01b4\u01b6"+
		"\u0003`0\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01ab\u0001\u0000"+
		"\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u0015\u0001\u0000"+
		"\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005\u0192"+
		"\u0000\u0000\u01bd\u01c2\u0003\u00b8\\\u0000\u01be\u01bf\u0005\u01b8\u0000"+
		"\u0000\u01bf\u01c1\u0003\u00b8\\\u0000\u01c0\u01be\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c4\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u0017\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c5\u01d1\u0003\u001a\r\u0000\u01c6"+
		"\u01c7\u0005\u01b4\u0000\u0000\u01c7\u01cc\u0003\u00b2Y\u0000\u01c8\u01c9"+
		"\u0005\u01b8\u0000\u0000\u01c9\u01cb\u0003\u00b2Y\u0000\u01ca\u01c8\u0001"+
		"\u0000\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01cf\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005"+
		"\u01b5\u0000\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01c6\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d4\u0005\u00c8\u0000\u0000\u01d4\u01d5\u0005"+
		"\u01b4\u0000\u0000\u01d5\u01d6\u0003\u0014\n\u0000\u01d6\u01d7\u0005\u01b5"+
		"\u0000\u0000\u01d7\u0019\u0001\u0000\u0000\u0000\u01d8\u01d9\u0003\u00f2"+
		"y\u0000\u01d9\u001b\u0001\u0000\u0000\u0000\u01da\u01db\u0005\u0119\u0000"+
		"\u0000\u01db\u01dc\u0005\u00d4\u0000\u0000\u01dc\u01e1\u0003D\"\u0000"+
		"\u01dd\u01de\u0005\u01b8\u0000\u0000\u01de\u01e0\u0003D\"\u0000\u01df"+
		"\u01dd\u0001\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000\u0000\u01e1"+
		"\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e6\u0003F#\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e6\u001d\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005"+
		"\u0113\u0000\u0000\u01e8\u01e9\u0003\u013a\u009d\u0000\u01e9\u001f\u0001"+
		"\u0000\u0000\u0000\u01ea\u01ec\u0003$\u0012\u0000\u01eb\u01ed\u0003\u00e8"+
		"t\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ed!\u0001\u0000\u0000\u0000\u01ee\u01ef\u0007\u0001\u0000\u0000"+
		"\u01ef#\u0001\u0000\u0000\u0000\u01f0\u01f2\u0005\u017a\u0000\u0000\u01f1"+
		"\u01f0\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f5\u0003\u0104\u0082\u0000\u01f4"+
		"\u01f6\u0003&\u0013\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f5\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f8"+
		"\u0005\u00c8\u0000\u0000\u01f8\u01fa\u0003\u00d6k\u0000\u01f9\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u0234\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fc\u0005\u012d\u0000\u0000\u01fc\u01fd\u0005"+
		"\u017a\u0000\u0000\u01fd\u01fe\u0005\u01b4\u0000\u0000\u01fe\u01ff\u0003"+
		"\u00ceg\u0000\u01ff\u0200\u0005\u01b4\u0000\u0000\u0200\u0205\u0003\u00d0"+
		"h\u0000\u0201\u0202\u0005\u01b8\u0000\u0000\u0202\u0204\u0003\u00d0h\u0000"+
		"\u0203\u0201\u0001\u0000\u0000\u0000\u0204\u0207\u0001\u0000\u0000\u0000"+
		"\u0205\u0203\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000"+
		"\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000"+
		"\u0208\u0209\u0005\u01b5\u0000\u0000\u0209\u020a\u0005\u01b5\u0000\u0000"+
		"\u020a\u0234\u0001\u0000\u0000\u0000\u020b\u020d\u0005\u012d\u0000\u0000"+
		"\u020c\u020b\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000"+
		"\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0005\u01b4\u0000\u0000"+
		"\u020f\u0210\u0003\u0014\n\u0000\u0210\u0211\u0005\u01b5\u0000\u0000\u0211"+
		"\u0234\u0001\u0000\u0000\u0000\u0212\u0213\u0005\u012d\u0000\u0000\u0213"+
		"\u0214\u0005\u017a\u0000\u0000\u0214\u0215\u0005\u01b4\u0000\u0000\u0215"+
		"\u0216\u0003\u00ceg\u0000\u0216\u0217\u0005\u01b4\u0000\u0000\u0217\u021c"+
		"\u0003\u00d0h\u0000\u0218\u0219\u0005\u01b8\u0000\u0000\u0219\u021b\u0003"+
		"\u00d0h\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021b\u021e\u0001\u0000"+
		"\u0000\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000"+
		"\u0000\u0000\u021d\u021f\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000"+
		"\u0000\u0000\u021f\u0220\u0005\u01b5\u0000\u0000\u0220\u0221\u0005\u01b5"+
		"\u0000\u0000\u0221\u0222\u0005\u00c8\u0000\u0000\u0222\u0223\u0003\u00e8"+
		"t\u0000\u0223\u0224\u0005\u01b4\u0000\u0000\u0224\u0229\u0003\u0130\u0098"+
		"\u0000\u0225\u0226\u0005\u01b8\u0000\u0000\u0226\u0228\u0003\u0130\u0098"+
		"\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0228\u022b\u0001\u0000\u0000"+
		"\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000"+
		"\u0000\u022a\u022c\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000\u0000"+
		"\u0000\u022c\u022d\u0005\u01b5\u0000\u0000\u022d\u0234\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u0005\u018b\u0000\u0000\u022f\u0230\u0005\u01b4\u0000"+
		"\u0000\u0230\u0231\u0003\u00b8\\\u0000\u0231\u0232\u0005\u01b5\u0000\u0000"+
		"\u0232\u0234\u0001\u0000\u0000\u0000\u0233\u01f1\u0001\u0000\u0000\u0000"+
		"\u0233\u01fb\u0001\u0000\u0000\u0000\u0233\u020c\u0001\u0000\u0000\u0000"+
		"\u0233\u0212\u0001\u0000\u0000\u0000\u0233\u022e\u0001\u0000\u0000\u0000"+
		"\u0234%\u0001\u0000\u0000\u0000\u0235\u0236\u0005\u0112\u0000\u0000\u0236"+
		"\u0237\u0005\u0178\u0000\u0000\u0237\u0238\u0005\u00c8\u0000\u0000\u0238"+
		"\u0239\u0005\u014b\u0000\u0000\u0239\u023e\u0003(\u0014\u0000\u023a\u023b"+
		"\u0005\u00c8\u0000\u0000\u023b\u023c\u0005\u014b\u0000\u0000\u023c\u023e"+
		"\u0003(\u0014\u0000\u023d\u0235\u0001\u0000\u0000\u0000\u023d\u023a\u0001"+
		"\u0000\u0000\u0000\u023e\'\u0001\u0000\u0000\u0000\u023f\u0240\u0003\u00b8"+
		"\\\u0000\u0240)\u0001\u0000\u0000\u0000\u0241\u0242\u0005\u01b4\u0000"+
		"\u0000\u0242\u0243\u0003\u0098L\u0000\u0243\u0244\u0005\u01b5\u0000\u0000"+
		"\u0244\u0245\u0003\u00e8t\u0000\u0245+\u0001\u0000\u0000\u0000\u0246\u0247"+
		"\u0005\u017a\u0000\u0000\u0247\u0248\u0005\u01b4\u0000\u0000\u0248\u0249"+
		"\u0003.\u0017\u0000\u0249\u024a\u0005\u01b5\u0000\u0000\u024a-\u0001\u0000"+
		"\u0000\u0000\u024b\u0250\u00030\u0018\u0000\u024c\u0250\u00032\u0019\u0000"+
		"\u024d\u0250\u00034\u001a\u0000\u024e\u0250\u00036\u001b\u0000\u024f\u024b"+
		"\u0001\u0000\u0000\u0000\u024f\u024c\u0001\u0000\u0000\u0000\u024f\u024d"+
		"\u0001\u0000\u0000\u0000\u024f\u024e\u0001\u0000\u0000\u0000\u0250/\u0001"+
		"\u0000\u0000\u0000\u0251\u0252\u0005\u00aa\u0000\u0000\u0252\u0257\u0005"+
		"\u01b4\u0000\u0000\u0253\u0258\u0005\u017a\u0000\u0000\u0254\u0255\u0005"+
		"\u0019\u0000\u0000\u0255\u0256\u0005\u01c9\u0000\u0000\u0256\u0258\u0005"+
		"\u017a\u0000\u0000\u0257\u0253\u0001\u0000\u0000\u0000\u0257\u0254\u0001"+
		"\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0003"+
		"\u0106\u0083\u0000\u025a\u025d\u0005\u01b8\u0000\u0000\u025b\u025c\u0005"+
		"\u00a3\u0000\u0000\u025c\u025e\u0005\u01c9\u0000\u0000\u025d\u025b\u0001"+
		"\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025f\u0001"+
		"\u0000\u0000\u0000\u025f\u0260\u0003>\u001f\u0000\u0260\u0261\u0001\u0000"+
		"\u0000\u0000\u0261\u0264\u0005\u01b8\u0000\u0000\u0262\u0263\u0005\u0095"+
		"\u0000\u0000\u0263\u0265\u0005\u01c9\u0000\u0000\u0264\u0262\u0001\u0000"+
		"\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000"+
		"\u0000\u0000\u0266\u0267\u0003\u00dam\u0000\u0267\u0270\u0001\u0000\u0000"+
		"\u0000\u0268\u026d\u0005\u01b8\u0000\u0000\u0269\u026a\u0005\u01bd\u0000"+
		"\u0000\u026a\u026b\u0005\u014c\u0000\u0000\u026b\u026c\u0005\u01bd\u0000"+
		"\u0000\u026c\u026e\u0005\u01c9\u0000\u0000\u026d\u0269\u0001\u0000\u0000"+
		"\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000"+
		"\u0000\u026f\u0271\u0003\u00dam\u0000\u0270\u0268\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000"+
		"\u0272\u0273\u0005\u01b5\u0000\u0000\u02731\u0001\u0000\u0000\u0000\u0274"+
		"\u0275\u0005<\u0000\u0000\u0275\u027a\u0005\u01b4\u0000\u0000\u0276\u027b"+
		"\u0005\u017a\u0000\u0000\u0277\u0278\u0005\u0019\u0000\u0000\u0278\u0279"+
		"\u0005\u01c9\u0000\u0000\u0279\u027b\u0005\u017a\u0000\u0000\u027a\u0276"+
		"\u0001\u0000\u0000\u0000\u027a\u0277\u0001\u0000\u0000\u0000\u027b\u027c"+
		"\u0001\u0000\u0000\u0000\u027c\u027d\u0003\u0106\u0083\u0000\u027d\u0280"+
		"\u0005\u01b8\u0000\u0000\u027e\u027f\u0005\u00a3\u0000\u0000\u027f\u0281"+
		"\u0005\u01c9\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0280\u0281"+
		"\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0283"+
		"\u0003>\u001f\u0000\u0283\u028a\u0001\u0000\u0000\u0000\u0284\u0287\u0005"+
		"\u01b8\u0000\u0000\u0285\u0286\u0005\u0096\u0000\u0000\u0286\u0288\u0005"+
		"\u01c9\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287\u0288\u0001"+
		"\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028b\u0003"+
		"\u00dam\u0000\u028a\u0284\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000"+
		"\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c\u028f\u0005\u01b8"+
		"\u0000\u0000\u028d\u028e\u0005\u0095\u0000\u0000\u028e\u0290\u0005\u01c9"+
		"\u0000\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000"+
		"\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0292\u0003\u00da"+
		"m\u0000\u0292\u029b\u0001\u0000\u0000\u0000\u0293\u0298\u0005\u01b8\u0000"+
		"\u0000\u0294\u0295\u0005\u01bd\u0000\u0000\u0295\u0296\u0005\u014c\u0000"+
		"\u0000\u0296\u0297\u0005\u01bd\u0000\u0000\u0297\u0299\u0005\u01c9\u0000"+
		"\u0000\u0298\u0294\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000"+
		"\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029c\u0003\u00dam\u0000"+
		"\u029b\u0293\u0001\u0000\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000"+
		"\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u029e\u0005\u01b5\u0000\u0000"+
		"\u029e3\u0001\u0000\u0000\u0000\u029f\u02a0\u0005\u0018\u0000\u0000\u02a0"+
		"\u02a5\u0005\u01b4\u0000\u0000\u02a1\u02a6\u0005\u017a\u0000\u0000\u02a2"+
		"\u02a3\u0005\u0019\u0000\u0000\u02a3\u02a4\u0005\u01c9\u0000\u0000\u02a4"+
		"\u02a6\u0005\u017a\u0000\u0000\u02a5\u02a1\u0001\u0000\u0000\u0000\u02a5"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7"+
		"\u02a8\u0003\u0106\u0083\u0000\u02a8\u02ab\u0005\u01b8\u0000\u0000\u02a9"+
		"\u02aa\u0005\u00a3\u0000\u0000\u02aa\u02ac\u0005\u01c9\u0000\u0000\u02ab"+
		"\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac"+
		"\u02ad\u0001\u0000\u0000\u0000\u02ad\u02ae\u0003>\u001f\u0000\u02ae\u02b5"+
		"\u0001\u0000\u0000\u0000\u02af\u02b2\u0005\u01b8\u0000\u0000\u02b0\u02b1"+
		"\u0005\u009c\u0000\u0000\u02b1\u02b3\u0005\u01c9\u0000\u0000\u02b2\u02b0"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b4\u02b6\u0003\u00dam\u0000\u02b5\u02af\u0001"+
		"\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001"+
		"\u0000\u0000\u0000\u02b7\u02ba\u0005\u01b8\u0000\u0000\u02b8\u02b9\u0005"+
		"\u0095\u0000\u0000\u02b9\u02bb\u0005\u01c9\u0000\u0000\u02ba\u02b8\u0001"+
		"\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001"+
		"\u0000\u0000\u0000\u02bc\u02bd\u0003\u00dam\u0000\u02bd\u02be\u0001\u0000"+
		"\u0000\u0000\u02be\u02bf\u0005\u01b5\u0000\u0000\u02bf5\u0001\u0000\u0000"+
		"\u0000\u02c0\u02c1\u0005\u0092\u0000\u0000\u02c1\u02c6\u0005\u01b4\u0000"+
		"\u0000\u02c2\u02c7\u0005\u017a\u0000\u0000\u02c3\u02c4\u0005\u0019\u0000"+
		"\u0000\u02c4\u02c5\u0005\u01c9\u0000\u0000\u02c5\u02c7\u0005\u017a\u0000"+
		"\u0000\u02c6\u02c2\u0001\u0000\u0000\u0000\u02c6\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02d3\u0003\u0106\u0083"+
		"\u0000\u02c9\u02ca\u0005\u0155\u0000\u0000\u02ca\u02cb\u0005\u00d4\u0000"+
		"\u0000\u02cb\u02d0\u0003\u0106\u0083\u0000\u02cc\u02cd\u0005\u01b8\u0000"+
		"\u0000\u02cd\u02cf\u0003\u0106\u0083\u0000\u02ce\u02cc\u0001\u0000\u0000"+
		"\u0000\u02cf\u02d2\u0001\u0000\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d3\u02c9\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02db\u0001\u0000\u0000"+
		"\u0000\u02d5\u02d8\u0005\u01b8\u0000\u0000\u02d6\u02d7\u0005\u00a3\u0000"+
		"\u0000\u02d7\u02d9\u0005\u01c9\u0000\u0000\u02d8\u02d6\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000"+
		"\u0000\u02da\u02dc\u0003>\u001f\u0000\u02db\u02d5\u0001\u0000\u0000\u0000"+
		"\u02db\u02dc\u0001\u0000\u0000\u0000\u02dc\u02e3\u0001\u0000\u0000\u0000"+
		"\u02dd\u02e0\u0005\u01b8\u0000\u0000\u02de\u02df\u00058\u0000\u0000\u02df"+
		"\u02e1\u0005\u01c9\u0000\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e0"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e4\u0003\u00dam\u0000\u02e3\u02dd\u0001\u0000\u0000\u0000\u02e3\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5\u02e6"+
		"\u0005\u01b5\u0000\u0000\u02e67\u0001\u0000\u0000\u0000\u02e7\u02e8\u0007"+
		"\u0002\u0000\u0000\u02e89\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005\u017a"+
		"\u0000\u0000\u02ea\u02f9\u0003P(\u0000\u02eb\u02f9\u0003>\u001f\u0000"+
		"\u02ec\u02f9\u0003\u00dam\u0000\u02ed\u02ee\u0005\u0019\u0000\u0000\u02ee"+
		"\u02ef\u0005\u01c9\u0000\u0000\u02ef\u02f0\u0005\u017a\u0000\u0000\u02f0"+
		"\u02f9\u0003P(\u0000\u02f1\u02f2\u0005\u00a3\u0000\u0000\u02f2\u02f3\u0005"+
		"\u01c9\u0000\u0000\u02f3\u02f9\u0003>\u001f\u0000\u02f4\u02f5\u0003<\u001e"+
		"\u0000\u02f5\u02f6\u0005\u01c9\u0000\u0000\u02f6\u02f7\u0003\u00dam\u0000"+
		"\u02f7\u02f9\u0001\u0000\u0000\u0000\u02f8\u02e9\u0001\u0000\u0000\u0000"+
		"\u02f8\u02eb\u0001\u0000\u0000\u0000\u02f8\u02ec\u0001\u0000\u0000\u0000"+
		"\u02f8\u02ed\u0001\u0000\u0000\u0000\u02f8\u02f1\u0001\u0000\u0000\u0000"+
		"\u02f8\u02f4\u0001\u0000\u0000\u0000\u02f9;\u0001\u0000\u0000\u0000\u02fa"+
		"\u02fb\u0007\u0003\u0000\u0000\u02fb=\u0001\u0000\u0000\u0000\u02fc\u02fd"+
		"\u0005 \u0000\u0000\u02fd\u02fe\u0005\u01b4\u0000\u0000\u02fe\u02ff\u0003"+
		"\u0106\u0083\u0000\u02ff\u0300\u0005\u01b5\u0000\u0000\u0300?\u0001\u0000"+
		"\u0000\u0000\u0301\u0302\u0005\u014d\u0000\u0000\u0302\u0310\u0003\u00ba"+
		"]\u0000\u0303\u0304\u0005\u0190\u0000\u0000\u0304\u0305\u0005\u01b4\u0000"+
		"\u0000\u0305\u030a\u0003\u0106\u0083\u0000\u0306\u0307\u0005\u01b8\u0000"+
		"\u0000\u0307\u0309\u0003\u0106\u0083\u0000\u0308\u0306\u0001\u0000\u0000"+
		"\u0000\u0309\u030c\u0001\u0000\u0000\u0000\u030a\u0308\u0001\u0000\u0000"+
		"\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u030d\u0001\u0000\u0000"+
		"\u0000\u030c\u030a\u0001\u0000\u0000\u0000\u030d\u030e\u0005\u01b5\u0000"+
		"\u0000\u030e\u0310\u0001\u0000\u0000\u0000\u030f\u0301\u0001\u0000\u0000"+
		"\u0000\u030f\u0303\u0001\u0000\u0000\u0000\u0310A\u0001\u0000\u0000\u0000"+
		"\u0311\u0312\u0005\u0196\u0000\u0000\u0312\u0313\u0003\u00ba]\u0000\u0313"+
		"C\u0001\u0000\u0000\u0000\u0314\u0330\u0003\u00b8\\\u0000\u0315\u0330"+
		"\u0003L&\u0000\u0316\u0317\u0005\u01b4\u0000\u0000\u0317\u0330\u0005\u01b5"+
		"\u0000\u0000\u0318\u0319\u0005\u01b4\u0000\u0000\u0319\u031e\u0003\u00b8"+
		"\\\u0000\u031a\u031b\u0005\u01b8\u0000\u0000\u031b\u031d\u0003\u00b8\\"+
		"\u0000\u031c\u031a\u0001\u0000\u0000\u0000\u031d\u0320\u0001\u0000\u0000"+
		"\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031e\u031f\u0001\u0000\u0000"+
		"\u0000\u031f\u0321\u0001\u0000\u0000\u0000\u0320\u031e\u0001\u0000\u0000"+
		"\u0000\u0321\u0322\u0005\u01b5\u0000\u0000\u0322\u0330\u0001\u0000\u0000"+
		"\u0000\u0323\u0324\u0003J%\u0000\u0324\u0325\u0005\u01b4\u0000\u0000\u0325"+
		"\u032a\u0003\u00b8\\\u0000\u0326\u0327\u0005\u01b8\u0000\u0000\u0327\u0329"+
		"\u0003\u00b8\\\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0329\u032c\u0001"+
		"\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032a\u032b\u0001"+
		"\u0000\u0000\u0000\u032b\u032d\u0001\u0000\u0000\u0000\u032c\u032a\u0001"+
		"\u0000\u0000\u0000\u032d\u032e\u0005\u01b5\u0000\u0000\u032e\u0330\u0001"+
		"\u0000\u0000\u0000\u032f\u0314\u0001\u0000\u0000\u0000\u032f\u0315\u0001"+
		"\u0000\u0000\u0000\u032f\u0316\u0001\u0000\u0000\u0000\u032f\u0318\u0001"+
		"\u0000\u0000\u0000\u032f\u0323\u0001\u0000\u0000\u0000\u0330E\u0001\u0000"+
		"\u0000\u0000\u0331\u0332\u0003H$\u0000\u0332\u0333\u0005\u01b4\u0000\u0000"+
		"\u0333\u0338\u0003D\"\u0000\u0334\u0335\u0005\u01b8\u0000\u0000\u0335"+
		"\u0337\u0003D\"\u0000\u0336\u0334\u0001\u0000\u0000\u0000\u0337\u033a"+
		"\u0001\u0000\u0000\u0000\u0338\u0336\u0001\u0000\u0000\u0000\u0338\u0339"+
		"\u0001\u0000\u0000\u0000\u0339\u033b\u0001\u0000\u0000\u0000\u033a\u0338"+
		"\u0001\u0000\u0000\u0000\u033b\u033c\u0005\u01b5\u0000\u0000\u033cG\u0001"+
		"\u0000\u0000\u0000\u033d\u033e\u0005\u011a\u0000\u0000\u033e\u033f\u0005"+
		"\u0093\u0000\u0000\u033fI\u0001\u0000\u0000\u0000\u0340\u0341\u0007\u0004"+
		"\u0000\u0000\u0341K\u0001\u0000\u0000\u0000\u0342\u0343\u0003N\'\u0000"+
		"\u0343\u0344\u0005\u01b4\u0000\u0000\u0344\u0345\u0003P(\u0000\u0345\u0346"+
		"\u0005\u01b8\u0000\u0000\u0346\u0347\u0003\u00dam\u0000\u0347\u0348\u0005"+
		"\u01b5\u0000\u0000\u0348M\u0001\u0000\u0000\u0000\u0349\u034a\u0007\u0005"+
		"\u0000\u0000\u034aO\u0001\u0000\u0000\u0000\u034b\u034c\u0003\u0106\u0083"+
		"\u0000\u034cQ\u0001\u0000\u0000\u0000\u034d\u034e\u0005\u011c\u0000\u0000"+
		"\u034e\u034f\u0003\u00ba]\u0000\u034fS\u0001\u0000\u0000\u0000\u0350\u0351"+
		"\u0005\u0197\u0000\u0000\u0351\u0356\u0003V+\u0000\u0352\u0353\u0005\u01b8"+
		"\u0000\u0000\u0353\u0355\u0003V+\u0000\u0354\u0352\u0001\u0000\u0000\u0000"+
		"\u0355\u0358\u0001\u0000\u0000\u0000\u0356\u0354\u0001\u0000\u0000\u0000"+
		"\u0356\u0357\u0001\u0000\u0000\u0000\u0357U\u0001\u0000\u0000\u0000\u0358"+
		"\u0356\u0001\u0000\u0000\u0000\u0359\u035a\u0003\u00eau\u0000\u035a\u035b"+
		"\u0005\u00c8\u0000\u0000\u035b\u035c\u0003X,\u0000\u035cW\u0001\u0000"+
		"\u0000\u0000\u035d\u035f\u0003\u00eau\u0000\u035e\u035d\u0001\u0000\u0000"+
		"\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u0360\u0001\u0000\u0000"+
		"\u0000\u0360\u0362\u0005\u01b4\u0000\u0000\u0361\u0363\u0003b1\u0000\u0362"+
		"\u0361\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000\u0363"+
		"\u0365\u0001\u0000\u0000\u0000\u0364\u0366\u0003\\.\u0000\u0365\u0364"+
		"\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366\u0368"+
		"\u0001\u0000\u0000\u0000\u0367\u0369\u0003r9\u0000\u0368\u0367\u0001\u0000"+
		"\u0000\u0000\u0368\u0369\u0001\u0000\u0000\u0000\u0369\u036a\u0001\u0000"+
		"\u0000\u0000\u036a\u036b\u0005\u01b5\u0000\u0000\u036bY\u0001\u0000\u0000"+
		"\u0000\u036c\u036d\u0005\u0138\u0000\u0000\u036d\u036f\u0005\u01b4\u0000"+
		"\u0000\u036e\u0370\u0003b1\u0000\u036f\u036e\u0001\u0000\u0000\u0000\u036f"+
		"\u0370\u0001\u0000\u0000\u0000\u0370\u0372\u0001\u0000\u0000\u0000\u0371"+
		"\u0373\u0003\\.\u0000\u0372\u0371\u0001\u0000\u0000\u0000\u0372\u0373"+
		"\u0001\u0000\u0000\u0000\u0373\u0375\u0001\u0000\u0000\u0000\u0374\u0376"+
		"\u0003f3\u0000\u0375\u0374\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000"+
		"\u0000\u0000\u0376\u0378\u0001\u0000\u0000\u0000\u0377\u0379\u0003l6\u0000"+
		"\u0378\u0377\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000"+
		"\u0379\u037b\u0001\u0000\u0000\u0000\u037a\u037c\u0003n7\u0000\u037b\u037a"+
		"\u0001\u0000\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u037e"+
		"\u0001\u0000\u0000\u0000\u037d\u037f\u0003h4\u0000\u037e\u037d\u0001\u0000"+
		"\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000"+
		"\u0000\u0000\u0380\u0381\u0003p8\u0000\u0381\u0386\u0005\u01b5\u0000\u0000"+
		"\u0382\u0384\u0005\u00c8\u0000\u0000\u0383\u0382\u0001\u0000\u0000\u0000"+
		"\u0383\u0384\u0001\u0000\u0000\u0000\u0384\u0385\u0001\u0000\u0000\u0000"+
		"\u0385\u0387\u0003\u00f2y\u0000\u0386\u0383\u0001\u0000\u0000\u0000\u0386"+
		"\u0387\u0001\u0000\u0000\u0000\u0387[\u0001\u0000\u0000\u0000\u0388\u0389"+
		"\u0005\u0150\u0000\u0000\u0389\u038a\u0005\u00d4\u0000\u0000\u038a\u038f"+
		"\u0003^/\u0000\u038b\u038c\u0005\u01b8\u0000\u0000\u038c\u038e\u0003^"+
		"/\u0000\u038d\u038b\u0001\u0000\u0000\u0000\u038e\u0391\u0001\u0000\u0000"+
		"\u0000\u038f\u038d\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000"+
		"\u0000\u0390]\u0001\u0000\u0000\u0000\u0391\u038f\u0001\u0000\u0000\u0000"+
		"\u0392\u0394\u0003\u00b8\\\u0000\u0393\u0395\u0007\u0006\u0000\u0000\u0394"+
		"\u0393\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395"+
		"\u0398\u0001\u0000\u0000\u0000\u0396\u0397\u0005\\\u0000\u0000\u0397\u0399"+
		"\u0007\u0007\u0000\u0000\u0398\u0396\u0001\u0000\u0000\u0000\u0398\u0399"+
		"\u0001\u0000\u0000\u0000\u0399_\u0001\u0000\u0000\u0000\u039a\u039d\u0005"+
		"\u0134\u0000\u0000\u039b\u039e\u0005\u00c1\u0000\u0000\u039c\u039e\u0003"+
		"\u00b8\\\u0000\u039d\u039b\u0001\u0000\u0000\u0000\u039d\u039c\u0001\u0000"+
		"\u0000\u0000\u039ea\u0001\u0000\u0000\u0000\u039f\u03a0\u0005\u0155\u0000"+
		"\u0000\u03a0\u03a1\u0005\u00d4\u0000\u0000\u03a1\u03a6\u0003\u00b8\\\u0000"+
		"\u03a2\u03a3\u0005\u01b8\u0000\u0000\u03a3\u03a5\u0003\u00b8\\\u0000\u03a4"+
		"\u03a2\u0001\u0000\u0000\u0000\u03a5\u03a8\u0001\u0000\u0000\u0000\u03a6"+
		"\u03a4\u0001\u0000\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7"+
		"c\u0001\u0000\u0000\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000\u03a9\u03ba"+
		"\u0005\u01c0\u0000\u0000\u03aa\u03ba\u0005\u01c3\u0000\u0000\u03ab\u03ba"+
		"\u0005\u01c8\u0000\u0000\u03ac\u03ad\u0005\u01b6\u0000\u0000\u03ad\u03ae"+
		"\u0005\u01cb\u0000\u0000\u03ae\u03af\u0005\u01b8\u0000\u0000\u03af\u03b0"+
		"\u0005\u01cb\u0000\u0000\u03b0\u03ba\u0005\u01b7\u0000\u0000\u03b1\u03b2"+
		"\u0005\u01b6\u0000\u0000\u03b2\u03b3\u0005\u01cb\u0000\u0000\u03b3\u03b4"+
		"\u0005\u01b8\u0000\u0000\u03b4\u03ba\u0005\u01b7\u0000\u0000\u03b5\u03b6"+
		"\u0005\u01b6\u0000\u0000\u03b6\u03b7\u0005\u01b8\u0000\u0000\u03b7\u03b8"+
		"\u0005\u01cb\u0000\u0000\u03b8\u03ba\u0005\u01b7\u0000\u0000\u03b9\u03a9"+
		"\u0001\u0000\u0000\u0000\u03b9\u03aa\u0001\u0000\u0000\u0000\u03b9\u03ab"+
		"\u0001\u0000\u0000\u0000\u03b9\u03ac\u0001\u0000\u0000\u0000\u03b9\u03b1"+
		"\u0001\u0000\u0000\u0000\u03b9\u03b5\u0001\u0000\u0000\u0000\u03bae\u0001"+
		"\u0000\u0000\u0000\u03bb\u03bc\u0005\u0139\u0000\u0000\u03bc\u03c1\u0003"+
		"\u0130\u0098\u0000\u03bd\u03be\u0005\u01b8\u0000\u0000\u03be\u03c0\u0003"+
		"\u0130\u0098\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03c0\u03c3\u0001"+
		"\u0000\u0000\u0000\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001"+
		"\u0000\u0000\u0000\u03c2g\u0001\u0000\u0000\u0000\u03c3\u03c1\u0001\u0000"+
		"\u0000\u0000\u03c4\u03c5\u0005\u0156\u0000\u0000\u03c5\u03c7\u0005\u01b4"+
		"\u0000\u0000\u03c6\u03c8\u0003j5\u0000\u03c7\u03c6\u0001\u0000\u0000\u0000"+
		"\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000\u0000"+
		"\u03c9\u03ca\u0001\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000\u0000\u0000"+
		"\u03cb\u03cd\u0005\u01b5\u0000\u0000\u03cc\u03ce\u0003v;\u0000\u03cd\u03cc"+
		"\u0001\u0000\u0000\u0000\u03cd\u03ce\u0001\u0000\u0000\u0000\u03cei\u0001"+
		"\u0000\u0000\u0000\u03cf\u03d1\u0003\u00f6{\u0000\u03d0\u03d2\u0003d2"+
		"\u0000\u03d1\u03d0\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000\u0000"+
		"\u0000\u03d2k\u0001\u0000\u0000\u0000\u03d3\u03d4\u0005\u00c1\u0000\u0000"+
		"\u03d4\u03d5\u0005\u0168\u0000\u0000\u03d5\u03d6\u0005\u0157\u0000\u0000"+
		"\u03d6\u03dc\u0005\u0137\u0000\u0000\u03d7\u03d8\u0005\u014e\u0000\u0000"+
		"\u03d8\u03d9\u0005\u0167\u0000\u0000\u03d9\u03da\u0005\u0157\u0000\u0000"+
		"\u03da\u03dc\u0005\u0137\u0000\u0000\u03db\u03d3\u0001\u0000\u0000\u0000"+
		"\u03db\u03d7\u0001\u0000\u0000\u0000\u03dcm\u0001\u0000\u0000\u0000\u03dd"+
		"\u03de\u0005\u0006\u0000\u0000\u03de\u03df\u0005\u0137\u0000\u0000\u03df"+
		"\u03e0\u0005\u0170\u0000\u0000\u03e0\u03e1\u0005g\u0000\u0000\u03e1\u03e2"+
		"\u0005N\u0000\u0000\u03e2\u03f6\u0005\u0167\u0000\u0000\u03e3\u03e4\u0005"+
		"\u0006\u0000\u0000\u03e4\u03e5\u0005\u0137\u0000\u0000\u03e5\u03e6\u0005"+
		"\u0170\u0000\u0000\u03e6\u03e7\u0005\u0184\u0000\u0000\u03e7\u03e8\u0005"+
		"\u0143\u0000\u0000\u03e8\u03f6\u0005\u0167\u0000\u0000\u03e9\u03ea\u0005"+
		"\u0006\u0000\u0000\u03ea\u03eb\u0005\u0137\u0000\u0000\u03eb\u03ec\u0005"+
		"\u0170\u0000\u0000\u03ec\u03ed\u0005\u0184\u0000\u0000\u03ed\u03ee\u0005"+
		"N\u0000\u0000\u03ee\u03f6\u0003\u00f6{\u0000\u03ef\u03f0\u0005\u0006\u0000"+
		"\u0000\u03f0\u03f1\u0005\u0137\u0000\u0000\u03f1\u03f2\u0005\u0170\u0000"+
		"\u0000\u03f2\u03f3\u0005\u0184\u0000\u0000\u03f3\u03f4\u0005/\u0000\u0000"+
		"\u03f4\u03f6\u0003\u00f6{\u0000\u03f5\u03dd\u0001\u0000\u0000\u0000\u03f5"+
		"\u03e3\u0001\u0000\u0000\u0000\u03f5\u03e9\u0001\u0000\u0000\u0000\u03f5"+
		"\u03ef\u0001\u0000\u0000\u0000\u03f6o\u0001\u0000\u0000\u0000\u03f7\u03f8"+
		"\u0005\u00f9\u0000\u0000\u03f8\u03fd\u0003\u0130\u0098\u0000\u03f9\u03fa"+
		"\u0005\u01b8\u0000\u0000\u03fa\u03fc\u0003\u0130\u0098\u0000\u03fb\u03f9"+
		"\u0001\u0000\u0000\u0000\u03fc\u03ff\u0001\u0000\u0000\u0000\u03fd\u03fb"+
		"\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000\u0000\u0000\u03feq\u0001"+
		"\u0000\u0000\u0000\u03ff\u03fd\u0001\u0000\u0000\u0000\u0400\u0401\u0005"+
		"\u015e\u0000\u0000\u0401\u0402\u0005\u00cd\u0000\u0000\u0402\u0403\u0003"+
		"\u00dam\u0000\u0403\u0404\u0003t:\u0000\u0404\u040a\u0001\u0000\u0000"+
		"\u0000\u0405\u0406\u0005\u0168\u0000\u0000\u0406\u0407\u0005\u00cd\u0000"+
		"\u0000\u0407\u0408\u0005\u01cb\u0000\u0000\u0408\u040a\u0003t:\u0000\u0409"+
		"\u0400\u0001\u0000\u0000\u0000\u0409\u0405\u0001\u0000\u0000\u0000\u040a"+
		"s\u0001\u0000\u0000\u0000\u040b\u040c\u0005l\u0000\u0000\u040c\u040d\u0005"+
		"\u00c4\u0000\u0000\u040d\u040e\u0005\u00ef\u0000\u0000\u040e\u040f\u0005"+
		"\u0167\u0000\u0000\u040fu\u0001\u0000\u0000\u0000\u0410\u0411\u0005\u0199"+
		"\u0000\u0000\u0411\u0412\u0003\u00dam\u0000\u0412w\u0001\u0000\u0000\u0000"+
		"\u0413\u0414\u0005\u0155\u0000\u0000\u0414\u0415\u0003\u010e\u0087\u0000"+
		"\u0415y\u0001\u0000\u0000\u0000\u0416\u0417\u0005\u015a\u0000\u0000\u0417"+
		"\u0418\u0005\u0112\u0000\u0000\u0418\u0419\u0005\u0178\u0000\u0000\u0419"+
		"{\u0001\u0000\u0000\u0000\u041a\u041b\u0005d\u0000\u0000\u041b\u041c\u0005"+
		"\u00d4\u0000\u0000\u041c\u041d\u0003~?\u0000\u041d}\u0001\u0000\u0000"+
		"\u0000\u041e\u041f\u0005\u01b4\u0000\u0000\u041f\u0424\u0003\u0080@\u0000"+
		"\u0420\u0421\u0005\u01b8\u0000\u0000\u0421\u0423\u0003\u0080@\u0000\u0422"+
		"\u0420\u0001\u0000\u0000\u0000\u0423\u0426\u0001\u0000\u0000\u0000\u0424"+
		"\u0422\u0001\u0000\u0000\u0000\u0424\u0425\u0001\u0000\u0000\u0000\u0425"+
		"\u0427\u0001\u0000\u0000\u0000\u0426\u0424\u0001\u0000\u0000\u0000\u0427"+
		"\u0428\u0005\u01b5\u0000\u0000\u0428\u007f\u0001\u0000\u0000\u0000\u0429"+
		"\u0437\u0003\u00d8l\u0000\u042a\u042b\u0003\u00f2y\u0000\u042b\u042c\u0005"+
		"\u01b4\u0000\u0000\u042c\u0431\u0003\u0082A\u0000\u042d\u042e\u0005\u01b8"+
		"\u0000\u0000\u042e\u0430\u0003\u0082A\u0000\u042f\u042d\u0001\u0000\u0000"+
		"\u0000\u0430\u0433\u0001\u0000\u0000\u0000\u0431\u042f\u0001\u0000\u0000"+
		"\u0000\u0431\u0432\u0001\u0000\u0000\u0000\u0432\u0434\u0001\u0000\u0000"+
		"\u0000\u0433\u0431\u0001\u0000\u0000\u0000\u0434\u0435\u0005\u01b5\u0000"+
		"\u0000\u0435\u0437\u0001\u0000\u0000\u0000\u0436\u0429\u0001\u0000\u0000"+
		"\u0000\u0436\u042a\u0001\u0000\u0000\u0000\u0437\u0081\u0001\u0000\u0000"+
		"\u0000\u0438\u043b\u0003\u00d8l\u0000\u0439\u043b\u0003\u011a\u008d\u0000"+
		"\u043a\u0438\u0001\u0000\u0000\u0000\u043a\u0439\u0001\u0000\u0000\u0000"+
		"\u043b\u0083\u0001\u0000\u0000\u0000\u043c\u043d\u0005\u0132\u0000\u0000"+
		"\u043d\u0446\u0003\u0104\u0082\u0000\u043e\u0442\u0005\u01b4\u0000\u0000"+
		"\u043f\u0441\u0003\u008aE\u0000\u0440\u043f\u0001\u0000\u0000\u0000\u0441"+
		"\u0444\u0001\u0000\u0000\u0000\u0442\u0440\u0001\u0000\u0000\u0000\u0442"+
		"\u0443\u0001\u0000\u0000\u0000\u0443\u0445\u0001\u0000\u0000\u0000\u0444"+
		"\u0442\u0001\u0000\u0000\u0000\u0445\u0447\u0005\u01b5\u0000\u0000\u0446"+
		"\u043e\u0001\u0000\u0000\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447"+
		"\u0085\u0001\u0000\u0000\u0000\u0448\u0451\u0005\u01a5\u0000\u0000\u0449"+
		"\u044b\u0005\u00d4\u0000\u0000\u044a\u044c\u0005\u01a7\u0000\u0000\u044b"+
		"\u044a\u0001\u0000\u0000\u0000\u044b\u044c\u0001\u0000\u0000\u0000\u044c"+
		"\u044d\u0001\u0000\u0000\u0000\u044d\u044e\u0005\u01b4\u0000\u0000\u044e"+
		"\u044f\u0003\u00f2y\u0000\u044f\u0450\u0005\u01b5\u0000\u0000\u0450\u0452"+
		"\u0001\u0000\u0000\u0000\u0451\u0449\u0001\u0000\u0000\u0000\u0451\u0452"+
		"\u0001\u0000\u0000\u0000\u0452\u0457\u0001\u0000\u0000\u0000\u0453\u0454"+
		"\u0005\u0128\u0000\u0000\u0454\u0455\u0003\u0120\u0090\u0000\u0455\u0456"+
		"\u0005\u01a8\u0000\u0000\u0456\u0458\u0001\u0000\u0000\u0000\u0457\u0453"+
		"\u0001\u0000\u0000\u0000\u0457\u0458\u0001\u0000\u0000\u0000\u0458\u0087"+
		"\u0001\u0000\u0000\u0000\u0459\u0462\u0005\u01a6\u0000\u0000\u045a\u045c"+
		"\u0005\u00d4\u0000\u0000\u045b\u045d\u0005\u01a7\u0000\u0000\u045c\u045b"+
		"\u0001\u0000\u0000\u0000\u045c\u045d\u0001\u0000\u0000\u0000\u045d\u045e"+
		"\u0001\u0000\u0000\u0000\u045e\u045f\u0005\u01b4\u0000\u0000\u045f\u0460"+
		"\u0003\u00f2y\u0000\u0460\u0461\u0005\u01b5\u0000\u0000\u0461\u0463\u0001"+
		"\u0000\u0000\u0000\u0462\u045a\u0001\u0000\u0000\u0000\u0462\u0463\u0001"+
		"\u0000\u0000\u0000\u0463\u0468\u0001\u0000\u0000\u0000\u0464\u0465\u0005"+
		"\u0128\u0000\u0000\u0465\u0466\u0003\u0120\u0090\u0000\u0466\u0467\u0005"+
		"\u01a8\u0000\u0000\u0467\u0469\u0001\u0000\u0000\u0000\u0468\u0464\u0001"+
		"\u0000\u0000\u0000\u0468\u0469\u0001\u0000\u0000\u0000\u0469\u0089\u0001"+
		"\u0000\u0000\u0000\u046a\u046b\u0007\b\u0000\u0000\u046b\u046f\u0007\t"+
		"\u0000\u0000\u046c\u046d\u0007\n\u0000\u0000\u046d\u046f\u0007\u000b\u0000"+
		"\u0000\u046e\u046a\u0001\u0000\u0000\u0000\u046e\u046c\u0001\u0000\u0000"+
		"\u0000\u046f\u008b\u0001\u0000\u0000\u0000\u0470\u0474\u0003\u008eG\u0000"+
		"\u0471\u0474\u0003\u00acV\u0000\u0472\u0474\u0003\u00b0X\u0000\u0473\u0470"+
		"\u0001\u0000\u0000\u0000\u0473\u0471\u0001\u0000\u0000\u0000\u0473\u0472"+
		"\u0001\u0000\u0000\u0000\u0474\u008d\u0001\u0000\u0000\u0000\u0475\u0476"+
		"\u0003\u00b2Y\u0000\u0476\u0478\u0003\u00b6[\u0000\u0477\u0479\u0003\u00a8"+
		"T\u0000\u0478\u0477\u0001\u0000\u0000\u0000\u0478\u0479\u0001\u0000\u0000"+
		"\u0000\u0479\u047b\u0001\u0000\u0000\u0000\u047a\u047c\u0003\u00aaU\u0000"+
		"\u047b\u047a\u0001\u0000\u0000\u0000\u047b\u047c\u0001\u0000\u0000\u0000"+
		"\u047c\u008f\u0001\u0000\u0000\u0000\u047d\u047e\u0003\u00b8\\\u0000\u047e"+
		"\u0091\u0001\u0000\u0000\u0000\u047f\u0480\u0005\u00b8\u0000\u0000\u0480"+
		"\u0481\u0005\u0112\u0000\u0000\u0481\u0482\u0003\u00b8\\\u0000\u0482\u0483"+
		"\u0005\u00c8\u0000\u0000\u0483\u0484\u0003\u00b8\\\u0000\u0484\u0491\u0001"+
		"\u0000\u0000\u0000\u0485\u0486\u0005\u00b8\u0000\u0000\u0486\u0489\u0005"+
		"\u0112\u0000\u0000\u0487\u048a\u0003\u0106\u0083\u0000\u0488\u048a\u0003"+
		"\u00b8\\\u0000\u0489\u0487\u0001\u0000\u0000\u0000\u0489\u0488\u0001\u0000"+
		"\u0000\u0000\u048a\u048b\u0001\u0000\u0000\u0000\u048b\u048c\u0005\u00c8"+
		"\u0000\u0000\u048c\u048e\u0003\u0106\u0083\u0000\u048d\u048f\u0003\u00da"+
		"m\u0000\u048e\u048d\u0001\u0000\u0000\u0000\u048e\u048f\u0001\u0000\u0000"+
		"\u0000\u048f\u0491\u0001\u0000\u0000\u0000\u0490\u047f\u0001\u0000\u0000"+
		"\u0000\u0490\u0485\u0001\u0000\u0000\u0000\u0491\u0093\u0001\u0000\u0000"+
		"\u0000\u0492\u0493\u0005\u00e7\u0000\u0000\u0493\u0495\u0003\u0096K\u0000"+
		"\u0494\u0492\u0001\u0000\u0000\u0000\u0494\u0495\u0001\u0000\u0000\u0000"+
		"\u0495\u0496\u0001\u0000\u0000\u0000\u0496\u0497\u0005\u015d\u0000\u0000"+
		"\u0497\u0498\u0005J\u0000\u0000\u0498\u0499\u0003\u00b4Z\u0000\u0499\u049a"+
		"\u0005\u0146\u0000\u0000\u049a\u049b\u0005#\u0000\u0000\u049b\u0095\u0001"+
		"\u0000\u0000\u0000\u049c\u049d\u0003\u00f2y\u0000\u049d\u0097\u0001\u0000"+
		"\u0000\u0000\u049e\u049f\u0005\u0192\u0000\u0000\u049f\u04a4\u0003\u009a"+
		"M\u0000\u04a0\u04a1\u0005\u01b8\u0000\u0000\u04a1\u04a3\u0003\u009aM\u0000"+
		"\u04a2\u04a0\u0001\u0000\u0000\u0000\u04a3\u04a6\u0001\u0000\u0000\u0000"+
		"\u04a4\u04a2\u0001\u0000\u0000\u0000\u04a4\u04a5\u0001\u0000\u0000\u0000"+
		"\u04a5\u0099\u0001\u0000\u0000\u0000\u04a6\u04a4\u0001\u0000\u0000\u0000"+
		"\u04a7\u04a8\u0005\u01b4\u0000\u0000\u04a8\u04ad\u0003\u011a\u008d\u0000"+
		"\u04a9\u04aa\u0005\u01b8\u0000\u0000\u04aa\u04ac\u0003\u011a\u008d\u0000"+
		"\u04ab\u04a9\u0001\u0000\u0000\u0000\u04ac\u04af\u0001\u0000\u0000\u0000"+
		"\u04ad\u04ab\u0001\u0000\u0000\u0000\u04ad\u04ae\u0001\u0000\u0000\u0000"+
		"\u04ae\u04b0\u0001\u0000\u0000\u0000\u04af\u04ad\u0001\u0000\u0000\u0000"+
		"\u04b0\u04b1\u0005\u01b5\u0000\u0000\u04b1\u009b\u0001\u0000\u0000\u0000"+
		"\u04b2\u04b3\u0005\u01b4\u0000\u0000\u04b3\u04b4\u0003\u0120\u0090\u0000"+
		"\u04b4\u04b5\u0005\u01b5\u0000\u0000\u04b5\u009d\u0001\u0000\u0000\u0000"+
		"\u04b6\u04b7\u0005\u01b4\u0000\u0000\u04b7\u04ba\u0003\u0120\u0090\u0000"+
		"\u04b8\u04b9\u0005\u01b8\u0000\u0000\u04b9\u04bb\u0003\u0120\u0090\u0000"+
		"\u04ba\u04b8\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001\u0000\u0000\u0000"+
		"\u04bb\u04bc\u0001\u0000\u0000\u0000\u04bc\u04bd\u0005\u01b5\u0000\u0000"+
		"\u04bd\u009f\u0001\u0000\u0000\u0000\u04be\u04bf\u0005\u01b4\u0000\u0000"+
		"\u04bf\u04c2\u0003\u011e\u008f\u0000\u04c0\u04c1\u0005\u01b8\u0000\u0000"+
		"\u04c1\u04c3\u0003\u011e\u008f\u0000\u04c2\u04c0\u0001\u0000\u0000\u0000"+
		"\u04c2\u04c3\u0001\u0000\u0000\u0000\u04c3\u04c4\u0001\u0000\u0000\u0000"+
		"\u04c4\u04c5\u0005\u01b5\u0000\u0000\u04c5\u00a1\u0001\u0000\u0000\u0000"+
		"\u04c6\u04c7\u0005\u01af\u0000\u0000\u04c7\u04cc\u0003\u00b6[\u0000\u04c8"+
		"\u04c9\u0005\u01b8\u0000\u0000\u04c9\u04cb\u0003\u00b6[\u0000\u04ca\u04c8"+
		"\u0001\u0000\u0000\u0000\u04cb\u04ce\u0001\u0000\u0000\u0000\u04cc\u04ca"+
		"\u0001\u0000\u0000\u0000\u04cc\u04cd\u0001\u0000\u0000\u0000\u04cd\u04cf"+
		"\u0001\u0000\u0000\u0000\u04ce\u04cc\u0001\u0000\u0000\u0000\u04cf\u04d0"+
		"\u0005\u01ae\u0000\u0000\u04d0\u00a3\u0001\u0000\u0000\u0000\u04d1\u04d2"+
		"\u0005\u01af\u0000\u0000\u04d2\u04d3\u0003\u00b6[\u0000\u04d3\u04d4\u0005"+
		"\u01b8\u0000\u0000\u04d4\u04d5\u0003\u00b6[\u0000\u04d5\u04d6\u0001\u0000"+
		"\u0000\u0000\u04d6\u04d7\u0005\u01ae\u0000\u0000\u04d7\u00a5\u0001\u0000"+
		"\u0000\u0000\u04d8\u04d9\u0005\u01af\u0000\u0000\u04d9\u04da\u0003\u00b2"+
		"Y\u0000\u04da\u04e1\u0003\u00b6[\u0000\u04db\u04dc\u0005\u01b8\u0000\u0000"+
		"\u04dc\u04dd\u0003\u00b2Y\u0000\u04dd\u04de\u0003\u00b6[\u0000\u04de\u04e0"+
		"\u0001\u0000\u0000\u0000\u04df\u04db\u0001\u0000\u0000\u0000\u04e0\u04e3"+
		"\u0001\u0000\u0000\u0000\u04e1\u04df\u0001\u0000\u0000\u0000\u04e1\u04e2"+
		"\u0001\u0000\u0000\u0000\u04e2\u04e4\u0001\u0000\u0000\u0000\u04e3\u04e1"+
		"\u0001\u0000\u0000\u0000\u04e4\u04e5\u0005\u01ae\u0000\u0000\u04e5\u00a7"+
		"\u0001\u0000\u0000\u0000\u04e6\u04e7\u0005\u00e7\u0000\u0000\u04e7\u04e9"+
		"\u0003\u0096K\u0000\u04e8\u04e6\u0001\u0000\u0000\u0000\u04e8\u04e9\u0001"+
		"\u0000\u0000\u0000\u04e9\u04ea\u0001\u0000\u0000\u0000\u04ea\u04eb\u0005"+
		"\u015d\u0000\u0000\u04eb\u04ee\u0005J\u0000\u0000\u04ec\u04ed\u0005\u0146"+
		"\u0000\u0000\u04ed\u04ef\u0005#\u0000\u0000\u04ee\u04ec\u0001\u0000\u0000"+
		"\u0000\u04ee\u04ef\u0001\u0000\u0000\u0000\u04ef\u04f5\u0001\u0000\u0000"+
		"\u0000\u04f0\u04f2\u0005\u0146\u0000\u0000\u04f1\u04f0\u0001\u0000\u0000"+
		"\u0000\u04f1\u04f2\u0001\u0000\u0000\u0000\u04f2\u04f3\u0001\u0000\u0000"+
		"\u0000\u04f3\u04f5\u0005\u0149\u0000\u0000\u04f4\u04e8\u0001\u0000\u0000"+
		"\u0000\u04f4\u04f1\u0001\u0000\u0000\u0000\u04f5\u00a9\u0001\u0000\u0000"+
		"\u0000\u04f6\u04f7\u0005\u0012\u0000\u0000\u04f7\u04f8\u0005\u01ca\u0000"+
		"\u0000\u04f8\u00ab\u0001\u0000\u0000\u0000\u04f9\u04fa\u0003\u00b2Y\u0000"+
		"\u04fa\u04fb\u0003\u00b6[\u0000\u04fb\u04fe\u0005\u013b\u0000\u0000\u04fc"+
		"\u04fd\u0005\u0113\u0000\u0000\u04fd\u04ff\u0003\u00aeW\u0000\u04fe\u04fc"+
		"\u0001\u0000\u0000\u0000\u04fe\u04ff\u0001\u0000\u0000\u0000\u04ff\u0501"+
		"\u0001\u0000\u0000\u0000\u0500\u0502\u0005\u00b7\u0000\u0000\u0501\u0500"+
		"\u0001\u0000\u0000\u0000\u0501\u0502\u0001\u0000\u0000\u0000\u0502\u00ad"+
		"\u0001\u0000\u0000\u0000\u0503\u0504\u0005\u01ca\u0000\u0000\u0504\u00af"+
		"\u0001\u0000\u0000\u0000\u0505\u0506\u0003\u00b2Y\u0000\u0506\u0507\u0005"+
		"\u00c8\u0000\u0000\u0507\u0509\u0003\u0090H\u0000\u0508\u050a\u0003\u00aa"+
		"U\u0000\u0509\u0508\u0001\u0000\u0000\u0000\u0509\u050a\u0001\u0000\u0000"+
		"\u0000\u050a\u00b1\u0001\u0000\u0000\u0000\u050b\u050e\u0003\u0106\u0083"+
		"\u0000\u050c\u050e\u0003\u00b8\\\u0000\u050d\u050b\u0001\u0000\u0000\u0000"+
		"\u050d\u050c\u0001\u0000\u0000\u0000\u050e\u00b3\u0001\u0000\u0000\u0000"+
		"\u050f\u0510\u0005\u01b4\u0000\u0000\u0510\u0515\u0003\u00b2Y\u0000\u0511"+
		"\u0512\u0005\u01b8\u0000\u0000\u0512\u0514\u0003\u00b2Y\u0000\u0513\u0511"+
		"\u0001\u0000\u0000\u0000\u0514\u0517\u0001\u0000\u0000\u0000\u0515\u0513"+
		"\u0001\u0000\u0000\u0000\u0515\u0516\u0001\u0000\u0000\u0000\u0516\u0518"+
		"\u0001\u0000\u0000\u0000\u0517\u0515\u0001\u0000\u0000\u0000\u0518\u0519"+
		"\u0005\u01b5\u0000\u0000\u0519\u0523\u0001\u0000\u0000\u0000\u051a\u051f"+
		"\u0003\u00b2Y\u0000\u051b\u051c\u0005\u01b8\u0000\u0000\u051c\u051e\u0003"+
		"\u00b2Y\u0000\u051d\u051b\u0001\u0000\u0000\u0000\u051e\u0521\u0001\u0000"+
		"\u0000\u0000\u051f\u051d\u0001\u0000\u0000\u0000\u051f\u0520\u0001\u0000"+
		"\u0000\u0000\u0520\u0523\u0001\u0000\u0000\u0000\u0521\u051f\u0001\u0000"+
		"\u0000\u0000\u0522\u050f\u0001\u0000\u0000\u0000\u0522\u051a\u0001\u0000"+
		"\u0000\u0000\u0523\u00b5\u0001\u0000\u0000\u0000\u0524\u056e\u0007\f\u0000"+
		"\u0000\u0525\u0527\u0007\r\u0000\u0000\u0526\u0528\u0003\u009cN\u0000"+
		"\u0527\u0526\u0001\u0000\u0000\u0000\u0527\u0528\u0001\u0000\u0000\u0000"+
		"\u0528\u056e\u0001\u0000\u0000\u0000\u0529\u052b\u0005\u017f\u0000\u0000"+
		"\u052a\u052c\u0003\u009cN\u0000\u052b\u052a\u0001\u0000\u0000\u0000\u052b"+
		"\u052c\u0001\u0000\u0000\u0000\u052c\u0533\u0001\u0000\u0000\u0000\u052d"+
		"\u052f\u0007\u000e\u0000\u0000\u052e\u0530\u0005\u0135\u0000\u0000\u052f"+
		"\u052e\u0001\u0000\u0000\u0000\u052f\u0530\u0001\u0000\u0000\u0000\u0530"+
		"\u0531\u0001\u0000\u0000\u0000\u0531\u0532\u0005\u017e\u0000\u0000\u0532"+
		"\u0534\u0005\u00bf\u0000\u0000\u0533\u052d\u0001\u0000\u0000\u0000\u0533"+
		"\u0534\u0001\u0000\u0000\u0000\u0534\u056e\u0001\u0000\u0000\u0000\u0535"+
		"\u0537\u0005\u0180\u0000\u0000\u0536\u0538\u0003\u009cN\u0000\u0537\u0536"+
		"\u0001\u0000\u0000\u0000\u0537\u0538\u0001\u0000\u0000\u0000\u0538\u053f"+
		"\u0001\u0000\u0000\u0000\u0539\u053b\u0007\u000e\u0000\u0000\u053a\u053c"+
		"\u0005\u0135\u0000\u0000\u053b\u053a\u0001\u0000\u0000\u0000\u053b\u053c"+
		"\u0001\u0000\u0000\u0000\u053c\u053d\u0001\u0000\u0000\u0000\u053d\u053e"+
		"\u0005\u017e\u0000\u0000\u053e\u0540\u0005\u00bf\u0000\u0000\u053f\u0539"+
		"\u0001\u0000\u0000\u0000\u053f\u0540\u0001\u0000\u0000\u0000\u0540\u056e"+
		"\u0001\u0000\u0000\u0000\u0541\u0543\u0005\u0181\u0000\u0000\u0542\u0544"+
		"\u0003\u009cN\u0000\u0543\u0542\u0001\u0000\u0000\u0000\u0543\u0544\u0001"+
		"\u0000\u0000\u0000\u0544\u054b\u0001\u0000\u0000\u0000\u0545\u0547\u0007"+
		"\u000e\u0000\u0000\u0546\u0548\u0005\u0135\u0000\u0000\u0547\u0546\u0001"+
		"\u0000\u0000\u0000\u0547\u0548\u0001\u0000\u0000\u0000\u0548\u0549\u0001"+
		"\u0000\u0000\u0000\u0549\u054a\u0005\u017e\u0000\u0000\u054a\u054c\u0005"+
		"\u00bf\u0000\u0000\u054b\u0545\u0001\u0000\u0000\u0000\u054b\u054c\u0001"+
		"\u0000\u0000\u0000\u054c\u056e\u0001\u0000\u0000\u0000\u054d\u054f\u0005"+
		"\u0182\u0000\u0000\u054e\u0550\u0003\u009cN\u0000\u054f\u054e\u0001\u0000"+
		"\u0000\u0000\u054f\u0550\u0001\u0000\u0000\u0000\u0550\u0557\u0001\u0000"+
		"\u0000\u0000\u0551\u0553\u0007\u000e\u0000\u0000\u0552\u0554\u0005\u0135"+
		"\u0000\u0000\u0553\u0552\u0001\u0000\u0000\u0000\u0553\u0554\u0001\u0000"+
		"\u0000\u0000\u0554\u0555\u0001\u0000\u0000\u0000\u0555\u0556\u0005\u017e"+
		"\u0000\u0000\u0556\u0558\u0005\u00bf\u0000\u0000\u0557\u0551\u0001\u0000"+
		"\u0000\u0000\u0557\u0558\u0001\u0000\u0000\u0000\u0558\u056e\u0001\u0000"+
		"\u0000\u0000\u0559\u055b\u0007\u000f\u0000\u0000\u055a\u055c\u0003\u009e"+
		"O\u0000\u055b\u055a\u0001\u0000\u0000\u0000\u055b\u055c\u0001\u0000\u0000"+
		"\u0000\u055c\u056e\u0001\u0000\u0000\u0000\u055d\u055f\u0007\u0010\u0000"+
		"\u0000\u055e\u0560\u0003\u00a2Q\u0000\u055f\u055e\u0001\u0000\u0000\u0000"+
		"\u055f\u0560\u0001\u0000\u0000\u0000\u0560\u056e\u0001\u0000\u0000\u0000"+
		"\u0561\u0563\u0005R\u0000\u0000\u0562\u0564\u0003\u00a4R\u0000\u0563\u0562"+
		"\u0001\u0000\u0000\u0000\u0563\u0564\u0001\u0000\u0000\u0000\u0564\u056e"+
		"\u0001\u0000\u0000\u0000\u0565\u0567\u0005\u0167\u0000\u0000\u0566\u0568"+
		"\u0003\u00a6S\u0000\u0567\u0566\u0001\u0000\u0000\u0000\u0567\u0568\u0001"+
		"\u0000\u0000\u0000\u0568\u056e\u0001\u0000\u0000\u0000\u0569\u056b\u0005"+
		"z\u0000\u0000\u056a\u056c\u0003\u00a0P\u0000\u056b\u056a\u0001\u0000\u0000"+
		"\u0000\u056b\u056c\u0001\u0000\u0000\u0000\u056c\u056e\u0001\u0000\u0000"+
		"\u0000\u056d\u0524\u0001\u0000\u0000\u0000\u056d\u0525\u0001\u0000\u0000"+
		"\u0000\u056d\u0529\u0001\u0000\u0000\u0000\u056d\u0535\u0001\u0000\u0000"+
		"\u0000\u056d\u0541\u0001\u0000\u0000\u0000\u056d\u054d\u0001\u0000\u0000"+
		"\u0000\u056d\u0559\u0001\u0000\u0000\u0000\u056d\u055d\u0001\u0000\u0000"+
		"\u0000\u056d\u0561\u0001\u0000\u0000\u0000\u056d\u0565\u0001\u0000\u0000"+
		"\u0000\u056d\u0569\u0001\u0000\u0000\u0000\u056e\u00b7\u0001\u0000\u0000"+
		"\u0000\u056f\u0570\u0003\u00ba]\u0000\u0570\u00b9\u0001\u0000\u0000\u0000"+
		"\u0571\u0572\u0006]\uffff\uffff\u0000\u0572\u0573\u0005\u0146\u0000\u0000"+
		"\u0573\u057e\u0003\u00ba]\u0006\u0574\u0575\u0005\u010a\u0000\u0000\u0575"+
		"\u0576\u0005\u01b4\u0000\u0000\u0576\u0577\u0003\u0014\n\u0000\u0577\u0578"+
		"\u0005\u01b5\u0000\u0000\u0578\u057e\u0001\u0000\u0000\u0000\u0579\u057b"+
		"\u0003\u00c0`\u0000\u057a\u057c\u0003\u00bc^\u0000\u057b\u057a\u0001\u0000"+
		"\u0000\u0000\u057b\u057c\u0001\u0000\u0000\u0000\u057c\u057e\u0001\u0000"+
		"\u0000\u0000\u057d\u0571\u0001\u0000\u0000\u0000\u057d\u0574\u0001\u0000"+
		"\u0000\u0000\u057d\u0579\u0001\u0000\u0000\u0000\u057e\u058d\u0001\u0000"+
		"\u0000\u0000\u057f\u0580\n\u0003\u0000\u0000\u0580\u0581\u0005\u00c4\u0000"+
		"\u0000\u0581\u058c\u0003\u00ba]\u0004\u0582\u0583\n\u0002\u0000\u0000"+
		"\u0583\u0584\u0005\u014f\u0000\u0000\u0584\u058c\u0003\u00ba]\u0003\u0585"+
		"\u0586\n\u0001\u0000\u0000\u0586\u0588\u0005\u0129\u0000\u0000\u0587\u0589"+
		"\u0005\u0146\u0000\u0000\u0588\u0587\u0001\u0000\u0000\u0000\u0588\u0589"+
		"\u0001\u0000\u0000\u0000\u0589\u058a\u0001\u0000\u0000\u0000\u058a\u058c"+
		"\u0007\u0011\u0000\u0000\u058b\u057f\u0001\u0000\u0000\u0000\u058b\u0582"+
		"\u0001\u0000\u0000\u0000\u058b\u0585\u0001\u0000\u0000\u0000\u058c\u058f"+
		"\u0001\u0000\u0000\u0000\u058d\u058b\u0001\u0000\u0000\u0000\u058d\u058e"+
		"\u0001\u0000\u0000\u0000\u058e\u00bb\u0001\u0000\u0000\u0000\u058f\u058d"+
		"\u0001\u0000\u0000\u0000\u0590\u0592\u0005\u0146\u0000\u0000\u0591\u0590"+
		"\u0001\u0000\u0000\u0000\u0591\u0592\u0001\u0000\u0000\u0000\u0592\u0593"+
		"\u0001\u0000\u0000\u0000\u0593\u0595\u0005\u00cd\u0000\u0000\u0594\u0596"+
		"\u0007\u0012\u0000\u0000\u0595\u0594\u0001\u0000\u0000\u0000\u0595\u0596"+
		"\u0001\u0000\u0000\u0000\u0596\u0597\u0001\u0000\u0000\u0000\u0597\u0598"+
		"\u0003\u00c0`\u0000\u0598\u0599\u0005\u00c4\u0000\u0000\u0599\u059a\u0003"+
		"\u00c0`\u0000\u059a\u05d4\u0001\u0000\u0000\u0000\u059b\u059d\u0005\u0146"+
		"\u0000\u0000\u059c\u059b\u0001\u0000\u0000\u0000\u059c\u059d\u0001\u0000"+
		"\u0000\u0000\u059d\u059e\u0001\u0000\u0000\u0000\u059e\u059f\u0005\u011f"+
		"\u0000\u0000\u059f\u05a0\u0005\u01b4\u0000\u0000\u05a0\u05a5\u0003\u00b8"+
		"\\\u0000\u05a1\u05a2\u0005\u01b8\u0000\u0000\u05a2\u05a4\u0003\u00b8\\"+
		"\u0000\u05a3\u05a1\u0001\u0000\u0000\u0000\u05a4\u05a7\u0001\u0000\u0000"+
		"\u0000\u05a5\u05a3\u0001\u0000\u0000\u0000\u05a5\u05a6\u0001\u0000\u0000"+
		"\u0000\u05a6\u05a8\u0001\u0000\u0000\u0000\u05a7\u05a5\u0001\u0000\u0000"+
		"\u0000\u05a8\u05a9\u0005\u01b5\u0000\u0000\u05a9\u05d4\u0001\u0000\u0000"+
		"\u0000\u05aa\u05ac\u0005\u0146\u0000\u0000\u05ab\u05aa\u0001\u0000\u0000"+
		"\u0000\u05ab\u05ac\u0001\u0000\u0000\u0000\u05ac\u05ad\u0001\u0000\u0000"+
		"\u0000\u05ad\u05ae\u0005\u011f\u0000\u0000\u05ae\u05af\u0005\u01b4\u0000"+
		"\u0000\u05af\u05b0\u0003\u0014\n\u0000\u05b0\u05b1\u0005\u01b5\u0000\u0000"+
		"\u05b1\u05d4\u0001\u0000\u0000\u0000\u05b2\u05b3\u0005\u010a\u0000\u0000"+
		"\u05b3\u05b4\u0005\u01b4\u0000\u0000\u05b4\u05b5\u0003\u0014\n\u0000\u05b5"+
		"\u05b6\u0005\u01b5\u0000\u0000\u05b6\u05d4\u0001\u0000\u0000\u0000\u05b7"+
		"\u05b9\u0005\u0146\u0000\u0000\u05b8\u05b7\u0001\u0000\u0000\u0000\u05b8"+
		"\u05b9\u0001\u0000\u0000\u0000\u05b9\u05ba\u0001\u0000\u0000\u0000\u05ba"+
		"\u05bb\u0005\u0164\u0000\u0000\u05bb\u05d4\u0003\u00c0`\u0000\u05bc\u05d4"+
		"\u0003\u00be_\u0000\u05bd\u05bf\u0005\u0129\u0000\u0000\u05be\u05c0\u0005"+
		"\u0146\u0000\u0000\u05bf\u05be\u0001\u0000\u0000\u0000\u05bf\u05c0\u0001"+
		"\u0000\u0000\u0000\u05c0\u05c1\u0001\u0000\u0000\u0000\u05c1\u05d4\u0007"+
		"\u0011\u0000\u0000\u05c2\u05c4\u0005\u0129\u0000\u0000\u05c3\u05c5\u0005"+
		"\u0146\u0000\u0000\u05c4\u05c3\u0001\u0000\u0000\u0000\u05c4\u05c5\u0001"+
		"\u0000\u0000\u0000\u05c5\u05c6\u0001\u0000\u0000\u0000\u05c6\u05c7\u0005"+
		"\u00fe\u0000\u0000\u05c7\u05c8\u0005\u0113\u0000\u0000\u05c8\u05d4\u0003"+
		"\u00c0`\u0000\u05c9\u05cb\u0005\u0146\u0000\u0000\u05ca\u05c9\u0001\u0000"+
		"\u0000\u0000\u05ca\u05cb\u0001\u0000\u0000\u0000\u05cb\u05cc\u0001\u0000"+
		"\u0000\u0000\u05cc\u05cd\u0005\u016e\u0000\u0000\u05cd\u05ce\u0005\u0184"+
		"\u0000\u0000\u05ce\u05d1\u0003\u00c0`\u0000\u05cf\u05d0\u0005\u0107\u0000"+
		"\u0000\u05d0\u05d2\u0003\u011e\u008f\u0000\u05d1\u05cf\u0001\u0000\u0000"+
		"\u0000\u05d1\u05d2\u0001\u0000\u0000\u0000\u05d2\u05d4\u0001\u0000\u0000"+
		"\u0000\u05d3\u0591\u0001\u0000\u0000\u0000\u05d3\u059c\u0001\u0000\u0000"+
		"\u0000\u05d3\u05ab\u0001\u0000\u0000\u0000\u05d3\u05b2\u0001\u0000\u0000"+
		"\u0000\u05d3\u05b8\u0001\u0000\u0000\u0000\u05d3\u05bc\u0001\u0000\u0000"+
		"\u0000\u05d3\u05bd\u0001\u0000\u0000\u0000\u05d3\u05c2\u0001\u0000\u0000"+
		"\u0000\u05d3\u05ca\u0001\u0000\u0000\u0000\u05d4\u00bd\u0001\u0000\u0000"+
		"\u0000\u05d5\u05d7\u0005\u0146\u0000\u0000\u05d6\u05d5\u0001\u0000\u0000"+
		"\u0000\u05d6\u05d7\u0001\u0000\u0000\u0000\u05d7\u05d8\u0001\u0000\u0000"+
		"\u0000\u05d8\u05d9\u0005\u0132\u0000\u0000\u05d9\u05e7\u0007\u0013\u0000"+
		"\u0000\u05da\u05db\u0005\u01b4\u0000\u0000\u05db\u05e8\u0005\u01b5\u0000"+
		"\u0000\u05dc\u05dd\u0005\u01b4\u0000\u0000\u05dd\u05e2\u0003\u00b8\\\u0000"+
		"\u05de\u05df\u0005\u01b8\u0000\u0000\u05df\u05e1\u0003\u00b8\\\u0000\u05e0"+
		"\u05de\u0001\u0000\u0000\u0000\u05e1\u05e4\u0001\u0000\u0000\u0000\u05e2"+
		"\u05e0\u0001\u0000\u0000\u0000\u05e2\u05e3\u0001\u0000\u0000\u0000\u05e3"+
		"\u05e5\u0001\u0000\u0000\u0000\u05e4\u05e2\u0001\u0000\u0000\u0000\u05e5"+
		"\u05e6\u0005\u01b5\u0000\u0000\u05e6\u05e8\u0001\u0000\u0000\u0000\u05e7"+
		"\u05da\u0001\u0000\u0000\u0000\u05e7\u05dc\u0001\u0000\u0000\u0000\u05e8"+
		"\u05f3\u0001\u0000\u0000\u0000\u05e9\u05eb\u0005\u0146\u0000\u0000\u05ea"+
		"\u05e9\u0001\u0000\u0000\u0000\u05ea\u05eb\u0001\u0000\u0000\u0000\u05eb"+
		"\u05ec\u0001\u0000\u0000\u0000\u05ec\u05ed\u0005\u0132\u0000\u0000\u05ed"+
		"\u05f0\u0003\u00c0`\u0000\u05ee\u05ef\u0005\u0107\u0000\u0000\u05ef\u05f1"+
		"\u0003\u011e\u008f\u0000\u05f0\u05ee\u0001\u0000\u0000\u0000\u05f0\u05f1"+
		"\u0001\u0000\u0000\u0000\u05f1\u05f3\u0001\u0000\u0000\u0000\u05f2\u05d6"+
		"\u0001\u0000\u0000\u0000\u05f2\u05ea\u0001\u0000\u0000\u0000\u05f3\u00bf"+
		"\u0001\u0000\u0000\u0000\u05f4\u05f5\u0006`\uffff\uffff\u0000\u05f5\u05f9"+
		"\u0003\u00c2a\u0000\u05f6\u05f7\u0007\u0014\u0000\u0000\u05f7\u05f9\u0003"+
		"\u00c0`\u0007\u05f8\u05f4\u0001\u0000\u0000\u0000\u05f8\u05f6\u0001\u0000"+
		"\u0000\u0000\u05f9\u060f\u0001\u0000\u0000\u0000\u05fa\u05fb\n\u0006\u0000"+
		"\u0000\u05fb\u05fc\u0007\u0015\u0000\u0000\u05fc\u060e\u0003\u00c0`\u0007"+
		"\u05fd\u05fe\n\u0005\u0000\u0000\u05fe\u05ff\u0007\u0016\u0000\u0000\u05ff"+
		"\u060e\u0003\u00c0`\u0006\u0600\u0601\n\u0004\u0000\u0000\u0601\u0602"+
		"\u0005\u01ab\u0000\u0000\u0602\u060e\u0003\u00c0`\u0005\u0603\u0604\n"+
		"\u0003\u0000\u0000\u0604\u0605\u0005\u01ac\u0000\u0000\u0605\u060e\u0003"+
		"\u00c0`\u0004\u0606\u0607\n\u0002\u0000\u0000\u0607\u0608\u0005\u01aa"+
		"\u0000\u0000\u0608\u060e\u0003\u00c0`\u0003\u0609\u060a\n\u0001\u0000"+
		"\u0000\u060a\u060b\u0003\u0118\u008c\u0000\u060b\u060c\u0003\u00c0`\u0002"+
		"\u060c\u060e\u0001\u0000\u0000\u0000\u060d\u05fa\u0001\u0000\u0000\u0000"+
		"\u060d\u05fd\u0001\u0000\u0000\u0000\u060d\u0600\u0001\u0000\u0000\u0000"+
		"\u060d\u0603\u0001\u0000\u0000\u0000\u060d\u0606\u0001\u0000\u0000\u0000"+
		"\u060d\u0609\u0001\u0000\u0000\u0000\u060e\u0611\u0001\u0000\u0000\u0000"+
		"\u060f\u060d\u0001\u0000\u0000\u0000\u060f\u0610\u0001\u0000\u0000\u0000"+
		"\u0610\u00c1\u0001\u0000\u0000\u0000\u0611\u060f\u0001\u0000\u0000\u0000"+
		"\u0612\u0613\u0006a\uffff\uffff\u0000\u0613\u0615\u0005\u00d8\u0000\u0000"+
		"\u0614\u0616\u0003\u00fa}\u0000\u0615\u0614\u0001\u0000\u0000\u0000\u0616"+
		"\u0617\u0001\u0000\u0000\u0000\u0617\u0615\u0001\u0000\u0000\u0000\u0617"+
		"\u0618\u0001\u0000\u0000\u0000\u0618\u061b\u0001\u0000\u0000\u0000\u0619"+
		"\u061a\u0005\u0104\u0000\u0000\u061a\u061c\u0003\u00b8\\\u0000\u061b\u0619"+
		"\u0001\u0000\u0000\u0000\u061b\u061c\u0001\u0000\u0000\u0000\u061c\u061d"+
		"\u0001\u0000\u0000\u0000\u061d\u061e\u0005\u0105\u0000\u0000\u061e\u0682"+
		"\u0001\u0000\u0000\u0000\u061f\u0620\u0005\u00d8\u0000\u0000\u0620\u0622"+
		"\u0003\u00b8\\\u0000\u0621\u0623\u0003\u00fa}\u0000\u0622\u0621\u0001"+
		"\u0000\u0000\u0000\u0623\u0624\u0001\u0000\u0000\u0000\u0624\u0622\u0001"+
		"\u0000\u0000\u0000\u0624\u0625\u0001\u0000\u0000\u0000\u0625\u0628\u0001"+
		"\u0000\u0000\u0000\u0626\u0627\u0005\u0104\u0000\u0000\u0627\u0629\u0003"+
		"\u00b8\\\u0000\u0628\u0626\u0001\u0000\u0000\u0000\u0628\u0629\u0001\u0000"+
		"\u0000\u0000\u0629\u062a\u0001\u0000\u0000\u0000\u062a\u062b\u0005\u0105"+
		"\u0000\u0000\u062b\u0682\u0001\u0000\u0000\u0000\u062c\u062d\u0005\u00d9"+
		"\u0000\u0000\u062d\u062e\u0005\u01b4\u0000\u0000\u062e\u062f\u0003\u00b8"+
		"\\\u0000\u062f\u0630\u0005\u00c8\u0000\u0000\u0630\u0631\u0003\u00b6["+
		"\u0000\u0631\u0632\u0005\u01b5\u0000\u0000\u0632\u0682\u0001\u0000\u0000"+
		"\u0000\u0633\u0634\u0005/\u0000\u0000\u0634\u0635\u0005\u01b4\u0000\u0000"+
		"\u0635\u0638\u0003\u00b8\\\u0000\u0636\u0637\u0005?\u0000\u0000\u0637"+
		"\u0639\u0005\\\u0000\u0000\u0638\u0636\u0001\u0000\u0000\u0000\u0638\u0639"+
		"\u0001\u0000\u0000\u0000\u0639\u063a\u0001\u0000\u0000\u0000\u063a\u063b"+
		"\u0005\u01b5\u0000\u0000\u063b\u0682\u0001\u0000\u0000\u0000\u063c\u063d"+
		"\u0005N\u0000\u0000\u063d\u063e\u0005\u01b4\u0000\u0000\u063e\u0641\u0003"+
		"\u00b8\\\u0000\u063f\u0640\u0005?\u0000\u0000\u0640\u0642\u0005\\\u0000"+
		"\u0000\u0641\u063f\u0001\u0000\u0000\u0000\u0641\u0642\u0001\u0000\u0000"+
		"\u0000\u0642\u0643\u0001\u0000\u0000\u0000\u0643\u0644\u0005\u01b5\u0000"+
		"\u0000\u0644\u0682\u0001\u0000\u0000\u0000\u0645\u0646\u0005\u015b\u0000"+
		"\u0000\u0646\u0647\u0005\u01b4\u0000\u0000\u0647\u0648\u0003\u00c0`\u0000"+
		"\u0648\u0649\u0005\u011f\u0000\u0000\u0649\u064a\u0003\u00c0`\u0000\u064a"+
		"\u064b\u0005\u01b5\u0000\u0000\u064b\u0682\u0001\u0000\u0000\u0000\u064c"+
		"\u0682\u0003\u011a\u008d\u0000\u064d\u0682\u0005\u01c0\u0000\u0000\u064e"+
		"\u064f\u0003\u0106\u0083\u0000\u064f\u0650\u0005\u01b1\u0000\u0000\u0650"+
		"\u0651\u0005\u01c0\u0000\u0000\u0651\u0682\u0001\u0000\u0000\u0000\u0652"+
		"\u0653\u0005\u01b4\u0000\u0000\u0653\u0654\u0003\u0014\n\u0000\u0654\u0655"+
		"\u0005\u01b5\u0000\u0000\u0655\u0682\u0001\u0000\u0000\u0000\u0656\u0657"+
		"\u0003\u00ceg\u0000\u0657\u0663\u0005\u01b4\u0000\u0000\u0658\u065a\u0003"+
		"\u0124\u0092\u0000\u0659\u0658\u0001\u0000\u0000\u0000\u0659\u065a\u0001"+
		"\u0000\u0000\u0000\u065a\u065b\u0001\u0000\u0000\u0000\u065b\u0660\u0003"+
		"\u00d0h\u0000\u065c\u065d\u0005\u01b8\u0000\u0000\u065d\u065f\u0003\u00d0"+
		"h\u0000\u065e\u065c\u0001\u0000\u0000\u0000\u065f\u0662\u0001\u0000\u0000"+
		"\u0000\u0660\u065e\u0001\u0000\u0000\u0000\u0660\u0661\u0001\u0000\u0000"+
		"\u0000\u0661\u0664\u0001\u0000\u0000\u0000\u0662\u0660\u0001\u0000\u0000"+
		"\u0000\u0663\u0659\u0001\u0000\u0000\u0000\u0663\u0664\u0001\u0000\u0000"+
		"\u0000\u0664\u0665\u0001\u0000\u0000\u0000\u0665\u0666\u0005\u01b5\u0000"+
		"\u0000\u0666\u0682\u0001\u0000\u0000\u0000\u0667\u0668\u0003\u00ceg\u0000"+
		"\u0668\u0669\u0005\u01b4\u0000\u0000\u0669\u066a\u0003\u00d0h\u0000\u066a"+
		"\u066b\u0005\u0184\u0000\u0000\u066b\u066c\u0003\u00d0h\u0000\u066c\u066d"+
		"\u0005\u01b5\u0000\u0000\u066d\u0682\u0001\u0000\u0000\u0000\u066e\u066f"+
		"\u0003\u00ceg\u0000\u066f\u0671\u0005\u01b4\u0000\u0000\u0670\u0672\u0003"+
		"\u0124\u0092\u0000\u0671\u0670\u0001\u0000\u0000\u0000\u0671\u0672\u0001"+
		"\u0000\u0000\u0000\u0672\u0673\u0001\u0000\u0000\u0000\u0673\u0674\u0003"+
		"\u00d0h\u0000\u0674\u0676\u0005\u01b5\u0000\u0000\u0675\u0677\u0003\u00d2"+
		"i\u0000\u0676\u0675\u0001\u0000\u0000\u0000\u0676\u0677\u0001\u0000\u0000"+
		"\u0000\u0677\u0682\u0001\u0000\u0000\u0000\u0678\u0682\u0003\u00f2y\u0000"+
		"\u0679\u0682\u0003\u00d4j\u0000\u067a\u067b\u0005\u01b4\u0000\u0000\u067b"+
		"\u067c\u0003\u00b8\\\u0000\u067c\u067d\u0005\u01b5\u0000\u0000\u067d\u0682"+
		"\u0001\u0000\u0000\u0000\u067e\u067f\u0005\u01b4\u0000\u0000\u067f\u0682"+
		"\u0005\u01b5\u0000\u0000\u0680\u0682\u0003\u00c4b\u0000\u0681\u0612\u0001"+
		"\u0000\u0000\u0000\u0681\u061f\u0001\u0000\u0000\u0000\u0681\u062c\u0001"+
		"\u0000\u0000\u0000\u0681\u0633\u0001\u0000\u0000\u0000\u0681\u063c\u0001"+
		"\u0000\u0000\u0000\u0681\u0645\u0001\u0000\u0000\u0000\u0681\u064c\u0001"+
		"\u0000\u0000\u0000\u0681\u064d\u0001\u0000\u0000\u0000\u0681\u064e\u0001"+
		"\u0000\u0000\u0000\u0681\u0652\u0001\u0000\u0000\u0000\u0681\u0656\u0001"+
		"\u0000\u0000\u0000\u0681\u0667\u0001\u0000\u0000\u0000\u0681\u066e\u0001"+
		"\u0000\u0000\u0000\u0681\u0678\u0001\u0000\u0000\u0000\u0681\u0679\u0001"+
		"\u0000\u0000\u0000\u0681\u067a\u0001\u0000\u0000\u0000\u0681\u067e\u0001"+
		"\u0000\u0000\u0000\u0681\u0680\u0001\u0000\u0000\u0000\u0682\u068a\u0001"+
		"\u0000\u0000\u0000\u0683\u0684\n\u0006\u0000\u0000\u0684\u0685\u0005\u01b2"+
		"\u0000\u0000\u0685\u0686\u0003\u00c0`\u0000\u0686\u0687\u0005\u01b3\u0000"+
		"\u0000\u0687\u0689\u0001\u0000\u0000\u0000\u0688\u0683\u0001\u0000\u0000"+
		"\u0000\u0689\u068c\u0001\u0000\u0000\u0000\u068a\u0688\u0001\u0000\u0000"+
		"\u0000\u068a\u068b\u0001\u0000\u0000\u0000\u068b\u00c3\u0001\u0000\u0000"+
		"\u0000\u068c\u068a\u0001\u0000\u0000\u0000\u068d\u0691\u0003\u00c6c\u0000"+
		"\u068e\u0691\u0003\u00c8d\u0000\u068f\u0691\u0003\u00cae\u0000\u0690\u068d"+
		"\u0001\u0000\u0000\u0000\u0690\u068e\u0001\u0000\u0000\u0000\u0690\u068f"+
		"\u0001\u0000\u0000\u0000\u0691\u00c5\u0001\u0000\u0000\u0000\u0692\u0693"+
		"\u0005\u00c7\u0000\u0000\u0693\u0694\u0005\u01b2\u0000\u0000\u0694\u0699"+
		"\u0003\u00ccf\u0000\u0695\u0696\u0005\u01b8\u0000\u0000\u0696\u0698\u0003"+
		"\u00ccf\u0000\u0697\u0695\u0001\u0000\u0000\u0000\u0698\u069b\u0001\u0000"+
		"\u0000\u0000\u0699\u0697\u0001\u0000\u0000\u0000\u0699\u069a\u0001\u0000"+
		"\u0000\u0000\u069a\u069c\u0001\u0000\u0000\u0000\u069b\u0699\u0001\u0000"+
		"\u0000\u0000\u069c\u069d\u0005\u01b3\u0000\u0000\u069d\u00c7\u0001\u0000"+
		"\u0000\u0000\u069e\u069f\u0005\u0167\u0000\u0000\u069f\u06a0\u0005\u01b4"+
		"\u0000\u0000\u06a0\u06a5\u0003\u00ccf\u0000\u06a1\u06a2\u0005\u01b8\u0000"+
		"\u0000\u06a2\u06a4\u0003\u00ccf\u0000\u06a3\u06a1\u0001\u0000\u0000\u0000"+
		"\u06a4\u06a7\u0001\u0000\u0000\u0000\u06a5\u06a3\u0001\u0000\u0000\u0000"+
		"\u06a5\u06a6\u0001\u0000\u0000\u0000\u06a6\u06a8\u0001\u0000\u0000\u0000"+
		"\u06a7\u06a5\u0001\u0000\u0000\u0000\u06a8\u06a9\u0005\u01b5\u0000\u0000"+
		"\u06a9\u00c9\u0001\u0000\u0000\u0000\u06aa\u06ab\u0005R\u0000\u0000\u06ab"+
		"\u06ac\u0005\u01b2\u0000\u0000\u06ac\u06ad\u0003\u00ccf\u0000\u06ad\u06ae"+
		"\u0005\u01b8\u0000\u0000\u06ae\u06af\u0003\u00ccf\u0000\u06af\u06b0\u0005"+
		"\u01b3\u0000\u0000\u06b0\u00cb\u0001\u0000\u0000\u0000\u06b1\u06b4\u0003"+
		"\u00e6s\u0000\u06b2\u06b4\u0003\u00c4b\u0000\u06b3\u06b1\u0001\u0000\u0000"+
		"\u0000\u06b3\u06b2\u0001\u0000\u0000\u0000\u06b4\u00cd\u0001\u0000\u0000"+
		"\u0000\u06b5\u06b9\u0003\u012c\u0096\u0000\u06b6\u06b9\u0003\u012e\u0097"+
		"\u0000\u06b7\u06b9\u0003\u0106\u0083\u0000\u06b8\u06b5\u0001\u0000\u0000"+
		"\u0000\u06b8\u06b6\u0001\u0000\u0000\u0000\u06b8\u06b7\u0001\u0000\u0000"+
		"\u0000\u06b9\u00cf\u0001\u0000\u0000\u0000\u06ba\u06c0\u0003\u012a\u0095"+
		"\u0000\u06bb\u06c0\u0003\u0128\u0094\u0000\u06bc\u06c0\u0003\u0126\u0093"+
		"\u0000\u06bd\u06c0\u0003\u00b8\\\u0000\u06be\u06c0\u0003\u00d2i\u0000"+
		"\u06bf\u06ba\u0001\u0000\u0000\u0000\u06bf\u06bb\u0001\u0000\u0000\u0000"+
		"\u06bf\u06bc\u0001\u0000\u0000\u0000\u06bf\u06bd\u0001\u0000\u0000\u0000"+
		"\u06bf\u06be\u0001\u0000\u0000\u0000\u06c0\u00d1\u0001\u0000\u0000\u0000"+
		"\u06c1\u06c2\u0005,\u0000\u0000\u06c2\u06c3\u0005\u01b4\u0000\u0000\u06c3"+
		"\u06c4\u0005\u0196\u0000\u0000\u06c4\u06c5\u0003\u00ba]\u0000\u06c5\u06c6"+
		"\u0005\u01b5\u0000\u0000\u06c6\u00d3\u0001\u0000\u0000\u0000\u06c7\u06c8"+
		"\u0003\u0106\u0083\u0000\u06c8\u00d5\u0001\u0000\u0000\u0000\u06c9\u06ca"+
		"\u0003\u00f2y\u0000\u06ca\u00d7\u0001\u0000\u0000\u0000\u06cb\u06ce\u0003"+
		"\u00f2y\u0000\u06cc\u06ce\u0003\u00d4j\u0000\u06cd\u06cb\u0001\u0000\u0000"+
		"\u0000\u06cd\u06cc\u0001\u0000\u0000\u0000\u06ce\u00d9\u0001\u0000\u0000"+
		"\u0000\u06cf\u06d2\u0005\u0127\u0000\u0000\u06d0\u06d3\u0003\u00dcn\u0000"+
		"\u06d1\u06d3\u0003\u00e0p\u0000\u06d2\u06d0\u0001\u0000\u0000\u0000\u06d2"+
		"\u06d1\u0001\u0000\u0000\u0000\u06d2\u06d3\u0001\u0000\u0000\u0000\u06d3"+
		"\u00db\u0001\u0000\u0000\u0000\u06d4\u06d6\u0003\u00deo\u0000\u06d5\u06d7"+
		"\u0003\u00e2q\u0000\u06d6\u06d5\u0001\u0000\u0000\u0000\u06d6\u06d7\u0001"+
		"\u0000\u0000\u0000\u06d7\u00dd\u0001\u0000\u0000\u0000\u06d8\u06d9\u0003"+
		"\u00e4r\u0000\u06d9\u06da\u0003\u0128\u0094\u0000\u06da\u06dc\u0001\u0000"+
		"\u0000\u0000\u06db\u06d8\u0001\u0000\u0000\u0000\u06dc\u06dd\u0001\u0000"+
		"\u0000\u0000\u06dd\u06db\u0001\u0000\u0000\u0000\u06dd\u06de\u0001\u0000"+
		"\u0000\u0000\u06de\u00df\u0001\u0000\u0000\u0000\u06df\u06e2\u0003\u00e2"+
		"q\u0000\u06e0\u06e3\u0003\u00deo\u0000\u06e1\u06e3\u0003\u00e2q\u0000"+
		"\u06e2\u06e0\u0001\u0000\u0000\u0000\u06e2\u06e1\u0001\u0000\u0000\u0000"+
		"\u06e2\u06e3\u0001\u0000\u0000\u0000\u06e3\u00e1\u0001\u0000\u0000\u0000"+
		"\u06e4\u06e5\u0003\u00e4r\u0000\u06e5\u06e6\u0003\u0128\u0094\u0000\u06e6"+
		"\u06e7\u0005\u0184\u0000\u0000\u06e7\u06e8\u0003\u0128\u0094\u0000\u06e8"+
		"\u00e3\u0001\u0000\u0000\u0000\u06e9\u06eb\u0007\u0017\u0000\u0000\u06ea"+
		"\u06e9\u0001\u0000\u0000\u0000\u06ea\u06eb\u0001\u0000\u0000\u0000\u06eb"+
		"\u06ec\u0001\u0000\u0000\u0000\u06ec\u06ef\u0007\u0018\u0000\u0000\u06ed"+
		"\u06ef\u0005\u01ca\u0000\u0000\u06ee\u06ea\u0001\u0000\u0000\u0000\u06ee"+
		"\u06ed\u0001\u0000\u0000\u0000\u06ef\u00e5\u0001\u0000\u0000\u0000\u06f0"+
		"\u06f2\u0005\u00c8\u0000\u0000\u06f1\u06f0\u0001\u0000\u0000\u0000\u06f1"+
		"\u06f2\u0001\u0000\u0000\u0000\u06f2\u06f3\u0001\u0000\u0000\u0000\u06f3"+
		"\u06f5\u0003\u00f2y\u0000\u06f4\u06f6\u0003\u00eew\u0000\u06f5\u06f4\u0001"+
		"\u0000\u0000\u0000\u06f5\u06f6\u0001\u0000\u0000\u0000\u06f6\u00e7\u0001"+
		"\u0000\u0000\u0000\u06f7\u06f9\u0005\u00c8\u0000\u0000\u06f8\u06f7\u0001"+
		"\u0000\u0000\u0000\u06f8\u06f9\u0001\u0000\u0000\u0000\u06f9\u06fa\u0001"+
		"\u0000\u0000\u0000\u06fa\u06fc\u0003\u00f2y\u0000\u06fb\u06fd\u0003\u00ee"+
		"w\u0000\u06fc\u06fb\u0001\u0000\u0000\u0000\u06fc\u06fd\u0001\u0000\u0000"+
		"\u0000\u06fd\u00e9\u0001\u0000\u0000\u0000\u06fe\u06ff\u0003\u00f2y\u0000"+
		"\u06ff\u0700\u0003\u00ecv\u0000\u0700\u00eb\u0001\u0000\u0000\u0000\u0701"+
		"\u0702\u0005\u013c\u0000\u0000\u0702\u0704\u0003\u00f2y\u0000\u0703\u0701"+
		"\u0001\u0000\u0000\u0000\u0704\u0705\u0001\u0000\u0000\u0000\u0705\u0703"+
		"\u0001\u0000\u0000\u0000\u0705\u0706\u0001\u0000\u0000\u0000\u0706\u0709"+
		"\u0001\u0000\u0000\u0000\u0707\u0709\u0001\u0000\u0000\u0000\u0708\u0703"+
		"\u0001\u0000\u0000\u0000\u0708\u0707\u0001\u0000\u0000\u0000\u0709\u00ed"+
		"\u0001\u0000\u0000\u0000\u070a\u070b\u0005\u01b4\u0000\u0000\u070b\u070c"+
		"\u0003\u00f0x\u0000\u070c\u070d\u0005\u01b5\u0000\u0000\u070d\u00ef\u0001"+
		"\u0000\u0000\u0000\u070e\u0713\u0003\u00f2y\u0000\u070f\u0710\u0005\u01b8"+
		"\u0000\u0000\u0710\u0712\u0003\u00f2y\u0000\u0711\u070f\u0001\u0000\u0000"+
		"\u0000\u0712\u0715\u0001\u0000\u0000\u0000\u0713\u0711\u0001\u0000\u0000"+
		"\u0000\u0713\u0714\u0001\u0000\u0000\u0000\u0714\u00f1\u0001\u0000\u0000"+
		"\u0000\u0715\u0713\u0001\u0000\u0000\u0000\u0716\u071b\u0003\u00f6{\u0000"+
		"\u0717\u071b\u0003\u00f8|\u0000\u0718\u071b\u0003\u012e\u0097\u0000\u0719"+
		"\u071b\u0003\u00f4z\u0000\u071a\u0716\u0001\u0000\u0000\u0000\u071a\u0717"+
		"\u0001\u0000\u0000\u0000\u071a\u0718\u0001\u0000\u0000\u0000\u071a\u0719"+
		"\u0001\u0000\u0000\u0000\u071b\u00f3\u0001\u0000\u0000\u0000\u071c\u071d"+
		"\u0005\u01bb\u0000\u0000\u071d\u071e\u0005\u01b6\u0000\u0000\u071e\u071f"+
		"\u0003\u00f6{\u0000\u071f\u0720\u0005\u01b7\u0000\u0000\u0720\u00f5\u0001"+
		"\u0000\u0000\u0000\u0721\u0722\u0007\u0019\u0000\u0000\u0722\u00f7\u0001"+
		"\u0000\u0000\u0000\u0723\u0724\u0005\u01ca\u0000\u0000\u0724\u00f9\u0001"+
		"\u0000\u0000\u0000\u0725\u0726\u0005\u0195\u0000\u0000\u0726\u0727\u0003"+
		"\u00b8\\\u0000\u0727\u0728\u0005\u017d\u0000\u0000\u0728\u0729\u0003\u00b8"+
		"\\\u0000\u0729\u00fb\u0001\u0000\u0000\u0000\u072a\u072b\u0003\u0106\u0083"+
		"\u0000\u072b\u00fd\u0001\u0000\u0000\u0000\u072c\u072d\u0003\u0106\u0083"+
		"\u0000\u072d\u00ff\u0001\u0000\u0000\u0000\u072e\u072f\u0003\u0106\u0083"+
		"\u0000\u072f\u0101\u0001\u0000\u0000\u0000\u0730\u0731\u0003\u0106\u0083"+
		"\u0000\u0731\u0103\u0001\u0000\u0000\u0000\u0732\u0733\u0003\u0106\u0083"+
		"\u0000\u0733\u0105\u0001\u0000\u0000\u0000\u0734\u0739\u0003\u00f2y\u0000"+
		"\u0735\u0736\u0005\u01b1\u0000\u0000\u0736\u0738\u0003\u00f2y\u0000\u0737"+
		"\u0735\u0001\u0000\u0000\u0000\u0738\u073b\u0001\u0000\u0000\u0000\u0739"+
		"\u0737\u0001\u0000\u0000\u0000\u0739\u073a\u0001\u0000\u0000\u0000\u073a"+
		"\u0107\u0001\u0000\u0000\u0000\u073b\u0739\u0001\u0000\u0000\u0000\u073c"+
		"\u073d\u0005\u0198\u0000\u0000\u073d\u073e\u0003\u0110\u0088\u0000\u073e"+
		"\u0109\u0001\u0000\u0000\u0000\u073f\u0740\u0005>\u0000\u0000\u0740\u0741"+
		"\u0005\u0146\u0000\u0000\u0741\u0742\u0005\u010a\u0000\u0000\u0742\u010b"+
		"\u0001\u0000\u0000\u0000\u0743\u0744\u0005>\u0000\u0000\u0744\u0745\u0005"+
		"\u010a\u0000\u0000\u0745\u010d\u0001\u0000\u0000\u0000\u0746\u0749\u0005"+
		"\u01b4\u0000\u0000\u0747\u074a\u0003\u0112\u0089\u0000\u0748\u074a\u0003"+
		"\u0114\u008a\u0000\u0749\u0747\u0001\u0000\u0000\u0000\u0749\u0748\u0001"+
		"\u0000\u0000\u0000\u074a\u0752\u0001\u0000\u0000\u0000\u074b\u074e\u0005"+
		"\u01b8\u0000\u0000\u074c\u074f\u0003\u0112\u0089\u0000\u074d\u074f\u0003"+
		"\u0114\u008a\u0000\u074e\u074c\u0001\u0000\u0000\u0000\u074e\u074d\u0001"+
		"\u0000\u0000\u0000\u074f\u0751\u0001\u0000\u0000\u0000\u0750\u074b\u0001"+
		"\u0000\u0000\u0000\u0751\u0754\u0001\u0000\u0000\u0000\u0752\u0750\u0001"+
		"\u0000\u0000\u0000\u0752\u0753\u0001\u0000\u0000\u0000\u0753\u0755\u0001"+
		"\u0000\u0000\u0000\u0754\u0752\u0001\u0000\u0000\u0000\u0755\u0756\u0005"+
		"\u01b5\u0000\u0000\u0756\u010f\u0001\u0000\u0000\u0000\u0757\u0758\u0005"+
		"\u01b4\u0000\u0000\u0758\u075d\u0003\u0112\u0089\u0000\u0759\u075a\u0005"+
		"\u01b8\u0000\u0000\u075a\u075c\u0003\u0112\u0089\u0000\u075b\u0759\u0001"+
		"\u0000\u0000\u0000\u075c\u075f\u0001\u0000\u0000\u0000\u075d\u075b\u0001"+
		"\u0000\u0000\u0000\u075d\u075e\u0001\u0000\u0000\u0000\u075e\u0760\u0001"+
		"\u0000\u0000\u0000\u075f\u075d\u0001\u0000\u0000\u0000\u0760\u0761\u0005"+
		"\u01b5\u0000\u0000\u0761\u0111\u0001\u0000\u0000\u0000\u0762\u0763\u0003"+
		"\u0114\u008a\u0000\u0763\u0764\u0005\u01ad\u0000\u0000\u0764\u0765\u0003"+
		"\u0116\u008b\u0000\u0765\u0113\u0001\u0000\u0000\u0000\u0766\u0771\u0003"+
		"\u00f2y\u0000\u0767\u076c\u0003\u00d4j\u0000\u0768\u0769\u0005\u01c2\u0000"+
		"\u0000\u0769\u076b\u0003\u00d4j\u0000\u076a\u0768\u0001\u0000\u0000\u0000"+
		"\u076b\u076e\u0001\u0000\u0000\u0000\u076c\u076a\u0001\u0000\u0000\u0000"+
		"\u076c\u076d\u0001\u0000\u0000\u0000\u076d\u0771\u0001\u0000\u0000\u0000"+
		"\u076e\u076c\u0001\u0000\u0000\u0000\u076f\u0771\u0005\u01ca\u0000\u0000"+
		"\u0770\u0766\u0001\u0000\u0000\u0000\u0770\u0767\u0001\u0000\u0000\u0000"+
		"\u0770\u076f\u0001\u0000\u0000\u0000\u0771\u0115\u0001\u0000\u0000\u0000"+
		"\u0772\u0778\u0005\u01cb\u0000\u0000\u0773\u0778\u0005\u01cc\u0000\u0000"+
		"\u0774\u0778\u0003\u0122\u0091\u0000\u0775\u0778\u0005\u01ca\u0000\u0000"+
		"\u0776\u0778\u0003\u00f6{\u0000\u0777\u0772\u0001\u0000\u0000\u0000\u0777"+
		"\u0773\u0001\u0000\u0000\u0000\u0777\u0774\u0001\u0000\u0000\u0000\u0777"+
		"\u0775\u0001\u0000\u0000\u0000\u0777\u0776\u0001\u0000\u0000\u0000\u0778"+
		"\u0117\u0001\u0000\u0000\u0000\u0779\u0788\u0005\u01ad\u0000\u0000\u077a"+
		"\u0788\u0005\u01ae\u0000\u0000\u077b\u0788\u0005\u01af\u0000\u0000\u077c"+
		"\u077d\u0005\u01af\u0000\u0000\u077d\u0788\u0005\u01ad\u0000\u0000\u077e"+
		"\u077f\u0005\u01ae\u0000\u0000\u077f\u0788\u0005\u01ad\u0000\u0000\u0780"+
		"\u0781\u0005\u01af\u0000\u0000\u0781\u0788\u0005\u01ae\u0000\u0000\u0782"+
		"\u0783\u0005\u01b0\u0000\u0000\u0783\u0788\u0005\u01ad\u0000\u0000\u0784"+
		"\u0785\u0005\u01af\u0000\u0000\u0785\u0786\u0005\u01ad\u0000\u0000\u0786"+
		"\u0788\u0005\u01ae\u0000\u0000\u0787\u0779\u0001\u0000\u0000\u0000\u0787"+
		"\u077a\u0001\u0000\u0000\u0000\u0787\u077b\u0001\u0000\u0000\u0000\u0787"+
		"\u077c\u0001\u0000\u0000\u0000\u0787\u077e\u0001\u0000\u0000\u0000\u0787"+
		"\u0780\u0001\u0000\u0000\u0000\u0787\u0782\u0001\u0000\u0000\u0000\u0787"+
		"\u0784\u0001\u0000\u0000\u0000\u0788\u0119\u0001\u0000\u0000\u0000\u0789"+
		"\u0797\u0003\u00dam\u0000\u078a\u0797\u0003\u011c\u008e\u0000\u078b\u0797"+
		"\u0003\u011e\u008f\u0000\u078c\u078e\u0005\u01c2\u0000\u0000\u078d\u078c"+
		"\u0001\u0000\u0000\u0000\u078d\u078e\u0001\u0000\u0000\u0000\u078e\u078f"+
		"\u0001\u0000\u0000\u0000\u078f\u0797\u0003\u0120\u0090\u0000\u0790\u0797"+
		"\u0003\u0122\u0091\u0000\u0791\u0797\u0005\u01cc\u0000\u0000\u0792\u0794"+
		"\u0005\u0146\u0000\u0000\u0793\u0792\u0001\u0000\u0000\u0000\u0793\u0794"+
		"\u0001\u0000\u0000\u0000\u0794\u0795\u0001\u0000\u0000\u0000\u0795\u0797"+
		"\u0005\u0149\u0000\u0000\u0796\u0789\u0001\u0000\u0000\u0000\u0796\u078a"+
		"\u0001\u0000\u0000\u0000\u0796\u078b\u0001\u0000\u0000\u0000\u0796\u078d"+
		"\u0001\u0000\u0000\u0000\u0796\u0790\u0001\u0000\u0000\u0000\u0796\u0791"+
		"\u0001\u0000\u0000\u0000\u0796\u0793\u0001\u0000\u0000\u0000\u0797\u011b"+
		"\u0001\u0000\u0000\u0000\u0798\u0799\u0003\u0126\u0093\u0000\u0799\u079a"+
		"\u0003\u011e\u008f\u0000\u079a\u011d\u0001\u0000\u0000\u0000\u079b\u079c"+
		"\u0005\u01ca\u0000\u0000\u079c\u011f\u0001\u0000\u0000\u0000\u079d\u079e"+
		"\u0005\u01cb\u0000\u0000\u079e\u0121\u0001\u0000\u0000\u0000\u079f\u07a0"+
		"\u0007\u001a\u0000\u0000\u07a0\u0123\u0001\u0000\u0000\u0000\u07a1\u07a2"+
		"\u0007\u001b\u0000\u0000\u07a2\u0125\u0001\u0000\u0000\u0000\u07a3\u07a4"+
		"\u0007\u001c\u0000\u0000\u07a4\u0127\u0001\u0000\u0000\u0000\u07a5\u07a6"+
		"\u0007\u001d\u0000\u0000\u07a6\u0129\u0001\u0000\u0000\u0000\u07a7\u07a8"+
		"\u0007\u001e\u0000\u0000\u07a8\u012b\u0001\u0000\u0000\u0000\u07a9\u07aa"+
		"\u0007\u001f\u0000\u0000\u07aa\u012d\u0001\u0000\u0000\u0000\u07ab\u07ac"+
		"\u0007 \u0000\u0000\u07ac\u012f\u0001\u0000\u0000\u0000\u07ad\u07b6\u0003"+
		"\u013e\u009f\u0000\u07ae\u07b3\u0003\u00b8\\\u0000\u07af\u07b1\u0005\u00c8"+
		"\u0000\u0000\u07b0\u07af\u0001\u0000\u0000\u0000\u07b0\u07b1\u0001\u0000"+
		"\u0000\u0000\u07b1\u07b2\u0001\u0000\u0000\u0000\u07b2\u07b4\u0003\u00b8"+
		"\\\u0000\u07b3\u07b0\u0001\u0000\u0000\u0000\u07b3\u07b4\u0001\u0000\u0000"+
		"\u0000\u07b4\u07b6\u0001\u0000\u0000\u0000\u07b5\u07ad\u0001\u0000\u0000"+
		"\u0000\u07b5\u07ae\u0001\u0000\u0000\u0000\u07b6\u0131\u0001\u0000\u0000"+
		"\u0000\u07b7\u07b8\u0003\u0134\u009a\u0000\u07b8\u07ba\u0003\u001e\u000f"+
		"\u0000\u07b9\u07bb\u0003B!\u0000\u07ba\u07b9\u0001\u0000\u0000\u0000\u07ba"+
		"\u07bb\u0001\u0000\u0000\u0000\u07bb\u07bd\u0001\u0000\u0000\u0000\u07bc"+
		"\u07be\u0003\u001c\u000e\u0000\u07bd\u07bc\u0001\u0000\u0000\u0000\u07bd"+
		"\u07be\u0001\u0000\u0000\u0000\u07be\u07c0\u0001\u0000\u0000\u0000\u07bf"+
		"\u07c1\u0003R)\u0000\u07c0\u07bf\u0001\u0000\u0000\u0000\u07c0\u07c1\u0001"+
		"\u0000\u0000\u0000\u07c1\u07c3\u0001\u0000\u0000\u0000\u07c2\u07c4\u0003"+
		"T*\u0000\u07c3\u07c2\u0001\u0000\u0000\u0000\u07c3\u07c4\u0001\u0000\u0000"+
		"\u0000\u07c4\u07ca\u0001\u0000\u0000\u0000\u07c5\u07c6\u0003\u0134\u009a"+
		"\u0000\u07c6\u07c7\u0003\u001e\u000f\u0000\u07c7\u07c8\u0003Z-\u0000\u07c8"+
		"\u07ca\u0001\u0000\u0000\u0000\u07c9\u07b7\u0001\u0000\u0000\u0000\u07c9"+
		"\u07c5\u0001\u0000\u0000\u0000\u07ca\u0133\u0001\u0000\u0000\u0000\u07cb"+
		"\u07d5\u0005\u016b\u0000\u0000\u07cc\u07d6\u0005\u01c0\u0000\u0000\u07cd"+
		"\u07d2\u0003\u0130\u0098\u0000\u07ce\u07cf\u0005\u01b8\u0000\u0000\u07cf"+
		"\u07d1\u0003\u0130\u0098\u0000\u07d0\u07ce\u0001\u0000\u0000\u0000\u07d1"+
		"\u07d4\u0001\u0000\u0000\u0000\u07d2\u07d0\u0001\u0000\u0000\u0000\u07d2"+
		"\u07d3\u0001\u0000\u0000\u0000\u07d3\u07d6\u0001\u0000\u0000\u0000\u07d4"+
		"\u07d2\u0001\u0000\u0000\u0000\u07d5\u07cc\u0001\u0000\u0000\u0000\u07d5"+
		"\u07cd\u0001\u0000\u0000\u0000\u07d6\u0135\u0001\u0000\u0000\u0000\u07d7"+
		"\u07d9\u0005\u0109\u0000\u0000\u07d8\u07d7\u0001\u0000\u0000\u0000\u07d8"+
		"\u07d9\u0001\u0000\u0000\u0000\u07d9\u07da\u0001\u0000\u0000\u0000\u07da"+
		"\u07db\u0003\u0010\b\u0000\u07db\u0137\u0001\u0000\u0000\u0000\u07dc\u07dd"+
		"\u0003\"\u0011\u0000\u07dd\u0139\u0001\u0000\u0000\u0000\u07de\u07df\u0006"+
		"\u009d\uffff\uffff\u0000\u07df\u07e4\u0003 \u0010\u0000\u07e0\u07e1\u0005"+
		"\u01b8\u0000\u0000\u07e1\u07e3\u0003 \u0010\u0000\u07e2\u07e0\u0001\u0000"+
		"\u0000\u0000\u07e3\u07e6\u0001\u0000\u0000\u0000\u07e4\u07e2\u0001\u0000"+
		"\u0000\u0000\u07e4\u07e5\u0001\u0000\u0000\u0000\u07e5\u07ea\u0001\u0000"+
		"\u0000\u0000\u07e6\u07e4\u0001\u0000\u0000\u0000\u07e7\u07ea\u0003*\u0015"+
		"\u0000\u07e8\u07ea\u0003,\u0016\u0000\u07e9\u07de\u0001\u0000\u0000\u0000"+
		"\u07e9\u07e7\u0001\u0000\u0000\u0000\u07e9\u07e8\u0001\u0000\u0000\u0000"+
		"\u07ea\u080a\u0001\u0000\u0000\u0000\u07eb\u07ec\n\u0003\u0000\u0000\u07ec"+
		"\u07ed\u0005\u00ec\u0000\u0000\u07ed\u07ee\u0005\u012a\u0000\u0000\u07ee"+
		"\u0809\u0003\u013a\u009d\u0004\u07ef\u07f1\n\u0004\u0000\u0000\u07f0\u07f2"+
		"\u0005\u0142\u0000\u0000\u07f1\u07f0\u0001\u0000\u0000\u0000\u07f1\u07f2"+
		"\u0001\u0000\u0000\u0000\u07f2\u07f4\u0001\u0000\u0000\u0000\u07f3\u07f5"+
		"\u0003\u0138\u009c\u0000\u07f4\u07f3\u0001\u0000\u0000\u0000\u07f4\u07f5"+
		"\u0001\u0000\u0000\u0000\u07f5\u07f7\u0001\u0000\u0000\u0000\u07f6\u07f8"+
		"\u0005\u0152\u0000\u0000\u07f7\u07f6\u0001\u0000\u0000\u0000\u07f7\u07f8"+
		"\u0001\u0000\u0000\u0000\u07f8\u07fa\u0001\u0000\u0000\u0000\u07f9\u07fb"+
		"\u0005\u008f\u0000\u0000\u07fa\u07f9\u0001\u0000\u0000\u0000\u07fa\u07fb"+
		"\u0001\u0000\u0000\u0000\u07fb\u07fc\u0001\u0000\u0000\u0000\u07fc\u07fd"+
		"\u0005\u012a\u0000\u0000\u07fd\u07ff\u0003\u013a\u009d\u0000\u07fe\u0800"+
		"\u0003@ \u0000\u07ff\u07fe\u0001\u0000\u0000\u0000\u07ff\u0800\u0001\u0000"+
		"\u0000\u0000\u0800\u0805\u0001\u0000\u0000\u0000\u0801\u0802\u0005\u01b8"+
		"\u0000\u0000\u0802\u0804\u0003 \u0010\u0000\u0803\u0801\u0001\u0000\u0000"+
		"\u0000\u0804\u0807\u0001\u0000\u0000\u0000\u0805\u0803\u0001\u0000\u0000"+
		"\u0000\u0805\u0806\u0001\u0000\u0000\u0000\u0806\u0809\u0001\u0000\u0000"+
		"\u0000\u0807\u0805\u0001\u0000\u0000\u0000\u0808\u07eb\u0001\u0000\u0000"+
		"\u0000\u0808\u07ef\u0001\u0000\u0000\u0000\u0809\u080c\u0001\u0000\u0000"+
		"\u0000\u080a\u0808\u0001\u0000\u0000\u0000\u080a\u080b\u0001\u0000\u0000"+
		"\u0000\u080b\u013b\u0001\u0000\u0000\u0000\u080c\u080a\u0001\u0000\u0000"+
		"\u0000\u080d\u080e\u0003\u000e\u0007\u0000\u080e\u013d\u0001\u0000\u0000"+
		"\u0000\u080f\u0810\u0003\u00c2a\u0000\u0810\u0811\u0005\u0153\u0000\u0000"+
		"\u0811\u0813\u0003X,\u0000\u0812\u0814\u0005\u00c8\u0000\u0000\u0813\u0812"+
		"\u0001\u0000\u0000\u0000\u0813\u0814\u0001\u0000\u0000\u0000\u0814\u0815"+
		"\u0001\u0000\u0000\u0000\u0815\u0816\u0003\u00f2y\u0000\u0816\u0820\u0001"+
		"\u0000\u0000\u0000\u0817\u0818\u0003\u00c2a\u0000\u0818\u0819\u0005\u0153"+
		"\u0000\u0000\u0819\u081b\u0003\u00eau\u0000\u081a\u081c\u0005\u00c8\u0000"+
		"\u0000\u081b\u081a\u0001\u0000\u0000\u0000\u081b\u081c\u0001\u0000\u0000"+
		"\u0000\u081c\u081d\u0001\u0000\u0000\u0000\u081d\u081e\u0003\u00f2y\u0000"+
		"\u081e\u0820\u0001\u0000\u0000\u0000\u081f\u080f\u0001\u0000\u0000\u0000"+
		"\u081f\u0817\u0001\u0000\u0000\u0000\u0820\u013f\u0001\u0000\u0000\u0000"+
		"\u00fc\u0145\u0147\u0150\u015a\u015e\u0162\u016b\u0170\u0174\u0178\u017c"+
		"\u017f\u0182\u0185\u0188\u018e\u0190\u0194\u0197\u019b\u01a3\u01a6\u01a9"+
		"\u01ae\u01b2\u01b5\u01b9\u01c2\u01cc\u01d1\u01e1\u01e5\u01ec\u01f1\u01f5"+
		"\u01f9\u0205\u020c\u021c\u0229\u0233\u023d\u024f\u0257\u025d\u0264\u026d"+
		"\u0270\u027a\u0280\u0287\u028a\u028f\u0298\u029b\u02a5\u02ab\u02b2\u02b5"+
		"\u02ba\u02c6\u02d0\u02d3\u02d8\u02db\u02e0\u02e3\u02f8\u030a\u030f\u031e"+
		"\u032a\u032f\u0338\u0356\u035e\u0362\u0365\u0368\u036f\u0372\u0375\u0378"+
		"\u037b\u037e\u0383\u0386\u038f\u0394\u0398\u039d\u03a6\u03b9\u03c1\u03c9"+
		"\u03cd\u03d1\u03db\u03f5\u03fd\u0409\u0424\u0431\u0436\u043a\u0442\u0446"+
		"\u044b\u0451\u0457\u045c\u0462\u0468\u046e\u0473\u0478\u047b\u0489\u048e"+
		"\u0490\u0494\u04a4\u04ad\u04ba\u04c2\u04cc\u04e1\u04e8\u04ee\u04f1\u04f4"+
		"\u04fe\u0501\u0509\u050d\u0515\u051f\u0522\u0527\u052b\u052f\u0533\u0537"+
		"\u053b\u053f\u0543\u0547\u054b\u054f\u0553\u0557\u055b\u055f\u0563\u0567"+
		"\u056b\u056d\u057b\u057d\u0588\u058b\u058d\u0591\u0595\u059c\u05a5\u05ab"+
		"\u05b8\u05bf\u05c4\u05ca\u05d1\u05d3\u05d6\u05e2\u05e7\u05ea\u05f0\u05f2"+
		"\u05f8\u060d\u060f\u0617\u061b\u0624\u0628\u0638\u0641\u0659\u0660\u0663"+
		"\u0671\u0676\u0681\u068a\u0690\u0699\u06a5\u06b3\u06b8\u06bf\u06cd\u06d2"+
		"\u06d6\u06dd\u06e2\u06ea\u06ee\u06f1\u06f5\u06f8\u06fc\u0705\u0708\u0713"+
		"\u071a\u0739\u0749\u074e\u0752\u075d\u076c\u0770\u0777\u0787\u078d\u0793"+
		"\u0796\u07b0\u07b3\u07b5\u07ba\u07bd\u07c0\u07c3\u07c9\u07d2\u07d5\u07d8"+
		"\u07e4\u07e9\u07f1\u07f4\u07f7\u07fa\u07ff\u0805\u0808\u080a\u0813\u081b"+
		"\u081f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
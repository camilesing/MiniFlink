grammar FQL;

@header {
package com.dogeking;
}

statements
    : sqlStatements EOF
    ;


sqlStatements
    : ( sqlStatement| emptyStatement)*
    ;

sqlStatement
    :
    ddlStatement SEMICOLON #ddlPart
    | dmlStatement SEMICOLON #dmlPart
    ;

emptyStatement
    : SEMICOLON
    ;

ddlStatement
    : createStatement
    ;

createStatement
    : createTable;


dmlStatement
    : queryStatement | insertStatement
    ;

// Create statements

simpleCreateTable
    : KW_CREATE KW_TEMPORARY? KW_TABLE ifNotExists? tablePathCreate
    LR_BRACKET
        columnOptionDefinition (COMMA columnOptionDefinition)*
        (COMMA watermarkDefinition)?
        (COMMA tableConstraint)?
        (COMMA selfDefinitionClause)?
    RR_BRACKET
    commentSpec?
    partitionDefinition?
    withOption?
    likeDefinition?
    distributed?
    ;




// Insert statements

insertSimpleStatement
    : KW_INSERT (KW_INTO | KW_OVERWRITE KW_TABLE?) tablePath
    (
        insertPartitionDefinition? columnNameList? queryStatement
        | valuesDefinition
    )
    ;

insertPartitionDefinition
    : KW_PARTITION tablePropertyList
    ;

// query statements

queryStatement
    : left=queryStatement operator=(KW_INTERSECT | KW_UNION | KW_EXCEPT) KW_ALL? right=queryStatement orderByCaluse? limitClause? #unionQuery
    | (selectClause | selectStatement) orderByCaluse? limitClause?   #commonQuery
    ;

valuesCaluse
    : KW_VALUES expression (COMMA expression )*
    ;


withItem
    : withItemName (LR_BRACKET columnName (COMMA columnName)* RR_BRACKET)? KW_AS LR_BRACKET queryStatement RR_BRACKET
    ;

withItemName
    : identifier
    ;


groupByClause
    : KW_GROUP KW_BY groupItemDefinition  (COMMA groupItemDefinition)* groupingSet?
    ;



fromClause
    : KW_FROM tableExpression
    ;



tableReference
    : (tablePrimary tableAlias?)
    ;


flinkJoinOp: KW_LEFT | KW_RIGHT | KW_FULL | KW_INNER;



tablePrimary
    : KW_TABLE? tablePath timePeriod? (KW_AS correlationName)?
    | KW_LATERAL KW_TABLE LR_BRACKET functionName LR_BRACKET functionParam (COMMA functionParam)* RR_BRACKET RR_BRACKET
    | KW_LATERAL? LR_BRACKET queryStatement RR_BRACKET
    | KW_LATERAL KW_TABLE LR_BRACKET functionName LR_BRACKET functionParam (COMMA functionParam)* RR_BRACKET RR_BRACKET KW_AS tableAlias LR_BRACKET projectItemDefinition (COMMA projectItemDefinition)* RR_BRACKET
    | KW_UNNEST LR_BRACKET expression RR_BRACKET
    ;



timePeriod
    : KW_FOR KW_SYSTEM_TIME KW_AS KW_OF dateTimeExpression
    | KW_AS KW_OF dateTimeExpression
    ;

dateTimeExpression
    : expression
    ;

inlineDataValueClause
    : LR_BRACKET valuesDefinition RR_BRACKET tableAlias
    ;

windowTVFClause
    : KW_TABLE LR_BRACKET windowTVFExpression RR_BRACKET
    ;

windowTVFExpression
    : tumableExpression | hopExpression | cumulateExpression | sessionExpression
    ;

tumableExpression
    : KW_TUMBLE LR_BRACKET
        (KW_TABLE | KW_DATA DOUBLE_RIGHT_ARROW KW_TABLE)uid
        (COMMA (KW_TIMECOL DOUBLE_RIGHT_ARROW)? columnDescriptor)
        (COMMA (KW_SIZE DOUBLE_RIGHT_ARROW)? timeIntervalExpression)
        (COMMA (DOUBLE_QUOTE_SYMB KW_OFFSET  DOUBLE_QUOTE_SYMB DOUBLE_RIGHT_ARROW)? timeIntervalExpression)?
      RR_BRACKET
    ;

hopExpression
    : KW_HOP
        LR_BRACKET
         (KW_TABLE | KW_DATA DOUBLE_RIGHT_ARROW KW_TABLE)uid
         (COMMA (KW_TIMECOL DOUBLE_RIGHT_ARROW)? columnDescriptor)
         (COMMA (KW_SLIDE DOUBLE_RIGHT_ARROW)? timeIntervalExpression)?
         (COMMA (KW_SIZE DOUBLE_RIGHT_ARROW)? timeIntervalExpression)
         (COMMA (DOUBLE_QUOTE_SYMB KW_OFFSET  DOUBLE_QUOTE_SYMB DOUBLE_RIGHT_ARROW)? timeIntervalExpression)?
        RR_BRACKET
    ;

cumulateExpression
    : KW_CUMULATE
        LR_BRACKET
        (KW_TABLE | KW_DATA DOUBLE_RIGHT_ARROW KW_TABLE) uid
         (COMMA (KW_TIMECOL DOUBLE_RIGHT_ARROW)? columnDescriptor)
         (COMMA (KW_STEP DOUBLE_RIGHT_ARROW)? timeIntervalExpression)?
         (COMMA (KW_SIZE DOUBLE_RIGHT_ARROW)? timeIntervalExpression)
        RR_BRACKET
    ;

sessionExpression
    : KW_SESSION
        LR_BRACKET
         (KW_TABLE | KW_DATA DOUBLE_RIGHT_ARROW KW_TABLE ) uid (KW_PARTITION KW_BY uid (COMMA uid)*)?
         (COMMA (KW_TIMECOL DOUBLE_RIGHT_ARROW)? columnDescriptor)?
         (COMMA (KW_GAP DOUBLE_RIGHT_ARROW)? timeIntervalExpression)?
        RR_BRACKET
    ;

windowTVFName
    : KW_TUMBLE
    | KW_HOP
    | KW_CUMULATE
    | KW_SESSION
;

windowTVFParam
    : KW_TABLE timeAttrColumn
    | columnDescriptor
    | timeIntervalExpression
    | KW_DATA DOUBLE_RIGHT_ARROW KW_TABLE timeAttrColumn
    | KW_TIMECOL DOUBLE_RIGHT_ARROW columnDescriptor
    | timeIntervalParamName DOUBLE_RIGHT_ARROW timeIntervalExpression
    ;

timeIntervalParamName
    : KW_DATA
    | KW_TIMECOL
    | KW_SIZE
    | KW_OFFSET
    | KW_STEP
    | KW_SLIDE
    ;

columnDescriptor
    : KW_DESCRIPTOR LR_BRACKET uid RR_BRACKET
    ;

joinCondition
    : KW_ON booleanExpression
    | KW_USING LR_BRACKET uid (COMMA uid)* RR_BRACKET
    ;

whereClause
    : KW_WHERE booleanExpression
    ;



groupItemDefinition
    : expression
    | groupWindowFunction
    | LR_BRACKET RR_BRACKET
    | LR_BRACKET expression (COMMA expression)* RR_BRACKET
    | groupingSetsNotionName LR_BRACKET expression (COMMA expression)* RR_BRACKET
    ;

groupingSet:
    groupingSets LR_BRACKET groupItemDefinition (COMMA groupItemDefinition)* RR_BRACKET
    ;

groupingSets
    : KW_GROUPING KW_SETS
    ;

groupingSetsNotionName
    : KW_CUBE
    | KW_ROLLUP
    ;

groupWindowFunction
    : groupWindowFunctionName LR_BRACKET timeAttrColumn COMMA timeIntervalExpression RR_BRACKET
    ;

groupWindowFunctionName
    : KW_TUMBLE
    | KW_HOP
    | KW_SESSION
    ;

timeAttrColumn
    : uid
    ;

havingClause
    : KW_HAVING booleanExpression
    ;

windowClause
    : KW_WINDOW namedWindow (COMMA namedWindow)*
    ;

namedWindow
    : name=errorCapturingIdentifier KW_AS windowSpec
    ;

windowSpec
    : name=errorCapturingIdentifier?
    LR_BRACKET
        partitionByClause?
        orderByCaluse?
        windowFrame?
    RR_BRACKET
    ;

matchRecognizeClause
    : KW_MATCH_RECOGNIZE
    LR_BRACKET
        partitionByClause?
        orderByCaluse?
        measuresClause?
        outputMode?
        afterMatchStrategy?
        patternDefinition?
        patternVariablesDefinition
    RR_BRACKET ( KW_AS? identifier )?
    ;

orderByCaluse
    : KW_ORDER KW_BY orderItemDefinition (COMMA orderItemDefinition)*
    ;

orderItemDefinition
    : expression ordering=(KW_ASC | KW_DESC)? (KW_NULLS nullOrder=(KW_LAST | KW_FIRST))?
    ;

limitClause
    : KW_LIMIT (KW_ALL | limit=expression)
    ;

partitionByClause
    : KW_PARTITION KW_BY expression (COMMA expression)*
    ;

quantifiers
    : (ASTERISK_SIGN)
    | (ADD_SIGN)
    | (QUESTION_MARK_SIGN)
    | (LB_BRACKET DIG_LITERAL COMMA DIG_LITERAL RB_BRACKET)
    | (LB_BRACKET DIG_LITERAL COMMA  RB_BRACKET)
    | (LB_BRACKET COMMA DIG_LITERAL RB_BRACKET)
    ;

measuresClause
    : KW_MEASURES projectItemDefinition (COMMA projectItemDefinition)*
    ;

patternDefinition
    : KW_PATTERN
    LR_BRACKET
        patternVariable+
    RR_BRACKET
    withinClause?
    ;

patternVariable
    : unquotedIdentifier quantifiers?
    ;

outputMode
    : KW_ALL KW_ROWS KW_PER KW_MATCH
    | KW_ONE KW_ROW KW_PER KW_MATCH
    ;

afterMatchStrategy
    : KW_AFTER KW_MATCH KW_SKIP KW_PAST KW_LAST KW_ROW
    | KW_AFTER KW_MATCH KW_SKIP KW_TO KW_NEXT KW_ROW
    | KW_AFTER KW_MATCH KW_SKIP KW_TO KW_LAST unquotedIdentifier
    | KW_AFTER KW_MATCH KW_SKIP KW_TO KW_FIRST unquotedIdentifier
    ;

patternVariablesDefinition
    : KW_DEFINE projectItemDefinition (COMMA projectItemDefinition)*
    ;

windowFrame
    : KW_RANGE KW_BETWEEN timeIntervalExpression frameBound
    | KW_ROWS KW_BETWEEN DIG_LITERAL frameBound
    ;

frameBound
    : KW_PRECEDING KW_AND KW_CURRENT KW_ROW
    ;

withinClause
    : KW_WITHIN timeIntervalExpression
    ;

analyzePartitionDefinition
    : KW_PARTITION tableCanHasKeyPropertyList
    ;


selfDefinitionClause
    : KW_PERIOD KW_FOR KW_SYSTEM_TIME
    ;

partitionDefinition
    : KW_PARTITIONED KW_BY transformList
    ;

transformList
    : LR_BRACKET transform (COMMA transform)* RR_BRACKET
    ;

transform
    : qualifiedName                                                           #identityTransform
    | transformName=identifier
      LR_BRACKET transformArgument (COMMA transformArgument)* RR_BRACKET  #applyTransform
    ;

transformArgument
    : qualifiedName
    | constant
    ;

likeDefinition
    : KW_LIKE tablePath (LR_BRACKET likeOption* RR_BRACKET)?
    ;

distributed
    :  KW_DISTRIBUTED (KW_BY KW_HASH? LR_BRACKET identifier RR_BRACKET)? (KW_INTO decimalLiteral KW_BUCKETS)?
    ;

distribution
    :  KW_DISTRIBUTION (KW_BY KW_HASH? LR_BRACKET identifier RR_BRACKET)? (KW_INTO decimalLiteral KW_BUCKETS)?
    ;


likeOption
    : ((KW_INCLUDING | KW_EXCLUDING) (KW_ALL | KW_CONSTRAINTS | KW_PARTITIONS))
    | ((KW_INCLUDING | KW_EXCLUDING | KW_OVERWRITING) (KW_GENERATED | KW_OPTIONS | KW_WATERMARKS))
    ;



columnOptionDefinition
    : physicalColumnDefinition
    | metadataColumnDefinition
    | computedColumnDefinition
    ;

physicalColumnDefinition
    : columnName columnType columnConstraint? commentSpec?
    ;


computedColumnExpression
    : expression
    ;

watermarkDefinition
    : KW_WATERMARK KW_FOR expression KW_AS expression
    | KW_WATERMARK KW_FOR ( uid | expression) KW_AS uid timeIntervalExpression?
    ;

tableConstraint
    : (KW_CONSTRAINT constraintName)? KW_PRIMARY KW_KEY columnNameList KW_NOT KW_ENFORCED
    ;

constraintName
    : identifier
    ;

valuesDefinition
    : KW_VALUES valuesRowDefinition (COMMA valuesRowDefinition)*
    ;

valuesRowDefinition
    : LR_BRACKET
        constant (COMMA constant)*
    RR_BRACKET
    ;

lengthOneDimension
    : LR_BRACKET decimalLiteral RR_BRACKET
    ;

lengthTwoOptionalDimension
    : LR_BRACKET decimalLiteral (COMMA decimalLiteral)? RR_BRACKET
    ;

lengthTwoStringDimension
    : LR_BRACKET stringLiteral (COMMA stringLiteral)? RR_BRACKET
    ;

lengthOneTypeDimension
    : LESS_SYMBOL columnType (COMMA columnType)* GREATER_SYMBOL  #lengthSymbolsTypeDimension
    ;

mapTypeDimension
    : LESS_SYMBOL columnType (COMMA columnType) GREATER_SYMBOL
    ;

rowTypeDimension
    : LESS_SYMBOL columnName columnType (COMMA columnName columnType)* GREATER_SYMBOL #rowSymbolsTypeDimension
    ;

columnConstraint
    :(KW_CONSTRAINT constraintName)? KW_PRIMARY KW_KEY (KW_NOT KW_ENFORCED)? | KW_NOT? KW_NULL
    ;

commentSpec
    : KW_COMMENT STRING_LITERAL
    ;

metadataColumnDefinition
    : columnName columnType KW_METADATA (KW_FROM metadataKey)? KW_VIRTUAL?
    ;

metadataKey
    : STRING_LITERAL
    ;

computedColumnDefinition
    : columnName KW_AS computedColumnExpression commentSpec?
    ;

columnName
    : uid | expression
    ;

columnNameList
    : (LR_BRACKET columnName (COMMA columnName)* RR_BRACKET)
    | (columnName (COMMA columnName)*)
    ;

columnType
    : typeName=(KW_DATE | KW_BOOLEAN | KW_NULL)
    | typeName=(KW_CHAR | KW_VARCHAR | KW_STRING | KW_BINARY | KW_VARBINARY | KW_BYTES
        | KW_TINYINT | KW_SMALLINT | KW_INT | KW_INTEGER | KW_BIGINT
        | KW_TIME | KW_TIMESTAMP_LTZ | KW_DATETIME
    ) lengthOneDimension?
    | typeName=KW_TIMESTAMP lengthOneDimension? ((KW_WITHOUT | KW_WITH) KW_LOCAL? KW_TIME KW_ZONE)?
    | typeName=KW_TIMESTAMP_3 lengthOneDimension? ((KW_WITHOUT | KW_WITH) KW_LOCAL? KW_TIME KW_ZONE)?
    | typeName=KW_TIMESTAMP_6 lengthOneDimension? ((KW_WITHOUT | KW_WITH) KW_LOCAL? KW_TIME KW_ZONE)?
    | typeName=KW_TIMESTAMP_9 lengthOneDimension? ((KW_WITHOUT | KW_WITH) KW_LOCAL? KW_TIME KW_ZONE)?
    | typeName=(KW_DECIMAL | KW_DEC | KW_NUMERIC | KW_FLOAT | KW_DOUBLE) lengthTwoOptionalDimension?
    | type=(KW_ARRAY | KW_MULTISET) lengthOneTypeDimension?
    | type=KW_MAP mapTypeDimension?
    | type=KW_ROW rowTypeDimension?
    | type=KW_RAW lengthTwoStringDimension?
    ;

// expression

expression
    : booleanExpression
    ;

booleanExpression
    : KW_NOT booleanExpression                                        #logicalNot
    | KW_EXISTS LR_BRACKET queryStatement RR_BRACKET                                         #exists
    | valueExpression predicate?                                   #predicated
    | left=booleanExpression operator=KW_AND right=booleanExpression  #logicalBinary
    | left=booleanExpression operator=KW_OR right=booleanExpression   #logicalBinary
    | booleanExpression KW_IS KW_NOT? kind=(KW_TRUE | KW_FALSE | KW_UNKNOWN | KW_NULL) #logicalNested
    ;

predicate
    : KW_NOT?
        kind=KW_BETWEEN (KW_ASYMMETRIC | KW_SYMMETRIC)?
        lower=valueExpression KW_AND
        upper=valueExpression
    | KW_NOT? kind=KW_IN LR_BRACKET expression (COMMA expression)* RR_BRACKET
    | KW_NOT? kind=KW_IN LR_BRACKET queryStatement RR_BRACKET
    | kind=KW_EXISTS LR_BRACKET queryStatement RR_BRACKET
    | KW_NOT? kind=KW_RLIKE pattern=valueExpression
    | likePredicate
    | KW_IS KW_NOT? kind=(KW_TRUE | KW_FALSE | KW_UNKNOWN | KW_NULL)
    | KW_IS KW_NOT? kind=KW_DISTINCT KW_FROM right=valueExpression
    | KW_NOT? kind=KW_SIMILAR KW_TO right=valueExpression (KW_ESCAPE stringLiteral)?
    ;

likePredicate
    : KW_NOT? kind=KW_LIKE quantifier=(KW_ANY | KW_ALL) (LR_BRACKET RR_BRACKET | LR_BRACKET expression (COMMA expression)* RR_BRACKET)
    | KW_NOT? kind=KW_LIKE pattern=valueExpression (KW_ESCAPE stringLiteral)?
    ;

valueExpression
    : primaryExpression                                                                      #valueExpressionDefault
    | operator=('-' | ADD_SIGN | BIT_NOT_OP) valueExpression                                        #arithmeticUnary
    | left=valueExpression operator=(ASTERISK_SIGN | SLASH_SIGN | PENCENT_SIGN | KW_DIV) right=valueExpression #arithmeticBinary
    | left=valueExpression operator=(ADD_SIGN | HYPNEN_SIGN | DOUBLE_VERTICAL_SIGN) right=valueExpression       #arithmeticBinary
    | left=valueExpression operator='&' right=valueExpression                          #arithmeticBinary
    | left=valueExpression operator='^' right=valueExpression                                #arithmeticBinary
    | left=valueExpression operator='|' right=valueExpression                               #arithmeticBinary
    | left=valueExpression comparisonOperator right=valueExpression                          #comparison

    ;

primaryExpression
    : KW_CASE whenClause+ (KW_ELSE elseExpression=expression)? KW_END                                   #searchedCase
    | KW_CASE value=expression whenClause+ (KW_ELSE elseExpression=expression)? KW_END                  #simpleCase
    | KW_CAST LR_BRACKET expression KW_AS columnType RR_BRACKET                                                      #cast
    | KW_FIRST LR_BRACKET expression (KW_IGNORE KW_NULLS)? RR_BRACKET                                                 #first
    | KW_LAST LR_BRACKET expression (KW_IGNORE KW_NULLS)? RR_BRACKET                                                  #last
    | KW_POSITION LR_BRACKET substr=valueExpression KW_IN str=valueExpression RR_BRACKET                           #position
    | constant                                                                                 #constantDefault
    | ASTERISK_SIGN                                                                                 #star
    | uid DOT ASTERISK_SIGN                                                                #star
    | LR_BRACKET queryStatement RR_BRACKET                                                                           #subqueryExpression
    | functionName LR_BRACKET (setQuantifier? functionParam (COMMA functionParam)*)? RR_BRACKET                      #functionCall
    | functionName LR_BRACKET functionParam KW_TO functionParam RR_BRACKET                      #functionCall
    | functionName LR_BRACKET setQuantifier? functionParam RR_BRACKET  filterClause?                             #functionCallFilter
    | value=primaryExpression LS_BRACKET index=valueExpression RS_BRACKET                                   #subscript
    | identifier                                                                               #columnReference
    | dereferenceDefinition                                                                    #dereference
    | LR_BRACKET expression RR_BRACKET        #parenthesizedExpression
    | LR_BRACKET RR_BRACKET          #emptyExpression
    | complexDataTypeExpression                                                                 # complexDataTypeFieldExpression
     ;




complexDataTypeExpression
    : arrayExpression
    | rowExpression
    | mapExpression
    ;

arrayExpression
    : KW_ARRAY LS_BRACKET dataTypeExpression (COMMA dataTypeExpression)* RS_BRACKET
    ;

rowExpression
    : KW_ROW LR_BRACKET dataTypeExpression (COMMA dataTypeExpression)* RR_BRACKET
    ;

mapExpression
    : KW_MAP LS_BRACKET dataTypeExpression COMMA dataTypeExpression RS_BRACKET
    ;


dataTypeExpression
    : columnAlias
    | complexDataTypeExpression
    ;

functionName
    : reservedKeywordsUsedAsFuncName
    | nonReservedKeywords
    | uid
    ;

functionParam
    : reservedKeywordsUsedAsFuncParam
    | timeIntervalUnit
    | timePointUnit
    | expression
    | filterClause
    ;

filterClause
    : KW_FILTER LR_BRACKET KW_WHERE booleanExpression RR_BRACKET
    ;

dereferenceDefinition
    : uid
    ;

// base common

correlationName
    : identifier
    ;

qualifiedName
    : identifier | dereferenceDefinition
    ;

timeIntervalExpression
    : KW_INTERVAL (errorCapturingMultiUnitsInterval | errorCapturingUnitToUnitInterval)?
    ;

errorCapturingMultiUnitsInterval
    : multiUnitsInterval unitToUnitInterval?
    ;

multiUnitsInterval
    : (intervalValue timeIntervalUnit)+
    ;

errorCapturingUnitToUnitInterval
    : body=unitToUnitInterval (error1=multiUnitsInterval | error2=unitToUnitInterval)?
    ;

unitToUnitInterval
    : value=intervalValue from=timeIntervalUnit KW_TO to=timeIntervalUnit
    ;

intervalValue
    : (ADD_SIGN | HYPNEN_SIGN)? (DIG_LITERAL | REAL_LITERAL)
    | STRING_LITERAL
    ;

columnAlias
    : KW_AS? identifier identifierList?
    ;

tableAlias
    : KW_AS? identifier identifierList?
    ;

errorCapturingIdentifier
    : identifier errorCapturingIdentifierExtra
    ;

errorCapturingIdentifierExtra
    : (KW_MINUS identifier)+    #errorIdent
    |                        #realIdent
    ;

identifierList
    : LR_BRACKET identifierSeq RR_BRACKET
    ;

identifierSeq
    : identifier (COMMA identifier)*
    ;

identifier
    : unquotedIdentifier         #unquotedIdentifierAlternative
    | quotedIdentifier           #quotedIdentifierAlternative
    | nonReservedKeywords        #nonReservedKeywordsAlternative
    | refVar                     #urefVarAlternative
    ;

refVar
    :  DOLLAR LB_BRACKET unquotedIdentifier RB_BRACKET;

unquotedIdentifier
    : DIG_LITERAL | ID_LITERAL
    ;

quotedIdentifier
    : STRING_LITERAL
    ;

whenClause
    : KW_WHEN condition=expression KW_THEN result=expression
    ;

catalogPath
    : uid
    ;

databasePath
    : uid
    ;

databasePathCreate
    : uid
    ;

tablePathCreate
    : uid
    ;

tablePath
    : uid
    ;


uid
    : identifier (DOT identifier)*
    ;

withOption
    : KW_WITH tablePropertyList
    ;

ifNotExists
    : KW_IF KW_NOT KW_EXISTS;

ifExists
    : KW_IF KW_EXISTS;

tableCanHasKeyPropertyList
    : LR_BRACKET (tableProperty | tablePropertyKey)
        (COMMA (tableProperty | tablePropertyKey))* RR_BRACKET
    ;

tablePropertyList
    : LR_BRACKET tableProperty (COMMA tableProperty)* RR_BRACKET
    ;

tableProperty
    : tablePropertyKey EQUAL_SYMBOL tablePropertyValue
    ;

tablePropertyKey
    : (identifier)
    | (dereferenceDefinition (HYPNEN_SIGN dereferenceDefinition)*)
    | (STRING_LITERAL)
    ;

tablePropertyValue
    : DIG_LITERAL
    | REAL_LITERAL
    | booleanLiteral
    | STRING_LITERAL
    | unquotedIdentifier
    ;


comparisonOperator
    : EQUAL_SYMBOL
    | GREATER_SYMBOL
    | LESS_SYMBOL
    | LESS_SYMBOL EQUAL_SYMBOL
    | GREATER_SYMBOL EQUAL_SYMBOL
    | LESS_SYMBOL GREATER_SYMBOL
    | EXCLAMATION_SYMBOL EQUAL_SYMBOL
    | LESS_SYMBOL EQUAL_SYMBOL GREATER_SYMBOL
    ;



constant
    : timeIntervalExpression
    | timePointLiteral
    | stringLiteral
    | HYPNEN_SIGN? decimalLiteral
    | booleanLiteral
    | REAL_LITERAL
    //| BIT_STRING
    | KW_NOT? KW_NULL
    ;

timePointLiteral
    : timePointUnit stringLiteral
    ;

stringLiteral
    : STRING_LITERAL
    ;

decimalLiteral
    : DIG_LITERAL
    ;

booleanLiteral
    : KW_TRUE | KW_FALSE;

setQuantifier
    : KW_DISTINCT
    | KW_ALL
    ;

timePointUnit
    : KW_YEAR
    | KW_QUARTER
    | KW_MONTH
    | KW_WEEK
    | KW_DAY
    | KW_HOUR
    | KW_MINUTE
    | KW_SECOND
    | KW_MILLISECOND
    | KW_MICROSECOND
    ;

timeIntervalUnit
    : KW_MILLENNIUM
    | KW_CENTURY
    | KW_DECADE
    | KW_YEAR
    | KW_YEARS
    | KW_QUARTER
    | KW_MONTH
    | KW_MONTHS
    | KW_WEEK
    | KW_WEEKS
    | KW_DAY
    | KW_DAYS
    | KW_HOUR
    | KW_HOURS
    | KW_MINUTE
    | KW_MINUTES
    | KW_SECOND
    | KW_SECONDS
    | KW_MILLISECOND
    | KW_MICROSECOND
    | KW_NANOSECOND
    | KW_EPOCH
    ;

reservedKeywordsUsedAsFuncParam
    : KW_LEADING
    | KW_TRAILING
    | KW_BOTH
    | KW_ALL
    | KW_DISTINCT
    | ASTERISK_SIGN
    ;

reservedKeywordsUsedAsFuncName
    : KW_ABS
    | KW_ARRAY
    | KW_AVG
    | KW_CAST
    | KW_CEIL
    | KW_COALESCE
    | KW_COLLECT
    | KW_COUNT
    | KW_DATE
    | KW_FIRST_VALUE
    | KW_FROM_UNIXTIME
    | KW_GROUPING
    | KW_HOUR
    | KW_IF
    | KW_LEAD
    | KW_LAG
    | KW_LAST_VALUE
    | KW_LEFT
    | KW_NTILE
    | KW_MAP
    | KW_MINUTE
    | KW_MONTH
    | KW_OVERLAY
    | KW_POSITION
    | KW_PERCENT_RANK
    | KW_POWER
    | KW_QUARTER
    | KW_RANK
    | KW_ROW_NUMBER
    | KW_RIGHT
    | KW_SECOND
    | KW_SUBSTRING
    | KW_SUM
    | KW_TIME
    | KW_TIMESTAMP
    | KW_TIMESTAMP_3
    | KW_TIMESTAMP_6
    | KW_TIMESTAMP_9
    | KW_TRUNCATE
    | KW_UPPER
    | KW_WEEK
    | KW_YEAR
    ;


nonReservedKeywords
    :KW_ADD
    |KW_ADMIN
    |KW_AFTER
    |KW_ANALYZE
    |KW_ASC
    |KW_BEFORE
    |KW_BYTES
    |KW_CASCADE
    |KW_CATALOG
    |KW_CATALOGS
    |KW_CENTURY
    |KW_CHAIN
    |KW_CHANGELOG_MODE
    |KW_CHARACTERS
    |KW_COMMENT
    |KW_COMPACT
    |KW_COLUMNS
    |KW_CONSTRAINTS
    |KW_CONSTRUCTOR
    |KW_CUMULATE
    |KW_DATA
    |KW_DATE
    |KW_DATABASE
    |KW_DATABASES
    |KW_DAYS
    |KW_DECADE
    |KW_DEFINED
    |KW_DESC
    |KW_DESCRIPTOR
    |KW_DIV
    |KW_ENCODING
    |KW_ENFORCED
    |KW_ENGINE
    |KW_ERROR
    |KW_ESTIMATED_COST
    |KW_EXCEPTION
    |KW_EXCLUDE
    |KW_EXCLUDING
    |KW_EXTENDED
    |KW_FILE
    |KW_FINAL
    |KW_FIRST
    |KW_FOLLOWING
    |KW_FORMAT
    |KW_FORTRAN
    |KW_FOUND
    |KW_FRAC_SECOND
    |KW_FUNCTIONS
    |KW_GENERAL
    |KW_GENERATED
    |KW_GO
    |KW_GOTO
    |KW_GRANTED
    |KW_HOP
    |KW_HOURS
    |KW_IF
    |KW_IGNORE
    |KW_INCREMENT
    |KW_INPUT
    |KW_INVOKER
    |KW_JAR
    |KW_JARS
    |KW_JAVA
    |KW_JSON
    |KW_JSON_EXECUTION_PLAN
    |KW_KEY
    |KW_KEY_MEMBER
    |KW_KEY_TYPE
    |KW_LABEL
    |KW_LAST
    |KW_LENGTH
    |KW_LEVEL
    |KW_LOAD
    |KW_LOCALTIMESTAMP
    |KW_MAP
    |KW_MICROSECOND
    |KW_MILLENNIUM
    |KW_MILLISECOND
    |KW_MINUTES
    |KW_MINVALUE
    |KW_MODIFY
    |KW_MODULES
    |KW_MONTHS
    |KW_NANOSECOND
    |KW_NULLS
    |KW_NUMBER
    |KW_OPTION
    |KW_OPTIONS
    |KW_ORDERING
    |KW_OUTPUT
    |KW_OVERWRITE
    |KW_OVERWRITING
    |KW_PARTITIONED
    |KW_PARTITIONS
    |KW_PASSING
    |KW_PAST
    |KW_PATH
    |KW_PLACING
    |KW_PLAN
    |KW_PRECEDING
    |KW_PRESERVE
    |KW_PRIOR
    |KW_PRIVILEGES
    |KW_PUBLIC
    |KW_PYTHON
    |KW_PYTHON_FILES
    |KW_PYTHON_REQUIREMENTS
    |KW_PYTHON_DEPENDENCIES
    |KW_PYTHON_JAR
    |KW_PYTHON_ARCHIVES
    |KW_PYTHON_PARAMETER
    |KW_QUARTER
    |KW_RAW
    |KW_READ
    |KW_RELATIVE
    |KW_REMOVE
    |KW_RENAME
    |KW_REPLACE
    |KW_RESPECT
    |KW_RESTART
    |KW_RESTRICT
    |KW_ROLE
    |KW_ROW_COUNT
    |KW_SCALA
    |KW_SCALAR
    |KW_SCALE
    |KW_SCHEMA
    |KW_SECONDS
    |KW_SECTION
    |KW_SECURITY
    |KW_SELF
    |KW_SERVER
    |KW_SERVER_NAME
    |KW_SESSION
    |KW_SETS
    |KW_SIMPLE
    |KW_SIZE
    |KW_SLIDE
    |KW_SOURCE
    |KW_SPACE
    |KW_STATE
    |KW_STATEMENT
    |KW_STEP
    |KW_STRING
    |KW_STRUCTURE
    |KW_STYLE
    |KW_TABLES
    |KW_TEMPORARY
    |KW_TIMECOL
    |KW_FLOOR
    |KW_TIMESTAMP_LTZ
    |KW_TIMESTAMPADD
    |KW_TIMESTAMPDIFF
    |KW_TO_TIMESTAMP
    |KW_TRANSFORM
    |KW_TUMBLE
    |KW_TYPE
    |KW_UNDER
    |KW_UNLOAD
    |KW_USAGE
    |KW_USE
    |KW_USER
    |KW_UTF16
    |KW_UTF32
    |KW_UTF8
    |KW_VERSION
    |KW_VIEW
    |KW_VIEWS
    |KW_VIRTUAL
    |KW_WATERMARK
    |KW_WATERMARKS
    |KW_WEEK
    |KW_WORK
    |KW_WRAPPER
    |KW_YEARS
    |KW_ZONE
    ;

SPACE:                               [ \t\r\n]+    -> channel(HIDDEN);
COMMENT_INPUT:                       '/' '*' .*?  '*' '/' -> channel(HIDDEN);
LINE_COMMENT:                        (
                                       ( DOUBLE_HYPNEN_SIGN | '#') ~[\r\n]* ('\r'? '\n' | EOF)
                                       | DOUBLE_HYPNEN_SIGN ('\r'? '\n' | EOF)
                                     ) -> channel(HIDDEN);

// List of keywords that are not reserved.
// Please keep the keyword in alphabetical order if new keyword is added.
// Please add it to the nonReservedKeywords rule if new keyword is added.
// Reference link https://github.com/apache/flink/blob/release-1.16/flink-table/flink-sql-parser/src/main/codegen/data/Parser.tdd

KW_ADD:                              A D D;
KW_ADMIN:                            A D M I N;
KW_AFTER:                            A F T E R;
KW_ANALYZE:                          A N A L Y Z E;
KW_ASC:                              A S C;
KW_BEFORE:                           B E F O R E;
KW_BYTES:                            B Y T E S;
KW_CASCADE:                          C A S C A D E;
KW_CATALOG:                          C A T A L O G;
KW_CATALOGS:                         C A T A L O G S;
KW_CENTURY:                          C E N T U R Y;
KW_CHAIN:                            C H A I N;
KW_CHANGELOG_MODE:                   C H A N G E L O G UNDERLINE_SIGN M O D E;
KW_CHARACTERS:                       C H A R A C T E R S;
KW_COMMENT:                          C O M M E N T;
KW_COMPACT:                          C O M P A C T;
KW_COMPUTE:                          C O M P U T E;
KW_COLUMNS:                          C O L U M N S;
KW_CONSTRAINTS:                      C O N S T R A I N T S;
KW_CONSTRUCTOR:                      C O N S T R U C T O R;
KW_CUMULATE:                         C U M U L A T E;
KW_DATA:                             D A T A ;
KW_DATABASE:                         D A T A B A S E;
KW_DATABASES:                        D A T A B A S E S;
KW_DAYS:                             D A Y S;
KW_DECADE:                           D E C A D E;
KW_DEFINED:                          D E F I N E D;
KW_DESC:                             D E S C;
KW_DESCRIPTOR:                       D E S C R I P T O R;
KW_DIV:                              D I V;
KW_ENCODING:                         E N C O D I N G;
KW_ENFORCED:                         E N F O R C E D;
KW_ENGINE:                           E N G I N E;
KW_EPOCH:                            E P O C H;
KW_ERROR:                            E R R O R;
KW_ESTIMATED_COST:                   E S T I M A T E D UNDERLINE_SIGN C O S T;
KW_EXCEPTION:                        E X C E P T I O N;
KW_EXCLUDE:                          E X C L U D E;
KW_EXCLUDING:                        E X C L U D I N G;
KW_EXTENDED:                         E X T E N D E D;
KW_FILTER:                           F I L T E R;
KW_FILE:                             F I L E;
KW_FINAL:                            F I N A L;
KW_FIRST:                            F I R S T;
KW_FOLLOWING:                        F O L L O W I N G;
KW_FORMAT:                           F O R M A T;
KW_FORTRAN:                          F O R T R A N;
KW_FOUND:                            F O U N D;
KW_FRAC_SECOND:                      F R A C UNDERLINE_SIGN S E C O N D;
KW_FUNCTIONS:                        F U N C T I O N S;
KW_GENERAL:                          G E N E R A L;
KW_GENERATED:                        G E N E R A T E D;
KW_GAP:                              G A P;
KW_GO:                               G O;
KW_GOTO:                             G O T O;
KW_GRANTED:                          G R A N T E D;
KW_HOP:                              H O P;
KW_HOURS:                            H O U R S;
KW_IF:                               I F;
KW_IGNORE:                           I G N O R E;
KW_INCREMENT:                        I N C R E M E N T;
KW_INPUT:                            I N P U T;
KW_INVOKER:                          I N V O K E R;
KW_JAR:                              J A R;
KW_JARS:                             J A R S;
KW_JAVA:                             J A V A;
KW_JSON:                             J S O N;
KW_JOB:                              J O B;
KW_JOBS:                             J O B S;
KW_JSON_EXECUTION_PLAN:              J S O N UNDERLINE_SIGN E X E C U T I O N UNDERLINE_SIGN P L A N;
KW_KEY:                              K E Y;
KW_KEY_MEMBER:                       K E Y UNDERLINE_SIGN M E M B E R;
KW_KEY_TYPE:                         K E Y UNDERLINE_SIGN T Y P E;
KW_LABEL:                            L A B E L;
KW_LAST:                             L A S T;
KW_LENGTH:                           L E N G T H;
KW_LEVEL:                            L E V E L;
KW_LOAD:                             L O A D;
KW_MAP:                              M A P;
KW_MICROSECOND:                      M I C R O S E C O N D;
KW_MILLENNIUM:                       M I L L E N N I U M;
KW_MILLISECOND:                      M I L L I S E C O N D;
KW_MINUTES:                          M I N U T E S;
KW_MINVALUE:                         M I N V A L U E;
KW_MODIFY:                           M O D I F Y;
KW_MODULES:                          M O D U L E S;
KW_MONTHS:                           M O N T H S;
KW_NANOSECOND:                       N A N O S E C O N D;
KW_NULLS:                            N U L L S;
KW_NUMBER:                           N U M B E R;
KW_OPTION:                           O P T I O N;
KW_OPTIONS:                          O P T I O N S;
KW_ORDERING:                         O R D E R I N G;
KW_OUTPUT:                           O U T P U T;
KW_OVERWRITE:                        O V E R W R I T E;
KW_OVERWRITING:                      O V E R W R I T I N G;
KW_PARTITIONED:                      P A R T I T I O N E D;
KW_PARTITIONS:                       P A R T I T I O N S;
KW_PASSING:                          P A S S I N G;
KW_PAST:                             P A S T;
KW_PATH:                             P A T H;
KW_PLACING:                          P L A C I N G;
KW_PLAN:                             P L A N;
KW_PLAN_ADVICE:                             P L A N UNDERLINE_SIGN A D V I C E;
KW_PRECEDING:                        P R E C E D I N G;
KW_PRESERVE:                         P R E S E R V E;
KW_PRIOR:                            P R I O R;
KW_PROCEDURES:                       P R O C E D U R E S;
KW_PRIVILEGES:                       P R I V I L E G E S;
KW_PUBLIC:                           P U B L I C;
KW_PYTHON:                           P Y T H O N;
KW_PYTHON_FILES:                     P Y T H O N UNDERLINE_SIGN F I L E S;
KW_PYTHON_REQUIREMENTS:              P Y T H O N UNDERLINE_SIGN R E Q U I R E M E N T S;
KW_PYTHON_DEPENDENCIES:              P Y T H O N UNDERLINE_SIGN D E P E N D E N C I E S;
KW_PYTHON_JAR:                       P Y T H O N UNDERLINE_SIGN J A R;
KW_PYTHON_ARCHIVES:                  P Y T H O N UNDERLINE_SIGN A R C H I V E S;
KW_PYTHON_PARAMETER:                 P Y T H O N UNDERLINE_SIGN P A R A M E T E R;
KW_QUARTER:                          Q U A R T E R;
KW_RAW:                              R A W;
KW_RECORDWRITER:                     R E C O R D W R I T E R;
KW_RECORDREADER:                     R E C O R D R E A D E R;
KW_READ:                             R E A D;
KW_RELATIVE:                         R E L A T I V E;
KW_REMOVE:                           R E M O V E;
KW_RENAME:                           R E N A M E;
KW_REPLACE:                          R E P L A C E;
KW_RESPECT:                          R E S P E C T;
KW_RESTART:                          R E S T A R T;
KW_RESTRICT:                         R E S T R I C T;
KW_ROLE:                             R O L E;
KW_ROW_COUNT:                        R O W UNDERLINE_SIGN C O U N T;
KW_SCALA:                            S C A L A;
KW_SCALAR:                           S C A L A R;
KW_SCALE:                            S C A L E;
KW_SCHEMA:                           S C H E M A;
KW_SECONDS:                          S E C O N D S;
KW_SECTION:                          S E C T I O N;
KW_SECURITY:                         S E C U R I T Y;
KW_SELF:                             S E L F;
KW_SEMI:                             S E M I;
KW_SERVER:                           S E R V E R;
KW_SERVER_NAME:                      S E R V E R UNDERLINE_SIGN N A M E;
KW_SESSION:                          S E S S I O N;
KW_SETS:                             S E T S;
KW_SIMPLE:                           S I M P L E;
KW_SIZE:                             S I Z E;
KW_SLIDE:                            S L I D E;
KW_SOURCE:                           S O U R C E;
KW_SPACE:                            S P A C E;
KW_STATE:                            S T A T E;
KW_STATEMENT:                        S T A T E M E N T;
KW_STATISTICS:                       S T A T I S T I C S;
KW_STEP:                             S T E P;
KW_STOP:                             S T O P;
KW_STRING:                           S T R I N G;
KW_STRUCTURE:                        S T R U C T U R E;
KW_STYLE:                            S T Y L E;
KW_TABLES:                           T A B L E S;
KW_TEMPORARY:                        T E M P O R A R Y;
KW_TIMECOL:                          T I M E C O L;
KW_FLOOR:                            F L O O R;
KW_TIMESTAMP_LTZ:                    T I M E S T A M P UNDERLINE_SIGN L T Z;
KW_TIMESTAMPADD:                     T I M E S T A M P A D D;
KW_TIMESTAMPDIFF:                    T I M E S T A M P D I F F;
KW_TO_TIMESTAMP:                     T O UNDERLINE_SIGN T I M E S T A M P;
KW_TRANSFORM:                        T R A N S F O R M;
KW_TUMBLE:                           T U M B L E;
KW_TYPE:                             T Y P E;
KW_UNBOUNDED:                        U N B O U N D E D;
KW_UNDER:                            U N D E R;
KW_UNLOAD:                           U N L O A D;
KW_USAGE:                            U S A G E;
KW_USE:                              U S E;
KW_UTF16:                            U T F '1' '6';
KW_UTF32:                            U T F '3' '2';
KW_UTF8:                             U T F'8';
KW_VERSION:                          V E R S I O N;
KW_VIEW:                             V I E W;
KW_VIEWS:                            V I E W S;
KW_VIRTUAL:                          V I R T U A L;
KW_WATERMARK:                        W A T E R M A R K;
KW_WATERMARKS:                       W A T E R M A R K S;
KW_WEEK:                             W E E K;
KW_WEEKS:                            W E E K S;
KW_WORK:                             W O R K;
KW_WRAPPER:                          W R A P P E R;
KW_YEARS:                            Y E A R S;
KW_ZONE:                             Z O N E;


// Reserved Keywords
// Please keep the keyword in alphabetical order if new keyword is added.
// Please add it to the reservedKeywords rule if new keyword is added.
// Reference link https://calcite.apache.org/docs/reference.html

KW_ABS:                              A B S;
KW_ALL:                              A L L;
KW_ALLOW:                            A L L O W;
KW_ALTER :                           A L T E R ;
KW_AND:                              A N D;
KW_ANY:                              A N Y;
KW_ARE:                              A R E;
KW_ARRAY:                            A R R A Y;
KW_AS:                               A S;
KW_ASYMMETRIC:                       A S Y M M E T R I C;
KW_AT:                               A T;
KW_AVG:                              A V G;
KW_BEGIN:                            B E G I N;
KW_BETWEEN:                          B E T W E E N;
KW_BIGINT:                           B I G I N T;
KW_BINARY:                           B I N A R Y;
KW_BIT:                              B I T;
KW_BLOB:                             B L O B;
KW_BOOLEAN:                          B O O L E A N;
KW_BOTH:                             B O T H;
KW_BY:                               B Y;
KW_CALL:                             C A L L;
KW_CALLED:                           C A L L E D;
KW_CASCADED:                         C A S C A D E D;
KW_CASE:                             C A S E;
KW_CAST:                             C A S T;
KW_CEIL:                             C E I L;
KW_CHAR:                             C H A R;
KW_CHARACTER:                        C H A R A C T E R;
KW_CHECK:                            C H E C K;
KW_CLOB:                             C L O B;
KW_CLOSE:                            C L O S E;
KW_CLUSTER:                          C L U S T E R;
KW_COALESCE:                         C O A L E S C E;
KW_COLLATE:                          C O L L A T E;
KW_COLLECT:                          C O L L E C T;
KW_COLUMN:                           C O L U M N;
KW_COMMIT:                           C O M M I T;
KW_CONNECT:                          C O N N E C T;
KW_CONSTRAINT:                       C O N S T R A I N T;
KW_CONTAINS:                         C O N T A I N S;
KW_CONVERT:                          C O N V E R T;
KW_COUNT:                            C O U N T;
KW_CREATE:                           C R E A T E;
KW_CROSS:                            C R O S S;
KW_CUBE:                             C U B E;
KW_CUME_DIST:                        C U M E UNDERLINE_SIGN D I S T;
KW_CURRENT:                          C U R R E N T;
KW_CURSOR:                           C U R S O R;
KW_CYCLE:                            C Y C L E;
KW_DATE:                             D A T E;
KW_DATETIME:                         D A T E T I M E;
KW_DAY:                              D A Y;
KW_DEC:                              D E C;
KW_DECIMAL:                          D E C I M A L;
KW_DECLARE:                          D E C L A R E;
KW_DEFAULT:                          D E F A U L T;
KW_DEFINE:                           D E F I N E;
KW_DELIMITED:                        D E L I M I T E D;
KW_DELETE:                           D E L E T E;
KW_DESCRIBE:                         D E S C R I B E;
KW_DENSE_RANK:                       D E N S E UNDERLINE_SIGN R A N K;
KW_DISTINCT:                         D I S T I N C T;
KW_DISTRIBUTE:                       D I S T R I B U T E;
KW_DOUBLE:                           D O U B L E;
KW_DROP:                             D R O P;
KW_DRAIN:                            D R A I N;
KW_EACH:                             E A C H;
KW_ELSE:                             E L S E;
KW_END:                              E N D;
KW_EQUALS:                           E Q U A L S;
KW_ESCAPE:                           E S C A P E;
KW_EXCEPT:                           E X C E P T;
KW_EXECUTE:                          E X E C U T E;
KW_EXISTS:                           E X I S T S;
KW_EXPLAIN:                          E X P L A I N;
KW_EXTERNAL:                         E X T E R N A L;
KW_EXTRACT:                          E X T R A C T;
KW_FIRST_VALUE:                      F I R S T UNDERLINE_SIGN V A L U E;
KW_FALSE:                            F A L S E ;
KW_FIELDS:                           F I E L D S;
KW_FLOAT:                            F L O A T;
KW_FOR:                              F O R;
KW_FROM:                             F R O M;
KW_FROM_UNIXTIME:                    F R O M UNDERLINE_SIGN U N I X T I M E;
KW_FULL:                             F U L L;
KW_FUNCTION:                         F U N C T I O N;
KW_GLOBAL:                           G L O B A L;
KW_GRANT:                            G R A N T;
KW_GROUP:                            G R O U P;
KW_GROUPING:                         G R O U P I N G;
KW_GROUPS:                           G R O U P S;
KW_HAVING:                           H A V I N G ;
KW_HOUR:                             H O U R;
KW_IMPORT:                           I M P O R T;
KW_IN:                               I N;
KW_INCLUDING:                        I N C L U D I N G;
KW_INNER:                            I N N E R;
KW_INOUT:                            I N O U T;
KW_INSERT:                           I N S E R T;
KW_INT:                              I N T;
KW_INTEGER:                          I N T E G E R;
KW_INTERSECT:                        I  N T E R S E C T;
KW_INTERVAL:                         I N T E R V A L;
KW_INTO:                             I N T O;
KW_IS:                               I S;
KW_JOIN:                             J O I N;
KW_LAG:                              L A G;
KW_LANGUAGE:                         L A N G U A G E;
KW_LATERAL:                          L A T E R A L;
KW_LAST_VALUE:                       L A S T UNDERLINE_SIGN V A L U E;
KW_LEAD:                             L E A D;
KW_LEADING:                          L E A D I N G;
KW_LEFT:                             L E F T;
KW_LIKE:                             L I K E;
KW_LINES:                            L I N E S;
KW_LIMIT:                            L I M I T;
KW_LOCAL:                            L O C A L;
KW_LOCALTIMESTAMP:                   L O C A L T I M E S T A M P;
KW_MATCH:                            M A T C H;
KW_MATCH_RECOGNIZE:                  M A T C H UNDERLINE_SIGN R E C O G N I Z E;
KW_MEASURES:                         M E A S U R E S;
KW_MERGE:                            M E R G E;
KW_METADATA:                         M E T A D A T A;
KW_MINUS:                            M I N U S;
KW_MINUTE:                           M I N U T E;
KW_MODIFIES:                         M O D I F I E S ;
KW_MODULE:                           M O D U L E;
KW_MONTH:                            M O N T H;
KW_MULTISET:                         M U L T I S E T;
KW_NATURAL:                          N A T U R A L;
KW_NEXT:                             N E X T ;
KW_NO:                               N O;
KW_NONE:                             N O N E;
KW_NOT:                              N O T;
KW_NTH_VALUE:                        N T H UNDERLINE_SIGN V A L U E;
KW_NTILE:                            N T I L E;
KW_NULL:                             N U L L;
KW_NUMERIC:                          N U M E R I C;
KW_OF:                               O F;
KW_OFFSET:                           O F F S E T;
KW_ON:                               O N;
KW_ONE:                              O N E;
KW_OR:                               O R;
KW_ORDER:                            O R D E R;
KW_OUT:                              O U T;
KW_OUTER:                            O U T E R;
KW_OVER:                             O V E R;
KW_OVERLAY:                          O V E R L A Y;
KW_PARTITION:                        P A R T I T I O N;
KW_PATTERN:                          P A T T E R N;
KW_PER:                              P E R;
KW_PERCENT:                          P E R C E N T;
KW_PERCENT_RANK:                     P E R C E N T UNDERLINE_SIGN R A N K;
KW_PERIOD:                           P E R I O D;
KW_POSITION:                         P O S I T I O N;
KW_POWER:                            P O W E R;
KW_PRIMARY:                          P R I M A R Y;
KW_RANGE:                            R A N G E;
KW_ROW_NUMBER:                       R O W UNDERLINE_SIGN N U M B E R;
KW_RANK:                             R A N K;
KW_RESET:                            R E S E T;
KW_REVOKE:                           R E V O K E;
KW_RIGHT:                            R I G H T;
KW_RLIKE:                            R L I K E;
KW_ROLLBACK:                         R O L L B A C K;
KW_ROLLUP:                           R O L L U P ;
KW_ROW:                              R O W;
KW_ROWS:                             R O W S;
KW_SAVEPOINT:                        S A V E P O I N T;
KW_SECOND:                           S E C O N D;
KW_SELECT:                           S E L E C T;
KW_SET:                              S E T;
KW_SHOW:                             S H O W;
KW_SIMILAR:                          S I M I L A R ;
KW_SORT:                             S O R T;
KW_SKIP:                             S K I P;
KW_SMALLINT:                         S M A L L I N T;
KW_START:                            S T A R T;
KW_STATIC:                           S T A T I C;
KW_SUBSTRING:                        S U B S T R I N G ;
KW_SUM:                              S U M;
KW_SYMMETRIC:                        S Y M M E T R I C;
KW_SYSTEM:                           S Y S T E M;
KW_SYSTEM_TIME:                      S Y S T E M UNDERLINE_SIGN T I M E;
KW_SYSTEM_USER:                      S Y S T E M UNDERLINE_SIGN U S E R;
KW_TABLE:                            T A B L E;
KW_TABLESAMPLE:                      T A B L E S A M P L E;
KW_TERMINATED:                       T E R M I N A T E D;
KW_THEN:                             T H E N;
KW_TIME:                             T I M E;
KW_TIMESTAMP:                        T I M E S T A M P;
KW_TIMESTAMP_3:                      T I M E S T A M P'(' '3' ')';
KW_TIMESTAMP_6:                      T I M E S T A M P'(' '6' ')';
KW_TIMESTAMP_9:                      T I M E S T A M P'(' '9' ')';
KW_TINYINT:                          T I N Y I N T ;
KW_TO:                               T O;
KW_TRAILING:                         T R A I L I N G;
KW_TRUE:                             T R U E;
KW_TRUNCATE:                         T R U N C A T E;
KW_UNION:                            U N I O N;
KW_UNIQUE:                           U N I Q U E;
KW_UNKNOWN:                          U N K N O W N;
KW_UNNEST:                           U N N E S T;
KW_UPDATE:                           U P D A T E;
KW_UPPER:                            U P P E R;
KW_UPSERT:                           U P S E R T;
KW_USER:                             U S E R;
KW_USING:                            U S I N G;
KW_VALUE:                            V A L U E;
KW_VALUES:                           V A L U E S;
KW_VARBINARY:                        V A R B I N A R Y;
KW_VARCHAR:                          V A R C  H A R;
KW_WHEN:                             W H E N;
KW_WHERE:                            W H E R E;
KW_WINDOW:                           W I N D O W;
KW_WITH:                             W I T H;
KW_WITHIN:                           W I T H I N;
KW_WITHOUT:                          W I T H O U T;
KW_YEAR:                             Y E A R;
KW_MATERIALIZED:                     M A T E R I A L I Z E D;
KW_FRESHNESS:                        F R E S H N E S S;
KW_REFRESH_MODE:                     R E F R E S H UNDERLINE_SIGN M O D E;
KW_CONTINUOUS:                       C O N T I N U O U S;
KW_SERDE:                            S E R D E ;
KW_SERDEPROPERTIES:                  S E R D E P R O P E R T I E S;
KW_SUSPEND:                          S U S P E N D;
KW_RESUME:                           R E S U M E;
KW_REFRESH:                          R E F R E S H;
KW_DISTRIBUTED:                      D I S T R I B U T E D;
KW_DISTRIBUTION:                     D I S T R I B U T I O N;
KW_HASH:                             H A S H;
KW_BUCKETS:                          B U C K E T S;


// fragment a-z
fragment A: ('A'|'a');
fragment B: ('B'|'b');
fragment C: ('C'|'c');
fragment D: ('D'|'d');
fragment E: ('E'|'e');
fragment F: ('F'|'f');
fragment G: ('G'|'g');
fragment H: ('H'|'h');
fragment I: ('I'|'i');
fragment J: ('J'|'j');
fragment K: ('K'|'k');
fragment L: ('L'|'l');
fragment M: ('M'|'m');
fragment N: ('N'|'n');
fragment O: ('O'|'o');
fragment P: ('P'|'p');
fragment Q: ('Q'|'q');
fragment R: ('R'|'r');
fragment S: ('S'|'s');
fragment T: ('T'|'t');
fragment U: ('U'|'u');
fragment V: ('V'|'v');
fragment W: ('W'|'w');
fragment X: ('X'|'x');
fragment Y: ('Y'|'y');
fragment Z: ('Z'|'z');


// Operators. Bit
// todo reduce
BIT_NOT_OP:                          '~';
BIT_OR_OP:                           '|';
BIT_AND_OP:                          '&';
BIT_XOR_OP:                          '^';


// Operators. Comparation
EQUAL_SYMBOL:                        '=';
GREATER_SYMBOL:                      '>';
LESS_SYMBOL:                         '<';
EXCLAMATION_SYMBOL:                  '!';


//fragment SLASH_TEXT_FRAG:            [/\\] (~([/\\ ] | '(' | ')' | ';'))*;
fragment EXPONENT_NUM_PART:          'E' [-+]? DEC_DIGIT+;
fragment ID_LITERAL_FRAG:            [A-Z_0-9a-z]*?[A-Z_a-z]+?[A-Z_0-9a-z]*;
fragment DEC_DIGIT:                  [0-9];
fragment DQUOTA_STRING:              DOUBLE_QUOTE_SYMB ( '\\'. | '"' '"' | ~( '`'| '\\') )* DOUBLE_QUOTE_SYMB;
fragment SQUOTA_STRING:              '\'' ('\\'. | '\\' | ~('\'' | '\\'))* '\'';
//fragment BIT_STRING_L:               'B' '\'' [01]+ '\'';
fragment BQUOTA_STRING:             REVERSE_QUOTE_SYMB ( '\\'. | '`' '`' | ~( '`'|'\\'))* REVERSE_QUOTE_SYMB;

// Constructors symbols

DOT:                                 '.';
LS_BRACKET:                          '[';
RS_BRACKET:                          ']';
LR_BRACKET:                          '(';
RR_BRACKET:                          ')';
LB_BRACKET:                          '{';
RB_BRACKET:                          '}';
COMMA:                               ',';
SEMICOLON:                           ';';
AT_SIGN:                             '@';
DOLLAR:                               '$';
SINGLE_QUOTE_SYMB:                   '\'';
DOUBLE_QUOTE_SYMB:                   '"';
REVERSE_QUOTE_SYMB:                  '`';
COLON_SYMB:                          ':';
ASTERISK_SIGN:                       '*';
UNDERLINE_SIGN:                      '_';
HYPNEN_SIGN:                         '-';
ADD_SIGN:                            '+';
PENCENT_SIGN:                        '%';
DOUBLE_VERTICAL_SIGN:                '|' '|';
DOUBLE_HYPNEN_SIGN:                  '-' '-';
SLASH_SIGN:                          '/';
QUESTION_MARK_SIGN:                  '?';
DOUBLE_RIGHT_ARROW:                  '=' '>';
STRING_LITERAL:                      DQUOTA_STRING | SQUOTA_STRING | BQUOTA_STRING;
DIG_LITERAL:                         DEC_DIGIT+;
REAL_LITERAL:                        (DEC_DIGIT+)? '.' DEC_DIGIT+
                                     | DEC_DIGIT+ '.' EXPONENT_NUM_PART
                                     | (DEC_DIGIT+)? '.' (DEC_DIGIT+ EXPONENT_NUM_PART)
                                     | DEC_DIGIT+ EXPONENT_NUM_PART;
ID_LITERAL:                          ID_LITERAL_FRAG;



projectItemDefinition
    : (overWindowItem) #flinkStyleProjectItem
    | (expression (KW_AS? expression)?) #common
    ;

selectStatement
    : (selectClause fromClause whereClause? groupByClause? havingClause? windowClause?) #commonSQL
    | (selectClause fromClause matchRecognizeClause) #selectWithMatchRecognize
    ;

selectClause
    : KW_SELECT  (ASTERISK_SIGN | projectItemDefinition (COMMA projectItemDefinition)*)
    ;


insertStatement
    : (KW_EXECUTE? insertSimpleStatement) #commonInsert
    ;


joinOp:
    flinkJoinOp
    ;

tableExpression
    : tableReference (COMMA tableReference)*
    | tableExpression KW_NATURAL? joinOp? KW_OUTER? KW_SEMI? KW_JOIN tableExpression  joinCondition? (COMMA tableReference)*
    | tableExpression KW_CROSS KW_JOIN tableExpression
    | inlineDataValueClause
    | windowTVFClause
    ;



createTable
    : simpleCreateTable
    ;

overWindowItem
    : primaryExpression KW_OVER windowSpec KW_AS? identifier
    ;

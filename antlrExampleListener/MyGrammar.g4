grammar MyGrammar;

// rules
myStart :  block+ EOF;

block
 : stat+
 ;

// rules
stat:   if_stat #ifStatement
    | variable_stat #variableStatement
    | print_stat #printStatement
    | expr #otherExpression
    ;

if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

condition_block
 : OPAR expr CPAR stat_block
 ;

stat_block
 : LEFTCURL block RIGHTCURL
 | stat
 ;

//stat must be changed to expr
variable_stat
        : variable_block variable_name                   #initVar
        | variable_block variable_name EQUAL value_block #initVarWithValue
        | variable_block variable_name EQUAL expr        #initVarWithStatementValue
        | variable_block variable_name EQUAL variable_stat #initVarToVar
        ;

variable_block :
    BOOL_INIT #boolVariable
    |   STRING_INIT  #stringVariable
    |   INT_INIT     #intVariable
    |   CHAR_INIT    #charVariable
    ;

variable_name :
    IDENTIFIER #variableName
    ;

print_stat
        : PRINT OPAR print_content CPAR
        ;

print_content
        : expr #printExpr
        | variable_stat #printVariable
        ;

value_block :
    INT #intValue
    | STRING #stringValue
    | BOOL #booleanValue
    | IDENTIFIER #otherVariable
    ;

expr:   expr op=(MUL|DIV) expr #  MulDiv
    |   expr op=(ADD|SUB) expr #  AddSub
    |   expr op=POW expr # Pow
    |   expr op=FACT  #  Fact
    |   NOT expr # Not
    |   expr OR expr # Or
    |   expr AND expr # And
    |   expr op=(EQUAL | NEQUAL | EQUALCHECK) expr # Equality
    |   OPAR expr CPAR  # parens
    |   INT     # int
    |   BOOL    # bool
    |   STRING  # string
    |   IDENTIFIER # identifier
    |   IF # if
    |   ELSE # else
    |   EQUALCHECK #equalcheck
    |   INT_INIT #intInit
    |   STRING_INIT #stringInit
    ;

// tokens
LEFTCURL : '{';
RIGHTCURL : '}';
OPAR: '(';
CPAR: ')';
MUL:    '*';
DIV:    '/';
ADD:    '+';
SUB:    '-';
POW:    '^';
FACT:   '!';
NOT: 'not';
AND: '&&';
OR: '||';
INT_INIT: 'int_var';
STRING_INIT: 'string_var';
BOOL_INIT: 'bool_var';
CHAR_INIT: 'char_var';
PRINT: 'print';
IF: 'if';
ELSE: 'else';
FOR: 'for';
EQUAL: '=';
NEQUAL: '!=';
EQUALCHECK: '==';
INT     : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip;
BOOL : 'true' | 'false';
STRING : '"' (~["])+ '"';
IDENTIFIER : [a-zA-Z_] [a-zA-Z_0-9]* ;

//CHAR : .;



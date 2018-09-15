grammar Toyl;

file : statementList;

statementList : statement*;

// Statements
statement : procedureDecl
          | IF LPAREN condition RPAREN THEN LBRACE trueBranch=statementList RBRACE
          | IF LPAREN condition RPAREN THEN LBRACE trueBranch=statementList RBRACE ELSE LBRACE falseBranch=statementList RBRACE
          | WHILE LPAREN condition RPAREN LBRACE loopBranch=statementList RBRACE
          | VARDECL newVariable=variable ASSIGN expression SEP
          | oldVariable=variable ASSIGN expression SEP
          | expression SEP;

// Expressions
condition returns [boolean value]: expression;

expression : LPAREN nestedExpression=expression RPAREN
           | variable
           | literal
           | procedureCall
           | IF LPAREN condition RPAREN THEN trueBranch=expression ELSE falseBranch=expression
           | left=expression operator=(MUL | DIV | MOD) right=expression
           | left=expression operator=(PLUS | MINUS) right=expression
           | left=expression operator=(GT | GEQ | LT | LEQ) right=expression
           | left=expression operator=(EQ | NEQ) right=expression
           | left=expression operator=(AND | OR) right=expression;

// Procedures and arguments
procedureDecl : FUN functionName LPAREN declArgumentsList RPAREN (COLON variableType)? LBRACE statementList (RETURN expression SEP)? RBRACE;
procedureCall : functionName LPAREN callArgumentsList RPAREN;

declArgumentsList : parameterDecl (COMMA parameterDecl)* | ;
callArgumentsList : expression (COMMA expression)* | ;

functionName : VAR;
parameterDecl : variable COLON variableType;

// Variables, constants and types
variableType : NUMTYPE | BOOLTYPE;
variable     : VAR;
literal      : NUM | TRUE | FALSE;

// Whitespaces and comments
WS : [ \t\r\n] -> skip;

ONE_LINE_COMMENT : '//' ~[\r\n] -> skip;

MULTILINE_COMMENT: '/*' .*? '*/' -> skip;

// Keywords

IF       : 'if';
THEN     : 'then';
ELSE     : 'else';
WHILE    : 'while';
RETURN   : 'return';
FUN      : 'fun';
VARDECL  : 'var';
NUMTYPE  : 'num';
BOOLTYPE : 'bool';
TRUE     : 'true';
FALSE    : 'false';

// Separators

SEP    : ';';
COLON  : ':';
COMMA  : ',';
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';

// Operators

PLUS   : '+';
MINUS  : '-';
MUL    : '*';
DIV    : '/';
MOD    : '%';
EQ     : '==';
NEQ    : '!=';
LT     : '<';
LEQ    : '<=';
GT     : '>';
GEQ    : '>=';
AND    : '&&';
OR     : '||';
ASSIGN : ':=';

// Literals

NUM             : ('+'|'-')?([0-9]+('.'[0-9]*)?)((('e'|'E')(('+'|'-')?)([0-9]+('.'[0-9]*)?)))?;

VAR             : [_]*[a-z][a-z0-9_]* ;
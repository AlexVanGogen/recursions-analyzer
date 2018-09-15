grammar Toyl;

file : statementList;

statementList : statement*;

// Statements
statement : procedureDecl
          | IF LPAREN condition RPAREN THEN LBRACE trueBranch=statementList RBRACE
          | IF LPAREN condition RPAREN THEN LBRACE trueBranch=statementList RBRACE ELSE LBRACE falseBranch=statementList RBRACE
          | WHILE LPAREN condition RPAREN LBRACE loopBranch=statementList RBRACE
          | VARDECL variable ASSIGN expression SEP
          | variable ASSIGN expression SEP
          | RETURN expression SEP
          | expression SEP;

// Expressions
condition returns [boolean value]: expression;

expression : LPAREN expression RPAREN
           | literal
           | procedureCall
           | IF LPAREN condition RPAREN THEN trueBranch=expression ELSE falseBranch=expression
           | left=expression operator=(MUL | DIV | MOD) right=expression
           | left=expression operator=(PLUS | MINUS) right=expression
           | left=expression operator=(GT | GEQ | LT | LEQ) right=expression
           | left=expression operator=(EQ | NEQ) right=expression
           | left=expression operator=(AND | OR) right=expression;

// Procedures and arguments
procedureDecl : FUN functionName LPAREN declArgumentsList RPAREN LBRACE statementList RBRACE;
procedureCall : functionName LPAREN callArgumentsList RPAREN;

declArgumentsList : parameterDecl (COMMA parameterDecl)* | ;
callArgumentsList : expression (COMMA expression)* | ;

functionName : VAR;
parameterDecl : variable COMMA variableType;

// Variables, constants and types
literal      : variable | variableType ;
variableType : NUMTYPE | BOOLTYPE;
variable     : VAR;

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
BOOL            : TRUE | FALSE;

VAR             : [_]*[a-z][a-z0-9_]* ;
# recursions-analyzer
Analyzer of (mutually) recursive procedures for the toy language

## Install & build

```bash
# Install
git clone https://github.com/AlexVanGogen/recursions-analyzer.git
cd recursions-analyzer
# Build
gradle installDist
```

## Run
```bash
sh run.sh -a filename # get AST of file `filename`
# or
sh run.sh -r filename # find all (mutually) recursive procedures
```

## Grammar

Toyl is a language with variables, numbers, boolean literals, arithmetic/logical expressions, basic control flows and procedures.

The full grammar of this language is described below:

```antlr
grammar Toyl;

file : statementList;

statementList : statement* | ;

// Statements
statement : procedureDecl
          | IF LPAREN condition RPAREN THEN LBRACE trueBranch=statementList RBRACE
          | IF LPAREN condition RPAREN THEN LBRACE trueBranch=statementList RBRACE ELSE LBRACE falseBranch=statementList RBRACE
          | WHILE LPAREN condition RPAREN LBRACE loopBranch=statementList RBRACE
          | VARDECL variableDecl ASSIGN expression SEP
          | variable ASSIGN expression SEP
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
variableDecl : variable (COLON variableType)?;

// Variables, constants and types
variableType : NUMTYPE | BOOLTYPE | UNITTYPE;
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
UNITTYPE : 'unit';
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
```

## Visibility scopes

We cannot to declare one variable or procedure twice in the same scope:

```
var x: num := 0;
var x: num := 1; // Error: Variable already defined: x
```

```
fun x() {}
fun x() { 1; } // Error: Procedure already exists: x()
```

Every variable must be declared and initialized before using. So the following code will produce an error:

```
var x: num := p; // Error: Variable not found: p
var p: num := 1;
```

But it's OK for procedures being used before its declaration:

```
var x: num := p(1); // OK

fun p(i: num): num {
    return i + 5;
}
```

However, it's impossible to access to variables and procedures that are declared in separate visibility scope:

```
var x: num := 1;

if (x <= 5) then {
    fun f(x: bool) { }
    var x: bool := true;
} else {
    var p := f(x < 3); // Error: Procedure not found: f(bool)
}
```

But it's OK to access to variables and procedures that are declared in enclosing visibility scopes:

```
var x: num := 1;

while (x < 5) {
    if (f(x, x == 5)) then {                                // OK
        var y: num := x - 5;                                // OK
    }
    fun f(a: num, b: bool): bool { return (a < x) && b; }   // OK
}
```

Note that procedures can be declared inside any scope (including body of another function):

```
fun f(x: num): num {
    fun g(x: num): num {
        return x + 1;
    }
    return x + g(x);
}
```

## Types

Every literal, variable, procedure and expression has one of three types:
* `num` for every real number
* `bool` for every boolean value (including conditional expressions)
* `unit` for procedures that return nothing (and variables initialized with such procedures)

In addition, program has something like type checker, so it's impossible to add booleans, have different types of branches of conditional expression, call inappropriate procedure, and so on:

```
5 + true; // Error: Expression must have type num but the right part has type bool
```

```
var x: num := 5;
var y: num := if (x < 6) then false else 5; // Error: Both branches of conditional expression must have the same type; got bool and num
```

```
fun f(x: num): num { return x + 1; }
fun g() { } /* returns unit */
var x: num := f(g()); // Error: Procedure not found: f(unit)
```

Types allow us to overload functions:

```
fun x() {}
fun x(z: num) { 1; } // OK
```

## Recursion analysis

Workflow:
1. Build an AST of program;
2. Collect variable and procedure declarations into visibility scopes;
3. Run type checker to verify the program and determine types for expressions, including types of procedure calls;
4. Construct procedure call graph;
5. Use this graph to find recursive procedures.

Steps 2 and 3 help us to reduce amount of possible procedure declarations, corresponding to given procedure call, to 1.

### Example 1

```
fun x(b: num, c: num): num {
    var d: num := b + c;
    return if (d <= b) then c else b;
}

var p: num := 1;
var l: num := 0;

while (p >= 0) {
    l := p * 2;
    p := p / 2;
}
```

Output:

```bash
$ sh run.sh -r src/main/resources/example.tl 
# Nothing
```

### Example 2

```
fun y(s: bool) {
    fun x(b: num, c: num): num {
        var d: num := b + c;
        return if (d <= b) then c else b;
    }

    var p: num := 1;
    var l: num := 0;

    fun y(s: num): num {
        var p: num := 2 * s;
        return if (p >= 2) then p else s;
    }

    while (p >= 0) {
        l := p * 2;
        p := p / x(p, y(l));
    }
}

var p: bool := true;

fun z(p: unit) {
    z(t());
}

fun z(x: num) {
    t();
    return y(true);
}

fun t() {
    var x := u(1);

    fun u(i: num) { z(u(i)); }

    return x;
}

fun plus(x: num, y: num): num {
    return x + y;
}

fun plus(x: bool, y: bool): bool {
    return x || y;
}

fun branch() {
    var z: num := plus(3, plus(1, 2));
    if (z >= 5) then {
        t();
    } else {
        y(plus(z < 3, z < 2));
    }
}
```

Output:

```bash
$ sh run.sh -r src/main/resources/example2.tl 
Recursion found: z(unit) -> z(unit)     [chain: -]
Recursion found: z(unit) -> t() -> u(num) -> z(unit)    [chain: -]
Recursion found: u(num) -> u(num)       [chain: z(unit) -> t() -> u(num)]
Recursion found: z(unit) -> z(unit)     [chain: z(num) -> t() -> u(num) -> z(unit)]
Recursion found: t() -> u(num) -> z(unit) -> t()        [chain: z(num) -> t()]
Recursion found: u(num) -> u(num)       [chain: z(num) -> t() -> u(num)]
Recursion found: z(unit) -> z(unit)     [chain: branch() -> t() -> u(num) -> z(unit)]
Recursion found: t() -> u(num) -> z(unit) -> t()        [chain: branch() -> t()]
Recursion found: u(num) -> u(num)       [chain: branch() -> t() -> u(num)]
```

You can see recursion cycles and procedure call chains that lead to that cycle.

### Example 3

```
fun a(x: num, y: num, z: num) {
    a(x, y, z);
}

fun a(x: num, y: num) {
    a(x, y, 0);
}

fun a(x: num) {
    a(x, 1);
}

fun a() {
    a(2);
}
```

Output:

```bash
$ sh run.sh -r src/main/resources/example3.tl 
Recursion found: a(num, num, num) -> a(num, num, num)   [chain: -]
Recursion found: a(num, num, num) -> a(num, num, num)   [chain: a(num, num) -> a(num, num, num)]
Recursion found: a(num, num, num) -> a(num, num, num)   [chain: a(num) -> a(num, num) -> a(num, num, num)]
Recursion found: a(num, num, num) -> a(num, num, num)   [chain: a() -> a(num) -> a(num, num) -> a(num, num, num)]
```

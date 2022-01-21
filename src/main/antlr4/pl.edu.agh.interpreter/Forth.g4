grammar Forth;
/*
Welcome to my Forth grammar
*/
/*
    Parser
*/

//the beginning
forth: zeroOrMoreStatement EOF?;

//self explanatory
zeroOrMoreStatement : WHITESPACE* (statement WHITESPACE+)* statement? WHITESPACE* ;

//statement is a fundamental action in forth
//I decided to split statement into either a regular statement
//or a function definition
//this is to avoid defining functions within functions
statement:
regularStatement
| defineFun
;

//list of all things that can be a regular statement
regularStatement :
push
| constant
| variable
| callEnv
| printString
| ifElse
| ifRegular
| doLoop
| untilLoop
| printSimple
| set
| deref
| printVar
| arithmetic
| comparison
| modifyVar
| stackManipulation
| callI ;

//push an integer onto the Stack
push : INTEGER ;

//print STRING token
printString : '.' WHITESPACE* STRING;

//define constant into the Environment
constant : 'constant' WHITESPACE+ IDENTIFIER ;

//define variable into the Environment
variable: 'variable' WHITESPACE+ IDENTIFIER ;

// if top of the stack contains -1 (true)
//then execute first "zeroOrMoreRegularStatement"
//else if top of the stack is 0 (false)
//then execute second "zeroOrMoreRegularStatement"
ifElse : 'if' WHITESPACE+
zeroOrMoreRegularStatement
'else' WHITESPACE+
zeroOrMoreRegularStatement
 'then' ;

//an if clause without the "else" part
ifRegular : 'if' WHITESPACE+
zeroOrMoreRegularStatement
'then' ;

//function definition
// a function is an environment variable with name anad a list of statements to execute
defineFun: ':'WHITESPACE+ IDENTIFIER WHITESPACE+ zeroOrMoreRegularStatement ';';

//"for" loop
//pops 2 values from the Stack (start and finish) and executes statments between 'do' and 'loop' finish-start times
doLoop : 'do' WHITESPACE+
zeroOrMoreRegularStatement
'loop' ;

//a begin until loop
//every time an "until" keyword is met, Forth pops a value from the Stack,
// if that value is 0 (false),
//then it comes back to the "begin" keyword and executes statements again
//if that value is -1 (true)
//then the standard execution continues from this point
untilLoop : 'begin' WHITESPACE+
zeroOrMoreRegularStatement
'until' ;

//simply calls "i" environment variable
callI : 'i' ;

//pop 2 values from the stack and push result of corresponding arithmetic operation
arithmetic :
'+' |
'-' |
'*' |
'/' |
'mod' ;

//same as with arithmetic, but push -1(true) or 0(true) on to the Stack, depending on the comparison result
comparison :
'>' |
'<' |
'=' |
'>=' |
'<=' ;

//to the memory address at the top of the stack
//assign value below that address
set: '!' ;

//push value of the variable, which adress is at the top of the Stack
deref: '@' ;

//print value of the variable, which adress is at the top of the Stack
printVar: '?' ;

//perform an arithmetic operation to the variable, which address is at the top of the Stack
modifyVar :
'+!' |
'-!' |
'*!' |
'/!' |
'mod!' ;

//various stack or output manipulation statements
stackManipulation :
'and'   |
'or'    |
'invert'|
'dup'   |
'drop'  |
'swap'  |
'over'  |
'rot'   |
'emit'  |
'cr'    ;

//pop a value from the Stack and print it
printSimple: '.' ;

//this token is used by every other token, that requires other statements to be executed
//that is: if...then,
// if...else...then,
// do...loop,
// begin...until,
// : function_name ... ;
zeroOrMoreRegularStatement : WHITESPACE* (regularStatement WHITESPACE+)* regularStatement? WHITESPACE* ;

//last rule, if nothing matches then this is a call to the environment variable
callEnv : IDENTIFIER;

/*
    Lexer
*/

//all here is self explanatory
INTEGER : '-'?[0-9]+ ;
IDENTIFIER : LETTER CHARACTER*;
CHARACTER : (LETTER | INTEGER | '-' | '_' ) ;
LETTER : [a-zA-Z] ;
WHITESPACE : (' ' | '\t' | '\n' | '\r') ;
//String is everything between '"' that is not '"'
STRING : '"' ( '\\"' | . )*? '"' ;

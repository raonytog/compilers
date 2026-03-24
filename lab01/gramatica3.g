lexer grammar gramatica3;

WS : [ \t\n]+ -> skip ;

DIGITO : [0-9]+ ;

// operators
PLUS : '+' ;
MINUS : '-' ;
TIMES : '*' ;
DIV : '/' ;

// comparisons
EQUAL : '=' ;
LT : '<' ;
GT : '>' ;
LE : '<=' ;
GE : '>=' ;
EQ : '==' ;
NEQ : '!=' ;
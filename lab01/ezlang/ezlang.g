lexer grammar ezlang;

// Pula espaços e comentários:
WS : [ \t\n] -> skip ;
COMENT : LBRACE ~['}']* RBRACE -> skip;

// Palavras reservadas:
BEGIN : 'begin' ;
END : 'end' ;

IF : 'if' ;
ELSE : 'else' ;

TRUE : 'true' ;
FALSE : 'false' ;

BOOL_TYPE : 'bool' ;
STRING_TYPE : 'string' ;
INT_TYPE : 'int' ;
FLOAT_TYPE : 'float' ;

PROGRAM : 'program' ;
READ : 'read' ;
REAL : 'real' ;
REPEAT : 'repeat' ;
THEN : 'then' ;
UNTIL : 'until' ;
VAR : 'var' ;
WRITE : 'write' ;

// Símbolos especiais:
ASSIGN : ':=' ;
EQUAL : '=' ;
LESS_THAN : '<' ;
PLUS : '+' ;
MINUS : '-' ;
MULTIPLY : '*' ;
DIVIDE : '/' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACE : '{' ;
RBRACE : '}' ;
SEMICOLON : ';' ;

// IDs e valores dos tipos:
ID : [A-Za-z][A-Za-z0-9]*;
INT_VALUE : [0-9]+ ;
FLOAT_VALUE : INT_VALUE '.' INT_VALUE ;
STRING_VALUE : '"' ~["]* '"' ;


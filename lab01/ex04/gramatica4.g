// transform uppercase into lowercase
lexer grammar gramatica4;

LOWERCASE : [a-z] ;
UPPERCASE : [A-Z] -> type(LOWERCASE) ;
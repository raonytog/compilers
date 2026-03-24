// exercicio de placa de carro
lexer grammar gramatica6;

WS : [ \t\n]+ -> skip ;

LETRA : [A-Z] ;
DIGITO : [0-9] ;
SEMICOLON : ';' ;
HYPHEN : '-' ;

PLACA : LETRA LETRA LETRA HYPHEN DIGITO DIGITO DIGITO DIGITO;
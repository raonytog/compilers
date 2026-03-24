lexer grammar gramatica2;

// whise space
WS : [ \t\n]+ -> skip ;

// random words
GAG : 'gag' ;
OLD : 'old' ;
YAG : 'yag' ;
BETA : 'beta' ;
CRU : 'cru' ;
PERIOT : '.' ;
COMMA : ',' ;
EXCLAM : '!' ;

// numbers
DIGITO : [0-9] ;
DEZENA : DIGITO DIGITO ;
CENTENA : DEZENA DIGITO ;
MILHAR : CENTENA DIGITO ;
MILHAO : MILHAR DIGITO ;

// conditional
IF : 'if' ;
ELSE : 'else' ;

// reconize 32 bit hexadecimal
lexer grammar gramatica5;

fragment HEX_DIGIT : [0-9a-fA-F] ;
HEX_NUMBER : '0' [xX] HEX_DIGIT? HEX_DIGIT? HEX_DIGIT? HEX_DIGIT? HEX_DIGIT? HEX_DIGIT? HEX_DIGIT? HEX_DIGIT? ;

OTHER : . { System.out.print(getText()); };
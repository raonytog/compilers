grammar Exemplo04;

begin:
  expr+
;

expr:
  PARENTESESL expr PARENTESESR
| A
;

op:
  EQ | LT | GT
;

INT_VAL : [0-9]+ ;
LT      : '<'    ;
GT      : '>'    ;
EQ      : '='    ;
SEMI    : ';'    ;
WS      : [ \t\n]+ -> skip ;
PARENTESESL : '(' ;
PARENTESESR : ')' ;
A : 'a' ;


grammar EZLang;
 
@header {
    package parser;
}

program:
  PROGRAM ID SEMI 
  vars_sect 
  stmt_sect
  EOF
;

vars_sect:
  VAR var_decl*
;

var_decl:
  type_spec ID SEMI
;

type_spec: BOOL | INT | REAL | STRING
;

stmt_sect:
  BEGIN stmt+ END
;

stmt:
  assign_stmt
| if_stmt
| read_stmt
| repeat_stmt
| write_stmt
;

assign_stmt:
  ID ASSIGN expr SEMI
;

if_stmt:
  IF expr THEN stmt+ (ELSE stmt+)? END
;

read_stmt:
  READ ID SEMI
;

repeat_stmt:
  REPEAT stmt+ UNTIL expr
;

write_stmt:
  WRITE expr SEMI
;

expr:
  expr (TIMES | OVER) expr  # timesOver
| expr (PLUS | MINUS) expr  # plusMinus
| expr (EQ | LT) expr       # eqLt
| LPAR expr RPAR            # exprPar
| TRUE                      # exprTrue
| FALSE                     # exprFalse
| INT_VAL                   # exprIntVal
| REAL_VAL                  # exprRealVal
| STR_VAL                   # exprStrVal
| ID                        # exprId
;

WS       : [ \t\n]+      -> skip ;
COMMENTS : '{' ~[}]* '}' -> skip ;

BEGIN   : 'begin'   ;
BOOL    : 'bool'    ;
ELSE    : 'else'    ;
END     : 'end'     ;
FALSE   : 'false'   ;
IF      : 'if'      ;
INT     : 'int'     ;
PROGRAM : 'program' ;
READ    : 'read'    ;
REAL    : 'real'    ;
REPEAT  : 'repeat'  ;
STRING  : 'string'  ;
THEN    : 'then'    ;
TRUE    : 'true'    ;
UNTIL   : 'until'   ;
VAR     : 'var'     ;
WRITE   : 'write'   ;

ASSIGN : ':=' ;
EQ     : '='  ;
LPAR   : '('  ;
LT     : '<'  ;
MINUS  : '-'  ;
OVER   : '/'  ;
PLUS   : '+'  ;
RPAR   : ')'  ;
SEMI   : ';'  ;
TIMES  : '*'  ;

INT_VAL  : [0-9]+            ;
REAL_VAL : [0-9]+ '.' [0-9]+ ;
STR_VAL  : '"' ~["]* '"'     ;

ID : [a-zA-Z]+ ;

UNKNOWN : . ;
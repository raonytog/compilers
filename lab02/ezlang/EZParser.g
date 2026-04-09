parser grammar EZParser;

options {
    tokenVocab = EZLexer;
}

program : 
    PROGRAM ID SEMI vars_sect stmt_sect ;

vars_sect : 
    VAR var_decl* ;

var_decl : 
    type_spec ID SEMI ;

type_spec : 
    BOOL 
    | INT 
    | REAL 
    | STRING 
;

stmt_sect : 
    BEGIN stmt+ END 
;

stmt : 
    assign_stmt 
    | if_stmt 
    | read_stmt 
    | repeat_stmt 
    | write_stmt 
;

assign_stmt : 
    ID ASSIGN expr SEMI; 

if_stmt : 
    IF expr THEN stmt+ (ELSE stmt+)? END; 

read_stmt : 
    READ ID SEMI; 

repeat_stmt : 
    REPEAT stmt+ UNTIL expr ;

write_stmt : 
    WRITE expr SEMI ;

expr : 
      expr op_l1 expr
    | expr op_l2 expr
    | expr op_l3 expr
    | LPAR expr RPAR 
    | TRUE 
    | FALSE 
    | INT_VAL 
    | REAL_VAL 
    | STR_VAL 
    | ID 
;

op_l1 : 
    TIMES | OVER 
;

op_l2 :
    PLUS | MINUS
;

op_l3 :
    LT | EQ
;
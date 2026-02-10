grammar main;

s
    : dec cond EOF
    ;

dec
    : ENTERO ID '=' INT             #DEC
    ;

cond
    : SI cmp                         #COND
    ;

cmp
    : ID op=('==' | '>' | '<') INT  #CMP
    ;


ENTERO : 'entero';
SI     : 'si';

INT    : DIGIT+;

ID     : LETTER (LETTER | DIGIT)*;

fragment LETTER : [a-zA-Z];
fragment DIGIT  : [0-9];

WS : [ \n\t\r]+ -> skip;

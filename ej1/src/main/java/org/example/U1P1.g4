grammar U1P1;

prule : nc ',' name ',' carrer ',' semester ',' gender ',' age ',' avg EOF;

nc       : NC;
name     : ID;
carrer   : ID;
semester : SEMESTER;
gender   : ID;
age      : INT;
avg      : FLOAT;

NC : DIGITO DIGITO '09' DIGITO DIGITO DIGITO DIGITO ;

ID : [a-zA-Z]+;

SEMESTER : DIGITO_1_9
         | '1' '0'
         | '1' '1'
         | '1' '2' ;

INT : [0-9]+;

FLOAT : '100.00' | DIGITO DIGITO '.' DIGITO DIGITO | DIGITO '.' DIGITO DIGITO;

WS : [ \t\r\n]+ -> skip;

COMMA : ',';
fragment DIGITO : [0-9] ;
fragment DIGITO_1_9 : [1-9] ;
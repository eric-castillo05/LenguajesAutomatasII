grammar main;

archivo : lista_calificaciones EOF ;

lista_calificaciones : NUMERO (','? NUMERO)* ;

NUMERO : [0-9]+ ;
WS     : [ \t\r\n]+ -> skip ;

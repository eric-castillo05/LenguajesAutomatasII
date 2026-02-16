grammar main;

s:
    (LET COM)* LET TERM EOF #EXP
    ;

LET:
    [a-z]
;

COM: ',';

TERM: ';';

WS: [ \n\t\r] -> skip;
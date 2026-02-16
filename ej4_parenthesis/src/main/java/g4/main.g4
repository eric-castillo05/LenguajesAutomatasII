grammar main;

s: ('(' | ')')+     #EXP
    ;

WS: [ \n\t\r] -> skip;
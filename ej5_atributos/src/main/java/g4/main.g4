grammar main;

s returns [int c]

@init {$c = 0;}:
    let {$c++;}
    (com let {$c++;})*
    term EOF
    {System.out.println($c);}
;

let: LET;
LET: [a-z];
com: COM;
COM: ',';
term: TERM;
TERM: ';';

WS: [ \t\n\r] -> skip;

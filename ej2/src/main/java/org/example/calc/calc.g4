grammar calc;

p: exp EOF;

exp: exp op = ('*' | '/') exp   #MD
    | exp op = ('+' | '-') exp  #SR
    | INT                       #Int
    | '(' exp ')'               #Pa
    ;

INT: [0-9];

WS: [ \n\t\r] -> skip;


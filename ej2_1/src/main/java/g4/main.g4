grammar main;

s: exp EOF;

exp: exp op = ('-' | '+') exp   #ADDITATIVE_OPS
    | exp op = ('*' | '/') exp  #MULTIPLICATIVE_OPS
    | INT                       #INT
    | '(' exp ')'               #PARENTHESES
    | op = ('+' | '-') INT      #SIGNED_INT;


INT: [0-9]+;

WS: [ \t\n\r] -> skip;
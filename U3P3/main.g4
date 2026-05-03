grammar main;

s: expr EOF;

expr: expr ('+' | '-') md
    | md
    ;

md: md ('*' | '/') pl
    | pl
    ;

pl: '(' expr ')'
      | LETTER
      ;

LETTER: [a-z];

WS: [ \t\r\n]+ -> skip;
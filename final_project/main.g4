grammar main;

s: expr+ EOF;

expr: 'Orden' name = LETTER preparation_time = NUMBER deliver_time = NUMBER max_deliver_time = NUMBER penalization = NUMBER;

LETTER: [A-Z];

NUMBER: [0-9]+;

WS: [ \t\r\n] -> skip;
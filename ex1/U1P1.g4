grammar U1P1;

// --- REGLAS DEL PARSER (Minúsculas) ---
prule : nc ',' name ',' carrer ',' semester ',' gender ',' age ',' avg EOF;

nc       : INT;    // El parser sabe que el primer INT es el NC
name     : ID;     // El parser sabe que el primer ID es el nombre
carrer   : ID;     // El segundo ID es la carrera
semester : INT;
gender   : ID;     // O podrías dejarlo como regla de lexer si es solo 'M' o 'F'
age      : INT;
avg      : FLOAT;

// --- REGLAS DEL LEXER (Mayúsculas) ---

// Un ID es cualquier palabra que empiece con letra
ID : [a-zA-Z]+;

// Un INT es cualquier secuencia de números
INT : [0-9]+;

// Un FLOAT reconoce números con punto decimal
FLOAT : [0-9]+ '.' [0-9]+;

// Saltamos espacios en blanco
WS : [ \t\r\n]+ -> skip;

// El resto de símbolos
COMMA : ',';

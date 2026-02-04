grammar ej2;


prule: (par)* ultimo EOF;


par: ('a' | 'b') ('a' | 'b');
ultimo: 'a' 'b' | 'b' 'b';
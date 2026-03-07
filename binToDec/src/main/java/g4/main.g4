grammar main;

s returns [int v]
    : n=NB
      c[Integer.parseInt($n.text)]
      {
          $v = $c.v;
          System.out.println("El valor en decimal es: " + $v);
      }
    ;

c [int h] returns [int v]
    : n=NB
      c[($h * 2) + Integer.parseInt($n.text)]
      {
          $v = $c.v;
      }
    | n=NB
      {
          $v = ($h * 2) + Integer.parseInt($n.text);
      }
    ;

NB : '0' | '1';
WS : [ \t\r\n]+ -> skip;
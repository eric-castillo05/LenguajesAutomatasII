grammar main;


precio returns[Float v]:
    entero {$v = $entero.v;} |
    real {$v = $real.v;}
;
entero returns[Float v]:
    c = Num{$v = Float.parseFloat($c.text);}
    ;

real returns [Float v]:
    a = Num '.' Num {Float.parseFloat($a.text) + '.' Float.parseFloat($b.text);}
    ;

descuento [Float h] returns [Float v]:
    n = entero {$v = $h - ($h * Float.parseFloat($n.text)/100);}
    ;

s returns [Float v]:
    p = precio
    d = descuento[$p.v]
    {System.out.prinln("El total a pagar es de " + $d.v);}
    ;

Num: [0-9];

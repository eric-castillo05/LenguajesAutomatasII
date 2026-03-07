grammar main;

s returns[int ans]
@init {$ans = 0;}:
    num1 = NUM
    op = OP
    num2 = NUM
    EOF
    {
    int n1 = Integer.parseInt($num1.getText());
    int n2 = Integer.parseInt($num2.getText());

    if (n1 == 0) { System.out.println("0"); }
    if (n2 == 0) { System.out.println("Error: -1");}
    System.out.println("Ans: " + n1 / n2);

    }
    ;

OP: '/';
NUM: [0-9]+;

WS: [ \t\n\r] -> skip;
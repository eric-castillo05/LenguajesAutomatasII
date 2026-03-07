grammar main;

s returns [boolean flag]
@init {$flag = false;}:
    type=TYPE
    id
    equals
    num=NUM
    semicolon
    EOF

    {
        String t = $type.getText();
        String n = $num.getText();

        if(!(n.contains(".")) && t.equals("float")){
            System.out.println("Error");
        }
        if (t.equals("int") && n.contains(".")){
            System.out.println("Error");
        }
    }
    ;


//type: TYPE;
TYPE: 'int' | 'float';

id: ID;
ID: [a-zA-Z];

equals: EQUALS;
EQUALS: '=';

NUM: INT | FLOAT;
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;

semicolon: SEMICOLON;
SEMICOLON: ';';

WS: [ \t\r\n] -> skip;


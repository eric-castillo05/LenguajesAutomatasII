grammar main;

//s: ('(' | ')')+     #EXP
//    ;

s returns [Boolean $flag]
@init {$Stack<String> stack = new Stack<>()}
:
    op {$stack.push('(');}
    cp {if ($stack.isEmpty()) {
        return false;
        } else {
        $stack.pop();
        }
    }
    EOF
    {System.out.println($stack.isEmpty());}

;

op: OP;
OP: '(';
cp: CP;
CP: ')';
WS: [ \n\t\r] -> skip;
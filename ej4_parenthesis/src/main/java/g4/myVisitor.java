package g4;

import java.util.Stack;

public class myVisitor extends mainBaseVisitor<Boolean>{
    @Override public Boolean visitEXP(mainParser.EXPContext ctx) {
        String s = ctx.getText();
        Stack<String> stack = new Stack<>();
        System.out.println(s);
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '('){
                stack.push("(");
            } else if (c == ')'){
                if (stack.isEmpty()){
                    return false;
                } else {
                    stack.pop();
                }
            }

        }
        return stack.isEmpty();
    }

}

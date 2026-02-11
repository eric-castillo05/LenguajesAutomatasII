package g4;

import java.util.HashMap;
import java.util.Map;

public class myVisitor extends mainBaseVisitor<Integer>{
    private Map<String, Integer> mem = new HashMap<>();
    @Override public Integer visitDEC(mainParser.DECContext ctx) {
        String id = ctx.ID().getText();
        int value = Integer.parseInt(ctx.INT().getText());
        mem.put(id, value);
        return -1;
    }
    @Override public Integer visitCOND(mainParser.CONDContext ctx) {
        return visit(ctx.cmp());
    }
    @Override public Integer visitCMP(mainParser.CMPContext ctx) {
        String id = ctx.ID().getText();
        int l;
        if (mem.containsKey(id)){
            l = mem.get(id);
        } else {
            System.out.println("La variable " + id + " no ha sido declarada");
            return -1;
        }

        int r = Integer.parseInt(ctx.INT().getText());
        String op = ctx.op.getText();
        boolean ans =  false;
        if (op.equals(">")) {
            ans = l > r;
            System.out.println(l + " > " + r);
        } else if (op.equals("<")) {
            ans = l < r;
            System.out.println(l + " < " + r);
        } else if (op.equals("==")) {
            ans = l == r;
            System.out.println(l + " == " + r);
        }
        System.out.println(ans ? "Verdadero" : "Falso");
        System.out.println("El resultado es: " + (ans ? (l + r) : -1));
        if (ans) {
            return l + r;
        }
        return -1;
    }
}

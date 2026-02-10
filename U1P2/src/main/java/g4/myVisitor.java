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
        int l = mem.get(id);
        int r = Integer.parseInt(ctx.INT().getText());
        String op = ctx.op.getText();
        boolean ans =  false;
        if (op.equals(">")) {
            ans = l > r;
        } else if (op.equals("<")) {
            ans = l < r;
        } else if (op.equals("==")) {
            ans = l == r;
        }
        System.out.println(ans ? "Verdadero" : "Falso");
        if (ans) {
            return 1;
        }
        return 0;
    }
}

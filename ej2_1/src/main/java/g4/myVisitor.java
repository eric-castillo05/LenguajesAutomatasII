package g4;

public class myVisitor extends mainBaseVisitor<Integer>{
    @Override public Integer visitS(mainParser.SContext ctx) {
        return visit(ctx.exp());
    }

    @Override public Integer visitINT(mainParser.INTContext ctx) {
        return Integer.parseInt((ctx.INT().getText()));
    }

    @Override public Integer visitSIGNED_INT(mainParser.SIGNED_INTContext ctx) {
        if (ctx.op.getText().equals("-")){
            return -(Integer.parseInt(ctx.INT().getText()));
        }
        return Integer.parseInt(ctx.INT().getText());
    }
    @Override public Integer visitADDITATIVE_OPS(mainParser.ADDITATIVE_OPSContext ctx) {
        int l = visit(ctx.exp(0));
        int r = visit(ctx.exp(1));
        if (ctx.op.getText().equals("+")){
            return l + r;
        }
        return l - r;
    }
    @Override public Integer visitMULTIPLICATIVE_OPS(mainParser.MULTIPLICATIVE_OPSContext ctx) {
        int l = visit(ctx.exp(0));
        int r = visit(ctx.exp(1));

        if (ctx.op.getText().equals("/")) {
            if (r == 1) {
                return l;
            }
            if (l == 0 && r != 0) {
                return 0;
            }
            if (r == 0) {
                return -1;
            }
            return l / r;
        }
        return l * r;
    }

    @Override public Integer visitPARENTHESES(mainParser.PARENTHESESContext ctx) {
        return visit(ctx.exp());
    }

}

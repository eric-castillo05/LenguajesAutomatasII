package org.example.calc;

public class MyVisitor extends calcBaseVisitor<Integer>{
    @Override public Integer visitP(calcParser.PContext ctx) {
        return visit(ctx.exp());
    }
    @Override public Integer visitPa(calcParser.PaContext ctx) {
        return visit(ctx.exp());
    }
    @Override public Integer visitMD(calcParser.MDContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));
        if (ctx.op.getText().equals("*")) {
            return left * right;
        } else {
            return left / right;
        }
    }
    @Override public Integer visitInt(calcParser.IntContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }
    @Override public Integer visitSR(calcParser.SRContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));
        if (ctx.op.getText().equals("+")){
            return left + right;
        } else {
            return left -  right;
        }
    }

}

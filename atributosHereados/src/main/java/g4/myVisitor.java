package g4;

public class myVisitor extends mainBaseVisitor<Double>{
    @Override public Double visitEXP(mainParser.EXPContext ctx) {
        double p = Double.parseDouble(ctx.precio().getText());
        double d = Double.parseDouble(ctx.descuento().getText());
        return p - ((p * d) / 100);
    }

}

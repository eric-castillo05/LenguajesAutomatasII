package g4;

public class myVisitor extends mainBaseVisitor<Integer>{
    @Override public Integer visitEXP(mainParser.EXPContext ctx) {
        String s = ctx.getText();
        String[] temp = s.split(",");
        for (String t : temp){
            System.out.println(t);
        }
        System.out.println(temp.length);
        return ctx.getText().split(",").length;
    }


}

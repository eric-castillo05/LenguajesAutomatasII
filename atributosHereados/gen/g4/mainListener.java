// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/atributosHereados/src/main/java/g4/main.g4 by ANTLR 4.13.2
package g4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mainParser}.
 */
public interface mainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code EXP}
	 * labeled alternative in {@link mainParser#s}.
	 * @param ctx the parse tree
	 */
	void enterEXP(mainParser.EXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXP}
	 * labeled alternative in {@link mainParser#s}.
	 * @param ctx the parse tree
	 */
	void exitEXP(mainParser.EXPContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#descuento}.
	 * @param ctx the parse tree
	 */
	void enterDescuento(mainParser.DescuentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#descuento}.
	 * @param ctx the parse tree
	 */
	void exitDescuento(mainParser.DescuentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#precio}.
	 * @param ctx the parse tree
	 */
	void enterPrecio(mainParser.PrecioContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#precio}.
	 * @param ctx the parse tree
	 */
	void exitPrecio(mainParser.PrecioContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(mainParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(mainParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(mainParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(mainParser.RealContext ctx);
}
// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/ej2_1/src/main/java/g4/main.g4 by ANTLR 4.13.2
package g4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mainParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mainVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mainParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(mainParser.SContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARENTHESES}
	 * labeled alternative in {@link mainParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARENTHESES(mainParser.PARENTHESESContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SIGNED_INT}
	 * labeled alternative in {@link mainParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSIGNED_INT(mainParser.SIGNED_INTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADDITATIVE_OPS}
	 * labeled alternative in {@link mainParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADDITATIVE_OPS(mainParser.ADDITATIVE_OPSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULTIPLICATIVE_OPS}
	 * labeled alternative in {@link mainParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULTIPLICATIVE_OPS(mainParser.MULTIPLICATIVE_OPSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INT}
	 * labeled alternative in {@link mainParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINT(mainParser.INTContext ctx);
}
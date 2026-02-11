// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/U1P3/src/main/java/g4/main.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by the {@code DEC}
	 * labeled alternative in {@link mainParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDEC(mainParser.DECContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COND}
	 * labeled alternative in {@link mainParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOND(mainParser.CONDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CMP}
	 * labeled alternative in {@link mainParser#cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCMP(mainParser.CMPContext ctx);
}
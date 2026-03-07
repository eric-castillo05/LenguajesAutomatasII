// Generated from /home/eric/Documents/dev/LenguajesAutomatasII/ej5_atributos/src/main/java/g4/main.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link mainParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(mainParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCom(mainParser.ComContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(mainParser.TermContext ctx);
}
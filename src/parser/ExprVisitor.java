// Generated from /home/djjudjju/Documents/workspace/Qualite/ExpressionProject/src/parser/Expr.g4 by ANTLR 4.1

package parser;

import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#ExpressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(@NotNull ExprParser.ExpressionStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#opExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(@NotNull ExprParser.OpExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull ExprParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Nothing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNothing(@NotNull ExprParser.NothingContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull ExprParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(@NotNull ExprParser.UnaryExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#SyntaxLitteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntaxLitteral(@NotNull ExprParser.SyntaxLitteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#atomicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicExpr(@NotNull ExprParser.AtomicExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#parenExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(@NotNull ExprParser.ParenExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExprParser#VariableCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableCall(@NotNull ExprParser.VariableCallContext ctx);
}
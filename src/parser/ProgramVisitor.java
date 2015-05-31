// Generated from /home/djjudjju/Documents/workspace/Qualite/ExpressionProject/src/parser/Expr.g4 by ANTLR 4.1

package parser;

import java.util.ArrayList;
import java.util.List;

import myinterpreter.AST;
import myinterpreter.Addition;
import myinterpreter.BinaryExp;
import myinterpreter.Division;
import myinterpreter.Expression;
import myinterpreter.Multiplication;
import myinterpreter.Program;
import myinterpreter.Puissance;
import myinterpreter.Substraction;
import myinterpreter.SyntaxLiteral;
import myinterpreter.UnaryExp;
import myinterpreter.UnarySubstraction;
import myinterpreter.Variable;
import mystate.State;

import org.antlr.v4.runtime.tree.ParseTree;

import parser.ExprParser.AtomicExprContext;
import parser.ExprParser.ExpressionStatementContext;
import parser.ExprParser.NothingContext;
import parser.ExprParser.OpExprContext;
import parser.ExprParser.ParenExprContext;
import parser.ExprParser.ProgContext;
import parser.ExprParser.SyntaxLitteralContext;
import parser.ExprParser.UnaryExprContext;
import parser.ExprParser.VariableCallContext;
import parser.ExprParser.VariableContext;

/**
 * This class provides an empty implementation of {@link ExprVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class ProgramVisitor extends ExprBaseVisitor<AST> {
	
	protected State<Integer> stateVar = new State<Integer>();

	@Override
	public UnaryExp visitUnaryExpr(UnaryExprContext ctx) {
		return new UnarySubstraction((Expression) visit(ctx.e));
	}

	@Override
	public Expression visitParenExpr(ParenExprContext ctx) {
		return (Expression) visit(ctx.expr());
	}

	@Override
	public BinaryExp visitOpExpr(OpExprContext ctx) {
		Expression left = (Expression) visit(ctx.left);
        Expression right = (Expression) visit(ctx.right);
        switch (ctx.op.getText().charAt(0)) {
            case '*' : return new Multiplication(left, right);
            case '/' : return new Division(left, right);
            case '+' : return new Addition(left, right);
            case '-' : return new Substraction(left, right);
            case '^' : return new Puissance(left, right);
            default : return null;
        }
	}

	@Override
	public Expression visitAtomicExpr(AtomicExprContext ctx) {
		return (Expression) super.visitAtomicExpr(ctx);
	}

	@Override
	public Expression visitExpressionStatement(ExpressionStatementContext ctx) {
		return (Expression) visit(ctx.e);
	}

	@Override
	public Program visitProg(ProgContext ctx) {
		List<Expression> l = new ArrayList<Expression>();
		for (ParseTree child: ctx.children) {
			l.add((Expression) visit(child));
		}
		return new Program(stateVar, l);
	}

	@Override
	public SyntaxLiteral visitNothing(NothingContext ctx) {
		return new SyntaxLiteral(0);
	}

	@Override
	public Variable visitVariable(VariableContext ctx) {
		Variable var = new Variable(ctx.ID().getText());
		stateVar.bind(var.getName(), Integer.parseInt(((Expression) visitChildren(ctx.e)).eval(stateVar)));
		return var;
	}

	@Override
	public SyntaxLiteral visitSyntaxLitteral(SyntaxLitteralContext ctx) {
		return new SyntaxLiteral(Integer.parseInt(ctx.INT().getText()));
	}

	@Override
	public Variable visitVariableCall(VariableCallContext ctx) {
		return new Variable(ctx.getText());
	}
	
}
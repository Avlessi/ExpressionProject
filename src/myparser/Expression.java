package myparser;

import java.io.IOException;

import mylexer.Identificateur;
import mylexer.LPar;
import mylexer.Literal;
import mylexer.Op;
import mylexer.RPar;
import mylexer.SLexer;
import mylexer.Token;
import mylexer.UnexpectedCharacter;
import mylexer.VOp;
import mystate.State;

public abstract class Expression extends AST{
	
//	<Exp> ::= <Term> <Exp'> 
//	<Exp'> ::= + <Exp> | - <Exp> | ε

	
	public static Expression parseTerm(Token t) throws UnexpectedCharacter, IOException, SyntaxError {
		
		Expression term = Term.parse(SLexer.getToken());		
		return term;		
	}
	
	public abstract int eval();
	
	
	public static Expression parseComposite(Token t, Expression exp1) throws UnexpectedCharacter, IOException, SyntaxError {
		if (t instanceof Op) {
			VOp op = ((Op)t).getOperation();
			if(op == VOp.PLUS) {
				Expression exp2 = Expression.parseTerm(SLexer.getToken());
				Addition add = new Addition(exp1, exp2);
				return add;
			}
			else if (op == VOp.MINUS) {
				Expression exp2 = Expression.parseTerm(SLexer.getToken());
				Substraction sub = new Substraction(exp1, exp2);
				return sub;
			}
			else throw new SyntaxError("Expression: expected operator");
		}
		else throw new SyntaxError("Expression: received token is not operator");		
	}

	public static Expression parseCompositeExpression(Token t) throws UnexpectedCharacter, IOException, SyntaxError {  //parse binary, unary and condition exp	
		return null;			
		/*if(t instanceof Op) {  
			VOp op = ((Op) t).getOperation();
			Expression exp1 = Expression.parse(SLexer.getToken());
			
			Token t3 = SLexer.getToken();
			if(op == VOp.MINUS && t3 instanceof RPar) {					
				return new UnaryExp(exp1);
			}
			else {
				Expression exp2 = Expression.parse(t3);
				
				Token token = SLexer.getToken();
				if(!(token instanceof RPar)) {
					throw new SyntaxError("expected right paranthesis in a line " + SLexer.getCurrentLine());
				}					
				return new BinaryExp(op, exp1, exp2);
			}
		}
		else if(t instanceof IfToken){ // conditional expression
			Expression cond = Expression.parse(SLexer.getToken());
			Expression exp1 = Expression.parse(SLexer.getToken());
			Expression exp2 = Expression.parse(SLexer.getToken());
			
			Token token = SLexer.getToken();
			if(!(token instanceof RPar)) {
				throw new SyntaxError("expected right paranthesis in a line " + SLexer.getCurrentLine());
			}			
			return new CondExp(cond, exp1, exp2);
		}
		else if (t instanceof Identificateur) {
			FunctionCall f = new FunctionCall( ((Identificateur)t).getValue() );
			f.parseFunction(SLexer.getToken());
			return f;
		}
		else throw new SyntaxError(t + " is not resolved in a line " + SLexer.getCurrentLine());*/
		
	}

	public static Expression parseSimpleExpression(Token token) throws SyntaxError { //parse variable or literal
		if(token instanceof Literal) {
			return new SyntaxLiteral(Integer.valueOf( ((Literal)token).getValue() ));			
		}
		else if(token instanceof Identificateur) {
			return new Variable( ((Identificateur)token).getValue() );
		}
		else
			return null;		
	}
}

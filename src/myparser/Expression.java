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
	
	public static final Expression parse(Token t) throws UnexpectedCharacter, IOException, SyntaxError{  
		Expression exp = Expression.parseSimpleExpression(t);
		if(exp != null)
			return exp;
		else {			
			return Expression.parseCompositeExpression(SLexer.getToken());
		}		
	}
	
	public abstract int eval();

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

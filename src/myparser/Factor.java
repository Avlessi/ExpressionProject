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

public class Factor extends Expression {	

	public static Expression parse(Token t) throws UnexpectedCharacter, IOException, SyntaxError {
		if(t instanceof Identificateur) {
			return new Variable( ((Identificateur)t).getValue() ); 
		}
		else if (t instanceof Literal) {
			return new SyntaxLiteral( Integer.valueOf( ((Literal)t ).getValue() ) );
		}
		else if (t instanceof Op && ((Op)t).getOperation() == VOp.MINUS) {
			return new UnarySubstract(Factor.parse(SLexer.getToken()));
		}
		else if (t instanceof LPar) {
			Token tok = SLexer.getToken();
			if(tok instanceof Literal) {
				SyntaxLiteral s = new SyntaxLiteral( Integer.valueOf( ((Literal)tok).getValue() ) );
				Token tt = SLexer.getToken();
				if(!(tt instanceof RPar)) {
					throw new SyntaxError("Right paranthesis expected");
				}
				return s;
			}
			else {
				throw new SyntaxError("Literal expected");
			}
		}
		else {
			throw new SyntaxError("expected left paranthesis or identifier");
		}
	}
}

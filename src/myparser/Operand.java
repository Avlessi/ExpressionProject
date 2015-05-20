package myparser;

import mylexer.Token;
import mylexer.Literal;
import mylexer.Identificateur;

public class Operand {
	public static Expression parse(Token t) throws SyntaxError {
		if(t instanceof Literal) {
			Literal l = (Literal) t;
			return new SyntaxLiteral(Integer.parseInt(l.getValue()));
		}
		else if(t instanceof Identificateur) {
			Identificateur id = (Identificateur) t;
			return new Variable(id.getValue());
		}
		else {
			throw new SyntaxError("Operand: expected literal or identificateur. Found " + t);
		}
	}
}

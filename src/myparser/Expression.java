package myparser;

import java.io.IOException;
import java.util.List;

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

public class Expression extends AST {
	
	private List<Term> terms;	
	
	public Expression() /*throws UnexpectedCharacter, IOException, SyntaxError */ {
				
	}
	
	public static Expression parse() throws UnexpectedCharacter, IOException, SyntaxError {
		Expression e = Term.parse(SLexer.getToken());
		return e;
	}
	
	
	public int eval() {
		//TODO
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

package myparser;

import java.io.IOException;

import mylexer.Identificateur;
import mylexer.Op;
import mylexer.SLexer;
import mylexer.Token;
import mylexer.UnexpectedCharacter;
import mylexer.VOp;

public class Term {	
	
	public static Expression parse(Token t) throws UnexpectedCharacter, IOException, SyntaxError {		
		return Factor.parse(SLexer.getToken());		
	}
	
	
}

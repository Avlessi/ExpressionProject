package myparser;

import java.io.IOException;

import mylexer.SLexer;
import mylexer.UnexpectedCharacter;

public class Program {
	public static void main(String [] args) throws UnexpectedCharacter, IOException, SyntaxError {
		Expression expr = Expression.parse();
	}
}

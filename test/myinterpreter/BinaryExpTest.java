package myinterpreter;

import static org.junit.Assert.assertEquals;
import mystate.State;

import org.junit.Test;



public class BinaryExpTest {
	
	SyntaxLiteral zero = new SyntaxLiteral(0);
	SyntaxLiteral un = new SyntaxLiteral(1);
	SyntaxLiteral deux = new SyntaxLiteral(2);
	SyntaxLiteral trois = new SyntaxLiteral(3);
	SyntaxLiteral quatre = new SyntaxLiteral(4);
	SyntaxLiteral cinq = new SyntaxLiteral(5);
	
	State<Integer> state = new State<Integer>();
	
	@Test
	public void UnPlusUnFoisDeuxEgalTrois() {
		BinaryExp e = new Addition(un, un); 
		assertEquals(e, deux) ;
	}

}

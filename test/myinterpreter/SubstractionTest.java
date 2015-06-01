package myinterpreter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mystate.State;



public class SubstractionTest {

	SyntaxLiteral zero = new SyntaxLiteral(0);
	SyntaxLiteral un = new SyntaxLiteral(1);
	SyntaxLiteral deux = new SyntaxLiteral(2);
	SyntaxLiteral trois = new SyntaxLiteral(3);
	SyntaxLiteral quatre = new SyntaxLiteral(4);
	SyntaxLiteral cinq = new SyntaxLiteral(5);
	
	State<Integer> stateVar = new State<Integer>();
	
	@Test
	public void DeuxMoinsUnMoinsUnEgalZero() {
		Substraction s = new Substraction(new Substraction(deux, un), un); 
		assertEquals(s, zero);
	}
	
}

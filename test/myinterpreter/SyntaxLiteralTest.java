package myinterpreter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mystate.State;



public class SyntaxLiteralTest {

	SyntaxLiteral zero = new SyntaxLiteral(0);
	SyntaxLiteral un = new SyntaxLiteral(1);
	SyntaxLiteral deux = new SyntaxLiteral(2);
	SyntaxLiteral trois = new SyntaxLiteral(3);
	SyntaxLiteral quatre = new SyntaxLiteral(4);
	SyntaxLiteral cinq = new SyntaxLiteral(5);
	
	State<Integer> stateVar = new State<Integer>();
	
	@Test
	public void unEgalUn() {
		assertEquals(un, un);
	}
	
	@Test(expected = AssertionError.class)
	public void unDifferentZero() {
		assertEquals(un, zero);
	}
	
}

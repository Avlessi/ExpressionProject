package myinterpreter;

import static org.junit.Assert.assertEquals;
import mystate.State;

import org.junit.Test;



public class DivisionTest {
	SyntaxLiteral zero = new SyntaxLiteral(0);
	SyntaxLiteral un = new SyntaxLiteral(1);
	SyntaxLiteral deux = new SyntaxLiteral(2);
	SyntaxLiteral trois = new SyntaxLiteral(3);
	SyntaxLiteral quatre = new SyntaxLiteral(4);
	SyntaxLiteral cinq = new SyntaxLiteral(5);
	
	State<Integer> stateVar = new State<Integer>();
	
	@Test
	public void UnSurUnEgalUn() {
		Division e = new Division(un, un); 
		assertEquals(e, un) ;
	}
	
	@Test(expected=ArithmeticException.class)
	public void UnSurZeroThrowError() {
		Division d = new Division(un, zero); 
		d.eval();
	}

}

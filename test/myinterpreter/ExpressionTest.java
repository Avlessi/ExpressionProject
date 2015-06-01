package myinterpreter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mystate.State;

public class ExpressionTest{

	SyntaxLiteral zero = new SyntaxLiteral(0);
	SyntaxLiteral un = new SyntaxLiteral(1);
	SyntaxLiteral deux = new SyntaxLiteral(2);
	SyntaxLiteral trois = new SyntaxLiteral(3);
	SyntaxLiteral quatre = new SyntaxLiteral(4);
	SyntaxLiteral cinq = new SyntaxLiteral(5);
	
	State<Integer> stateVar = new State<Integer>();
	
	@Test
	public void calculable() {
		Division d = new Division(un, deux); 
		Addition a = new Addition(d, new Variable("x", stateVar));
		stateVar.bind("x", 3);
		assertEquals(a.isCalculable(), true);
		assertEquals(a, trois);
	}
	
	@Test
	public void nonCalculable() {
		Division d = new Division(un, deux); 
		Addition a = new Addition(d, new Variable("x", stateVar));
		assertEquals(a.isCalculable(), false);
	}

	
}

package myinterpreter;

import static org.junit.Assert.assertEquals;
import mystate.State;

import org.junit.Test;

public class UnarySubstractionTest {

	SyntaxLiteral zero = new SyntaxLiteral(0);
	SyntaxLiteral un = new SyntaxLiteral(1);
	SyntaxLiteral deux = new SyntaxLiteral(2);
	SyntaxLiteral trois = new SyntaxLiteral(3);
	SyntaxLiteral quatre = new SyntaxLiteral(4);
	SyntaxLiteral cinq = new SyntaxLiteral(5);
	
	State<Integer> stateVar = new State<Integer>();
	
	@Test
	public void MoinsMoinsunEgalUn() {
		assertEquals(new UnarySubstraction(new UnarySubstraction(un)), un);
		assertEquals(new UnarySubstraction(new UnarySubstraction(un)).simplif().toString(), un.toString());
	}
	
	//voir si la simplification marche -(-x) = x même si x 'est pas défini
	@Test
	public void MoinsMoinsXEgalX() {
		Expression e = new Variable("x", stateVar);
		assertEquals(new UnarySubstraction(new UnarySubstraction(e)).simplif(), e); 
	}
	
}

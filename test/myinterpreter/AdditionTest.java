package myinterpreter;

import static org.junit.Assert.assertEquals;
import mystate.State;

import org.junit.Test;



public class AdditionTest {
	
	SyntaxLiteral zero = new SyntaxLiteral(0);
	SyntaxLiteral un = new SyntaxLiteral(1);
	SyntaxLiteral deux = new SyntaxLiteral(2);
	
	State<Integer> state = new State<Integer>();

	@Test
	public void unPlusUnEgalDeux() {
		Addition unPlusUn = new Addition(un, un);
		Addition zeroPlusUn = new Addition(zero, un);
		assertEquals(unPlusUn, deux);
	}
	
	
}

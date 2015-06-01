package myinterpreter;

import static org.junit.Assert.assertEquals;
import mystate.State;

import org.junit.Test;



public class VariableTest {
	
	State<Integer> stateVar = new State<Integer>();
	Variable a = new Variable("a", stateVar);
	Variable b = new Variable("b", stateVar);
	Variable aBis = new Variable("a", new State<Integer>());
	
	@Test
	public void aEgala() {
		assertEquals(a, a);
		assertEquals(a, b);
	}
	
	
}

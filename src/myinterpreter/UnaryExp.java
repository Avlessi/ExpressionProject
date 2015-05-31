package myinterpreter;

import mystate.State;



public abstract class UnaryExp extends Expression {
	protected Expression exp;
	
	 public UnaryExp(Expression exp) {
		this.exp = exp;
	}

	public abstract String eval(State<Integer> stateVar);
}

package myinterpreter;

import mystate.State;



public class UnarySubstraction extends UnaryExp{

	public UnarySubstraction(Expression exp) {
		super(exp);		
	}

	@Override
	public String eval(State<Integer> stateVar) {
		return "-" + this.exp.eval(null);
	}

	@Override
	public String toString() {
		return "UnarySubstraction( " + exp + " )";
	}

	@Override
	public Expression simplif() {
		return this;
	}
}

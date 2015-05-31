package myinterpreter;

import mystate.State;



public class Addition extends BinaryExp {
	public Addition(Expression exp1, Expression exp2) {
		super(exp1, exp2);
	}

	@Override
	public String eval(State<Integer> stateVar) {
		return exp1.simplif().eval(stateVar) + exp2.simplif().eval(stateVar);
	}

	@Override
	public Expression simplif() {
		return exp1;
	}
	

	@Override
	public String toString() {
		return "Addition(" +  exp1 + "," + exp2 + ")";  
	}
}

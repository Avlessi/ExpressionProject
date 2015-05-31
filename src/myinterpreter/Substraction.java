package myinterpreter;

import mystate.State;



public class Substraction extends BinaryExp {
	public Substraction(Expression exp1, Expression exp2) {
		super(exp1, exp2);
	}

	@Override
	public String eval(State<Integer> stateVar) {
		return exp1.eval(null) + "-" + exp2.eval(null);
	}

	@Override
	public Expression simplif() {
		return this;
	}
	

	@Override
	public String toString() {
		return "Soustraction(" +  exp1 + "," + exp2 + ")";  
	}
}

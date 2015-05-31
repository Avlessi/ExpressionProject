package myinterpreter;

import mystate.State;



public class Division extends BinaryExp {
	public Division(Expression exp1, Expression exp2) {
		super(exp1, exp2);
	}

	@Override
	public String eval(State<Integer> stateVar) {
		if (!exp1.simplif().isAbstract && !exp2.simplif().isAbstract) {
			return "" + Integer.parseInt(exp1.eval(null)) / Integer.parseInt(exp2.eval(null)) ; 
		} else return exp1 + " / " + exp2;
	}

	@Override
	public Expression simplif() {
		return null;
	}
	

	@Override
	public String toString() {
		return "Division(" +  exp1 + "," + exp2 + ")";  
	}
}

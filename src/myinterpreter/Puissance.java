package myinterpreter;

import mystate.State;



public class Puissance extends BinaryExp{
	public Puissance(Expression exp1, Expression exp2) {
		super(exp1, exp2);
	}

	@Override
	public String eval(State<Integer> stateVar) {
		return " (" + exp1.eval(null) + "^" + exp2.eval(null) + ") ";
	}

	@Override
	public Expression simplif() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString() {
		return "Puissance(" +  exp1 + "," + exp2 + ")";  
	}
	
}

package myinterpreter;

import mystate.State;



public abstract class BinaryExp extends Expression{
	protected Expression exp1;
	protected Expression exp2;	
	
	public BinaryExp(Expression exp1, Expression exp2) {		
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	public abstract String eval(State<Integer> stateVar);	
	
}

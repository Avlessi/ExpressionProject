package myparser;

import mystate.State;

public abstract class BinaryExp extends Expression{
	private Expression exp1;
	private Expression exp2;	
	
	public BinaryExp(Expression exp1, Expression exp2) {		
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	public abstract int eval();	
	
	@Override
	public String toString() {
		return "BinaryExpression(" +  exp1 + "," + exp2 + ")";  
	}
}

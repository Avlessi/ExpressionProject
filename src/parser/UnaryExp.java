package parser;

import state.State;

public class UnaryExp extends Expression {
	private Expression exp;
	
	 public UnaryExp(Expression exp) {
		this.exp = exp;
	}

	@Override
	public int eval(State<Integer> stVar, State<Function> stFunc) throws SemanticException {
		return -exp.eval(stVar, stFunc);		
	}

	@Override
	public String toString() {
		return "-" + exp;
	}

}

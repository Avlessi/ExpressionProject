package myparser;

import mylexer.SLexer;
import mystate.State;

public class Variable extends Expression {
	String name;
	
	Variable(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
//	@Override
//	public int eval(State<Integer> stVar, State<Function> stFunc) throws SemanticException {
//		Integer val =  stVar.lookup(this.name);
//		if(val == null)
//			throw new SemanticException("Variable " + this.name  + " is not defined");
//		else return val;
//	}

	@Override
	public String toString() {
		return "Variable(" + "\"" +  name + "\"" + ")";
	}

	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return 0;
	}
}

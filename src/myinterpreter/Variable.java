package myinterpreter;

import mystate.State;



public class Variable extends Expression {
	protected String name;
	
	public Variable(String text) {
		this.name = text;
	}

	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Variable(" + "\"" +  name + "\"" + ")";
	}

	@Override
	public String eval(State<Integer> stateVar) {
		if (stateVar.lookup(this.name)!=null) {
			return "\"" + this.name + "\": " + stateVar.lookup(this.name);
		} else return this.name;  
	}

	@Override
	public Expression simplif() {
		return this;
	}
}

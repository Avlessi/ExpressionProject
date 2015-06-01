package myinterpreter;

import mystate.State;



public class Variable extends Expression {
	protected String name;
	
	private State<Integer> stateVar;
	
	public Variable(String text, State<Integer> stateVar) {
		this.name = text;
		this.stateVar = stateVar;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Variable(" + "\"" +  name + "\"" + ")";
	}

	@Override
	public String eval() {
		if (this.stateVar.lookup(this.name)!=null) {
			return "" + this.stateVar.lookup(this.name);
		} else return this.name;  
	}

	@Override
	public Expression simplif() {
		return this;
	}

	@Override
	public Boolean isCalculable() {
		return (this.stateVar.lookup(this.name)!=null);
	}
}

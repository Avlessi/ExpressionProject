package parser;

import state.State;

public class SyntaxLiteral extends Expression{
	private int val;
	public SyntaxLiteral(int val){
		this.val = val;
	}
	
	public String toString(){
		return "Literal(" + Integer.toString(val) + ")";
	}
	
	public int eval(State<Integer> stVar, State<Function> stFunc) throws SemanticException {
		return val;
	}		
	
}

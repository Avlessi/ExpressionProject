package parser;

import lexer.VOp;
import state.State;

public class BinaryExp extends Expression{
	private Expression exp1;
	private Expression exp2;
	private VOp op;
	
	public BinaryExp(VOp op, Expression exp1, Expression exp2) {
		this.op = op;
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	public int eval(State<Integer> stVar, State<Function> stFunc) throws SemanticException { 
		int v1 = exp1.eval(stVar, stFunc);
		int v2 = exp2.eval(stVar, stFunc);
		switch(op){
			case PLUS: return v1 + v2; 
			case MINUS: return v1 - v2;
			case TIMES: return v1 * v2;
			case DIVIDE: return v1 / v2;
			case EQUAL: if(v1==v2){return 1;} else return 0;
			case LESS: if(v1<v2){return 1;} else return 0;
			default: return 0;
		}
	}

	@Override
	public String toString() {
		return "BinaryExpression(" + this.op + "," + exp1 + "," + exp2 + ")";  
	}
}

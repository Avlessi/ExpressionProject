package myinterpreter;

import java.util.List;

import mystate.State;

public class Program extends AST {
	
	protected State<Integer> stateVar;
	protected List<Expression> listExp;

	public Program(State<Integer> stateVar, List<Expression> listExp) {
		super();
		this.stateVar = stateVar;
		this.listExp = listExp;
	}

	public String eval() {
		String s = "";
		for (Expression exp: listExp) {
			s+= exp.eval();
		}
		return s;
	}

	public String toString() {
		String s = "Program: \n";
		s += "What was given in input :" + listExp.toString() + "\n";
		s += "After simplification: [" ;
		for (Expression e: listExp) {
			s+= e.eval() + ", ";
		}
		s += "] ";
		return s;
	}

}

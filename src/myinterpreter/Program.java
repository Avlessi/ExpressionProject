package myinterpreter;

import java.util.List;

import mystate.State;

public class Program extends AST {
	
	protected State stateVar;
	protected List<Expression> listExp;

	public Program(State stateVar, List<Expression> listExp) {
		super();
		this.stateVar = stateVar;
		this.listExp = listExp;
	}

	public String eval(State<Integer> stateVar) {
		String s = "";
		for (Expression exp: listExp) {
			s+= exp.eval(stateVar);
		}
		return s;
	}

	public String toString() {
		String s = "Program: \n";
		s += "What was given in input :" + listExp.toString() + "\n";
		s += "After simplification: [" ;
		for (Expression e: listExp) {
			s+= e.eval(stateVar) + ", ";
		}
		s += "] ";
		return s;
	}

}

package myinterpreter;

import mystate.State;


public abstract class AST {
	
	public abstract String eval(State<Integer> stateVar) ;

	public abstract String toString() ;

}

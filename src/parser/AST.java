package parser;

import state.State;

public abstract class AST {
	abstract public String toString();
	abstract public int eval(State<Integer> stVar, State<Function> stFunc) throws SemanticException;
}

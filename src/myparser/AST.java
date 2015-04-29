package myparser;

import mystate.State;

public abstract class AST {
	abstract public String toString();
	abstract public int eval();
}

package myinterpreter;

import java.util.List;

import mystate.State;

public abstract class Expression extends AST {
	
	/**
	 * indique si l'expression contient des valeurs abstraites
	 */
	protected Boolean isAbstract; 

	public abstract Expression simplif() ;
	
}

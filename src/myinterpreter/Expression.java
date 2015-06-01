package myinterpreter;


public abstract class Expression extends AST {

	public abstract Expression simplif();
	
	public abstract Boolean isCalculable();
		
}

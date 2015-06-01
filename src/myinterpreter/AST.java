package myinterpreter;



public abstract class AST {
	
	public abstract String eval() ;

	public abstract String toString() ;
	
	public boolean equals(Object o) {
		return 
				(o instanceof AST) && 
				(((AST)(o)).eval()).
				equals(this.eval()) ;
	}

}

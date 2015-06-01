package myinterpreter;




public abstract class UnaryExp extends Expression {
	protected Expression exp;
	
	 public UnaryExp(Expression exp) {
		this.exp = exp;
	}

	public abstract String eval();
	
	public Boolean isCalculable() {
		return exp.isCalculable();
	}
}

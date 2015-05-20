package myparser;

public abstract class UnaryExp extends Expression {
	protected Expression exp;
	
	 public UnaryExp(Expression exp) {
		this.exp = exp;
	}

	public abstract int eval();
}

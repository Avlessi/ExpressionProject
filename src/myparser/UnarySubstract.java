package myparser;

public class UnarySubstract extends Expression {
	private Expression val;
	
	public UnarySubstract(Expression val) {
		this.val = val;
	}
}

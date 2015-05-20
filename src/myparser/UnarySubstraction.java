package myparser;

public class UnarySubstraction extends UnaryExp{

	public UnarySubstraction(Expression exp) {
		super(exp);		
	}

	@Override
	public int eval() {
		return -this.exp.eval();
	}

	@Override
	public String toString() {
		return "UnarySubstraction( " + exp + " )";
	}
}

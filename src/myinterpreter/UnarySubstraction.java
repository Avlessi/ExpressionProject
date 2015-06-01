package myinterpreter;




public class UnarySubstraction extends UnaryExp{

	public UnarySubstraction(Expression exp) {
		super(exp);		
	}

	@Override
	public String eval() {
		return this.simplif().toString();
	}

	@Override
	public String toString() {
		return "UnarySubstraction( " + exp + " )";
	}

	@Override
	public Expression simplif() {
		if (this.exp.isCalculable()) {
			int i = Integer.parseInt(this.exp.eval()); 
			return new SyntaxLiteral(i);
		} else if (this.exp instanceof UnarySubstraction) {
			UnarySubstraction child = (UnarySubstraction) this.exp;
			return child.exp ;
		} else return this;
	}
}

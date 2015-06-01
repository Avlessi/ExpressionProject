package myinterpreter;




public class Division extends BinaryExp {
	public Division(Expression exp1, Expression exp2) {
		super(exp1, exp2);
	}

	@Override
	public String eval() {
		return this.simplif().toString();
	}

	@Override
	public Expression simplif() {
		if (exp1.simplif().isCalculable() && exp2.simplif().isCalculable()) {
			return new SyntaxLiteral(
					Integer.parseInt(exp1.eval()) / Integer.parseInt(exp2.eval())
					);
		} else return this;
	}
	

	@Override
	public String toString() {
		return "Division(" +  exp1 + "," + exp2 + ")";  
	}

}

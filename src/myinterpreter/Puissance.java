package myinterpreter;




public class Puissance extends BinaryExp{
	public Puissance(Expression exp1, Expression exp2) {
		super(exp1, exp2);
	}

	@Override
	public String eval() {
		return this.simplif().toString();
	}

	@Override
	public String toString() {
		return "Puissance(" +  exp1 + "," + exp2 + ")";  
	}

	@Override
	public Expression simplif() {
		if (exp1.simplif().isCalculable() && exp2.simplif().isCalculable()) {
			return new SyntaxLiteral(
					(int)Math.pow(Integer.parseInt(exp1.eval()), Integer.parseInt(exp2.eval()))
					);
		} else return this;
	}
	
}

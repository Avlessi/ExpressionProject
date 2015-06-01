package myinterpreter;




public abstract class BinaryExp extends Expression{
	protected Expression exp1;
	protected Expression exp2;	
	
	public BinaryExp(Expression exp1, Expression exp2) {		
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	public abstract String eval();	
	
	public Boolean isCalculable() {
		return exp1.isCalculable() && exp2.isCalculable();
	}
	
}

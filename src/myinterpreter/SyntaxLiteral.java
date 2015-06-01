package myinterpreter;




public class SyntaxLiteral extends Expression{
	private int val;
	public SyntaxLiteral(int val){
		this.val = val;
	}
	
	public String toString(){
		return "" + val;
	}

	@Override
	public String eval() {
		return ""+val;
	}

	@Override
	public Expression simplif() {
		return this;
	}

	@Override
	public Boolean isCalculable() {
		return true;
	}		
	
}

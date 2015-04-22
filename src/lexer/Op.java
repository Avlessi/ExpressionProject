package lexer;

public class Op extends Token {
	private VOp op;
	
	Op(VOp op){
		this.op = op;
	}
	
	public VOp getOperation(){
		return op;
	}
	
	public String toString(){
		return "<<Op>> : " + op;
	}
}

package mylexer;

public class Literal extends Token {
	private String value;
	
	public Literal(String value){
		this.value = value;
	}	
	
	public String getValue(){
		return value;
	}

	@Override
	public String toString() {		
		return "<<Literal>> : " + value;
	}
}

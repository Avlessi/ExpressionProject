package mylexer;

public class Identificateur extends Token{
	private String value;
	
	public Identificateur(String value){
		this.value = value;
	}	
	
	public String getValue(){
		return value;
	}

	@Override
	public String toString() {
		return "<< Identificateur>> : " + value;
	}
}

package mylexer;

public class UnexpectedCharacter extends Exception {
	public UnexpectedCharacter(int i){
		super("unexpected character : ascii " + i + " - " + (char)i);
	}

}

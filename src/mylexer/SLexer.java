package mylexer;


import java.io.IOException;

public class SLexer {
	static private Lexer lexer;
	
	/**
	 * initialize a lexical analyzer
	 * 
	 * @param fileName - a name of file which contains a program to analyze
	 */
	public static void init(String fileName){
		try {
			lexer = new Lexer(fileName);
		} catch (IOException e) {
			System.err.println("");
			e.printStackTrace();
		}
	}
	
	public static Token getToken() throws UnexpectedCharacter, IOException{
		return lexer.getToken();
	}	
	
	public static int getCurrentLine() {
		return lexer.getCurrentLine();
	}

}

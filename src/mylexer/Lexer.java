package mylexer;
import java.util.*;
import java.io.*;

public class Lexer {
	private FileReader in;
	private int i; // current ASCII character (coded as an integer)
	private Token currentToken;
	private int lineCounter = 0;
	
	public Lexer(String filename) throws IOException {
		File file = new File(filename);
		try {
			in = new FileReader(file);
			i = in.read(); // initialize lexer
		} catch (FileNotFoundException e) {
			System.err.println("File : " + filename + " not found");
			//throw e; // pass the exception up the stack
		} catch (IOException e){
			in.close(); // close the reader
			throw e; // pass the exception up the stack
		}
	}
	
	public List<Token> lex() throws UnexpectedCharacter, IOException {
		// return the list of tokens recorded in the file
		List<Token> tokens = new ArrayList<Token>();
		
		try {
			Token token = getToken();
	
			while (! (token instanceof EOF)) {
				tokens.add(token);
				token = getToken();
			}
			tokens.add(token); // this is the EOF token
		} catch (IOException e){
				in.close(); // close the reader
				throw e; // pass the exception up the stack
		}
		return tokens;
	}	
	
	public Token getToken() throws UnexpectedCharacter, IOException {
		switch (i){
		case '=':
			i = in.read();       // read next input character
			if( ((char)i) == '=' ){	// if we have ==
				//pass further
				i = in.read();
				currentToken = new Op(VOp.EQUAL);
				return currentToken;
			}
//			else {
//				currentToken = new Assign();
//				return currentToken;
//			}			
		case -1 : 
			in.close();
			currentToken = new EOF();
			return currentToken;
		case ' ':
		case '\t':		
		case '\n':			
		case '\r':
			if(i == '\n')
				++lineCounter; 
			i = in.read();
			currentToken = null;
			return getToken();
		case '(':
			i = in.read();
			currentToken = new LPar();
			return currentToken;
		case ')':
			i = in.read();
			currentToken = new RPar();
			return currentToken;					
		case '+':
			i = in.read();
			currentToken = new Op(VOp.PLUS);
			return currentToken;
		case '-':
			i = in.read();
			currentToken = new Op(VOp.MINUS);
			return currentToken;
		case '*':
			i = in.read();
			currentToken = new Op(VOp.TIMES);
			return currentToken;
		case '/':
			i = in.read();
			currentToken = new Op(VOp.DIVIDE);
			return currentToken;
		case '<':
			i = in.read();
			currentToken = new Op(VOp.LESS);
			return currentToken;		
		default : 
			char c = (char)i;			
			//System.out.println(c);
			if(Character.isDigit(c)) { 
				i = in.read();
				
				if(currentToken instanceof Literal){
					
					Literal literal = new Literal( ((Literal)currentToken).getValue() + String.valueOf(c) );
					currentToken = literal;
					
					if(Character.isDigit(i)) {						
						return getToken();
					}					
					else
						return currentToken;
				}
				else if(currentToken instanceof Identificateur) {
					Identificateur ident = new Identificateur( ((Identificateur)currentToken).getValue() + String.valueOf(c) );
					currentToken = ident;					
					
					if(Character.isDigit(i) || Character.isLetter(i)) {
						return getToken();					
					}					
					else 
						return currentToken;					
				}
				else {
					currentToken = new Literal(String.valueOf(c));
					
					if(c == '0') {
						return currentToken;
					}
					else if(Character.isDigit(i)) {
						return getToken();					
					}					
					else 
						return currentToken;					
				}												
			}			
			else if(Character.isLetter(c)) { //check Identificateur
				i = in.read();
				
				if(currentToken instanceof Identificateur) {
					Identificateur ident = new Identificateur( ((Identificateur)currentToken).getValue() + String.valueOf(c) );
					currentToken = ident;
				}
				else {
					currentToken = new Identificateur(String.valueOf(c));
				}					
				if(Character.isDigit(i) || Character.isLetter(i)) 
					return getToken();										
				else{				
					return currentToken;
				}
			}
			else
				currentToken = null;
				throw new UnexpectedCharacter(i);			
		}
	}
	
	public int getCurrentLine() {
		return lineCounter;
	}	
	
}
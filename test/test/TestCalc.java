package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.ExprLexer;
import parser.ExprParser;
import parser.ProgramVisitor;

public class TestCalc {
	public static void main(String [] args) throws IOException {
		String inputFile = "test.expr";
		if ( args.length > 0 ) inputFile = args[0];
		InputStream is = System.in;
		if ( inputFile != null ) is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is); 
		ExprLexer lexer = new ExprLexer(input); 
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		ExprParser parser = new ExprParser(tokens); 
		ParseTree tree = parser.prog();
		System.out.println(tree.toStringTree(parser));
		ProgramVisitor pV = new ProgramVisitor();
		System.out.println(pV.visit(tree));
	}
}

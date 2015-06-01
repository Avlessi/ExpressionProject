package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import myinterpreter.*;

@RunWith(Suite.class)
@SuiteClasses({AdditionTest.class, 
	BinaryExpTest.class,
	DivisionTest.class, 
	ExpressionTest.class, 
	MultiplicationTest.class, 
	PuissanceTest.class, 
	SubstractionTest.class, 
	SyntaxLiteralTest.class, 
	UnarySubstractionTest.class, 
	VariableTest.class})
public class JUnitTests {
	
	
}
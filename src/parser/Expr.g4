grammar Expr;

@header {
package parser;

import java.util.HashMap;
}

prog
	:   stat+ ;
                
stat:   e=expr NEWLINE        	#ExpressionStatement
    |   ID '=' e=expr NEWLINE 	#Variable
    |   NEWLINE             	#Nothing
    ;

expr 
    :   left=expr op=('*'|'/'|'^') right=expr       #opExpr
	| 	left=expr op=('+'|'-') right=expr   		#opExpr
	| 	op='-' e=expr   				#unaryExpr
	| 	'(' expr ')'                        		#parenExpr
	| 	atom	                            		#atomicExpr
    ; 

atom 
    :   INT             #SyntaxLitteral
    |   ID              #VariableCall
    ;

ID  :   ('a'..'z'|'A'..'Z')+ ;
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;
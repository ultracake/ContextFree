package while_language.parsing;

import while_language.Environment;
import while_language.VariableNotDefinedException;
import while_language.ast.ArithExpr;

public class FindNote {
	
	private ArithExpr expression1;
	private String id;

	public FindNote(String text, ArithExpr e) {
		
		this.expression1 = e;
		this.id = text;	
	}


}

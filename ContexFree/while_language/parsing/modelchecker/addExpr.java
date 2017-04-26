package while_language.parsing;

import while_language.Environment;
import while_language.VariableNotDefinedException;
import while_language.ast.ArithExpr;

public class addExpr extends ArithExpr {

	private ArithExpr expression1;
	private ArithExpr expression2;
	
	public addExpr(ArithExpr str, ArithExpr e) {
		this.expression1 = e;
		this.expression2 = str;
	}

	@Override
	public int evaluate(Environment env) throws VariableNotDefinedException {
		return expression1.evaluate(env) + expression2.evaluate(env);
	}


}

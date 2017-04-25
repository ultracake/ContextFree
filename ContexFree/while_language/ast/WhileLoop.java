package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public class WhileLoop extends Statement {

	private BoolExpr condition;
	private Statement whileV;

	public WhileLoop(BoolExpr condition, Statement whileV) {
		this.condition = condition;
		this.whileV = whileV;

	}

	@Override
	public void evaluate(Environment env) throws VariableNotDefinedException {
		while (condition.evaluate(env)) {
			whileV.evaluate(env);	
		}
	}

}

package romenska.patterns.behavioral.interpreter;

public class Interpreter {
	public InterpreterContext ic;

	public Interpreter(InterpreterContext i) {
		this.ic = i;
	}

	public String interpret(String str) {
		Expression exp = null;
		// create rules for expressions
		if (str.contains("Hexadecimal")) {
			exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else if (str.contains("Binary")) {
			exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else
			return str;
		
		return exp.interpret(ic);
	}
}

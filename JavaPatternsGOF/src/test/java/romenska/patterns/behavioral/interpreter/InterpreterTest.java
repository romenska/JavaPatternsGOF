package romenska.patterns.behavioral.interpreter;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class InterpreterTest {
	
	
    @ParameterizedTest
    @CsvSource({"17 in Binary,10001","17 in Hexadecimal,11","3 in Binary,11"})
	public void testInterpreter(String str, String result) {

		  Interpreter interpreter = new Interpreter(new InterpreterContext());
		  assertEquals(result, interpreter.interpret(str));

	}
}

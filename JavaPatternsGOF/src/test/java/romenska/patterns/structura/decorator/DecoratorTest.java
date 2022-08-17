package romenska.patterns.structura.decorator;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DecoratorTest {
		
	private String text = "Hello";
	
	@Test
	public void testPrinter() {

		Printer printerTxt = new PrintText();
		assertNotNull(printerTxt);
		
		Printer printerHex = new PrintHex(printerTxt);
		assertNotNull(printerHex);
		
		assertAll( ()->printerTxt.print(""),()->printerHex.print(""));
		assertAll( ()->printerTxt.print(null),()->printerHex.print(null));
		assertAll( ()->printerTxt.print(text),()->printerHex.print(text));
	}
}

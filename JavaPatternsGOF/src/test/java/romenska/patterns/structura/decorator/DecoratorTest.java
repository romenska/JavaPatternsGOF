package romenska.patterns.structura.decorator;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;

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
	@Test
	public void testPrinterDecore() {

		Printer printer = new PrintText();
		Printer printerDecore1 = new PrinterDecorator(printer);
		Printer printerDecore2 = new PrinterDecorator(printerDecore1);
		assertAll( ()->printer.print(""),()->printerDecore1.print(""),()->printerDecore2.print(""));
		assertAll( ()->printer.print(null),()->printerDecore1.print(null),()->printerDecore2.print(null));
		assertAll( ()->printer.print(text),()->printerDecore1.print(text),()->printerDecore2.print(text));
	}
}

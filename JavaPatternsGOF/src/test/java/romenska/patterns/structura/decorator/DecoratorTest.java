package romenska.patterns.structura.decorator;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import romenska.patterns.structura.decorator.database.Database;
import romenska.patterns.structura.decorator.database.EncryptionDecorator;
import romenska.patterns.structura.decorator.database.FileDataBase;
import romenska.patterns.structura.decorator.printer.PrintHex;
import romenska.patterns.structura.decorator.printer.PrintText;
import romenska.patterns.structura.decorator.printer.Printer;
import romenska.patterns.structura.decorator.printer.PrinterDecorator;

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
	@Test
	public void testDatabase() {
		Database database = new EncryptionDecorator( new FileDataBase("data.txt"));
		database.write(text);
		String readData = database.read();
		assertEquals(text, readData);
	}
}

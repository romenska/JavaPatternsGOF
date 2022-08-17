package romenska.patterns.structura.decorator.printer;

public class PrintText implements Printer {

	@Override
	public void print(String text) {
		System.out.println(text);
	}

}

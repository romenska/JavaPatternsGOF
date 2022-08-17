package romenska.patterns.structura.decorator;

import java.util.stream.Collectors;


public class PrintHex implements Printer{

	private Printer inner;
	public PrintHex(Printer inner) {
		this.inner=inner;
	}
	@Override
	public void print(String text) {
		if (text != null) {
			text = text.chars()
				.boxed()
				.map(x->"0x"+Integer.toHexString(x))
				.collect(Collectors.joining(" "));
		}

		inner.print(text);
	}

}

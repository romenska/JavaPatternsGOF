package romenska.patterns.structura.decorator.printer;

public  class PrinterDecorator implements Printer {
	Printer inner;
	String decorator="decorator";
	public PrinterDecorator(Printer inner) {
		this.inner=inner;
	}
	@Override 
	public void print(String text) {
		inner.print("<"+decorator +">"+text+"<"+decorator+">");
	}

}

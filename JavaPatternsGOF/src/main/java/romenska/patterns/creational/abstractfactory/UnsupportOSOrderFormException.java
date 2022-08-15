package romenska.patterns.creational.abstractfactory;

public class UnsupportOSOrderFormException extends RuntimeException {
public UnsupportOSOrderFormException(String os) {
	super(os + "is unsupport.");
}
}

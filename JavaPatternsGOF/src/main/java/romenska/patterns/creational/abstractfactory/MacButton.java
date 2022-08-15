package romenska.patterns.creational.abstractfactory;

public class MacButton implements Button {
public MacButton() {
	System.out.println("MacButton is created.");
}
@Override
	public String toString() {
		return "MacButton";
	}
}

package romenska.patterns.creational.abstractfactory;

public class WindowsButton implements Button {
public WindowsButton() {
	System.out.println("WindowsButton is created.");
}
@Override
	public String toString() {
		return "WindowsButton";
	}
}

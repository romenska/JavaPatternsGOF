package romenska.patterns.creational.abstractfactory;

public class WindowsTextEdit implements TextEdit {
public WindowsTextEdit() {
	System.out.println("WindowsTextEdit is created.");
}
@Override
	public String toString() {
		return "WindowsTextEdit";
	}
}

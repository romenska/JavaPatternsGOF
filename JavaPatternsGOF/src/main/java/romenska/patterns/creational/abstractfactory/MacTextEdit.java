package romenska.patterns.creational.abstractfactory;

public class MacTextEdit implements TextEdit {
public MacTextEdit() {
	System.out.println("MacTextEdit is created.");
}
@Override
	public String toString() {
		return "MacTextEdit";
	}
}

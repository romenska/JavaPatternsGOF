package romenska.patterns.creational.abstractfactory;

public class WindowsGUIFactory implements GUIFactory {
public WindowsGUIFactory() {
	System.out.println("==== Create WindowsGUIFactory");
}

@Override
	public String toString() {
		return "WindowsGUIFactory";
	}
@Override
public Button createButton() {
	return new WindowsButton();
}

@Override
public TextEdit createTextEdit() {
	return new WindowsTextEdit();
}

@Override
public Select createSelect() {
	return new WindowsSelect();
}
}

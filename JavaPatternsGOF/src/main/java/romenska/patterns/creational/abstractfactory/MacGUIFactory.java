package romenska.patterns.creational.abstractfactory;

public class MacGUIFactory implements GUIFactory {

	public MacGUIFactory() {
		System.out.println("==== MacGUIFactory is created.");
	}
	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextEdit createTextEdit() {
		return new MacTextEdit();
	}

	@Override
	public Select createSelect() {
		return new MacSelect();
	}

}

package romenska.patterns.creational.abstractfactory;

public interface GUIFactory {
	Button createButton();
	TextEdit createTextEdit();
	Select createSelect();
}

package romenska.patterns.creational.abstractfactory;

public class OrderForm {
	
	private final Button buttonOrder;
	private final TextEdit textEditOrder;
	private final Select selectOrder;

	public OrderForm(GUIFactory factory) {
		buttonOrder = factory.createButton();
		textEditOrder = factory.createTextEdit();
		selectOrder =  factory.createSelect();
	}

	public Button getButtonOrder() {
		return buttonOrder;
	}

	public TextEdit getTextEditOrder() {
		return textEditOrder;
	}

	public Select getSelectOrder() {
		return selectOrder;
	}

}

package romenska.patterns.creational.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FormTest {

	@Test
	public void testWindowsOrderForm() {
		OrderForm form = new OrderForm(new WindowsGUIFactory());
		assertEquals(WindowsButton.class, form.getButtonOrder().getClass());
		assertEquals(WindowsTextEdit.class, form.getTextEditOrder().getClass());
		assertEquals(WindowsSelect.class, form.getSelectOrder().getClass());
	}
	@Test
	public void testMacOrderForm() {
		OrderForm form = new OrderForm(new MacGUIFactory());
		assertEquals(MacButton.class, form.getButtonOrder().getClass());
		assertEquals(MacTextEdit.class, form.getTextEditOrder().getClass());
		assertEquals(MacSelect.class, form.getSelectOrder().getClass());
	}
	
}

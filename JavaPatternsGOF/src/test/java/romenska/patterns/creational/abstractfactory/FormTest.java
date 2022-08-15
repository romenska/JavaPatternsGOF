package romenska.patterns.creational.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FormTest {

	@ParameterizedTest
	@ValueSource(strings = {"Windows","Mac"})
	public void testWindowsOrderForm(String os) {
		OrderForm form = buildForm(os);
		assertEquals(os+"Button", form.getButtonOrder().toString() );
		assertEquals(os+"TextEdit", form.getTextEditOrder().toString() );
		assertEquals(os+"Select", form.getSelectOrder().toString() );
	}
	@Test
	public void testUnsupportedOrderForm() {
		assertThrows(UnsupportOSOrderFormException.class,()-> buildForm("Ubuntu"));
	}

	private OrderForm  buildForm(String os){
		switch (os) {
		case "Windows": return new OrderForm(new WindowsGUIFactory());
		case "Mac": return new OrderForm(new MacGUIFactory());
		default: throw new UnsupportOSOrderFormException(os);
		}

	}
	
}

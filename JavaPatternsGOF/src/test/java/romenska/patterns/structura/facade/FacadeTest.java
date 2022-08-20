package romenska.patterns.structura.facade;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class FacadeTest {
	
	@Test
	public void testShape(){
		ShapeFacade facade = new ShapeFacade();
		assertAll(()-> facade.drawCircle()
				,()->facade.drawRectangle()
				,()->facade.drawLine());
	}
}

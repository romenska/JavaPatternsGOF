package romenska.patterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

public class StrategyTest {
	
	@Test
	public void testPet(){
		Pet cat = new Pet();
		
		cat.setActivity(new Run());
		cat.doIt();
				
		cat.setActivity(new Eat());
		cat.doIt();
		
		cat.setActivity(new Sleep());
		cat.doIt();
	}
}

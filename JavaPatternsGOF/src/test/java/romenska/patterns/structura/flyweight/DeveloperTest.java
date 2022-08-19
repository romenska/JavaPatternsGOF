package romenska.patterns.structura.flyweight;

import org.junit.jupiter.api.Test;

public class DeveloperTest {
	
	@Test
	public void testDeveloper() {
		for(int i=0;i<10;i++) {
			DeveloperFactory.getDeveloper("Java").work();
			DeveloperFactory.getDeveloper("C++").work();
		}
		
		
	}

}

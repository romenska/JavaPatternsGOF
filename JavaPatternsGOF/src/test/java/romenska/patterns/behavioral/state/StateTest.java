package romenska.patterns.behavioral.state;

import org.junit.jupiter.api.Test;

public class StateTest {


		@Test
		public void testPet(){
			Pet cat = new Pet();
			
			cat.changeActivity();
			cat.doIt();
					
			cat.changeActivity();
			cat.doIt();
			
			cat.changeActivity();
			cat.doIt();
		}
	}

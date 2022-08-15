package romenska.patterns.creational.singelton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SingeltonTest {
	@Test
	public void testSingelton(){
		Singelton singelton = Singelton.getInstance();
		for(int i=0;i<10;i++) {
			Singelton singeltonDuplicate =  Singelton.getInstance();
			assertEquals(singelton,singeltonDuplicate );
			System.out.println(i+": "+singeltonDuplicate);
		}
			
	}

}

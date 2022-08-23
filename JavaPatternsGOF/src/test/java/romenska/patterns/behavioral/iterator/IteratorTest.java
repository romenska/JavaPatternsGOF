package romenska.patterns.behavioral.iterator;


import org.junit.jupiter.api.Test;

public class IteratorTest {

	@Test
	public void testIterator() {
		
		History history = new  History();
		for (int i=1;i<=20;i++)
			history.add("v."+i);
		System.out.println("versions:");
		for(String v:history) {
			System.out.println(v);
		}
	}
}

package romenska.patterns.creational.prototype;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;

public class CircleTest {
	
	
	static Circle circle;
	
	@BeforeAll
	public static void  beforeAll() {
		circle = new Circle(100, 100, "red", 10);
		System.out.println("Prototype = "+circle);
	}
	

	
	@RepeatedTest(value = 10)
	public void testCloneCircle(){
		
		Circle circleClone = (Circle) circle.clone();
		System.out.println("Clone     = "+circleClone);
		
		assertTrue(circle.equals(circleClone));
		assertNotEquals(circle.hashCode(), circleClone.hashCode());

		
	}
}

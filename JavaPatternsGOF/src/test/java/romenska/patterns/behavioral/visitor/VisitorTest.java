package romenska.patterns.behavioral.visitor;

import org.junit.jupiter.api.Test;

public class VisitorTest {
	
	@Test
	public void testVisitor() {
		
		Visitor visitor = new EnVisitor();
		
		new Cat("Мурчик").say(visitor);
		new Dog("Гавчик").say(visitor);
	
	}

}

package romenska.patterns.behavioral.visitor;

public class EnVisitor implements Visitor{

	@Override
	public void acceptCat(Cat cat) {
		System.out.println(cat.getName()+" say: meow-meow");
		
	}

	@Override
	public void acceptDog(Dog dog) {
		System.out.println(dog.getName()+" say: woof-woof");
	}
	
}
package romenska.patterns.behavioral.visitor;

public class UaVisitor implements Visitor{

	@Override
	public void acceptCat(Cat cat) {
		System.out.println(cat.getName()+" сказав: няу-няу");
	}

	@Override
	public void acceptDog(Dog dog) {
		System.out.println(dog.getName()+" сказав: гав-гав");
	}
}
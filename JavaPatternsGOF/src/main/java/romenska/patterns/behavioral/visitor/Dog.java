package romenska.patterns.behavioral.visitor;

public class Dog implements Animal{
	private String name;
	public Dog(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	@Override
	public void say(Visitor visior) {
		visior.acceptDog(this);
	}
}

package romenska.patterns.behavioral.visitor;

public class Cat implements Animal{
	private String name;
	public Cat(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	@Override
	public void say(Visitor visior) {
		visior.acceptCat(this);
	}
}
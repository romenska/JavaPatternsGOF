package romenska.patterns.creational.factory;

public class CoffeeEspresso implements Coffee {
	public CoffeeEspresso() {
		System.out.println("Coffee espresso is done.");
	}
	@Override
	public String toString() {
		return "Espresso";
	}
}

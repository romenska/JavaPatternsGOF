package romenska.patterns.creational.factory;

public class CoffeeAmericano implements Coffee {
	public CoffeeAmericano() {
		System.out.println("Coffee americano is done.");
	}
	@Override
	public String toString() {
		return "Americano";
	}
}

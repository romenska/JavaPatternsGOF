package romenska.patterns.creational.factory;

public class CoffeeAmericanoFactory implements CoffeeFactory {

	@Override
	public Coffee makeCoffee() {
		return new CoffeeAmericano();
	}

}

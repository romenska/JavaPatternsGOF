package romenska.patterns.creational.factory;

public class CoffeeEspressoFactory implements CoffeeFactory {

	@Override
	public Coffee makeCoffee() {

		return new CoffeeEspresso();
	}

}

package romenska.patterns.creational.factory;

public class CoffeeMachine {
	
	public static final String AMERICANO = "Americano";
	public static final String ESPRESSO = "Espresso";
	
	public static Coffee makeCoffee(String coffeeType)  {
		
		CoffeeFactory coffeeFactory; 
		
		switch (coffeeType) {
		case AMERICANO: 
			coffeeFactory = new CoffeeAmericanoFactory();
			break;
		case ESPRESSO: 
			coffeeFactory = new CoffeeEspressoFactory();
			break;
		default:
			throw new UnknownCoffeeTypeException(coffeeType);
		}
		
		return coffeeFactory.makeCoffee();
	}
}

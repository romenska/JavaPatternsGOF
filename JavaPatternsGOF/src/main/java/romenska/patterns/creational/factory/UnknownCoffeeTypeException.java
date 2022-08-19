package romenska.patterns.creational.factory;


public class UnknownCoffeeTypeException extends RuntimeException {


	public UnknownCoffeeTypeException(String coffeeType) {
		super(coffeeType +" is unknown coffee type");
	}

}

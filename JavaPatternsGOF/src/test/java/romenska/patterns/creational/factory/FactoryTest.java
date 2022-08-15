package romenska.patterns.creational.factory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FactoryTest {
	
	@ParameterizedTest
	@ValueSource(strings = {CoffeeMachine.AMERICANO, CoffeeMachine.ESPRESSO})
	public void testMakeCoffee(String coffeeType){
		Coffee coffee = CoffeeMachine.makeCoffee(coffeeType);
		assertNotNull(coffee);
		assertEquals(coffeeType,coffee.toString());
	}
	@Test 
	public void testMakeUnknownCoffeeType(){
		assertThrows(UnknownCoffeeTypeException.class,  ()->CoffeeMachine.makeCoffee("Cappuccino"));

	}
	
}

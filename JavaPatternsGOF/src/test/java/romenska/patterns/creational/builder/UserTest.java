package romenska.patterns.creational.builder;

import org.junit.jupiter.api.Test;

public class UserTest {
	

	@Test
	public void testBuildUserWithAllOptional(){
		User user = new User.UserBuilder("Lokesh", "Gupta")
				.age(30)
				.phone("1234567")
				.address("Fake address 1234")
				.build();
		System.out.println(user);
	}
	@Test
	public void testBuildUserWithSomeOptional(){
		User user = new User.UserBuilder("Jack", "Reacher")
				.age(40)
				.phone("5655")
				//no address
				.build();
		System.out.println(user);
	}
	@Test
	public void testBuildUserWithoutOptional(){
		User user = new User.UserBuilder("Super", "Man")
				//No age
				//No phone
				//no address
				.build();
		System.out.println(user);
	}
}

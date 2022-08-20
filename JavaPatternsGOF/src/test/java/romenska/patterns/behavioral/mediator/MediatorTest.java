package romenska.patterns.behavioral.mediator;

import org.junit.jupiter.api.Test;

public class MediatorTest {
	@Test
	public void testChat(){
		
		IChat chat = new Chat();
		
		IUser user1 =  new User("User1",chat);
		IUser user2 =  new User("User2",chat);
		IUser user3 =  new User("User3",chat);
		
		user1.send("Hello!!!");
		user3.send("Hello, user3 :)");

	}
}

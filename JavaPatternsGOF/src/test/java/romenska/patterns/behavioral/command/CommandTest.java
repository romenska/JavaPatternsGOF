package romenska.patterns.behavioral.command;

import org.junit.jupiter.api.Test;

public class CommandTest {
	@Test
	public void testCommands(){
		Database database = new Database();
		Developer developer = new Developer(
				new CreateCommand(database), 
				new UpdateCommand(database), 
				new SelectCommand(database), 
				new DeleteCommand(database));
	
		developer.createRecord();
		developer.updateRecord();
		developer.selectRecord();
		developer.deleteRecord();
		
	}
}

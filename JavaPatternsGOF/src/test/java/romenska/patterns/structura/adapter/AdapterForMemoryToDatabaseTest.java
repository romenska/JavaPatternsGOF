package romenska.patterns.structura.adapter;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class AdapterForMemoryToDatabaseTest {
	@Test
	public void testAdapter(){
		Database database =  new AdapterForMemoryToDatabase();
		assertNotNull(database);
		database.delete();
		database.insert();
		database.update();
		database.select();
	}
}

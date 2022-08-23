package romenska.patterns.behavioral.memento;


import org.junit.jupiter.api.Test;

public class MementoTest {
	@Test
	public void testMemento() {
	
		try {
			
			Project project = new Project(1);
			System.out.println(project);
			
			Thread.sleep(1000);
			project.setVersion(2);
			System.out.println(project);
			
			Thread.sleep(1000);
			project.setVersion(3);
			System.out.println(project);
			
		
			Thread.sleep(1000);
			project.setVersion(4);
			System.out.println(project);
			
			project.undo();
			System.out.println(project);
			
			project.undo();
			System.out.println(project);
			
			project.redo();
			System.out.println(project);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

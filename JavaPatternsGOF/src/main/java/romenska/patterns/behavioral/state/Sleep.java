package romenska.patterns.behavioral.state;

public class Sleep implements Activity {

	@Override
	public void doIt() {
		System.out.println("Sleeping...");
	}

}

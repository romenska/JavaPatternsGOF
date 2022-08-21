package romenska.patterns.behavioral.strategy;

public class Sleep implements Activity {

	@Override
	public void doIt() {
		System.out.println("Sleeping...");
	}

}

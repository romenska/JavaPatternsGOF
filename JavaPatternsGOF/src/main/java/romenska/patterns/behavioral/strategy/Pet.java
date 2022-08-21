package romenska.patterns.behavioral.strategy;

public class Pet {
	private Activity activity;
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	public void doIt(){
		activity.doIt();
	}
}

package romenska.patterns.behavioral.state;

import java.util.Arrays;
import java.util.List;

public class Pet {
	
	private List<Activity> activityList = Arrays.asList(new Sleep(),new Eat(),new Run());
	private int current=0;
	
	public void changeActivity() {
		current = (current+1>=activityList.size())?0:current+1;
	}
	
	public void doIt(){
		activityList.get(current).doIt();
	}
}

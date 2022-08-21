package romenska.patterns.behavioral.оbserver;

public interface Observer<T> {
	
	//method to update the observer, used by subject
	public void update();
	
	//attach with subject to observe
	public void setSubject(Subject<T> sub);
	
}
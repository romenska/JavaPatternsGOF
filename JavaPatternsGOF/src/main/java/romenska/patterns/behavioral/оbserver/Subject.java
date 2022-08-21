package romenska.patterns.behavioral.оbserver;

public interface Subject<T> {

	//methods to register and unregister observers
	public void register(Observer<String> obj);
	public void unregister(Observer<String> obj);
	
	//method to notify observers of change
	public void notifyObservers();
	
	//method to get updates from subject
	public T getUpdate(Observer<String> obj);
	
}

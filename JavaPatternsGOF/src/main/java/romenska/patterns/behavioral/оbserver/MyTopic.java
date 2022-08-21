package romenska.patterns.behavioral.оbserver;

import java.util.Set;
import java.util.HashSet;

public class MyTopic implements Subject<String> {

	private final Set<Observer<String>> observers = new HashSet<>();
	private boolean changed;
	private String message;

	@Override
	public void register(Observer<String> observer) {

		synchronized (observers) {
			if (observer != null)
				observers.add(observer);
		}
	}

	@Override
	public void unregister(Observer<String> observer) {

		synchronized (observers) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		
		synchronized (observers) {
			if (changed)
				observers.stream().forEach(observer -> observer.update());
			changed = false;
		}
		
	}

	@Override
	public String getUpdate(Observer<String> obj) {
		return message;
	}

	// method to post message to the topic
	public void postMessage(String message) {
		this.message = message;
		changed = true;
		notifyObservers();
	}

}
package romenska.patterns.behavioral.оbserver;

public class MyTopicSubscriber implements Observer<String> {
	
	private String name;
	private Subject<String> subject;
	
	public MyTopicSubscriber(String name){
		this.name=name;
	}
	
	@Override
	public void setSubject(Subject<String> subject) {
		this.subject=subject;
	}
		
	@Override
	public void update() {
		
		String message = subject.getUpdate(this);
		
		if(message == null){
			System.out.println(name+":: No new message");
		}else  {
			System.out.println(name+":: Consuming message::"+message);
		}
	}



}
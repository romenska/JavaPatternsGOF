package romenska.patterns.behavioral.оbserver;

import org.junit.jupiter.api.Test;

public class ObserverTest {

	@Test
	public void testTopic() {
		
		MyTopic topic = new MyTopic();
		
		//create observers
		Observer<String> obj1 = new MyTopicSubscriber("Obj1");
		Observer<String> obj2 = new MyTopicSubscriber("Obj2");
		Observer<String> obj3 = new MyTopicSubscriber("Obj3");
		
		//register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);
		
		//attach observer to subject
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);
		
		//check if any update is available
		obj1.update();
		
		//now send message to subject
		topic.postMessage("New Message");
		
		obj1.update();
	}
}

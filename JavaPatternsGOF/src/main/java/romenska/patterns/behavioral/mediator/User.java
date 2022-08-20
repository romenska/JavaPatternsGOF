package romenska.patterns.behavioral.mediator;

public class User implements IUser {

	String name;
	IChat chat;
	
	public User(String name, IChat chat) {
		this.name = name;
		this.chat = chat;
		chat.addUser(this);
	}
	public String getName() {
		return name;
	}
	
	@Override
	public void send(String message) {
		System.out.println(this.name+" >> "+message);
		chat.sendMessage(this, message);
	}

	@Override
	public void recive(String message) {
		System.out.println(this.name+" << "+message);
	}
	
	@Override
	public String toString() {
		return name;
	}

}

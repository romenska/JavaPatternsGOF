package romenska.patterns.behavioral.mediator;

public interface IChat {
	void addUser(IUser user);
	void sendMessage(IUser user,String message);
}

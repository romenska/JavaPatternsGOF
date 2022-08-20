package romenska.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements IChat {
	
	List<IUser> userList = new ArrayList<>();

	@Override
	public void addUser(IUser user) {
		userList.add(user);
	}

	@Override
	public void sendMessage(IUser user, String message) {
		for(IUser u : userList) {
			if (u!=user) u.recive(message);
		}
	}

}

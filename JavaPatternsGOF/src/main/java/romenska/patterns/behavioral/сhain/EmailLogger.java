package romenska.patterns.behavioral.сhain;

public class EmailLogger extends Logger {

	public EmailLogger(int level) {
		super.level = level;
	}
	
	@Override
	protected void writeMessage(String msg) {
		System.out.println("Send email: "+msg);
	}

}

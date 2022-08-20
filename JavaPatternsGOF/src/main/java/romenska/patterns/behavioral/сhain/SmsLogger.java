package romenska.patterns.behavioral.сhain;

public class SmsLogger extends Logger {

	public SmsLogger(int level) {
		super.level = level;
	}
	
	@Override
	protected void writeMessage(String msg) {
		System.out.println("Send sms: "+msg);
	}

}

package romenska.patterns.behavioral.сhain;

public class FileLogger  extends Logger {

	public FileLogger(int level) {
		super.level = level;
	}
	
	@Override
	protected void writeMessage(String msg) {
		System.out.println("Save to file: "+msg);
	}

}

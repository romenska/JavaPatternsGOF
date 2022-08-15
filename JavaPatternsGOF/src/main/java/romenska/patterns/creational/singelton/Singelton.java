package romenska.patterns.creational.singelton;

public final class Singelton {
	
	static private Singelton instance = new Singelton();
	
	private Singelton() {
		System.out.println("New Singelton is created "+this);
	}

	public static Singelton getInstance() {
		return instance;
	}
}

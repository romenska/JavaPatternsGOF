package romenska.patterns.creational.abstractfactory;

public class MacSelect implements Select {
public MacSelect() {
	System.out.println("MacSelect is created.");
}
@Override
	public String toString() {
		return "MacSelect";
	}
}

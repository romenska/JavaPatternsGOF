package romenska.patterns.structura.flyweight;

public class UnknownDeveloperTypeException  extends RuntimeException {


	public UnknownDeveloperTypeException(String developerType) {
		super(developerType +" is unknown developer type");
	}

}

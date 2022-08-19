package romenska.patterns.structura.flyweight;

public class CppDeveloper  implements Developer {

	public CppDeveloper() {
		System.out.println("C++ developer hired");
	}
	@Override
	public void work() {
		System.out.println("C++ application development");
		
	}



}
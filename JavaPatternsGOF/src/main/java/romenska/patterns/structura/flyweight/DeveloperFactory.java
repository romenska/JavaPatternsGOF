package romenska.patterns.structura.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
	static private Map<String, Developer> developers = new HashMap<>();
	static public Developer getDeveloper(String developerType) {
		Developer developer= developers.get(developerType);
		if (developer==null) {
			switch(developerType) {
				case "Java": 
					developer=new JavaDeveloper();
					developers.put(developerType, developer);
					break;
				case "C++": 
					developer=new CppDeveloper();
					developers.put(developerType, developer);
					break;	
				default: 
					throw new UnknownDeveloperTypeException(developerType);
			}
		}
		return developer;
		
	}

}

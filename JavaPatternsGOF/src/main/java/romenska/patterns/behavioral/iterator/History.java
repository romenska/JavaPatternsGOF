package romenska.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class History implements Iterable<String> {

	private List <String> versions = new ArrayList<>();
	private int cursor=-1;
	
	public void add(String version) {
		versions.add(version);
	}
	
	@Override
	public Iterator<String> iterator() {

		return new Iterator<String>() {

			@Override
			public boolean hasNext() {
				return versions.size() > cursor+1;
			}

			@Override
			public String next() {
				if (!hasNext())throw new NullPointerException();
				
				return versions.get(++cursor);
			}
			
		};
	}

}

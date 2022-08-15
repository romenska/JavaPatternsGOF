package romenska.patterns.structura.adapter;

public class AdapterForMemoryToDatabase extends Memory implements Database {

	@Override
	public void select() {
		read();
	}

	@Override
	public void update() {
		change();
	}

	@Override
	public void insert() {
		write();
		
	}

	@Override
	public void delete() {
		remove();
	}

}

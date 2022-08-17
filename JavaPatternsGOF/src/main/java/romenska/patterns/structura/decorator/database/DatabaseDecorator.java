package romenska.patterns.structura.decorator.database;

public abstract  class DatabaseDecorator implements Database {

    private Database database;

    public DatabaseDecorator(Database database) {
        this.database = database;
    }

	@Override
	public void write(String data) {
		database.write(data);
		
	}

	@Override
	public String read() {
		return database.read();
	}

}

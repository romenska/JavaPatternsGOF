package romenska.patterns.behavioral.command;

public class CreateCommand implements Command {

	private Database database;
	public CreateCommand(Database database) {
		this.database=database;
	}
	@Override
	public void execute() {
		database.create();

	}

}

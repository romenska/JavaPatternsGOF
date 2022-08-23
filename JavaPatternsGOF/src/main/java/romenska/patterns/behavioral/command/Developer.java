package romenska.patterns.behavioral.command;

public class Developer {
	
	private Command create;
	private Command update;
	private Command select;
	private Command delete;
	
	public Developer(	Command create,
						Command update,
						Command select,
						Command delete) {
		this.create=create;
		this.update=update;
		this.select=select;
		this.delete=delete;
	}
	public void createRecord() {
		create.execute();
	}
	public void updateRecord() {
		update.execute();
	}
	public void selectRecord() {
		select.execute();
	}
	public void deleteRecord() {
		delete.execute();
	}
}

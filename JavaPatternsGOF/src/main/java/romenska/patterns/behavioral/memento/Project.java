package romenska.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project  {
	
	private int version;
	private Date date;

	private List<Project.Snapshot> history = new ArrayList<>();
	private int indexHistroy=0;

	class Snapshot{
		
		private final int version;
		private final Date date;
		
		private Snapshot(int version,Date date) {
			this.version = version;
			this.date = date;
		}
		
		public void restore() {
			Project.this.date = this.date;
			Project.this.version = this.version;
		}

	}

	private void snapshot(){
		history.add( new Snapshot(version, date));
		indexHistroy=history.size()-1;
	}
	public void undo() {
		indexHistroy=(indexHistroy>0)?indexHistroy-1:0;
		history.get(indexHistroy).restore();
	}
	public void redo() {
		indexHistroy=(indexHistroy>history.size()-1)?history.size()-1:indexHistroy+1;
		history.get(indexHistroy).restore();
	}

	
	public Project(int version) {
		this.version=version;
		this.date = new Date();
		history.add( new Snapshot(version, date));
	}

	public Date getDate() {
		return date;
	}
	
	public int getVersion() {
		return version;
	}
	
	public void setVersion(int version) {
		this.version = version;
		this.date = new Date();
		snapshot();
	}


	@Override
	public String toString() {
		return "Project v."+version+" ("+date+")";
	}
	
	
}

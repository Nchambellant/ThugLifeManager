package entities;

import java.util.ArrayList;

public class TaskBoard {

	public ArrayList<Task> getTasks() {
		if(tasks == null) tasks = new ArrayList<Task>();
		return tasks;
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
	
	private ArrayList<Task> tasks;
}

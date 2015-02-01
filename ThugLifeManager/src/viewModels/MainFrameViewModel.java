package viewModels;

import java.util.ArrayList;

import entities.*;
import models.MainFrameModel;

public class MainFrameViewModel {
	
	public MainFrameViewModel(MainFrameModel model){
		this.model = model;
	}
	
	// commands
	public void addTask(String newTaskTitle)
	{
		Task newTask = new Task(){{
			setTitle(newTaskTitle);
		}};
		model.getTaskBoard().getTasks().add(newTask);
	}
	
	public ArrayList<String> getTasksTitles(){
		ArrayList<String> taskTitles = new ArrayList<String>();
		
		for(Task task : getModel().getTaskBoard().getTasks())
			taskTitles.add(task.getTitle());
		
		return taskTitles;
	}

	
	public MainFrameModel getModel() {
		return model;
	}

	public void setModel(MainFrameModel model) {
		this.model = model;
	}
	
	private MainFrameModel model;
}

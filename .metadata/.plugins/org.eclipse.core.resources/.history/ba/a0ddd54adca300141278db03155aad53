package viewModels;

import entities.*;
import models.*;

public class MainFrameViewModel {
	
	// commands
	public void addTask(String newTaskTitle)
	{
		Task newTask = new Task(){{
			
		}};
		model.getTaskBoard().getTasks().add(newTask);
	}

	public MainFrameModel getModel() {
		return model;
	}

	public void setModel(MainFrameModel model) {
		this.model = model;
	}
	
	private MainFrameModel model;
}

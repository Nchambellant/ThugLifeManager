package models;

import entities.*;

public class MainFrameModel {
	
	public TaskBoard getTaskBoard() {
		return taskBoard;
	}

	public void setTaskBoard(TaskBoard taskBoard) {
		this.taskBoard = taskBoard;
	}
	
	private TaskBoard taskBoard;
}
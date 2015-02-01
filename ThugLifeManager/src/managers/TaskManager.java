package managers;

import java.util.ArrayList;

import entities.Task;
import entities.TaskBoard;

public class TaskManager {

	public void addTask(TaskBoard taskBoard, Task task) {
		ArrayList<Task> tasks = taskBoard.getTasks();
		tasks.add(task);
	}

	public void completeTask(TaskBoard taskBoard, Task task) {
		int indexOfTask = taskBoard.getTasks().indexOf(task);
		taskBoard.getTasks().get(indexOfTask).setIsCompleted(true);
	}

	public void deleteTask(TaskBoard taskBoard, Task task) {		
		int indexOfTask = taskBoard.getTasks().indexOf(task);
		taskBoard.getTasks().remove(indexOfTask);
	}

}

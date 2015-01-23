package managers;

import java.util.ArrayList;

import entities.Task;
import entities.TaskBoard;

public class TaskManager {

	public void addTask(TaskBoard taskBoard, Task task) {
		ArrayList<Task> tasks = taskBoard.getTasks();
		tasks.add(task);
		taskBoard.setTasks(tasks);
	}

}

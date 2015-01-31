package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import managers.TaskManager;

import org.junit.Test;

import entities.Task;
import entities.TaskBoard;

public class TaskManagerTest {

	@Test
	public void addTask() {
		//Arrange 
		Task task = new Task();
		TaskBoard taskBoard = new TaskBoard();
		TaskManager taskManager = new TaskManager();
		
		//Act
		taskManager.addTask(taskBoard, task);
		
		//Assert
		assertTrue(taskBoard.getTasks().contains(task));
		}
	
	@SuppressWarnings("serial")
	@Test
	public void completeTask(){
		//Arrange
		Task task = new Task(){{
			setIsCompleted(false);
		}};
		TaskBoard taskBoard = new TaskBoard(){{
			setTasks(
					new ArrayList<Task>(){{
						add(task);
					}}
					);
		}};
		TaskManager taskManager = new TaskManager();
		
		//Act
		taskManager.completeTask(taskBoard, task);
		
		//Assert
		assertTrue(task.getIsCompleted());
	}
	
	@Test
	public void createTaskWithTitle(){
		//Arrange
		String taskTitle = "default task title";
		Task task = new Task(){{
			setTitle(taskTitle);
		}};
		
		//Act
		//Assert
		assertTrue(task.getTitle() == taskTitle);
	}
	
	@Test
	public void deleteTask(){
		//Arrange
		String taskTitle = "default task title";
		Task task = new Task(){{
			setTitle(taskTitle);
		}};
		TaskBoard taskBoard = new TaskBoard(){{
			setTasks(
					new ArrayList<Task>(){{
						add(task);
					}}
					);
		}};
		TaskManager taskManager = new TaskManager();
		//Act
		taskManager.deleteTask(taskBoard, task);
		
		//Assert
		assertTrue(!taskBoard.getTasks().contains(task));
	}
	}

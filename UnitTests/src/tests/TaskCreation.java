package tests;

import static org.junit.Assert.*;
import managers.TaskManager;

import org.junit.Test;

import entities.Task;
import entities.TaskBoard;

public class TaskCreation {

	@Test
	public void CreateTask() {
		//Arrange 
		Task task = new Task();
		TaskBoard taskBoard = new TaskBoard();
		TaskManager taskManager = new TaskManager();
		
		//Act
		taskManager.addTask(taskBoard, task);
		
		//Assert
		assertTrue(taskBoard.getTasks().contains(task));
		}
	}

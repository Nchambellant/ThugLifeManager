package views;

import entities.*; // this line has to be deleted in the future!
import models.MainFrameModel; // this line has to be deleted in the future!
import viewModels.MainFrameViewModel;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JList;

public class MainFrameView {
	
	private static MainFrameViewModel viewModel;
	
	private JFrame frame;
	private JTextField taskTitleTextField;
	private JButton addTaskBtn;
	private DefaultListModel<String> taskListModel;
	private JList<String> taskList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrameView window = new MainFrameView();
					window.frame.setVisible(true);
					
					initializeFromNavigator(); // this line has to be deleted in the future!
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrameView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {		
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		taskTitleTextField = new JTextField();
		taskTitleTextField.setBounds(21, 11, 664, 20);
		frame.getContentPane().add(taskTitleTextField);
		taskTitleTextField.setColumns(10);
		
		addTaskBtn = new JButton("Add task");
		addTaskBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTask();
			}
		});
		addTaskBtn.setBounds(694, 11, 80, 20);
		frame.getContentPane().add(addTaskBtn);
		
		taskListModel = new DefaultListModel<String>();
		taskList = new JList<String>(taskListModel);
		taskList.setBounds(21, 42, 664, 480);
		frame.getContentPane().add(taskList);
	}
	
	private static void initializeFromNavigator(){ // this method has to be moved in the future!
		MainFrameModel mainFrameModel = new MainFrameModel(){{
			setTaskBoard(new TaskBoard());
		}};
		
		viewModel = new MainFrameViewModel(mainFrameModel);
	}
	
	private void addTask(){
		viewModel.addTask(taskTitleTextField.getText());
		refreshTaskList();
	}
	
	private void refreshTaskList(){
		taskListModel.clear();
		for(String taskTitle : viewModel.getTasksTitles())
			taskListModel.addElement(taskTitle);
	}
}

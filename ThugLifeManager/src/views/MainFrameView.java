package views;

import viewModels.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrameView {
	
	private MainFrameViewModel viewModel;
	
	private JFrame frame;
	private JTextField taskTitleTextField;
	private JButton addTaskBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrameView window = new MainFrameView();
					window.frame.setVisible(true);
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
				viewModel.addTask(taskTitleTextField.getText());
			}
		});
		addTaskBtn.setBounds(694, 11, 80, 20);
		frame.getContentPane().add(addTaskBtn);
	}
}
package views;

import javax.swing.JFrame;

public abstract class MainView {
	public void show(){
		this.frame.setVisible(true);
	}
	
	public void hide(){
		this.frame.setVisible(false);
	}
	
	protected JFrame frame;
}

package services;

import entities.*;
import models.*;
import viewModels.*;
import views.*;

public class NavigationService {
	
	public static void main(String[] args) {
		MainFrameModel mainFrameModel = new MainFrameModel(){{
			setTaskBoard(new TaskBoard());
		}};
		MainFrameViewModel mainFrameViewModel = new MainFrameViewModel(mainFrameModel);
		mainFrameView = new MainFrameView(mainFrameViewModel);
		
		mainFrameView.show();
	}
	
	private static MainFrameView mainFrameView;
}

package screenManagers;

import javax.swing.JPanel;

import screens.MainFrame;
import screens.MainMenuScreen;

public class MainMenuManager {
	
	private ViewManager viewManager;
	private MainFrame frame;
	private MainMenuScreen screen;
	
	public MainMenuManager(ViewManager viewManager, MainFrame frame) {
		this.viewManager = viewManager;
		this.frame = frame;
		frame.setMainMenuManager(this);
	}
	
	public void btnJoinChatPressed() {
		
	}
	
	public void btnHostServerPressed() {
		
	}
	
	public void btnExitPressed() {
		frame.exit();
	}
	
	public JPanel getScreen() {
		screen = new MainMenuScreen(this);
		return screen;
	}

}

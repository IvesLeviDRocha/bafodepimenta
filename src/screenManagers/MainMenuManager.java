package screenManagers;

import javax.swing.JPanel;

import screens.MainFrame;
import screens.MainMenuScreen;

public class MainMenuManager {

	private MainFrame frame;
	private MainMenuScreen screen;

	public MainMenuManager(ViewManager viewManager, MainFrame frame) {
		this.frame = frame;
		frame.setMainMenuManager(this);
	}

	public void btnJoinChatPressed() {
		frame.showJoinChatScreen();
	}

	public void btnHostServerPressed() {
		frame.showHostServerScreen();
	}

	public void btnExitPressed() {
		frame.exit();
	}

	public JPanel getScreen() {
		screen = new MainMenuScreen(this);
		return screen;
	}

}

package screenManagers;

import javax.swing.JPanel;

import screens.JoinChatScreen;
import screens.MainFrame;

public class JoinChatManager {
	
	private ViewManager viewManager;
	private MainFrame frame;
	private JoinChatScreen screen;
	
	public JoinChatManager(ViewManager viewManager, MainFrame frame) {
		this.viewManager = viewManager;
		this.frame = frame;
		frame.setJoinChatManager(this);
	}
	
	public void btnJoinPressed(String name, String ip, Integer port) {
		viewManager.createClient(name, ip, port);
		frame.showChatScreen(name);
	}
	
	public void btnCancelPressed() {
		frame.showMainMenuScreen();
	}
	
	public JPanel getScreen() {
		screen = new JoinChatScreen(this);
		return screen;
	}

}

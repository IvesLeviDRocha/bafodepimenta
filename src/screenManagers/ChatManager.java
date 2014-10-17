package screenManagers;

import javax.swing.JPanel;

import screens.ChatScreen;
import screens.MainFrame;

public class ChatManager {

	private ViewManager viewManager;
	private MainFrame frame;
	private ChatScreen screen;

	public ChatManager(ViewManager viewManager, MainFrame frame) {
		this.viewManager = viewManager;
		this.frame = frame;
		frame.setChatManager(this);
	}

	public void btnExitPressed() {

	}

	public void btnSendPressed() {

	}
	
	public JPanel getScreen() {
		screen = new ChatScreen(this);
		return screen;
	}

}

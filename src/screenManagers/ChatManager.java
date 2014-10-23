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
		System.exit(0);
	}

	public void btnSendPressed(String message) {
		screen.clearSendField();
		viewManager.sendMessage(message);
	}
	
	public void updateChat(String content) {
		screen.updateChat(content);
	}
	
	public JPanel getScreen(String nickname) {
		screen = new ChatScreen(this);
		setNickname(nickname);
		return screen;
	}
	
	public void setNickname(String name) {
		screen.setNickname(name);
	}

}

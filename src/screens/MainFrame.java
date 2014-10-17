package screens;

import javax.swing.JFrame;
import javax.swing.JPanel;

import screenManagers.ChatManager;
import screenManagers.HostServerManager;
import screenManagers.JoinChatManager;
import screenManagers.MainMenuManager;
import screenManagers.ViewManager;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 2255919888538524543L;

	private ChatManager chatManager;
	private HostServerManager hostServerManager;
	private JoinChatManager joinChatManager;
	private MainMenuManager mainMenuManager;

	public MainFrame() {
		setTitle("Bafo de Pimenta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}

	public void showScreen(JPanel screen) {
		setContentPane(screen);
		pack();
	}
	
	public void exit() {
		System.exit(0);
	}
	
	public void setChatManager(ChatManager chatManager) {
		this.chatManager = chatManager;
	}


	public void setHostServerManager(HostServerManager hostServerManager) {
		this.hostServerManager = hostServerManager;
	}


	public void setJoinChatManager(JoinChatManager joinChatManager) {
		this.joinChatManager = joinChatManager;
	}


	public void setMainMenuManager(MainMenuManager mainMenuManager) {
		this.mainMenuManager = mainMenuManager;
		showScreen(this.mainMenuManager.getScreen());
		setVisible(true);
	}

}

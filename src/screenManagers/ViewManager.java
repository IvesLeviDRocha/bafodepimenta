package screenManagers;

import bafodepimenta.ServiceController;
import screens.MainFrame;

public class ViewManager {

	private ServiceController controller;

	private ChatManager chatManager;
	private HostServerManager hostServerManager;
	private JoinChatManager joinChatManager;
	private MainMenuManager mainMenuManager;

	public ViewManager(ServiceController controller) {
		this.controller = controller;
		initManagers();
	}

	private void initManagers() {
		MainFrame frame = new MainFrame();
		chatManager = new ChatManager(this, frame);
		hostServerManager = new HostServerManager(this, frame);
		joinChatManager = new JoinChatManager(this, frame);
		mainMenuManager = new MainMenuManager(this, frame);
	}
	
	public void createClient(String name, String ip, Integer port) {
		controller.createClient(name, ip, port);
	}
	
	public void updateChat(String content) {
		chatManager.updateChat(content);
	}
	
	public void sendMessage(String message) {
		controller.sendMessage(message);
	}
	
	public void createServer(Integer port) {
		controller.createServer(port);
	}
	
	
}

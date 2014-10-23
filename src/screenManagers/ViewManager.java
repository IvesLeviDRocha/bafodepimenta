package screenManagers;

import bafodepimenta.ServiceController;
import screens.MainFrame;

public class ViewManager {

	private ServiceController controller;
	private ChatManager chatManager;

	public ViewManager(ServiceController controller) {
		this.controller = controller;
		initManagers();
	}

	private void initManagers() {
		MainFrame frame = new MainFrame();
		chatManager = new ChatManager(this, frame);
		new HostServerManager(this, frame);
		new JoinChatManager(this, frame);
		new MainMenuManager(this, frame);
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

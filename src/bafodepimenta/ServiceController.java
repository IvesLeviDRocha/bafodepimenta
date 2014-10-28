package bafodepimenta;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import screenManagers.ViewManager;
import server.Server;
import client.Client;

public class ServiceController {

	private Client client;
	private ViewManager viewManager;

	public ServiceController() {
		changeLookAndFeel();
		viewManager = new ViewManager(this);
	}

	public void createClient(String name, String serverAddress, Integer port) {
		client = new Client(name, serverAddress, port, this);
	}

	public void createServer(Integer port) {
		try {
			new Server(port);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to create server");
		}
	}

	public void updateChat(String content) {
		viewManager.updateChat(content);
	}

	public void sendMessage(String message) {
		client.sendMessage(message);
	}
	
	public void changeLookAndFeel() {
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

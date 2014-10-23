package bafodepimenta;

import screenManagers.ViewManager;
import server.Server;
import client.Client;

public class ServiceController {
	
	private Client client;
	private Server server;
	private ViewManager viewManager;
	
	public ServiceController() {
		viewManager = new ViewManager(this);
	}
	
	public void createClient(String name, String serverAddress, Integer port) {
		client = new Client(name, serverAddress, port, this);
	}
	
	public void createServer(Integer port) {
		try {
			server = new Server(port);
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

}

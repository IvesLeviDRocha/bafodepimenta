package client;

import bafodepimenta.ServiceController;

public class Client {

	ClientThread client;

	public Client(String name, String serverAddress, Integer port,
			ServiceController controller) {
		client = new ClientThread(name, port, serverAddress, controller);
		new Thread(client).start();
	}

	public void sendMessage(String message) {
		client.sendMessage(message);
	}
}

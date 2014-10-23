package client;

import bafodepimenta.ServiceController;

public class ClientThread implements Runnable {

	private Integer port = 6969;
	private String group = "239.239.239.239";
	private String serverAddress = "localhost";
	private String name;
	private ClientOutputManager outputManager;
	private ServiceController controller;

	public ClientThread(String name, Integer port, String serverAddress,
			ServiceController controller) {
		this.name = name;
		this.port = port;
		this.serverAddress = serverAddress;
		this.controller = controller;
	}

	@Override
	public void run() {
		new ClientInputManager(port, group, controller);
		outputManager = new ClientOutputManager(name, serverAddress, port);
	}

	public void sendMessage(String message) {
		outputManager.sendMessage(message);
	}

}

package client;

import bafodepimenta.ServiceController;

public class ClientInputManager {

	ClientInputManagerThread inputManager;

	public ClientInputManager(String clientName, Integer port, String group,
			ServiceController controller) {
		inputManager = new ClientInputManagerThread(clientName, port, group,
				controller);
		new Thread(inputManager).start();
	}

}

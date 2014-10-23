package client;

import bafodepimenta.ServiceController;

public class ClientInputManager {

	ClientInputManagerThread inputManager;

	public ClientInputManager(Integer port, String group,
			ServiceController controller) {
		inputManager = new ClientInputManagerThread(port, group, controller);
		new Thread(inputManager).start();
	}

}

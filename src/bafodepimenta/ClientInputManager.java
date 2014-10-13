package bafodepimenta;

public class ClientInputManager {

	public ClientInputManager(String clientName, Integer port, String group) {
		new Thread(new ClientInputManagerThread(clientName, port, group))
				.start();
	}

}

package client;

public class Client {

	public Client(String name, String output) {
		new Thread(new ClientThread(name, output)).start();
	}
}

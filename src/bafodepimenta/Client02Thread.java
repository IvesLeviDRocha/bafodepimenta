package bafodepimenta;

public class Client02Thread {

	public Client02Thread(String name) {
		new Thread(new Client02(name)).start();
	}
}

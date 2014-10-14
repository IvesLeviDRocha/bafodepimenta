package bafodepimenta;

import java.net.MulticastSocket;

public class ClientThread implements Runnable {

	private Integer port = 6969;
	MulticastSocket inSocket;
	String group = "239.239.239.239";
	String name;
	String output;
	String serverAddress = "localhost";

	public ClientThread(String name, String output) {
		this.name = name;
		this.output = output;
	}

	@Override
	public void run() {

		new ClientInputManager(name, port, group);
		
		new ClientOutputManager(name, output, serverAddress, port).startOutput();
		
	}

}

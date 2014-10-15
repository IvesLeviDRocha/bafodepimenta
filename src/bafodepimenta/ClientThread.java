package bafodepimenta;

public class ClientThread implements Runnable {

	private Integer port = 6969;
	private String group = "239.239.239.239";
	private String serverAddress = "localhost";
	private String name;
	private String output;

	public ClientThread(String name, String output) {
		this.name = name;
		this.output = output;
	}

	@Override
	public void run() {
		new ClientInputManager(name, port, group);
		new ClientOutputManager(name, output, serverAddress, port)
				.startOutput();
	}

}

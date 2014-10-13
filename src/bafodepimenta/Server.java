package bafodepimenta;

public class Server {
	
	public Server() throws Exception {
		new Thread(new ServerThread()).start();
	}

}

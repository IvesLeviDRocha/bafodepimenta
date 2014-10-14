package bafodepimenta;

public class ServerClientManager {

	public ServerClientManager(Integer port, ServerThread server) {
		new Thread(new ServerClientManagerThread(port, server)).start();
	} 
	
}

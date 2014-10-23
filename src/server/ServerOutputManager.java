package server;

public class ServerOutputManager {

	public ServerOutputManager(ServerThread server, String group, Integer port) {
		new Thread(new ServerOutputManagerThread(server, group, port)).start();
	}

}

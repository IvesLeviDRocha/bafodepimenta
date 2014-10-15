package bafodepimenta;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClientManagerThread implements Runnable {

	private Integer port;
	private ServerThread server;

	public ServerClientManagerThread(Integer port, ServerThread server) {
		this.port = port;
		this.server = server;
	}

	@Override
	public void run() {
		try (ServerSocket serverSocket = new ServerSocket(port)) {
			while (true) {
				receiveConnections(serverSocket);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void receiveConnections(ServerSocket serverSocket)
			throws IOException {
		Socket clientSocket = serverSocket.accept();
		addConnectedClient(clientSocket);
	}

	public void addConnectedClient(Socket clientSocket) {
		new Thread(new ConnectedClient(server, clientSocket)).start();
	}

}

package client;

import java.io.PrintWriter;
import java.net.Socket;

public class ClientOutputManager {

	private String clientName, serverAddress;
	private Integer port;
	private Socket outsocket;
	private PrintWriter out;

	public ClientOutputManager(String clientName, String serverAddress,
			Integer port) {
		this.clientName = clientName;
		this.serverAddress = serverAddress;
		this.port = port;
		tryConnectServer();
	}

	public void tryConnectServer() {
		try {
			outsocket = new Socket(serverAddress, port);
			out = new PrintWriter(outsocket.getOutputStream(), true);
			System.out.println(clientName + " connects to server.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(clientName + " unable to connect to server");
		}
	}
	
	public void sendMessage(String message) {
		out.println(clientName+": "+message);
	}

}

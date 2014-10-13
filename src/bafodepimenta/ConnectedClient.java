package bafodepimenta;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ConnectedClient implements Runnable {

	ServerThread server;
	Socket clientSocket;

	public ConnectedClient(ServerThread server, Socket clientSocket) {
		try {
			this.server = server;
			this.clientSocket = clientSocket;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					clientSocket.getInputStream()));
			while (true) {
				String input = in.readLine();
				server.clientInput(input);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

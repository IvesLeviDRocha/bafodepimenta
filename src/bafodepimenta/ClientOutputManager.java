package bafodepimenta;

import java.io.PrintWriter;
import java.net.Socket;

public class ClientOutputManager {

	private String clientName, serverAddress, clientOutput;
	private Integer port;

	public ClientOutputManager(String clientName, String clientOutput,
			String serverAddress, Integer port) {
		this.clientName = clientName;
		this.serverAddress = serverAddress;
		this.clientOutput = clientOutput;
		this.port = port;
	}

	public void startOutput() {
		try (Socket outsocket = new Socket(serverAddress, port);
				PrintWriter out = new PrintWriter(outsocket.getOutputStream(),
						true)) {
			System.out.println(clientName + " connects to server.");
			infiniteOutput(out);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void infiniteOutput(PrintWriter out) throws InterruptedException {
		while (true) {
			Thread.sleep(1000);
			System.out.println(clientName + " sends " + clientOutput
					+ " to server.");
			out.println(clientOutput);
		}
	}

}

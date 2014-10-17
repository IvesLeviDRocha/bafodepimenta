package server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class ServerOutputManagerThread implements Runnable {

	private Integer port;
	private InetAddress multicastGroup;
	private ServerThread server;

	public ServerOutputManagerThread(ServerThread server, String group, Integer port) {
		this.server = server;
		this.port = port;
		trySetGroup(group);
	}

	private void trySetGroup(String group) {
		try {
			this.multicastGroup = InetAddress.getByName(group);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		startOutput();
	}
	
	public void startOutput() {
		try (MulticastSocket outSocket = new MulticastSocket(port);) {
			while (true) {
				String output = server.getContent();
				broadcast(output, outSocket);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void broadcast(String output, MulticastSocket outSocket)
			throws IOException {
		DatagramPacket outPacket = new DatagramPacket(output.getBytes(),
				output.length(), multicastGroup, port);
		outSocket.send(outPacket);
		System.out.println("Server sends content.");
	}

}

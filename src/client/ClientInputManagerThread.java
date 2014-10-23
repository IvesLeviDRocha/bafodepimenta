package client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import bafodepimenta.ServiceController;

public class ClientInputManagerThread implements Runnable {

	private byte[] inBuffer = new byte[1024];
	private Integer port;
	private InetAddress multicastGroup;
	private ServiceController controller;

	public ClientInputManagerThread(Integer port, String group,
			ServiceController controller) {
		this.port = port;
		this.controller = controller;
		trySetGroup(group);
	}

	private void trySetGroup(String group) {
		try {
			this.multicastGroup = InetAddress.getByName(group);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try (MulticastSocket inSocket = new MulticastSocket(port)) {
			inSocket.joinGroup(multicastGroup);
			receive(inSocket);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void receive(MulticastSocket inSocket) throws IOException {
		while (true) {
			inBuffer = new byte[1024];
			DatagramPacket inPacket = new DatagramPacket(inBuffer,
					inBuffer.length);
			inSocket.receive(inPacket);
			String received = new String(inPacket.getData());
			controller.updateChat(received);
		}
	}

}

package bafodepimenta;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ClientInputManagerThread implements Runnable {
	
	private DatagramPacket inPacket;
	private byte[] inBuffer = new byte[256];
	private String clientName;
	private Integer port;
	private String group;
	
	public ClientInputManagerThread(String clientName, Integer port, String group) {
		this.clientName = clientName;
		this.port = port;
		this.group = group;
	}

	@Override
	public void run() {
			try (
				MulticastSocket inSocket = new MulticastSocket(port);
			) {
				InetAddress multicastGroup = InetAddress.getByName(group);
				inSocket.joinGroup(multicastGroup);
				receive(inSocket);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	private void receive(MulticastSocket inSocket) throws IOException {
		while (true) {
			inPacket = new DatagramPacket(inBuffer, inBuffer.length);
			inSocket.receive(inPacket);
			String received = new String(inPacket.getData());
			System.out.println(this.clientName + " receives: " + received);
		}
	}

}

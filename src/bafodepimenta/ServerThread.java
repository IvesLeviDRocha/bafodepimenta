package bafodepimenta;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ServerThread implements Runnable {

	public Integer port = 6969;
	StringBuffer content = new StringBuffer("");
	String output;
	
	static InetAddress group;
	MulticastSocket outSocket;
	DatagramPacket outPacket;
	
	@Override
	public void run() {
		
		new ServerClientManager(port, this);
		
		try {
			System.out.println("Server is up");
			group = InetAddress.getByName("239.239.239.239");
			outSocket = new MulticastSocket(port);
		} catch (Exception e) {
			e.printStackTrace();
		}
		broadcast();
		
	}

	private void broadcast() {
		while(true) {
			output = content.toString();
			outPacket = new DatagramPacket(output.getBytes(), output.length(), group, port);
			try {
				outSocket.send(outPacket);
				System.out.println("Server sends content.");
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}
	
	
	public void clientInput(String input) {
		content.append("\n	"+input);
	}
	
}

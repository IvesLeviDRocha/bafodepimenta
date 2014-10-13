package bafodepimenta;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 implements Runnable {

	public static final int PORT = 6969;
	public static InetAddress SERVER_IP;
	StringBuffer out = new StringBuffer("");
	String output;
	ServerSocket serverSocket;
	
	static InetAddress group;
	MulticastSocket outSocket;
	DatagramPacket outPacket;
	
	public Server02() throws Exception {
		serverSocket = new ServerSocket(6970);
	}
	
	@Override
	public void run() {
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						Socket clientSocket = serverSocket.accept();
						addClient(clientSocket);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
		}.start();
		
		try {
			System.out.println("Server is up");
			group = InetAddress.getByName("239.255.255.253");
			outSocket = new MulticastSocket(PORT);
		} catch (Exception e) {
			e.printStackTrace();
		}
		broadcast();
		
	}

	private void broadcast() {
		while(true) {
			output = out.toString();
			outPacket = new DatagramPacket(output.getBytes(), output.length(), group, PORT);
			try {
				outSocket.send(outPacket);
				System.out.println("Server sends content.");
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}
	
	public void addClient(Socket clientSocket) {
		Server02 server = this;
		new Thread(new ConnectedClient(server, clientSocket)).start();
	}
	
	public void clientInput(String input) {
		out.append("\n	"+input);
	}
	
}

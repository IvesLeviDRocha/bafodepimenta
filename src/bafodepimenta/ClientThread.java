package bafodepimenta;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.Socket;

public class ClientThread implements Runnable {

	private Integer port = 6969;
	MulticastSocket inSocket;
	String group = "239.239.239.239";
	byte[] inBuffer = new byte[256];
	DatagramPacket inPacket;
	String name;
	String output;

	public ClientThread(String name, String output) {
		this.name = name;
		this.output = output;
	}

	@Override
	public void run() {

		new ClientInputManager(name, port, group);
		
		try {
			Socket outsocket = new Socket("localhost", port);
			System.out.println(name+" connects to server.");
			PrintWriter out = new PrintWriter(
					outsocket.getOutputStream(), true);
			while (true) {
				Thread.sleep(1000);
				System.out.println(name+" sends "+output+" to server.");
				out.println(output);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

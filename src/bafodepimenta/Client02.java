package bafodepimenta;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.Socket;

public class Client02 implements Runnable {

	MulticastSocket socket;
	InetAddress group;
	byte[] inBuf = new byte[256];
	DatagramPacket inPacket;
	String name;
	String output = "default";

	public Client02(String name) {
		this.name = name;
		if (name.equals("KANEDA")) {
			output = "TETSUOOOOOO";
		} else if (name.equals("TETSUO")) {
			output = "KANEDAAAAAA";
		}
	}

	@Override
	public void run() {

		new Thread() {
			public void run() {
					try {
						Socket outsocket = new Socket("localhost", 6970);
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
		}.start();

		try {
			System.out.println(name + " is up");
			socket = new MulticastSocket(Server02.PORT);
			group = Server02.group;
			socket.joinGroup(group);
			receive();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void receive() throws IOException {
		while (true) {
			inPacket = new DatagramPacket(inBuf, inBuf.length);
			socket.receive(inPacket);
			String received = new String(inPacket.getData());
			System.out.println(this.name + " receives: " + received);
		}
	}

}

package bafodepimenta;

import server.Server;
import client.Client;

public class TestAutoServerClients {

	public static void main(String[] args) throws Exception {

		new Server();
		Thread.sleep(500);

		new Client("TETSUO", "KANEDAAAAAAAAAA");
		new Client("KANEDA", "TETSUOOOOOOOOOO");

	}
}

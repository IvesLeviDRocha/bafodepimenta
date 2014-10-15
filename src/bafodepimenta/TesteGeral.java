package bafodepimenta;

public class TesteGeral {

	public static void main(String[] args) throws Exception {

		new Server();
		Thread.sleep(500);

		new Client("TETSUO", "KANEDAAAAAAAAAA");
		new Client("KANEDA", "TETSUOOOOOOOOOO");

	}
}

package bafodepimenta;

public class Teste02 {

	public static void main(String[] args) throws Exception {
		
		new Server02Thread();
		Thread.sleep(500);
		
		new Client02Thread("TETSUO");
		new Client02Thread("KANEDA");
		
		
	}
}

package server;

import screens.HostingServerFrame;

public class Server {
	
	private Thread serverThread;
	private HostingServerFrame frame;

	public Server() throws Exception {
		serverThread = new Thread(new ServerThread());
		serverThread.start();
		frame = new HostingServerFrame();
		frame.setVisible(true);
	}
	
}

package server;

import java.net.InetAddress;

import screens.HostingServerFrame;

public class Server {

	private ServerThread server;
	private HostingServerFrame frame;

	public Server(Integer port) throws Exception {
		server = new ServerThread(port);
		new Thread(server).start();
		String iptxt = InetAddress.getLocalHost().toString();
		String[] ipparts = iptxt.split("/");
		String porttxt = String.valueOf(port);
		frame = new HostingServerFrame(ipparts[1], porttxt);
		frame.setVisible(true);
	}

}

package bafodepimenta;

public class ServerThread implements Runnable {

	private Integer port = 6969;
	private StringBuffer content = new StringBuffer("");
	private String group = "239.239.239.239";

	@Override
	public void run() {
		System.out.println("Server is up");
		new ServerClientManager(port, this);
		new ServerOutputManager(this, group, port).startOutput();
	}

	public void clientInput(String input) {
		content.append("\n	" + input);
	}

	public String getContent() {
		return content.toString();
	}

}

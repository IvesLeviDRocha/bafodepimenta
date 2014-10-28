package server;

public class ServerThread implements Runnable {

	private Integer port = 6969;
	private StringBuffer content = new StringBuffer("");
	private String group = "239.239.239.239";
	private int numLines = 0;

	public ServerThread(Integer port) {
		this.port = port;
	}

	@Override
	public void run() {
		new ServerClientManager(port, this);
		new ServerOutputManager(this, group, port);
	}

	public void clientInput(String input) {
		if (input.toLowerCase().contains("paulo")) {
			input = input.replaceAll("aulo", "ablo");
			input = input.replaceAll("PAULO", "PABLO");
		}
		content.append(input + "\n");
		numLines++;
		if (numLines > 18) {
			cleanContent();
		}
	}

	public String getContent() {
		return content.toString();
	}

	public void cleanContent() {
		String[] contentLines = content.toString().split("\n");
		content.delete(0, content.length());
		content.append("");
		for (int i = 9; i < contentLines.length; i++) {
			content.append(contentLines[i] + "\n");
		}
		numLines -= 9;
	}

}

package screenManagers;

import javax.swing.JPanel;

import screens.HostServerScreen;
import screens.MainFrame;

public class HostServerManager {

	private ViewManager viewManager;
	private MainFrame frame;
	private HostServerScreen screen;
	
	public HostServerManager(ViewManager viewManager, MainFrame frame) {
		this.viewManager = viewManager;
		this.frame = frame;
		frame.setHostServerManager(this);
	}
	
	public void btnHostPressed(Integer port) {
		viewManager.createServer(port);
	}
	
	public void btnCancelPressed() {
		frame.showMainMenuScreen();
	}
	
	public JPanel getScreen() {
		screen = new HostServerScreen(this);
		return screen;
	}
	
}

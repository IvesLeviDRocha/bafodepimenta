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
	
	public void btnHostPressed() {
		
	}
	
	public void btnCancelPressed() {
		
	}
	
	public JPanel getScreen() {
		screen = new HostServerScreen(this);
		return screen;
	}
	
}

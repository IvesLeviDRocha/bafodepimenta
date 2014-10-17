package screens;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class HostingServerFrame extends JFrame {

	private static final long serialVersionUID = 5010337889886975485L;
	
	private String ServerIP;
	private String ServerPort;
	
	private JPanel contentPane;
	private JLabel lblHostingServer;
	private JLabel lblIP;
	private JLabel lblPort;
	private JButton btnCloseServer;
	
	public HostingServerFrame() {
		initFrame();
	}

	private void initFrame() {
		initLayout();
		initContentPane();
		initComponents();
		addComponents();
	}

	private void initLayout() {
		setTitle("Chat Server");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 240);
		setResizable(false);
	}

	private void initContentPane() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	private void initComponents() {
		initLblHostingServer();
		initLblIP();
		initLblPort();
		initBtnCloseServer();
	}

	private void initBtnCloseServer() {
		btnCloseServer = new JButton("EXPLODE");
		btnCloseServer.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		btnCloseServer.setBounds(49, 150, 125, 34);
	}

	private void initLblPort() {
		lblPort = new JLabel("Port:");
		lblPort.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		lblPort.setBounds(10, 94, 204, 34);
	}

	private void initLblIP() {
		lblIP = new JLabel("IP:");
		lblIP.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		lblIP.setBounds(10, 60, 204, 34);
	}

	private void initLblHostingServer() {
		lblHostingServer = new JLabel("Hosting Server");
		lblHostingServer.setBounds(49, 10, 125, 39);
		lblHostingServer.setHorizontalAlignment(SwingConstants.CENTER);
		lblHostingServer.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		lblHostingServer.setBorder(new EmptyBorder(10, 10, 10, 10));
	}
	
	private void addComponents() {
		contentPane.add(lblHostingServer);
		contentPane.add(lblIP);
		contentPane.add(lblPort);
		contentPane.add(btnCloseServer);
	}

}

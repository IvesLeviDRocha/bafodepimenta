package screens;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import screenManagers.HostServerManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HostServerScreen extends JPanel {

	private static final long serialVersionUID = -2404820369095545899L;
	
	private HostServerManager manager;
	
	private JLabel lblPort;
	private JLabel lblHostServer;
	private JFormattedTextField txtPort;
	private JButton btnHost;
	private JButton btnCancel;

	public HostServerScreen(HostServerManager manager) {
		this.manager = manager;
		initScreen();	
	}

	private void initScreen() {
		initLayout();
		initComponents();
		addComponents();
	}

	private void initLayout() {
		setPreferredSize(new Dimension(320, 480));
		setLayout(null);
		setBorder(new EmptyBorder(5, 5, 5, 5));
	}
	
	private void initComponents() {
		initLblPort();
		initHostServer();
		initTxtPort();
		initBtnHost();
		initBtnCancel();
	}

	private void initLblPort() {
		lblPort = new JLabel("Port:");
		lblPort.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 24));
		lblPort.setBounds(80, 141, 57, 38);
	}

	private void initHostServer() {
		lblHostServer = new JLabel("Host Server");
		lblHostServer.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 32));
		lblHostServer.setBounds(79, 44, 176, 45);
	}

	private void initTxtPort() {
		txtPort = new JFormattedTextField(MaskFactory.createPortMask());
		txtPort.setBounds(147, 145, 108, 34);
	}

	private void initBtnHost() {
		btnHost = new JButton("Host");
		btnHost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHostPressed();
			}
		});
		btnHost.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 24));
		btnHost.setBounds(80, 218, 175, 45);
	}
	
	private void btnHostPressed() {
		String portText = txtPort.getText();
		Integer port = Integer.parseInt(portText);
		manager.btnHostPressed(port);
	}

	private void initBtnCancel() {
		btnCancel = new JButton("Back");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancelPressed();
			}
		});
		btnCancel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 24));
		btnCancel.setBounds(80, 306, 175, 45);
	}
	
	private void btnCancelPressed() {
		manager.btnCancelPressed();
	}
	
	private void addComponents() {
		add(lblPort);
		add(lblHostServer);
		add(txtPort);
		add(btnHost);
		add(btnCancel);
	}
	
	
}

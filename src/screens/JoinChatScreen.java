package screens;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.border.EmptyBorder;

import screenManagers.JoinChatManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JoinChatScreen extends JPanel {

	private static final long serialVersionUID = 8381785131392637562L;
	
	private JoinChatManager manager;
	
	private JTextField txtNickname;
	private JLabel lblNickname;
	private JLabel lblServerIP;
	private JLabel lblPort;
	private JButton btnJoin;
	private JButton btnCancel;
	private JTextField txtServerIP;
	private JFormattedTextField txtPort;
	private JLabel lblJoinChat;

	public JoinChatScreen(JoinChatManager manager) {
		this.manager = manager;
		initScreen();
	}

	private void initScreen() {
		initLayout();
		initComponents();
		addComponents();
	}

	private void initLayout() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setPreferredSize(new Dimension(320, 480));
		setLayout(null);
	}

	private void initComponents() {
		initLblNickname();	
		initLblServerIP();				
		initLblPort();				
		initBtnJoin();				
		initBtnCancel();				
		initTxtServerIP();				
		initTxtPort();				
		initTxtNickname();		
		initLblJoinChat();
	}

	private void initLblNickname() {
		lblNickname = new JLabel("Nickname:");
		lblNickname.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		lblNickname.setBounds(46, 81, 79, 14);
	}

	private void initLblServerIP() {
		lblServerIP = new JLabel("Server IP:");
		lblServerIP.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		lblServerIP.setBounds(46, 157, 69, 14);
	}

	private void initLblPort() {
		lblPort = new JLabel("Port:");
		lblPort.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		lblPort.setBounds(46, 231, 40, 14);
	}

	private void initBtnJoin() {
		btnJoin = new JButton("Join");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnJoinPressed();
			}
		});
		btnJoin.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 24));
		btnJoin.setBounds(85, 313, 175, 45);
	}
	
	private void btnJoinPressed() {
		String name = txtNickname.getText();
		String ip = txtServerIP.getText();
		Integer port = Integer.parseInt(txtPort.getText());
		manager.btnJoinPressed(name, ip, port);
	}

	private void initBtnCancel() {
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancelPressed();
			}
		});
		btnCancel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 24));
		btnCancel.setBounds(85, 384, 175, 45);
	}
	
	private void btnCancelPressed() {
		manager.btnCancelPressed();
	}

	private void initTxtServerIP() {
		txtServerIP = new JTextField();
		txtServerIP.setBounds(56, 184, 216, 34);
	}

	private void initTxtPort() {
		txtPort = new JFormattedTextField(MaskFactory.createPortMask());
		txtPort.setBounds(56, 256, 108, 34);
	}

	private void initTxtNickname() {
		txtNickname = new JTextField();
		txtNickname.setBounds(56, 107, 216, 34);
		txtNickname.setColumns(10);
	}

	private void initLblJoinChat() {
		lblJoinChat = new JLabel("Join Chat");
		lblJoinChat.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 32));
		lblJoinChat.setBounds(100, 16, 146, 45);
	}
	
	private void addComponents() {
		add(lblNickname);
		add(lblServerIP);
		add(lblPort);
		add(btnJoin);
		add(btnCancel);
		add(txtServerIP);
		add(txtPort);
		add(txtNickname);
		add(lblJoinChat);
	}
}

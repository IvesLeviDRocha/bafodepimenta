package screens;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import screenManagers.ChatManager;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatScreen extends JPanel {

	private static final long serialVersionUID = -7844675847884893844L;
	
	private ChatManager manager;

	private JTextField txtChat;
	private JLabel lblNickname;
	private JButton btnExit, btnSend;
	private JScrollPane scrollPane;
	private JTextPane txtpnChatbox;

	public ChatScreen(ChatManager manager) {
		this.manager = manager;
		initScreen();
	}

	private void initScreen() {
		initLayout();
		initializeComponents();
		addComponents();
	}

	private void initLayout() {
		setPreferredSize(new Dimension(320, 480));
		setLayout(null);
		setBorder(new EmptyBorder(5, 5, 5, 5));
	}

	private void initializeComponents() {
		initLblNickname();
		initBtnExit();
		initScrollPane();
		initTxtpnChatbox();
		initTxtChat();
		initBtnSend();
	}

	private void initLblNickname() {
		lblNickname = new JLabel("Nickname");
		lblNickname.setBounds(182, 11, 64, 14);
	}

	private void initBtnExit() {
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExitPressed();
			}
		});
		btnExit.setBounds(246, 7, 64, 23);
	}
	
	private void btnExitPressed() {
		manager.btnExitPressed();
	}

	private void initScrollPane() {
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 34, 300, 320);
	}

	private void initTxtpnChatbox() {
		txtpnChatbox = new JTextPane();
		txtpnChatbox.setText("Chatbox");
	}

	private void initTxtChat() {
		txtChat = new JTextField();
		txtChat.setBounds(10, 365, 300, 34);
		txtChat.setColumns(10);
	}

	private void initBtnSend() {
		btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSendPressed();
			}
		});
		btnSend.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		btnSend.setBounds(220, 410, 90, 34);
	}
	
	private void btnSendPressed() {
		manager.btnSendPressed();
	}

	private void addComponents() {
		add(lblNickname);
		add(btnExit);
		add(scrollPane);
		scrollPane.setViewportView(txtpnChatbox);
		add(txtChat);
		add(btnSend);
	}
}

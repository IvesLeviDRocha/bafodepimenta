package screens;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Font;

public class ChatScreen extends JPanel {


	private static final long serialVersionUID = -7844675847884893844L;
	private JTextField txtChat;

	public ChatScreen() {

		setPreferredSize(new Dimension(320, 480));
		setLayout(null);
		
		JLabel lblNickname = new JLabel("Nickname");
		lblNickname.setBounds(182, 11, 64, 14);
		add(lblNickname);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(246, 7, 64, 23);
		add(btnExit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 34, 300, 320);
		add(scrollPane);
		
		JTextPane txtpnChatbox = new JTextPane();
		txtpnChatbox.setText("Chatbox");
		scrollPane.setViewportView(txtpnChatbox);
		
		txtChat = new JTextField();
		txtChat.setBounds(10, 365, 300, 34);
		add(txtChat);
		txtChat.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		btnSend.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		btnSend.setBounds(220, 410, 90, 34);
		add(btnSend);
		
	}
}

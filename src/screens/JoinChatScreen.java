package screens;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class JoinChatScreen extends JPanel {

	private static final long serialVersionUID = 8381785131392637562L;
	private JTextField txtNickname;

	public JoinChatScreen() {

		setPreferredSize(new Dimension(320, 480));
		setLayout(null);
		
		JLabel lblNickname = new JLabel("Nickname:");
		lblNickname.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		lblNickname.setBounds(46, 81, 79, 14);
		add(lblNickname);
		
		JLabel lblServerIP = new JLabel("Server IP:");
		lblServerIP.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		lblServerIP.setBounds(46, 157, 69, 14);
		add(lblServerIP);
		
		JLabel lblPort = new JLabel("Port:");
		lblPort.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		lblPort.setBounds(46, 231, 40, 14);
		add(lblPort);
		
		JButton btnJoin = new JButton("Join");
		btnJoin.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 24));
		btnJoin.setBounds(85, 313, 175, 45);
		add(btnJoin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 24));
		btnCancel.setBounds(85, 384, 175, 45);
		add(btnCancel);
		
		JFormattedTextField txtServerIP = new JFormattedTextField(MaskFactory.createIPMask());
		txtServerIP.setBounds(56, 184, 216, 34);
		add(txtServerIP);
		
		JFormattedTextField txtPort = new JFormattedTextField(MaskFactory.createPortMask());
		txtPort.setBounds(56, 256, 108, 34);
		add(txtPort);
		
		txtNickname = new JTextField();
		txtNickname.setBounds(56, 107, 216, 34);
		add(txtNickname);
		txtNickname.setColumns(10);
		
		JLabel lblJoinChat = new JLabel("Join Chat");
		lblJoinChat.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 32));
		lblJoinChat.setBounds(100, 16, 146, 45);
		add(lblJoinChat);
		
	}
}

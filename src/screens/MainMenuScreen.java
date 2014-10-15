package screens;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenuScreen extends JPanel {

	private static final long serialVersionUID = 6827315437023277736L;

	public MainMenuScreen() {

		setPreferredSize(new Dimension(320, 480));
		setLayout(null);
		
		JButton btnJoinChat = new JButton("Join Chat");
		btnJoinChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnJoinChat.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 36));
		btnJoinChat.setBounds(28, 73, 263, 93);
		add(btnJoinChat);
		
		JButton btnHostServer = new JButton("Host Server");
		btnHostServer.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 36));
		btnHostServer.setBounds(28, 207, 263, 93);
		add(btnHostServer);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 36));
		btnExit.setBounds(28, 339, 263, 93);
		add(btnExit);
		
		JLabel lblBafoDePimenta = new JLabel("Bafo de Pimenta!");
		lblBafoDePimenta.setFont(new Font("Lucida Console", Font.PLAIN, 16));
		lblBafoDePimenta.setBounds(91, 24, 160, 14);
		add(lblBafoDePimenta);
		
	}
}

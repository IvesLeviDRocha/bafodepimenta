package screens;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import screenManagers.MainMenuManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenuScreen extends JPanel {

	private static final long serialVersionUID = 6827315437023277736L;
	
	private MainMenuManager manager;

	private JButton btnJoinChat;
	private JButton btnHostServer;
	private JButton btnExit;
	private JLabel lblBafoDePimenta;

	public MainMenuScreen(MainMenuManager manager) {
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
		initBtnJoinChat();
		initBtnHostServer();
		initBtnExit();
		initLblBafoDePimenta();
	}

	private void initBtnJoinChat() {
		btnJoinChat = new JButton("Join Chat");
		btnJoinChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnJoinChatPressed();
			}
		});
		btnJoinChat.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 36));
		btnJoinChat.setBounds(28, 73, 263, 93);
	}
	
	private void btnJoinChatPressed() {
		manager.btnJoinChatPressed();
	}

	private void initBtnHostServer() {
		btnHostServer = new JButton("Host Server");
		btnHostServer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHostServerPressed();
			}
		});
		btnHostServer.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 36));
		btnHostServer.setBounds(28, 207, 263, 93);
	}
	
	private void btnHostServerPressed() {
		manager.btnHostServerPressed();
	}

	private void initBtnExit() {
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExitPressed();
			}
		});
		btnExit.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 36));
		btnExit.setBounds(28, 339, 263, 93);
	}
	
	private void btnExitPressed() {
		manager.btnExitPressed();
	}

	private void initLblBafoDePimenta() {
		lblBafoDePimenta = new JLabel("Bafo de Pimenta!");
		lblBafoDePimenta.setFont(new Font("Lucida Console", Font.PLAIN, 16));
		lblBafoDePimenta.setBounds(91, 24, 160, 14);
	}

	private void addComponents() {
		add(btnJoinChat);
		add(btnHostServer);
		add(btnExit);
		add(lblBafoDePimenta);
	}
}

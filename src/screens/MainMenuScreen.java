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
import java.awt.Color;
import javax.swing.SwingConstants;

public class MainMenuScreen extends JPanel {

	private static final long serialVersionUID = 6827315437023277736L;

	private MainMenuManager manager;

	private JButton btnJoinChat;
	private JButton btnHostServer;
	private JButton btnExit;
	private JLabel lblBafoDePimenta;
	private JLabel lblSobre;

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
		initLblSobre();
	}

	private void initBtnJoinChat() {
		btnJoinChat = new JButton("Join Chat");
		btnJoinChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnJoinChatPressed();
			}
		});
		btnJoinChat.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		btnJoinChat.setBounds(61, 80, 200, 63);
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
		btnHostServer.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		btnHostServer.setBounds(61, 180, 200, 63);
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
		btnExit.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		btnExit.setBounds(61, 280, 200, 63);
	}

	private void btnExitPressed() {
		manager.btnExitPressed();
	}

	private void initLblBafoDePimenta() {
		lblBafoDePimenta = new JLabel("Bafo de Pimenta!");
		lblBafoDePimenta.setForeground(Color.BLUE);
		lblBafoDePimenta.setFont(new Font("Lucida Console", Font.PLAIN, 18));
		lblBafoDePimenta.setBounds(76, 24, 176, 26);
	}
	
	private void initLblSobre() {
		lblSobre = new JLabel(
				"<html>  Desenvolvido por: <br> "
				+ "  Levi & Paulo <br> "
				+ "2º Semestre ADS Unifor 2014 </html>");
		lblSobre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSobre.setForeground(Color.BLACK);
		lblSobre.setFont(new Font("Lucida Console", Font.PLAIN, 18));
		lblSobre.setBounds(6, 380, 308, 75);
	}

	private void addComponents() {
		add(btnJoinChat);
		add(btnHostServer);
		add(btnExit);
		add(lblBafoDePimenta);
		add(lblSobre);
	}
}

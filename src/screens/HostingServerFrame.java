package screens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class HostingServerFrame extends JFrame {


	private static final long serialVersionUID = 5010337889886975485L;
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HostingServerFrame frame = new HostingServerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public HostingServerFrame() {
		setTitle("Chat Server");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHostingServer = new JLabel("Hosting Server");
		lblHostingServer.setBounds(49, 10, 125, 39);
		lblHostingServer.setHorizontalAlignment(SwingConstants.CENTER);
		lblHostingServer.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		lblHostingServer.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.add(lblHostingServer);
		
		JLabel lblIP = new JLabel("IP:");
		lblIP.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		lblIP.setBounds(10, 60, 204, 34);
		contentPane.add(lblIP);
		
		JLabel lblPort = new JLabel("Port:");
		lblPort.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		lblPort.setBounds(10, 94, 204, 34);
		contentPane.add(lblPort);
		
		JButton btnCloseServer = new JButton("Close Server");
		btnCloseServer.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		btnCloseServer.setBounds(49, 150, 125, 34);
		contentPane.add(btnCloseServer);
	}

}

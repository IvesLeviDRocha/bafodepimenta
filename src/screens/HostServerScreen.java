package screens;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

public class HostServerScreen extends JPanel {

	private static final long serialVersionUID = -2404820369095545899L;

	public HostServerScreen() {

		setPreferredSize(new Dimension(320, 480));
		setLayout(null);
		
		JLabel lblPort = new JLabel("Port:");
		lblPort.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 24));
		lblPort.setBounds(80, 141, 57, 38);
		add(lblPort);
		
		JLabel lblHostServer = new JLabel("Host Server");
		lblHostServer.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 32));
		lblHostServer.setBounds(79, 44, 176, 45);
		add(lblHostServer);
		
		JFormattedTextField txtPort = new JFormattedTextField(MaskFactory.createPortMask());
		txtPort.setBounds(147, 145, 108, 34);
		add(txtPort);
		
		JButton btnHost = new JButton("Host");
		btnHost.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 24));
		btnHost.setBounds(80, 218, 175, 45);
		add(btnHost);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 24));
		btnCancel.setBounds(80, 306, 175, 45);
		add(btnCancel);
		
	}
}

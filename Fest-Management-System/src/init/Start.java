package init;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 606, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFestManagementSystem = new JLabel("FEST MANAGEMENT SYSTEM");
		lblFestManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblFestManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFestManagementSystem.setBounds(12, 13, 564, 81);
		frame.getContentPane().add(lblFestManagementSystem);
		
		JButton btnNewButton = new JButton("CULTURAL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ShowEvents shw = new ShowEvents("cultural");
			}
		});
		btnNewButton.setBounds(220, 143, 148, 51);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnTechnical = new JButton("TECHNICAL");
		btnTechnical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ShowEvents shw = new ShowEvents("technical");
			}
		});
		btnTechnical.setBounds(220, 233, 148, 51);
		frame.getContentPane().add(btnTechnical);
		JOptionPane.showMessageDialog(null, "Welcome to Annual Fest Management");
	}
}

package init;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowEvents {
	String cultural_list[]= {"Dance","Drama","Music"};
	String technical_list[]= {"Coding","Robotics","Development"};
	private JFrame frame;
	JComboBox<String> jcb;
	String func;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	private void cultural()
	{
		jcb=new JComboBox<String>(cultural_list);
	}
	private void technical()
	{
		jcb=new JComboBox<String>(technical_list);
	}
	public ShowEvents(String db) {
		this.func=db;
		if(func.equalsIgnoreCase("cultural"))
			cultural();
		else
			technical();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		jcb.setBounds(158, 89, 212, 30);
		frame.getContentPane().add(jcb);
		
		JLabel lblEvents = new JLabel("EVENTS");
		lblEvents.setHorizontalAlignment(SwingConstants.CENTER);
		lblEvents.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEvents.setBounds(45, 92, 101, 27);
		frame.getContentPane().add(lblEvents);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ShowDetails sd = new ShowDetails((String) jcb.getSelectedItem());
			}
		});
		btnSubmit.setBounds(155, 176, 127, 39);
		frame.getContentPane().add(btnSubmit);
		frame.setVisible(true);
	}
}

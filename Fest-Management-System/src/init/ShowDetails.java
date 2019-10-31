package init;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ShowDetails {

	private JFrame frame;
	private JLabel lblName_data, lblCoordinator_data,lblFees_data,lblVenue_data,lblDetails_data;
	/**
	 * Launch the application.
	 */
		/**
	 * Create the application.
	 */
	public ShowDetails(String event) {
		fillDetails(event);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void fillDetails(String event)
	{
		EventDetails ed = new EventDetails(event);
		lblName_data=new JLabel(ed.name());
		lblCoordinator_data = new JLabel(ed.coordinator());
		lblFees_data = new JLabel(ed.fees());
		lblVenue_data = new JLabel(ed.venue());
		lblDetails_data = new JLabel(ed.details());
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 484, 478);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setBounds(43, 50, 113, 37);
		frame.getContentPane().add(lblName);
		
		JLabel lblDetails = new JLabel("Details :");
		lblDetails.setHorizontalAlignment(SwingConstants.LEFT);
		lblDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDetails.setBounds(43, 250, 113, 37);
		frame.getContentPane().add(lblDetails);
		
		JLabel lblCoordinator = new JLabel("Co-ordinator :");
		lblCoordinator.setHorizontalAlignment(SwingConstants.LEFT);
		lblCoordinator.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCoordinator.setBounds(43, 100, 113, 37);
		frame.getContentPane().add(lblCoordinator);
		
		JLabel lblFees = new JLabel("Fees :");
		lblFees.setHorizontalAlignment(SwingConstants.LEFT);
		lblFees.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFees.setBounds(43, 150, 113, 37);
		frame.getContentPane().add(lblFees);
		
		JLabel lblVenue = new JLabel("Venue :");
		lblVenue.setHorizontalAlignment(SwingConstants.LEFT);
		lblVenue.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblVenue.setBounds(43, 200, 113, 37);
		frame.getContentPane().add(lblVenue);
		
		lblName_data.setHorizontalAlignment(SwingConstants.LEFT);
		lblName_data.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName_data.setBounds(168, 50, 180, 37);
		frame.getContentPane().add(lblName_data);
		
		lblCoordinator_data.setHorizontalAlignment(SwingConstants.LEFT);
		lblCoordinator_data.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCoordinator_data.setBounds(168, 100, 180, 37);
		frame.getContentPane().add(lblCoordinator_data);
		
		lblFees_data.setHorizontalAlignment(SwingConstants.LEFT);
		lblFees_data.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFees_data.setBounds(168, 150, 180, 37);
		frame.getContentPane().add(lblFees_data);
		
		lblVenue_data.setHorizontalAlignment(SwingConstants.LEFT);
		lblVenue_data.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVenue_data.setBounds(168, 200, 180, 37);
		frame.getContentPane().add(lblVenue_data);
		
		lblDetails_data.setVerticalAlignment(SwingConstants.TOP);
		lblDetails_data.setHorizontalAlignment(SwingConstants.LEFT);
		lblDetails_data.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDetails_data.setBounds(168, 250, 264, 101);
		frame.getContentPane().add(lblDetails_data);
		frame.setVisible(true);
	}
}

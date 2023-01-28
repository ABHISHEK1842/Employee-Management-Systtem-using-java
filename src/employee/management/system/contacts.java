package employee.management.system;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class contacts {

	private JFrame frame;
	private JTextField txtFfggg;
	private JTextField txtHakralNagarGopal;
	private JTextField textField_2;
	private JTextField txtHeloibmcom;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contacts window = new contacts();
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
	public contacts() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
			
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 10));
		frame.setBounds(400, 100, 893, 587);
		frame.setTitle("Contact");	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("    Contact  Detail");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(209, 37, 400, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Company Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(26, 195, 140, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(76, 243, 13, -7);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("       Address");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 268, 117, 38);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Phone Number ");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(40, 354, 151, 26);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("     Email");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3_3.setBounds(26, 427, 115, 37);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		txtFfggg = new JTextField();
		txtFfggg.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtFfggg.setText("           IBM ");
		txtFfggg.setBounds(209, 194, 182, 37);
		frame.getContentPane().add(txtFfggg);
		txtFfggg.setColumns(10);
		
		txtHakralNagarGopal = new JTextField();
		txtHakralNagarGopal.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtHakralNagarGopal.setText("Thakral Nagar, Gopal Nagar");
		txtHakralNagarGopal.setColumns(10);
		txtHakralNagarGopal.setBounds(209, 272, 182, 38);
		frame.getContentPane().add(txtHakralNagarGopal);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_2.setText("+9154329***23");
		textField_2.setColumns(10);
		textField_2.setBounds(209, 348, 182, 37);
		frame.getContentPane().add(textField_2);
		
		txtHeloibmcom = new JTextField();
		txtHeloibmcom.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtHeloibmcom.setText("heloIBM.com");
		txtHeloibmcom.setColumns(10);
		txtHeloibmcom.setBounds(209, 426, 182, 37);
		frame.getContentPane().add(txtHeloibmcom);
		
		 lblNewLabel_4 = new JLabel("images");
		 lblNewLabel_4.setIcon(new ImageIcon(getClass().getResource("/icons/look.jpg ")));
		lblNewLabel_4.setBounds(434, 194, 405, 237);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton(" next ");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(542, 443, 176, 51);
		frame.getContentPane().add(btnNewButton);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}

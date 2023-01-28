package employee.management.system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Feedback {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Feedback window = new Feedback();
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
	public Feedback() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 80, 935, 737);
		frame.setTitle("Feedback Employees");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employees Feedback ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel.setBounds(303, 57, 314, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Employee Name ");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(70, 161, 152, 29);
		frame.getContentPane().add(lblName);
		
		JLabel lblEmailid = new JLabel("Email_Id");
		lblEmailid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmailid.setBounds(70, 229, 152, 22);
		frame.getContentPane().add(lblEmailid);
		
		JLabel lblEmployeeId = new JLabel("Employee Id");
		lblEmployeeId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmployeeId.setBounds(70, 284, 152, 29);
		frame.getContentPane().add(lblEmployeeId);
		
		JLabel lblTimeStart = new JLabel("Start Time ");
		lblTimeStart.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTimeStart.setBounds(70, 344, 152, 29);
		frame.getContentPane().add(lblTimeStart);
		
		JLabel lblEnd = new JLabel("End Time  ");
		lblEnd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnd.setBounds(70, 413, 162, 29);
		frame.getContentPane().add(lblEnd);
		
		JLabel lblDomanNmae = new JLabel("Job Title");
		lblDomanNmae.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDomanNmae.setBounds(70, 489, 178, 29);
		frame.getContentPane().add(lblDomanNmae);
		
		textField = new JTextField();
		textField.setBounds(266, 169, 152, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLocation.setBounds(70, 551, 178, 29);
		frame.getContentPane().add(lblLocation);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(279, 632, 152, 47);
		frame.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(265, 229, 153, 29);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(265, 287, 153, 29);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(265, 347, 153, 29);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(265, 416, 153, 29);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(265, 492, 153, 29);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(265, 554, 153, 29);
		frame.getContentPane().add(textField_6);
		
		JLabel lblPhone = new JLabel("Phone ");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPhone.setBounds(465, 161, 152, 29);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblName_1_1 = new JLabel("Salary");
		lblName_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName_1_1.setBounds(465, 226, 152, 29);
		frame.getContentPane().add(lblName_1_1);
		
		JLabel lblName_1_2 = new JLabel("Department ");
		lblName_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName_1_2.setBounds(465, 292, 152, 29);
		frame.getContentPane().add(lblName_1_2);
		
		JLabel lblName_1_3 = new JLabel("");
		lblName_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName_1_3.setBounds(447, 292, 152, 29);
		frame.getContentPane().add(lblName_1_3);
		
		JLabel lblName_1_4 = new JLabel("Employee Experience");
		lblName_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName_1_4.setBounds(583, 331, 195, 29);
		frame.getContentPane().add(lblName_1_4);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(673, 169, 189, 29);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(673, 229, 189, 29);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(673, 292, 189, 29);
		frame.getContentPane().add(textField_9);
		
		JTextArea txtrHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhannakjfanjknjkfajkkjfaKjaaaaaaaaaaaaKf = new JTextArea();
		txtrHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhannakjfanjknjkfajkkjfaKjaaaaaaaaaaaaKf.setLineWrap(true);
		txtrHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhannakjfanjknjkfajkkjfaKjaaaaaaaaaaaaKf.setToolTipText("");
		txtrHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhannakjfanjknjkfajkkjfaKjaaaaaaaaaaaaKf.setWrapStyleWord(true);
		txtrHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhannakjfanjknjkfajkkjfaKjaaaaaaaaaaaaKf.setTabSize(2);
		txtrHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhannakjfanjknjkfajkkjfaKjaaaaaaaaaaaaKf.setText(" ");
		txtrHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhannakjfanjknjkfajkkjfaKjaaaaaaaaaaaaKf.setBounds(500, 370, 362, 303);
		frame.getContentPane().add(txtrHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhannakjfanjknjkfajkkjfaKjaaaaaaaaaaaaKf);
		
		JButton btnNewButton_1 = new JButton("Add Details");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(70, 632, 152, 47);
		frame.getContentPane().add(btnNewButton_1);
	}
}

package employee.management.system;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Color;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

//public class Contact {
//}

public class Contact extends JFrame implements ActionListener{
    
//
    
    JTextField tfname, tffname,tfems, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JDateChooser dcdob;
//    JComboBox cbeducation;
    JLabel lblempId;
    JButton  back;
    
    Contact() {
        getContentPane().setBackground(new Color(211, 211, 211));
        setLayout(null);
        setTitle("Contact");
        
        JLabel heading = new JLabel("Contact Detal");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 28));
        add(heading);
        
        JLabel labelname = new JLabel("Company Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);
        
        tfname = new JTextField("IBM");
        tfname.setBounds(200, 150, 150, 30);
        tfname.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(tfname);
        
//       
        JLabel labelempId = new JLabel("Address");
      labelempId.setBounds(50, 200, 150, 30);
      labelempId.setFont(new Font("serif", Font.PLAIN, 20));
      add(labelempId);
      
      tfems = new JTextField("Thakral Nagar, Gopal Nagar");
      tfems.setBounds(200, 200, 150, 30);
      tfems.setFont(new Font("serif", Font.BOLD, 12));
      add(tfems);
//     
        
        JLabel labeladdress = new JLabel("Phone Number");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);
        
        tfaddress = new JTextField("+91282892**17");
        tfaddress.setBounds(200, 250, 150, 30);
        tfaddress.setFont(new Font("serif", Font.BOLD, 20));
        add(tfaddress);
//        
//      
//        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemail);
        
        tfemail = new JTextField("HelpIbm.com");
        tfemail.setBounds(200, 300, 150, 30);
        tfemail.setFont(new Font("serif", Font.BOLD, 20));
        add(tfemail);
//        

//        
        JLabel labeldesignation = new JLabel("Total Employees");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldesignation);
        
        tfdesignation = new JTextField("200");
        tfdesignation.setBounds(200, 350, 150, 30);
        tfdesignation.setFont(new Font("serif", Font.BOLD, 20));
        add(tfdesignation);
        
//        
        back = new JButton("Next");
        back.setBounds(300, 443, 176, 51);
        back.addActionListener(this);
        back.setFont(new Font("serif", Font.PLAIN, 23));
        back.setBackground(new Color(0, 128, 255));
        back.setForeground(new Color(192, 192, 250));
        add(back);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/look.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(0, 0, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i1);
        image.setBounds(434, 194, 405,200);
        add(image);
//        
        
//        setSize(900, 700);
//        setLocation(300, 50);
        setBounds(400, 100, 893, 587);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        
    	setVisible(false);
        new Feedbacks();
    }

    public static void main(String[] args) {
        new Contact();
    }
}


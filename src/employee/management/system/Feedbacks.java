//package employee.management.system;

//public class Feedbacks {
//
//}
package employee.management.system;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;
import java.sql.*;

public class Feedbacks extends JFrame implements ActionListener{
//    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    JTextField tfEmpname, tffemail,tffjob ,tfflocation ,tfflocationn, tfstart, tfend, tfphone, tfDep, tfemail, tfsalary,  tfwork;
//    JTextArea tfflocationn;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempId;
    JButton add, back;
    
    Feedbacks() {
        getContentPane().setBackground(new Color(211, 211, 211));
        setLayout(null);
        setTitle("Feedback");
        
        JLabel heading = new JLabel("Employees Feedback");
        heading.setBounds(303, 57, 314, 49);
        heading.setFont(new Font("Tahoma", Font.BOLD, 29));
        add(heading);
        
        JLabel labelname = new JLabel("Employee Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);
        
        tfEmpname = new JTextField();
        tfEmpname.setBounds(200, 150, 150, 30);
        add(tfEmpname);
        
        JLabel labelfname = new JLabel("Email_Id");
        labelfname.setBounds(400, 150, 150, 30);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelfname);
        
        tffemail = new JTextField();
        tffemail.setBounds(600, 150, 150, 30);
        add(tffemail);
        
        JLabel label = new JLabel("Employee Experience");
        label.setBounds(400, 200, 150, 530);
//        label.setLineWrap(true);
        label.setFont(new Font("serif", Font.BOLD, 16));
        add(label);
        
        tfflocation = new JTextField();
//        ((Object) tfflocation).setLineWrap(true);
//        tfflocation.setWrapStyleWord(true);
        tfflocation.setBounds(600, 450, 250, 200);
        add(tfflocation);
        
        JLabel labell = new JLabel("Location");
        labell.setBounds(400, 160, 150, 500);
        labell.setFont(new Font("serif", Font.PLAIN, 20));
        add(labell);
        
        tfflocationn = new JTextField();
        tfflocationn.setBounds(600, 400, 150, 30);
        add(tfflocationn);
        
        
        JLabel labeldob = new JLabel("JOB Title");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);
        
         tffjob = new JTextField();
          tffjob.setBounds(200, 200, 150, 30);
          add(tffjob);
//        dcdob = new JDateChooser();
//        dcdob.setBounds();
//        add(dcdob);
//        
        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        add(tfsalary);
        
        JLabel labeladdress = new JLabel("Start Time");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);
        
        tfstart = new JTextField();
        tfstart.setBounds(200, 250, 150, 30);
        add(tfstart);
        
        JLabel labelend = new JLabel("End Time");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);
        
        tfend = new JTextField();
        tfend.setBounds(200, 250, 150, 30);
        add(tfend);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        JLabel labelemail = new JLabel("End Time");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemail);
        
        tfend= new JTextField();
        tfend.setBounds(200, 300, 150, 30);
        add(tfend);
        
        JLabel labeleducation = new JLabel("Higest Education");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeleducation);
        
        String courses[] = {"BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC", "PHD"};
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600, 300, 150, 30);
        add(cbeducation);
        
        JLabel labeldesignation = new JLabel("Country");
        labeldesignation.setBounds(50, 350, 700, 30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldesignation);
        
        tfwork = new JTextField();
        tfwork.setBounds(200, 350, 150, 30);
        add(tfwork);
        
        JLabel labelaadhar = new JLabel("Departmant");
        labelaadhar.setBounds(400, 350, 150, 30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelaadhar);
        
        tfDep = new JTextField();
        tfDep.setBounds(600, 350, 150, 30);
        add(tfDep);
        
        JLabel labelempId = new JLabel("Employee id");
        labelempId.setBounds(50, 400, 150, 30);
        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelempId);
        
        lblempId = new JLabel("" + number);
        lblempId.setBounds(200, 400, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblempId);
        
        add = new JButton("Add Details");
        add.setBounds(80, 550, 150, 40);
        add.setBackground(Color.white);
        add.setForeground(Color.black);
        add.addActionListener(this);
//        add.setBackground(Color.blue);
//        add.setForeground(Color.WHITE);
        add(add);
        
        back = new JButton("Back");
        back.setBounds(250, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(new Color(0, 128, 255));
        back.setForeground(Color.white);
        add(back);
        
//        setSize(900, 700);
//        setLocation(300, 50);
        setBounds(400, 80, 935, 737);
        setVisible(true);
    }
    
//    tfEmpname, tffemail,tffjob ,tfflocation , tfstart, tfend, tfphone, tfDep, tfemail, tfsalary,  tfwork
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String name = tfEmpname.getText();
            String empId = lblempId.getText();
            String location = tfflocation.getText();
            String Employee = tfflocationn.getText();
            String job = tffjob.getText();
//            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String star = tfstart.getText();
            String en = tfend.getText();
            String phone = tfphone.getText();
            String email = tffemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String wo = tfwork.getText();
            String dep = tfDep.getText();
                
            try {
                Conn conn = new Conn();
                String query = "insert into Feedbacks values('"+name+"', '"+empId+"', '"+location+"','"+Employee+"','"+job+"', '"+salary+"', '"+star+"', '"+en+"', '"+phone+"', '"+email+"','"+education+"','"+wo+"', '"+dep+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new Feedbacks();
    }
}

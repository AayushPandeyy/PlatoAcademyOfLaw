package com.example.Platoproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class mainPanel extends JPanel{
	public static String text;
	public static int price;
	public static String filename;
	public static int paidAmt , discountAmt;
	public static JTextField fnameField;
	public static JTextField snameField;
	public static JTextField addressField;
	public static JTextField contactField;
	public static JTextField seeSchoolField;
	public static JTextField seeGPAField;
	public static JTextField plustwoSchoolField;
	public static JTextField plustwoGPAField;
	public static JTextField guardianNameField;
	public static JTextField guardiansNumberField;
	public static String fnamedata;
	public static String snamedata;
	public static String addressdata;
	public static String contactdata;
	public static String seeschooldata;
	public static String seegpadata;
	public static String plustwoschooldata;
	public static String plustwogpadata;
	public static String gnamedata;
	public static String gnumberdata;
	public mainPanel() {
		setBackground(Color.red);
		setLayout(new GridLayout(0,1));
		JPanel mainpanel = new JPanel();
		mainpanel.setBackground(Color.yellow);
		mainpanel.setLayout(null);
		
		JLabel title = new JLabel("Student Details");
		title.setFont(new Font("Arial",1,28));
		title.setBounds(530,20,250,20);
		mainpanel.add(title);
		
		JLabel fname = new JLabel("Name : ");
		fname.setBounds(20,100,80,30);
		fnameField = new JTextField();
		fnameField.setBounds(130,100,400,30);
		
		JLabel sname = new JLabel("Surname : ");
		sname.setBounds(700,100,80,30);
		snameField = new JTextField();
		snameField.setBounds(810,100,400,30);
		
//		JLabel pic = new JLabel();
//		pic.setBounds(890,20,180,180);
//		pic.setBorder(new LineBorder(Color.black));
//		pic.setIcon(new ImageIcon(getClass().getResource("/img/hello-world.png")));
		
		JLabel address = new JLabel("Address : ");
		address.setBounds(20,140,100,30);
		addressField = new JTextField();
		addressField.setBounds(130,140,400,30);
		
		JLabel contact = new JLabel("Contact : ");
		contact.setBounds(700,140,100,30);
		contactField = new JTextField();
		contactField.setBounds(810,140,400,30);
		
		JLabel see = new JLabel("SEE");
		see.setFont(new Font("Arial",1,18));
		see.setBounds(600,180,250,20);
		
		JLabel seeSchool = new JLabel("School : ");
		seeSchool.setBounds(20,220,100,30);
		seeSchoolField = new JTextField();
		seeSchoolField.setBounds(130,220,400,30);
		
		JLabel seeGPA = new JLabel("GPA : ");
		seeGPA.setBounds(700,220,100,30);
		seeGPAField = new JTextField();
		seeGPAField.setBounds(810,220,400,30);
		
		JLabel plustwo = new JLabel("+2");
		plustwo.setFont(new Font("Arial",1,18));
		plustwo.setBounds(605,250,250,20);
		
		JLabel plustwoSchool = new JLabel("School : ");
		plustwoSchool.setBounds(20,290,100,30);
		plustwoSchoolField = new JTextField();
		plustwoSchoolField.setBounds(130,290,400,30);
		
		JLabel plustwoGPA = new JLabel("GPA : ");
		plustwoGPA.setBounds(700,290,100,30);
		plustwoGPAField = new JTextField();
		plustwoGPAField.setBounds(810,290,400,30);

		JLabel guardianName = new JLabel("Guardian's Name : ");
		guardianName.setBounds(20,330,150,30);
		guardianNameField = new JTextField();
		guardianNameField.setBounds(180,330,400,30);
		
		JLabel guardiansNumber = new JLabel("Guardian's Number : ");
		guardiansNumber.setBounds(700,330,150,30);
		guardiansNumberField = new JTextField();
		guardiansNumberField.setBounds(860,330,400,30);
		
		JRadioButton fullCourse = new JRadioButton("Full Package Course - 18000");
		fullCourse.setSelected(true);
		fullCourse.setBounds(20,370,200,30);
		JRadioButton syllabusCourse = new JRadioButton("Syllabus Course - 15000");
		syllabusCourse.setBounds(860,370,200,30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(syllabusCourse);
		bg.add(fullCourse);
		
		JLabel paid = new JLabel("Paid : ");
		paid.setBounds(20,410,100,30);
		JTextField paidField = new JTextField();
		paidField.setBounds(130,410,200,30);
		
		JLabel discount = new JLabel("Discount : ");
		discount.setBounds(700,410,100,30);
		JTextField discountField = new JTextField();
		discountField.setBounds(810,410,200,30);
		
		JButton submit = new JButton("Submit");
		submit.setBounds(520,490,200,30);
		
		submit.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				fnamedata = fnameField.getText();
				snamedata = snameField.getText();
				contactdata = contactField.getText();
				addressdata = addressField.getText();
				seeschooldata = seeSchoolField.getText();
				seegpadata = seeGPAField.getText();
				plustwogpadata = plustwoGPAField.getText();
				plustwoschooldata = plustwoSchoolField.getText();
				gnamedata = guardianNameField.getText();
				gnumberdata = guardiansNumberField.getText();

				try {
					com.example.billNo.App.main(null);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(fullCourse.isSelected()) {
					text = "Full Package Course";
					price = 18000;
				}else {
					text = "Syllabus Course";
					price = 15000;
				}
				filename = fnameField.getText()+snameField.getText()+seeSchoolField.getText();
				paidAmt = Integer.parseInt(paidField.getText());
				discountAmt = Integer.parseInt(discountField.getText());
				try {
					com.example.bill.App.main(null);
					com.example.excel.app.main(null);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				fnameField.setText("");
				snameField.setText("");
				addressField.setText("");
				contactField.setText("");
				seeSchoolField.setText("");
				seeGPAField.setText("");
				plustwoSchoolField.setText("");
				plustwoGPAField.setText("");
				guardianNameField.setText("");
				guardiansNumberField.setText("");
				paidField.setText("");
				discountField.setText("");
				fullCourse.setSelected(true);
				
			}
		});
		
//		mainpanel.add(pic);
		mainpanel.add(submit);
		mainpanel.add(see);
		mainpanel.add(fname);
		mainpanel.add(fnameField);
		mainpanel.add(sname);
		mainpanel.add(syllabusCourse);
		mainpanel.add(fullCourse);
		mainpanel.add(snameField);
		mainpanel.add(address);
		mainpanel.add(addressField);
		mainpanel.add(contact);
		mainpanel.add(contactField);
		mainpanel.add(seeSchool);
		mainpanel.add(seeSchoolField);
		mainpanel.add(seeGPA);
		mainpanel.add(seeGPAField);
		mainpanel.add(plustwo);
		mainpanel.add(plustwoSchool);
		mainpanel.add(plustwoSchoolField);
		mainpanel.add(plustwoGPA);
		mainpanel.add(plustwoGPAField);
		mainpanel.add(guardianName);
		mainpanel.add(guardianNameField);
		mainpanel.add(guardiansNumber);
		mainpanel.add(guardiansNumberField);
		mainpanel.add(paid);
		mainpanel.add(paidField);
		mainpanel.add(discount);
		mainpanel.add(discountField);
		JScrollPane mainScrollPane  = new JScrollPane(mainpanel);
//		mainScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(mainScrollPane);
	}
	
}

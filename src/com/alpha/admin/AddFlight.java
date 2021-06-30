package com.alpha.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class AddFlight extends JFrame {

	private JPanel contentPane;
	private JTextField flightName;
	private JTextField fl_serial;
	private JTextField takeofTime;
	public static JComboBox toBox;
	private JDateChooser dep_Date;
	private JDateChooser ret_Date;
	public static JComboBox fromBox;
	private JTextField sup_Field;
	private JTextField eco_Field;
	private JTextField buis_Field;
	private JTextField pre_Field;
	private JButton btnAdd;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFlight frame = new AddFlight();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public AddFlight() {
		initialize();
		connect();
		addAirports();
	}
	
	public static String flname, flserial,takeof, deprature, re , from, to,sup , bus ,eco,pre;
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/airline","root","");
			
		}
		catch(ClassNotFoundException ex) {
			
		}
		catch(SQLException ex) {
			
		}
	}
	
	public void addAirports() {
		com.alpha.airport.Airports.air();
		com.alpha.airport.Airports.air_1();
	}
	
	private void initialize() {
		setDefaultLookAndFeelDecorated(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1015, 710);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new LineBorder(new Color(0, 51, 204), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Flight Schedule");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 11, 980, 54);
		contentPane.add(lblNewLabel);
		
		flightName = new JTextField();
		flightName.setBounds(48, 119, 451, 35);
		contentPane.add(flightName);
		flightName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Flight Name");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(48, 94, 324, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Flight Serial No");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(593, 94, 324, 26);
		contentPane.add(lblNewLabel_1_1);
		
		fl_serial = new JTextField();
		fl_serial.setColumns(10);
		fl_serial.setBounds(593, 119, 324, 35);
		contentPane.add(fl_serial);
		
		JLabel lblNewLabel_1_2 = new JLabel("Take of Time");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(48, 195, 324, 26);
		contentPane.add(lblNewLabel_1_2);
		
		takeofTime = new JTextField();
		takeofTime.setColumns(10);
		takeofTime.setBounds(48, 220, 324, 35);
		contentPane.add(takeofTime);
		
		dep_Date = new JDateChooser();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		dep_Date.setBounds(441, 220, 227, 35);
		contentPane.add(dep_Date);
		
		ret_Date = new JDateChooser();
		SimpleDateFormat dateformat1 = new SimpleDateFormat("yyyy-MM-dd");
		ret_Date.setBounds(701, 220, 227, 35);
		contentPane.add(ret_Date);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Deprature Date");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(441, 195, 227, 26);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Return Date");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(701, 195, 227, 26);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		fromBox = new JComboBox();
		//fromBox.setModel(new DefaultComboBoxModel(new String[] {"Hazrat Shahjalal International Airport, Dhaka", "Shah Amanat International Airport, Chattogram", "Osmani International Airport, Sylhet", "Doha International Airport,Doha", "Hamad International Airport,Doha", "King Fahd International Airport,Dammam", "Amaala International Airport,Amaala", "King Abdulaziz International Airport,Jeddah", "King Khalid International Airport,Riyadh", "Prince Mohammad Bin Abdulaziz International Airport,Medina", "Al-Ahsa International Airport,Al-Hofuf, Al-Ahsa", "Prince Abdul Majeed bin Abdulaziz Domestic Airport,Al-'Ula", "Prince Abdul Mohsin bin Abdulaziz International Airport,Yanbu", "Prince Nayef Bin Abdulaziz Regional Airport,Buraidah", "Abu Dhabi International Airport,Abu Dhabi", "Al Bateen Executive Airport,Abu Dhabi", "Dubai International Airport,Dubai", "Al Minhad Air Base,Dubai", "Dubai World Central - Al Maktoum International Airport,Dubai", "Singapore Changi Airport ,Changi", "Seletar Airport,Seletar", "Kuala Lumpur International Airport,Greater Kuala Lumpur", "Kota Kinabalu International Airport,Kota Kinabalu", "Sultan Abdul Aziz Shah Airport, \tKuala Lumpur", "Soekarno\u2013Hatta International Airport,Jakarta", "Ngurah Rai International Airport,Denpasar", "Atat\u00FCrk International Airport,Istanbul", "Sabiha G\u00F6k\u00E7en International Airport,Istanbul", "Antalya Airport, Antalya", "Esenbo\u011Fa International Airport,Ankara"}));
		fromBox.setBounds(48, 307, 324, 35);
		contentPane.add(fromBox);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("From");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(48, 280, 324, 26);
		contentPane.add(lblNewLabel_1_2_1);
		
		toBox = new JComboBox();
		//toBox.setModel(new DefaultComboBoxModel(new String[] {"Hazrat Shahjalal International Airport, Dhaka", "Shah Amanat International Airport, Chattogram", "Osmani International Airport, Sylhet", "Doha International Airport,Doha", "Hamad International Airport,Doha", "King Fahd International Airport,Dammam", "Amaala International Airport,Amaala", "King Abdulaziz International Airport,Jeddah", "King Khalid International Airport,Riyadh", "Prince Mohammad Bin Abdulaziz International Airport,Medina", "Al-Ahsa International Airport,Al-Hofuf, Al-Ahsa", "Prince Abdul Majeed bin Abdulaziz Domestic Airport,Al-'Ula", "Prince Abdul Mohsin bin Abdulaziz International Airport,Yanbu", "Prince Nayef Bin Abdulaziz Regional Airport,Buraidah", "Abu Dhabi International Airport,Abu Dhabi", "Al Bateen Executive Airport,Abu Dhabi", "Dubai International Airport,Dubai", "Al Minhad Air Base,Dubai", "Dubai World Central - Al Maktoum International Airport,Dubai", "Singapore Changi Airport ,Changi", "Seletar Airport,Seletar", "Kuala Lumpur International Airport,Greater Kuala Lumpur", "Kota Kinabalu International Airport,Kota Kinabalu", "Sultan Abdul Aziz Shah Airport, \tKuala Lumpur", "Soekarno\u2013Hatta International Airport,Jakarta", "Ngurah Rai International Airport,Denpasar", "Atat\u00FCrk International Airport,Istanbul", "Sabiha G\u00F6k\u00E7en International Airport,Istanbul", "Antalya Airport, Antalya"}));
		toBox.setBounds(441, 307, 324, 35);
		contentPane.add(toBox);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("To");
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2_1_1.setBounds(441, 280, 324, 26);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		btnAdd = new JButton("add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				flname = flightName.getText();
				flserial = fl_serial.getText();
				takeof = takeofTime.getText();
				deprature = dateformat.format(dep_Date.getDate());
				re = dateformat1.format(ret_Date.getDate());
				from = fromBox.getSelectedItem().toString();
				to = toBox.getSelectedItem().toString();
				sup = sup_Field.getText();
				bus = eco_Field.getText();
			    eco = buis_Field.getText();
			    pre = pre_Field.getText();
				
				
				try {
					pst = con.prepareStatement("insert into addflight(flightname,flightserial,takeof,deprature,back,start,destination,super,economy,business,premium)values(?,?,?,?,?,?,?,?,?,?,?)");
					pst.setString(1, flname);
					pst.setString(2, flserial);
					pst.setString(3, takeof);
					pst.setString(4, deprature);
					pst.setString(5, re);
					pst.setString(6, from);
					pst.setString(7, to);
					pst.setString(8, sup);
					pst.setString(9, bus);
					pst.setString(10, eco);
					pst.setString(11, pre);
					
					pst.executeUpdate();
					
					JOptionPane.showMessageDialog(null, "Flight Added Successfully!");
					
					
				}
				catch(SQLException e1) {
					e1.printStackTrace();
				}

			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAdd.setBounds(465, 512, 109, 54);
		contentPane.add(btnAdd);
		
		sup_Field = new JTextField();
		sup_Field.setColumns(10);
		sup_Field.setBounds(98, 417, 172, 35);
		contentPane.add(sup_Field);
		
		eco_Field = new JTextField();
		eco_Field.setColumns(10);
		eco_Field.setBounds(319, 417, 172, 35);
		contentPane.add(eco_Field);
		
		buis_Field = new JTextField();
		buis_Field.setColumns(10);
		buis_Field.setBounds(549, 417, 172, 35);
		contentPane.add(buis_Field);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("super saver");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2_2.setBounds(98, 390, 172, 26);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("economy saver");
		lblNewLabel_1_2_3.setForeground(Color.WHITE);
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2_3.setBounds(319, 390, 172, 26);
		contentPane.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("business saver");
		lblNewLabel_1_2_4.setForeground(Color.WHITE);
		lblNewLabel_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2_4.setBounds(549, 390, 172, 26);
		contentPane.add(lblNewLabel_1_2_4);
		
		pre_Field = new JTextField();
		pre_Field.setColumns(10);
		pre_Field.setBounds(756, 417, 172, 35);
		contentPane.add(pre_Field);
		
		JLabel lblNewLabel_1_2_4_1 = new JLabel("premium economy");
		lblNewLabel_1_2_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2_4_1.setBounds(756, 390, 172, 26);
		contentPane.add(lblNewLabel_1_2_4_1);
	}
}
package com.alpha.bookflight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;

import net.proteanit.sql.DbUtils;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class otherInformations extends JFrame {

	private JPanel contentPane;
	private JPanel panelStartBooking;
	private JPanel panelSearchFlight;
	private JPanel panelInformation;
	private JPanel panel;
	public static JComboBox fromBox;
	private JLabel lblNewLabel_1;
	public static JComboBox toBox;
	private JLabel lblNewLabel_2;
	private JLabel lblDeprature;
	private JLabel lblNewLabel_4;
	private JButton btnSearch;
	private JLabel lblReturn;
	private JComboBox tripBox;
	private JDateChooser depDate;
	private JDateChooser retDate;
	private JComboBox classBox;
	private JPanel panelPayment;
	private JLayeredPane layeredPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnPrevious;
	private JButton btnContinue;
	private JCheckBox premiumBox;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JPanel panelPersonalInformation;
	private JPanel panelEmergencyContact;
	private JPanel panelPrimaryContact;
	private JPanel panelName;
	private JTextField txtName;
	private JPanel panelNation;
	private JTextField txtNation;
	private JComboBox genderBox;
	private JTextField txtPhone;
	private JTextField txtMail;
	private JTextField txtPassport;
	private JTextField txtCode;
	private JTextField txtPlus;
	private JTextField txtEmName;
	private JTextField txtEmPhone;
	private JTextField txtEmMail;
	private JDateChooser birthDate;
	private JDateChooser passportExpiry;
	private JPanel panelEmergencyEmail;
	private JPanel panelEmergencyPhone;
	private JPanel panelEmergencyName;
	private JPanel panelPhone;
	private JPanel panelEmail;
	private JPanel panelPassportNo;
	private JPanel panelCountryCode;
	private JCheckBox checkConfirm;
	private JButton btnNext;
	private JButton btnBack;
	private SimpleDateFormat dateformat;
	private SimpleDateFormat dateformat1;
	private SimpleDateFormat dateformat2;
	private SimpleDateFormat dateformat3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					otherInformations frame = new otherInformations();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public otherInformations() {
		initialize();
		connect();
		addAirport();
	}
	
	public static String name,gender,birth,nation,phone,mail,pass_no,pass_exp,country_code,em_name,em_phn,em_mail,
	from,to,trip_type,s_date,r_date,flight,fl_serial,takeof,seat_class,cost;
	
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
	
	public void flightLoad() {
		try {
				String Start = fromBox.getSelectedItem().toString();			
				String End = toBox.getSelectedItem().toString();
				String Dep = dateformat.format(depDate.getDate());
				String ret = dateformat1.format(retDate.getDate());
				
				pst = con.prepareStatement("select flightname,flightserial,takeof from addflight where start = ? and destination = ? and deprature = ? and back = ?");
				pst.setString(1, Start);
				pst.setString(2, End);
				pst.setString(3, Dep);
				pst.setString(4, ret);
				rs = pst.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
				table.setShowHorizontalLines(true);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				
				TableColumn column1 = null;
				for (int i = 0; i < 3; i++) {
				    column1 = table.getColumnModel().getColumn(i);
				    if(i==0) {
				    	column1.setPreferredWidth(400);
				    }
				    if (i == 1) {
				        column1.setPreferredWidth(280);
				    }
				    else if(i==2) {
				    	column1.setPreferredWidth(340);
				    }
				}
				table.setFont(new Font("SolaimanLipi", Font.PLAIN, 20));
				table.setRowHeight(30);
				
	        } catch(SQLException ex){
	        	ex.printStackTrace();
	        }
	}
	
	public void flightLoad_1() {
			try{
				String Start = fromBox.getSelectedItem().toString();			
				String End = toBox.getSelectedItem().toString();
				String Dep = dateformat.format(depDate.getDate());
				
				pst = con.prepareStatement("select flightname,flightserial,takeof from addflight where start = ? and destination = ? and deprature = ?");
				pst.setString(1, Start);
				pst.setString(2, End);
				pst.setString(3, Dep);
				rs = pst.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
				table.setShowHorizontalLines(true);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				
				TableColumn column1 = null;
				for (int i = 0; i < 3; i++) {
				    column1 = table.getColumnModel().getColumn(i);
				    if(i==0) {
				    	column1.setPreferredWidth(400);
				    }
				    if (i == 1) {
				        column1.setPreferredWidth(280);
				    }
				    else if(i==2) {
				    	column1.setPreferredWidth(340);
				    }
				}
				table.setFont(new Font("SolaimanLipi", Font.PLAIN, 20));
				table.setRowHeight(30);
				
	        } catch(SQLException ex){
	        	ex.printStackTrace();
	        }
	}
	
	public void addAirport() {
		com.alpha.airport.Airports.Air();
		com.alpha.airport.Airports.Air_1();
	}
	
	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		setDefaultLookAndFeelDecorated(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1015, 710);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new LineBorder(new Color(51, 0, 255), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1015, 710);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		/*__________________________Start Booking Panel_____________________________*/
		
		panelStartBooking = new JPanel();
		panelStartBooking.setBorder(new LineBorder(new Color(0, 51, 204), 2, true));
		panelStartBooking.setBackground(new Color(0, 0, 51));
		layeredPane.add(panelStartBooking, "name_16383597566101");
		panelStartBooking.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(628, 127, 377, 572);
		panelStartBooking.add(panel);
		panel.setLayout(null);
		
		fromBox = new JComboBox();
		fromBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fromBox.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		fromBox.setBackground(Color.WHITE);
		fromBox.setBounds(10, 123, 357, 36);
		panel.add(fromBox);
		
		JLabel lblNewLabel = new JLabel("Trip");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 142, 26);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("From");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 97, 142, 26);
		panel.add(lblNewLabel_1);
		
		toBox = new JComboBox();
		toBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		toBox.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		toBox.setBackground(Color.WHITE);
		toBox.setBounds(10, 208, 357, 36);
		panel.add(toBox);
		
		lblNewLabel_2 = new JLabel("To");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 183, 142, 26);
		panel.add(lblNewLabel_2);
		
		depDate = new JDateChooser();
		dateformat = new SimpleDateFormat("yyyy-MM-dd");
		depDate.setBounds(10, 293, 171, 36);
		panel.add(depDate);
		
		retDate = new JDateChooser();
		dateformat1 = new SimpleDateFormat("yyyy-MM-dd");
		retDate.setBounds(196, 293, 171, 36);
		panel.add(retDate);
		
		classBox = new JComboBox();
		classBox.setModel(new DefaultComboBoxModel(new String[] {"Premium", "Economy", "Business"}));
		classBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		classBox.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		classBox.setBackground(Color.WHITE);
		classBox.setBounds(10, 378, 357, 36);
		panel.add(classBox);
		
		lblDeprature = new JLabel("Deprature Date");
		lblDeprature.setForeground(Color.BLACK);
		lblDeprature.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDeprature.setBounds(10, 267, 142, 26);
		panel.add(lblDeprature);
		
		lblNewLabel_4 = new JLabel("Class");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 354, 142, 26);
		panel.add(lblNewLabel_4);
		
		btnSearch = new JButton("Search Flight");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tripBox.getSelectedItem().toString().equals("One Way")||tripBox.getSelectedItem().toString().equals("Multi Way")) {
					flightLoad();
				}
				else if(tripBox.getSelectedItem().toString().equals("Return")) {
					flightLoad_1();
				}
				switchPanels(panelSearchFlight);
			}
		});
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setBackground(new Color(102, 51, 255));
		btnSearch.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		btnSearch.setBounds(10, 483, 357, 49);
		panel.add(btnSearch);
		
		tripBox = new JComboBox();
		tripBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tripBox.getSelectedItem().equals("Return")) {
					retDate.setVisible(false);
					lblReturn.setVisible(false);
					depDate.setBounds(10, 293, 357, 36);
				}
				else if(tripBox.getSelectedItem().equals("One Way")) {
					retDate.setVisible(true);
					lblReturn.setVisible(true);
					depDate.setBounds(10, 293, 171, 36);
				}
				else if(tripBox.getSelectedItem().equals("Multi Way")) {
					retDate.setVisible(true);
					lblReturn.setVisible(true);
					depDate.setBounds(10, 293, 171, 36);
				}
			}
		});
		tripBox.setModel(new DefaultComboBoxModel(new String[] {"", "Return", "One Way", "Multi Way"}));
		tripBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tripBox.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		tripBox.setBackground(Color.WHITE);
		tripBox.setBounds(10, 38, 357, 36);
		panel.add(tripBox);
		
		lblReturn = new JLabel("Return Date");
		lblReturn.setForeground(Color.BLACK);
		lblReturn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblReturn.setBounds(196, 267, 142, 26);
		panel.add(lblReturn);
		
		/*__________________________Search Flight Panel____________________________*/
		
		panelSearchFlight = new JPanel();
		panelSearchFlight.setBackground(new Color(0, 0, 51));
		panelSearchFlight.setBorder(new LineBorder(new Color(0, 51, 204), 2, true));
		layeredPane.add(panelSearchFlight, "name_16386445882996");
		panelSearchFlight.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.DARK_GRAY);
		scrollPane.setBounds(10, 112, 995, 306);
		panelSearchFlight.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
		        DefaultTableModel d= (DefaultTableModel) table.getModel();
		        int selectedindex = table.getSelectedRow();        
		        flight = d.getValueAt(selectedindex, 0).toString();
		        fl_serial = d.getValueAt(selectedindex, 1).toString();
		        takeof = d.getValueAt(selectedindex, 2).toString();
			}
		});
		scrollPane.setViewportView(table);
		table.setForeground(Color.WHITE);
		table.setBackground(Color.DARK_GRAY);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setForeground(Color.WHITE);
		textField.setBorder(new LineBorder(new Color(0, 153, 255), 1, true));
		textField.setOpaque(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setBounds(106, 480, 160, 33);
		panelSearchFlight.add(textField);
		textField.setColumns(10);
		
		premiumBox = new JCheckBox("Premium");
		premiumBox.setFocusPainted(false);
		premiumBox.setHorizontalAlignment(SwingConstants.CENTER);
		premiumBox.setForeground(Color.WHITE);
		premiumBox.setOpaque(false);
		premiumBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		premiumBox.setBounds(106, 520, 160, 22);
		panelSearchFlight.add(premiumBox);
		
		chckbxNewCheckBox = new JCheckBox("Premium");
		chckbxNewCheckBox.setFocusPainted(false);
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox.setBounds(340, 520, 160, 22);
		panelSearchFlight.add(chckbxNewCheckBox);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setForeground(Color.WHITE);
		textField_1.setBorder(new LineBorder(new Color(0, 153, 255), 1, true));
		textField_1.setOpaque(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBackground(Color.WHITE);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(340, 480, 160, 33);
		panelSearchFlight.add(textField_1);
		
		chckbxNewCheckBox_1 = new JCheckBox("Premium");
		chckbxNewCheckBox_1.setFocusPainted(false);
		chckbxNewCheckBox_1.setOpaque(false);
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_1.setForeground(Color.WHITE);
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox_1.setBounds(602, 520, 160, 22);
		panelSearchFlight.add(chckbxNewCheckBox_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setForeground(Color.WHITE);
		textField_2.setBorder(new LineBorder(new Color(0, 153, 255), 1, true));
		textField_2.setOpaque(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBackground(Color.WHITE);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(602, 480, 160, 33);
		panelSearchFlight.add(textField_2);
		
		btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panelStartBooking);
			}
		});
		btnPrevious.setBackground(new Color(102, 51, 255));
		btnPrevious.setForeground(Color.WHITE);
		btnPrevious.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		btnPrevious.setBounds(172, 625, 302, 48);
		panelSearchFlight.add(btnPrevious);
		
		btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panelInformation);
			}
		});
		btnContinue.setForeground(Color.WHITE);
		btnContinue.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		btnContinue.setBackground(new Color(102, 51, 255));
		btnContinue.setBounds(542, 625, 302, 48);
		panelSearchFlight.add(btnContinue);
		
		/*____________________________Information Panel____________________________*/
		
		panelInformation = new JPanel();
		panelInformation.setBackground(new Color(0, 0, 51));
		panelInformation.setBorder(new LineBorder(new Color(0, 51, 204), 2, true));
		layeredPane.add(panelInformation, "name_16394798150323");
		panelInformation.setLayout(null);
		
		panelPersonalInformation = new JPanel();
		panelPersonalInformation.setBounds(14, 177, 315, 370);
		panelInformation.add(panelPersonalInformation);
		panelPersonalInformation.setLayout(null);
		
		lblNewLabel = new JLabel("Personal Information");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 315, 36);
		panelPersonalInformation.add(lblNewLabel);
		
		panelName = new JPanel();
		panelName.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		panelName.setBackground(Color.WHITE);
		panelName.setBounds(10, 83, 295, 36);
		panelPersonalInformation.add(panelName);
		panelName.setLayout(null);
		
		txtName = new JTextField();
		txtName.setSelectedTextColor(Color.WHITE);
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtName.setSelectionColor(new Color(0, 102, 255));
		txtName.setOpaque(false);
		txtName.setBorder(null);
		txtName.setBounds(10, 0, 275, 36);
		panelName.add(txtName);
		txtName.setColumns(10);
		
		panelNation = new JPanel();
		panelNation.setBackground(Color.WHITE);
		panelNation.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		panelNation.setLayout(null);
		panelNation.setBounds(10, 320, 295, 36);
		panelPersonalInformation.add(panelNation);
		
		txtNation = new JTextField();
		txtNation.setSelectedTextColor(Color.WHITE);
		txtNation.setOpaque(false);
		txtNation.setSelectionColor(new Color(0, 102, 255));
		txtNation.setBackground(Color.WHITE);
		txtNation.setBorder(null);
		txtNation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNation.setColumns(10);
		txtNation.setBounds(10, 0, 275, 36);
		panelNation.add(txtNation);
		
		JLabel lblNewLabel_1 = new JLabel("Name of Passanger");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 62, 295, 20);
		panelPersonalInformation.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gender");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(10, 139, 295, 20);
		panelPersonalInformation.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Birth Date");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(10, 219, 295, 20);
		panelPersonalInformation.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Nationality");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(10, 299, 295, 20);
		panelPersonalInformation.add(lblNewLabel_1_3);
		
		genderBox = new JComboBox();
		genderBox.setModel(new DefaultComboBoxModel(new String[] {"", "Male", "Female", "Others"}));
		genderBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		genderBox.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		genderBox.setBackground(Color.WHITE);
		genderBox.setBounds(10, 160, 295, 36);
		panelPersonalInformation.add(genderBox);
		
		birthDate = new JDateChooser();
		dateformat2 = new SimpleDateFormat("yyyy-MM-dd");
		birthDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		birthDate.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		birthDate.setBackground(Color.WHITE);
		birthDate.setBounds(10, 240, 295, 36);
		panelPersonalInformation.add(birthDate);
		
		panelEmergencyContact = new JPanel();
		panelEmergencyContact.setBounds(687, 177, 315, 370);
		panelInformation.add(panelEmergencyContact);
		panelEmergencyContact.setLayout(null);
		
		JLabel lblEmergencyContactInformation = new JLabel("Emergency Contact Information");
		lblEmergencyContactInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmergencyContactInformation.setForeground(Color.BLACK);
		lblEmergencyContactInformation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmergencyContactInformation.setBounds(0, 0, 315, 36);
		panelEmergencyContact.add(lblEmergencyContactInformation);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Name");
		lblNewLabel_1_4_1.setForeground(Color.BLACK);
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_4_1.setBounds(10, 62, 295, 20);
		panelEmergencyContact.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Phone/Telephone Number");
		lblNewLabel_1_5_1.setForeground(Color.BLACK);
		lblNewLabel_1_5_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_5_1.setBounds(10, 139, 295, 20);
		panelEmergencyContact.add(lblNewLabel_1_5_1);
		
		panelEmergencyName = new JPanel();
		panelEmergencyName.setLayout(null);
		panelEmergencyName.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		panelEmergencyName.setBackground(Color.WHITE);
		panelEmergencyName.setBounds(10, 83, 295, 36);
		panelEmergencyContact.add(panelEmergencyName);
		
		txtEmName = new JTextField();
		txtEmName.setSelectionColor(new Color(0, 102, 255));
		txtEmName.setSelectedTextColor(Color.WHITE);
		txtEmName.setOpaque(false);
		txtEmName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmName.setColumns(10);
		txtEmName.setBorder(null);
		txtEmName.setBounds(10, 0, 275, 36);
		panelEmergencyName.add(txtEmName);
		
		panelEmergencyPhone = new JPanel();
		panelEmergencyPhone.setLayout(null);
		panelEmergencyPhone.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		panelEmergencyPhone.setBackground(Color.WHITE);
		panelEmergencyPhone.setBounds(10, 160, 295, 36);
		panelEmergencyContact.add(panelEmergencyPhone);
		
		txtEmPhone = new JTextField();
		txtEmPhone.setSelectionColor(new Color(0, 102, 255));
		txtEmPhone.setSelectedTextColor(Color.WHITE);
		txtEmPhone.setOpaque(false);
		txtEmPhone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmPhone.setColumns(10);
		txtEmPhone.setBorder(null);
		txtEmPhone.setBounds(10, 0, 275, 36);
		panelEmergencyPhone.add(txtEmPhone);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("E-mail");
		lblNewLabel_1_4_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_4_1_1.setBounds(10, 219, 295, 20);
		panelEmergencyContact.add(lblNewLabel_1_4_1_1);
		
		panelEmergencyEmail = new JPanel();
		panelEmergencyEmail.setLayout(null);
		panelEmergencyEmail.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		panelEmergencyEmail.setBackground(Color.WHITE);
		panelEmergencyEmail.setBounds(10, 240, 295, 36);
		panelEmergencyContact.add(panelEmergencyEmail);
		
		txtEmMail = new JTextField();
		txtEmMail.setSelectionColor(new Color(0, 102, 255));
		txtEmMail.setSelectedTextColor(Color.WHITE);
		txtEmMail.setOpaque(false);
		txtEmMail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmMail.setColumns(10);
		txtEmMail.setBorder(null);
		txtEmMail.setBounds(10, 0, 275, 36);
		panelEmergencyEmail.add(txtEmMail);
		
		panelPrimaryContact = new JPanel();
		panelPrimaryContact.setBounds(351, 177, 315, 370);
		panelInformation.add(panelPrimaryContact);
		panelPrimaryContact.setLayout(null);
		
		JLabel lblPrimaryContactInformation = new JLabel("Primary Contact Information");
		lblPrimaryContactInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimaryContactInformation.setForeground(Color.BLACK);
		lblPrimaryContactInformation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrimaryContactInformation.setBounds(0, 0, 315, 36);
		panelPrimaryContact.add(lblPrimaryContactInformation);
		
		JLabel lblNewLabel_1_4 = new JLabel("Phone/Telephone Number");
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_4.setBounds(10, 62, 295, 20);
		panelPrimaryContact.add(lblNewLabel_1_4);
		
		panelPhone = new JPanel();
		panelPhone.setLayout(null);
		panelPhone.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		panelPhone.setBackground(Color.WHITE);
		panelPhone.setBounds(10, 83, 295, 36);
		panelPrimaryContact.add(panelPhone);
		
		txtPhone = new JTextField();
		txtPhone.setSelectedTextColor(Color.WHITE);
		txtPhone.setSelectionColor(new Color(0, 102, 255));
		txtPhone.setOpaque(false);
		txtPhone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPhone.setColumns(10);
		txtPhone.setBorder(null);
		txtPhone.setBounds(10, 0, 275, 36);
		panelPhone.add(txtPhone);
		
		JLabel lblNewLabel_1_5 = new JLabel("E-mail");
		lblNewLabel_1_5.setForeground(Color.BLACK);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_5.setBounds(10, 139, 295, 20);
		panelPrimaryContact.add(lblNewLabel_1_5);
		
		panelEmail = new JPanel();
		panelEmail.setLayout(null);
		panelEmail.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		panelEmail.setBackground(Color.WHITE);
		panelEmail.setBounds(10, 160, 295, 36);
		panelPrimaryContact.add(panelEmail);
		
		txtMail = new JTextField();
		txtMail.setSelectedTextColor(Color.WHITE);
		txtMail.setSelectionColor(new Color(0, 102, 255));
		txtMail.setOpaque(false);
		txtMail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtMail.setColumns(10);
		txtMail.setBorder(null);
		txtMail.setBounds(10, 0, 275, 36);
		panelEmail.add(txtMail);
		
		JLabel lblNewLabel_1_6 = new JLabel("Passport Number");
		lblNewLabel_1_6.setForeground(Color.BLACK);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_6.setBounds(10, 219, 295, 20);
		panelPrimaryContact.add(lblNewLabel_1_6);
		
		panelPassportNo = new JPanel();
		panelPassportNo.setLayout(null);
		panelPassportNo.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		panelPassportNo.setBackground(Color.WHITE);
		panelPassportNo.setBounds(10, 240, 295, 36);
		panelPrimaryContact.add(panelPassportNo);
		
		txtPassport = new JTextField();
		txtPassport.setSelectedTextColor(Color.WHITE);
		txtPassport.setSelectionColor(new Color(0, 102, 255));
		txtPassport.setOpaque(false);
		txtPassport.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPassport.setColumns(10);
		txtPassport.setBorder(null);
		txtPassport.setBounds(10, 0, 275, 36);
		panelPassportNo.add(txtPassport);
		
		passportExpiry = new JDateChooser();
		dateformat3 = new SimpleDateFormat("yyyy-MM-dd");
		passportExpiry.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passportExpiry.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		passportExpiry.setBackground(Color.WHITE);
		passportExpiry.setBounds(10, 320, 159, 36);
		panelPrimaryContact.add(passportExpiry);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Passport Expiry Date");
		lblNewLabel_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2_1.setBounds(10, 299, 159, 20);
		panelPrimaryContact.add(lblNewLabel_1_2_1);
		
		panelCountryCode = new JPanel();
		panelCountryCode.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		panelCountryCode.setBackground(Color.WHITE);
		panelCountryCode.setBounds(179, 320, 126, 36);
		panelPrimaryContact.add(panelCountryCode);
		panelCountryCode.setLayout(null);
		
		txtCode = new JTextField();
		txtCode.setSelectedTextColor(Color.WHITE);
		txtCode.setSelectionColor(new Color(0, 102, 255));
		txtCode.setOpaque(false);
		txtCode.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtCode.setBorder(null);
		txtCode.setBackground(Color.WHITE);
		txtCode.setBounds(44, 0, 72, 36);
		panelCountryCode.add(txtCode);
		txtCode.setColumns(10);
		
		txtPlus = new JTextField();
		txtPlus.setSelectedTextColor(Color.WHITE);
		txtPlus.setSelectionColor(new Color(51, 51, 255));
		txtPlus.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlus.setText("+");
		txtPlus.setOpaque(false);
		txtPlus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPlus.setEditable(false);
		txtPlus.setBorder(null);
		txtPlus.setBackground(Color.WHITE);
		txtPlus.setBounds(10, 0, 36, 36);
		panelCountryCode.add(txtPlus);
		txtPlus.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Country Code");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(179, 299, 126, 20);
		panelPrimaryContact.add(lblNewLabel_2);
		
		btnBack = new JButton("Previous");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panelSearchFlight);
			}
		});
		btnBack.setBackground(new Color(51, 51, 204));
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		btnBack.setBounds(92, 621, 276, 56);
		panelInformation.add(btnBack);
		
		checkConfirm = new JCheckBox("I declare that the given information about me are all matches with the passport and nothing is false");
		checkConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkConfirm.isSelected()) {
					btnNext.setEnabled(true);
				}
				else {
					btnNext.setEnabled(false);
				}
			}
		});
		checkConfirm.setFocusPainted(false);
		checkConfirm.setForeground(Color.WHITE);
		checkConfirm.setOpaque(false);
		checkConfirm.setFont(new Font("SolaimanLipi", Font.PLAIN, 14));
		checkConfirm.setBounds(14, 563, 649, 23);
		panelInformation.add(checkConfirm);
		
		btnNext = new JButton("Continue");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = txtName.getText();
				gender = genderBox.getSelectedItem().toString();
				birth = dateformat.format(birthDate.getDate()); 
				nation = txtNation.getText();
				phone = txtPhone.getText();
				mail = txtMail.getText();
				pass_no = txtPassport.getText();
				pass_exp = dateformat3.format(passportExpiry.getDate());
				country_code = txtPlus.getText() + txtCode.getText();
				em_name = txtEmName.getText();
				em_phn = txtEmPhone.getText();
				em_mail = txtEmMail.getText();
				from = fromBox.getSelectedItem().toString();
				to = toBox.getSelectedItem().toString();
				trip_type = tripBox.getSelectedItem().toString();
				s_date = dateformat1.format(depDate.getDate());
				//r_date = dateformat2.format(retDate.getDate());
				seat_class = classBox.getSelectedItem().toString();
				
				if(tripBox.getSelectedItem().toString().equals("Return")) {
					try {
						pst = con.prepareStatement("insert into ticket_booking(Name,Gender,BirthDate,Nationality,Phone,Email,Passport_No,Expiry,CountryCode,Emergency_Name,Emergency_Phone,Emergency_Email,Starting_From,Destination,Trip,Starting_Date,Flight_Name,Serial_No,TakeOf,Seat_Class)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
						pst.setString(1, name);
						pst.setString(2, gender);
						pst.setString(3, birth);
						pst.setString(4, nation);
						pst.setString(5, phone);
						pst.setString(6, mail);
						pst.setString(7, pass_no);
						pst.setString(8, pass_exp);
						pst.setString(9, country_code);
						pst.setString(10, em_name);
						pst.setString(11, em_phn);
						pst.setString(12, em_mail);
						pst.setString(13, from);
						pst.setString(14, to);
						pst.setString(15, trip_type);
						pst.setString(16, s_date);
						pst.setString(17, flight);
						pst.setString(18, fl_serial);
						pst.setString(19, takeof);
						pst.setString(20, seat_class);
						pst.executeUpdate();
						
						JOptionPane.showMessageDialog(null, "Flight Added Successfully!");
						dispose();
						com.alpha.bookflight.bookseat bs = new com.alpha.bookflight.bookseat();
						bs.setVisible(true);
						
					}
					catch(SQLException e1) {
						e1.printStackTrace();
					}
				}
				else if(tripBox.getSelectedItem().toString().equals("One Way")||tripBox.getSelectedItem().toString().equals("Multi Way")) {
					try {
						pst = con.prepareStatement("insert into ticket_booking(Name,Gender,BirthDate,Nationality,Phone,Email,Passport_No,Expiry,CountryCode,Emergency_Name,Emergency_Phone,Emergency_Email,Starting_From,Destination,Trip,Starting_Date,Return_Date,Flight_Name,Serial_No,TakeOf,Seat_Class)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
						pst.setString(1, name);
						pst.setString(2, gender);
						pst.setString(3, birth);
						pst.setString(4, nation);
						pst.setString(5, phone);
						pst.setString(6, mail);
						pst.setString(7, pass_no);
						pst.setString(8, pass_exp);
						pst.setString(9, country_code);
						pst.setString(10, em_name);
						pst.setString(11, em_phn);
						pst.setString(12, em_mail);
						pst.setString(13, from);
						pst.setString(14, to);
						pst.setString(15, trip_type);
						pst.setString(16, s_date);
						pst.setString(17, r_date);
						pst.setString(18, flight);
						pst.setString(19, fl_serial);
						pst.setString(20, takeof);
						pst.setString(21, seat_class);
						pst.executeUpdate();
						
						JOptionPane.showMessageDialog(null, "Flight Added Successfully!");
						dispose();
						com.alpha.bookflight.bookseat bs = new com.alpha.bookflight.bookseat();
						bs.setVisible(true);
						
					}
					catch(SQLException e1) {
						e1.printStackTrace();
					}
				}
				
			}
		});
		btnNext.setEnabled(false);
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		btnNext.setBackground(new Color(51, 51, 204));
		btnNext.setBounds(426, 621, 276, 56);
		panelInformation.add(btnNext);
		
		/*____________________________Payment Panel________________________________*/
		
		panelPayment = new JPanel();
		panelPayment.setBackground(new Color(0, 0, 51));
		panelPayment.setBorder(new LineBorder(new Color(0, 51, 204), 2, true));
		layeredPane.add(panelPayment, "name_16398071427094");
	}
}

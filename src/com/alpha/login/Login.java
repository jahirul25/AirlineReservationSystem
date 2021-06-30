package com.alpha.login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField userField;
	private JTextField userPlaceholder;
	private JPanel loginPanel;
	private JPanel panelUser;
	private JLabel userPic;
	private JPanel panelPass;
	private JPasswordField passwordField;
	private JTextField passPlaceholder;
	private JLabel passPic;
	private JPanel panelPic;
	private JLabel slideshow;
	private JLabel forgotPass;
	private JButton btnLogin;
	private JLabel lblNewLabel;
	private JLabel lblsignup;
	private JLabel lblNewLabel_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Login() {
		initialize();
		connect();
	}
	
	public static String profilePicture,name,dob,gen,phn,mail,cntry,cit,uname,pass;
	
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
		
		loginPanel = new JPanel();
		loginPanel.setOpaque(false);
		loginPanel.setBounds(668, 153, 347, 547);
		contentPane.add(loginPanel);
		loginPanel.setLayout(null);
		
		panelUser = new JPanel();
		panelUser.setOpaque(false);
		panelUser.setBounds(0, 125, 347, 48);
		loginPanel.add(panelUser);
		panelUser.setLayout(null);
		
		userField = new JTextField();
		userField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if(arg0.getKeyChar()!=KeyEvent.VK_BACK_SPACE && arg0.getKeyChar()!=KeyEvent.VK_DELETE && arg0.getKeyChar()!=KeyEvent.VK_ENTER) {
					userPlaceholder.setVisible(false);
					userPlaceholder.setEnabled(false);
			    }
			    else if(userField.getText().equals("")) {
			    	userPlaceholder.setVisible(true);
			    	userPlaceholder.setEnabled(false);
			    }
			}
		});
		userField.setCaretColor(Color.WHITE);
		userField.setForeground(Color.WHITE);
		userField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		userField.setBorder(new MatteBorder(0, 0, 4, 0, (Color) Color.RED));
		userField.setOpaque(false);
		userField.setBounds(10, 11, 280, 37);
		panelUser.add(userField);
		userField.setColumns(10);
		
		userPlaceholder = new JTextField();
		userPlaceholder.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 0, 0)));
		userPlaceholder.setOpaque(false);
		userPlaceholder.setDisabledTextColor(Color.GRAY);
		userPlaceholder.setFont(new Font("Tahoma", Font.PLAIN, 19));
		userPlaceholder.setEnabled(false);
		userPlaceholder.setEditable(false);
		userPlaceholder.setText("Enter Username");
		userPlaceholder.setBounds(10, 11, 280, 37);
		panelUser.add(userPlaceholder);
		userPlaceholder.setColumns(10);
		
		userPic = new JLabel("");
		userPic.setBounds(295, 4, 42, 40);
		panelUser.add(userPic);
		
		panelPass = new JPanel();
		panelPass.setLayout(null);
		panelPass.setOpaque(false);
		panelPass.setBounds(0, 207, 347, 48);
		loginPanel.add(panelPass);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if(arg0.getKeyChar()!=KeyEvent.VK_BACK_SPACE && arg0.getKeyChar()!=KeyEvent.VK_DELETE && arg0.getKeyChar()!=KeyEvent.VK_ENTER) {
					passPlaceholder.setVisible(false);
					passPlaceholder.setEnabled(false);
			    }
			    else if(passwordField.getText().equals("")) {
			    	passPlaceholder.setVisible(true);
			    	passPlaceholder.setEnabled(false);
			    }
			}
		});
		passwordField.setCaretColor(Color.WHITE);
		passwordField.setBorder(new MatteBorder(0, 0, 4, 0, (Color) Color.RED));
		passwordField.setForeground(Color.WHITE);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		passwordField.setOpaque(false);
		passwordField.setBounds(10, 11, 280, 37);
		panelPass.add(passwordField);
		
		passPlaceholder = new JTextField();
		passPlaceholder.setBorder(new MatteBorder(0, 0, 4, 0, (Color) Color.RED));
		passPlaceholder.setDisabledTextColor(Color.GRAY);
		passPlaceholder.setOpaque(false);
		passPlaceholder.setText("Enter Password");
		passPlaceholder.setFont(new Font("Tahoma", Font.PLAIN, 19));
		passPlaceholder.setEnabled(false);
		passPlaceholder.setEditable(false);
		passPlaceholder.setBounds(10, 11, 280, 37);
		panelPass.add(passPlaceholder);
		passPlaceholder.setColumns(10);
		
		passPic = new JLabel("");
		passPic.setBounds(295, 4, 42, 40);
		panelPass.add(passPic);
		
		forgotPass = new JLabel("Forgot Password?");
		forgotPass.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		forgotPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				forgotPass.setForeground(Color.CYAN);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				forgotPass.setForeground(new Color(0, 153, 255));
			}
		});
		forgotPass.setFont(new Font("Dialog", Font.PLAIN, 14));
		forgotPass.setHorizontalAlignment(SwingConstants.CENTER);
		forgotPass.setForeground(new Color(0, 153, 255));
		forgotPass.setBounds(111, 265, 115, 22);
		loginPanel.add(forgotPass);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					uname = userField.getText();
					pass = passwordField.getText();
					
					if(uname.equals("alpha") || pass.equals("airline")) {
						JOptionPane.showMessageDialog(null, "Logging in Successfully");
						dispose();
						com.alpha.admin.AddFlight af = new com.alpha.admin.AddFlight();
						af.setVisible(true);
					}
					
					else {
						if (uname.equals("") || pass.equals("")) {
							JOptionPane.showMessageDialog(null, "Wrong Username or Password");
							userField.requestFocus();
						}
						else {
							pst = con.prepareStatement("select * from signup where Username = ? and Password = ?");
							pst.setString(1, uname);
							pst.setString(2, pass);
							ResultSet rs = pst.executeQuery();

							if (rs.next() == true) {
								name = rs.getString(1);
								dob = rs.getString(2);
								gen = rs.getString(3);
								mail = rs.getString(4);
								phn = rs.getString(5);
								cntry = rs.getString(6);
								cit = rs.getString(7);
								uname = rs.getString(8);
								pass = rs.getString(9);
								profilePicture = rs.getString(10);
								
								JOptionPane.showMessageDialog(null, "Logging in Successfully");
								dispose();
								com.alpha.userprofile.UserProfile p = new com.alpha.userprofile.UserProfile();
								p.setVisible(true);
							}
							else {
								JOptionPane.showMessageDialog(null, "Wrong Username or Password");
							}
						}
					}
				}
				catch (SQLException ex) {

				}
			}
		});
		btnLogin.setFont(new Font("Dialog", Font.BOLD, 24));
		btnLogin.setBounds(10, 353, 327, 43);
		loginPanel.add(btnLogin);
		
		lblNewLabel = new JLabel("New User?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel.setForeground(new Color(0, 153, 255));
		lblNewLabel.setBounds(79, 425, 68, 21);
		loginPanel.add(lblNewLabel);
		
		lblsignup = new JLabel("SignUp");
		lblsignup.setToolTipText("Click here to crate new account");
		lblsignup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblsignup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				com.alpha.login.SignUp s = new com.alpha.login.SignUp();
				s.setVisible(true);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblsignup.setForeground(Color.CYAN);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblsignup.setForeground(new Color(0, 153, 255));
			}
		});
		lblsignup.setHorizontalAlignment(SwingConstants.CENTER);
		lblsignup.setForeground(new Color(0, 153, 255));
		lblsignup.setFont(new Font("Dialog", Font.BOLD, 16));
		lblsignup.setBounds(154, 425, 57, 21);
		loginPanel.add(lblsignup);
		
		lblNewLabel_1 = new JLabel("Now");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 153, 255));
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(217, 425, 31, 21);
		loginPanel.add(lblNewLabel_1);
		
		panelPic = new JPanel();
		panelPic.setOpaque(false);
		panelPic.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(0, 51, 204)));
		panelPic.setBackground(Color.CYAN);
		panelPic.setBounds(0, 153, 644, 547);
		contentPane.add(panelPic);
		panelPic.setLayout(null);
		
		slideshow = new JLabel("");
		slideshow.setBounds(8, 9, 628, 529);
		panelPic.add(slideshow);
	}
}

package com.alpha.userprofile;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;

public class UserProfile extends JFrame {

	private JPanel contentPane;
	private JLabel lblImg;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserProfile frame = new UserProfile();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UserProfile(){
		initialize();
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
		
		lblImg = new JLabel("");
		lblImg.setBounds(21, 55, 169, 218);
		contentPane.add(lblImg);
	}
}

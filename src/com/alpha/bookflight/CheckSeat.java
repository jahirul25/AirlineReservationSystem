package com.alpha.bookflight;

import java.sql.SQLException;

public class CheckSeat {
	
	static String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14;
	static String b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
	static String c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14;
	static String d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14;
	static String e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14;
	static String f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14;
	static String g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14;
	static String h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12,h13,h14;
	static String f_no,f_name,From,To,dep,ret,time,type;

	public static void check() {
		try {
			com.alpha.bookflight.bookseat.connect();
			
			/*checking the seat via flight no, flight name, start, end, deprature, return, time*/
			f_name = com.alpha.bookflight.otherInformations.flight;
			f_no = com.alpha.bookflight.otherInformations.fl_serial;
			From = com.alpha.bookflight.otherInformations.from;
			To = com.alpha.bookflight.otherInformations.to;
			dep = com.alpha.bookflight.otherInformations.s_date;
			ret = com.alpha.bookflight.otherInformations.r_date;
			time = com.alpha.bookflight.otherInformations.takeof;
			
			/*checking the first row A*/
			a1 = com.alpha.bookflight.bookseat.btnA1.getText();
			a2 = com.alpha.bookflight.bookseat.btnA2.getText();
			a3 = com.alpha.bookflight.bookseat.btnA3.getText();
			a4 = com.alpha.bookflight.bookseat.btnA4.getText();
			a5 = com.alpha.bookflight.bookseat.btnA5.getText();
			a6 = com.alpha.bookflight.bookseat.btnA6.getText();
			a7 = com.alpha.bookflight.bookseat.btnA7.getText();
			a8 = com.alpha.bookflight.bookseat.btnA8.getText();
			a9 = com.alpha.bookflight.bookseat.btnA9.getText();
			a10 = com.alpha.bookflight.bookseat.btnA10.getText();
			a11 = com.alpha.bookflight.bookseat.btnA11.getText();
			a12 = com.alpha.bookflight.bookseat.btnA12.getText();
			a13 = com.alpha.bookflight.bookseat.btnA13.getText();
			a14 = com.alpha.bookflight.bookseat.btnA14.getText();
			
			/*checking the second row B*/
			b1 = com.alpha.bookflight.bookseat.btnB1.getText();
			b2 = com.alpha.bookflight.bookseat.btnB2.getText();
			b3 = com.alpha.bookflight.bookseat.btnB3.getText();
			b4 = com.alpha.bookflight.bookseat.btnB4.getText();
			b5 = com.alpha.bookflight.bookseat.btnB5.getText();
			b6 = com.alpha.bookflight.bookseat.btnB6.getText();
			b7 = com.alpha.bookflight.bookseat.btnB7.getText();
			b8 = com.alpha.bookflight.bookseat.btnB8.getText();
			b9 = com.alpha.bookflight.bookseat.btnB9.getText();
			b10 = com.alpha.bookflight.bookseat.btnB10.getText();
			b11 = com.alpha.bookflight.bookseat.btnB11.getText();
			b12 = com.alpha.bookflight.bookseat.btnB12.getText();
			b13 = com.alpha.bookflight.bookseat.btnB13.getText();
			b14 = com.alpha.bookflight.bookseat.btnB14.getText();
			
			/*checking the third row C*/
			c1 = com.alpha.bookflight.bookseat.btnC1.getText();
			c2 = com.alpha.bookflight.bookseat.btnC2.getText();
			c3 = com.alpha.bookflight.bookseat.btnC3.getText();
			c4 = com.alpha.bookflight.bookseat.btnC4.getText();
			c5 = com.alpha.bookflight.bookseat.btnC5.getText();
			c6 = com.alpha.bookflight.bookseat.btnC6.getText();
			c7 = com.alpha.bookflight.bookseat.btnC7.getText();
			c8 = com.alpha.bookflight.bookseat.btnC8.getText();
			c9 = com.alpha.bookflight.bookseat.btnC9.getText();
			c10 = com.alpha.bookflight.bookseat.btnC10.getText();
			c11 = com.alpha.bookflight.bookseat.btnC11.getText();
			c12 = com.alpha.bookflight.bookseat.btnC12.getText();
			c13 = com.alpha.bookflight.bookseat.btnC13.getText();
			c14 = com.alpha.bookflight.bookseat.btnC14.getText();
			
			/*checking the fourth row D*/
			d1 = com.alpha.bookflight.bookseat.btnD1.getText();
			d2 = com.alpha.bookflight.bookseat.btnD2.getText();
			d3 = com.alpha.bookflight.bookseat.btnD3.getText();
			d4 = com.alpha.bookflight.bookseat.btnD4.getText();
			d5 = com.alpha.bookflight.bookseat.btnD5.getText();
			d6 = com.alpha.bookflight.bookseat.btnD6.getText();
			d7 = com.alpha.bookflight.bookseat.btnD7.getText();
			d8 = com.alpha.bookflight.bookseat.btnD8.getText();
			d9 = com.alpha.bookflight.bookseat.btnD9.getText();
			d10 = com.alpha.bookflight.bookseat.btnD10.getText();
			d11 = com.alpha.bookflight.bookseat.btnD11.getText();
			d12 = com.alpha.bookflight.bookseat.btnD12.getText();
			d13 = com.alpha.bookflight.bookseat.btnD13.getText();
			d14 = com.alpha.bookflight.bookseat.btnD14.getText();
			
			/*checking the fifth row E*/
			e1 = com.alpha.bookflight.bookseat.btnE1.getText();
			e2 = com.alpha.bookflight.bookseat.btnE2.getText();
			e3 = com.alpha.bookflight.bookseat.btnE3.getText();
			e4 = com.alpha.bookflight.bookseat.btnE4.getText();
			e5 = com.alpha.bookflight.bookseat.btnE5.getText();
			e6 = com.alpha.bookflight.bookseat.btnE6.getText();
			e7 = com.alpha.bookflight.bookseat.btnE7.getText();
			e8 = com.alpha.bookflight.bookseat.btnE8.getText();
			e9 = com.alpha.bookflight.bookseat.btnE9.getText();
			e10 = com.alpha.bookflight.bookseat.btnE10.getText();
			e11 = com.alpha.bookflight.bookseat.btnE11.getText();
			e12 = com.alpha.bookflight.bookseat.btnE12.getText();
			e13 = com.alpha.bookflight.bookseat.btnE13.getText();
			e14 = com.alpha.bookflight.bookseat.btnE14.getText();
			
			/*checking the sixth row F*/
			f1 = com.alpha.bookflight.bookseat.btnF1.getText();
			f2 = com.alpha.bookflight.bookseat.btnF2.getText();
			f3 = com.alpha.bookflight.bookseat.btnF3.getText();
			f4 = com.alpha.bookflight.bookseat.btnF4.getText();
			f5 = com.alpha.bookflight.bookseat.btnF5.getText();
			f6 = com.alpha.bookflight.bookseat.btnF6.getText();
			f7 = com.alpha.bookflight.bookseat.btnF7.getText();
			f8 = com.alpha.bookflight.bookseat.btnF8.getText();
			f9 = com.alpha.bookflight.bookseat.btnF9.getText();
			f10 = com.alpha.bookflight.bookseat.btnF10.getText();
			f11 = com.alpha.bookflight.bookseat.btnF11.getText();
			f12 = com.alpha.bookflight.bookseat.btnF12.getText();
			f13 = com.alpha.bookflight.bookseat.btnF13.getText();
			f14 = com.alpha.bookflight.bookseat.btnF14.getText();
			
			/*checking the seventh row G*/
			g1 = com.alpha.bookflight.bookseat.btnG1.getText();
			g2 = com.alpha.bookflight.bookseat.btnG2.getText();
			g3 = com.alpha.bookflight.bookseat.btnG3.getText();
			g4 = com.alpha.bookflight.bookseat.btnG4.getText();
			g5 = com.alpha.bookflight.bookseat.btnG5.getText();
			g6 = com.alpha.bookflight.bookseat.btnG6.getText();
			g7 = com.alpha.bookflight.bookseat.btnG7.getText();
			g8 = com.alpha.bookflight.bookseat.btnG8.getText();
			g9 = com.alpha.bookflight.bookseat.btnG9.getText();
			g10 = com.alpha.bookflight.bookseat.btnG10.getText();
			g11 = com.alpha.bookflight.bookseat.btnG11.getText();
			g12 = com.alpha.bookflight.bookseat.btnG12.getText();
			g13 = com.alpha.bookflight.bookseat.btnG13.getText();
			g14 = com.alpha.bookflight.bookseat.btnG14.getText();
			
			/*checking the eighth row H*/
			h1 = com.alpha.bookflight.bookseat.btnH1.getText();
			h2 = com.alpha.bookflight.bookseat.btnH2.getText();
			h3 = com.alpha.bookflight.bookseat.btnH3.getText();
			h4 = com.alpha.bookflight.bookseat.btnH4.getText();
			h5 = com.alpha.bookflight.bookseat.btnH5.getText();
			h6 = com.alpha.bookflight.bookseat.btnH6.getText();
			h7 = com.alpha.bookflight.bookseat.btnH7.getText();
			h8 = com.alpha.bookflight.bookseat.btnH8.getText();
			h9 = com.alpha.bookflight.bookseat.btnH9.getText();
			h10 = com.alpha.bookflight.bookseat.btnH10.getText();
			h11 = com.alpha.bookflight.bookseat.btnH11.getText();
			h12 = com.alpha.bookflight.bookseat.btnH12.getText();
			h13 = com.alpha.bookflight.bookseat.btnH13.getText();
			h14 = com.alpha.bookflight.bookseat.btnH14.getText();
			
			/*Finish Checking the rows, Now check the seats from database*/

			//check seat A1
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, a1);
			com.alpha.bookflight.bookseat.rs1 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs1.next()) {
				com.alpha.bookflight.bookseat.btnA1.setEnabled(false);
			}
			//check seat A2
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, a2);
			com.alpha.bookflight.bookseat.rs2 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs2.next()) {
				com.alpha.bookflight.bookseat.btnA2.setEnabled(false);
			}
			//check seat A3
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, a3);
			com.alpha.bookflight.bookseat.rs3 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs3.next()) {
				com.alpha.bookflight.bookseat.btnA3.setEnabled(false);
			}
			//checking seat A4
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, a4);
			com.alpha.bookflight.bookseat.rs4 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs4.next()) {
				com.alpha.bookflight.bookseat.btnA4.setEnabled(false);
			}
			//checking seat A5
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, a5);
			com.alpha.bookflight.bookseat.rs5 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs5.next()) {
				com.alpha.bookflight.bookseat.btnA5.setEnabled(false);
			}
			//checking seat A6
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, a6);
			com.alpha.bookflight.bookseat.rs6 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs6.next()) {
				com.alpha.bookflight.bookseat.btnA6.setEnabled(false);
			}
			//checking seat A7
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, a7);
			com.alpha.bookflight.bookseat.rs7 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs7.next()) {
				com.alpha.bookflight.bookseat.btnA7.setEnabled(false);
			}
			//checking seat A8
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, a8);
			com.alpha.bookflight.bookseat.rs8 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs8.next()) {
				com.alpha.bookflight.bookseat.btnA8.setEnabled(false);
			}
			//checking seat A9
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, a9);
			com.alpha.bookflight.bookseat.rs9 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs9.next()) {
				com.alpha.bookflight.bookseat.btnA9.setEnabled(false);
			}
			//checking seat A10
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, a10);
			com.alpha.bookflight.bookseat.rs10 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs10.next()) {
				com.alpha.bookflight.bookseat.btnA10.setEnabled(false);
			}
			//checking seat A11
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, a11);
			com.alpha.bookflight.bookseat.rs11 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs11.next()) {
				com.alpha.bookflight.bookseat.btnA11.setEnabled(false);
			}
			//checking seat A12
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, a12);
			com.alpha.bookflight.bookseat.rs12 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs12.next()) {
				com.alpha.bookflight.bookseat.btnA12.setEnabled(false);
			}
			//checking seat A13
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, a13);
			com.alpha.bookflight.bookseat.rs13 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs13.next()) {
				com.alpha.bookflight.bookseat.btnA13.setEnabled(false);
			}
			//checking seat A14
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, a14);
			com.alpha.bookflight.bookseat.rs14 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs14.next()) {
				com.alpha.bookflight.bookseat.btnA14.setEnabled(false);
			}
			/*______________________________________________________________________________________*/
			
			//check seat B1
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, b1);
			com.alpha.bookflight.bookseat.rs15 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs15.next()) {
				com.alpha.bookflight.bookseat.btnB1.setEnabled(false);
			}
			//check seat B2
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, b2);
			com.alpha.bookflight.bookseat.rs16 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs16.next()) {
				com.alpha.bookflight.bookseat.btnB2.setEnabled(false);
			}
			//check seat B3
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, b3);
			com.alpha.bookflight.bookseat.rs17 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs17.next()) {
				com.alpha.bookflight.bookseat.btnB3.setEnabled(false);
			}
			//checking seat B4
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, b4);
			com.alpha.bookflight.bookseat.rs18 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs18.next()) {
				com.alpha.bookflight.bookseat.btnB4.setEnabled(false);
			}
			//checking seat B5
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, b5);
			com.alpha.bookflight.bookseat.rs19 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs19.next()) {
				com.alpha.bookflight.bookseat.btnB5.setEnabled(false);
			}
			//checking seat B6
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, b6);
			com.alpha.bookflight.bookseat.rs20 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs20.next()) {
				com.alpha.bookflight.bookseat.btnB6.setEnabled(false);
			}
			//checking seat B7
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, b7);
			com.alpha.bookflight.bookseat.rs21 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs21.next()) {
				com.alpha.bookflight.bookseat.btnB7.setEnabled(false);
			}
			//checking seat B8
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, b8);
			com.alpha.bookflight.bookseat.rs22 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs8.next()) {
				com.alpha.bookflight.bookseat.btnB8.setEnabled(false);
			}
			//checking seat B9
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, b9);
			com.alpha.bookflight.bookseat.rs23 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs23.next()) {
				com.alpha.bookflight.bookseat.btnB9.setEnabled(false);
			}
			//checking seat B10
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, b10);
			com.alpha.bookflight.bookseat.rs24 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs24.next()) {
				com.alpha.bookflight.bookseat.btnB10.setEnabled(false);
			}
			//checking seat B11
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, b11);
			com.alpha.bookflight.bookseat.rs25 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs25.next()) {
				com.alpha.bookflight.bookseat.btnB11.setEnabled(false);
			}
			//checking seat B12
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, b12);
			com.alpha.bookflight.bookseat.rs26 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs26.next()) {
				com.alpha.bookflight.bookseat.btnB12.setEnabled(false);
			}
			//checking seat B13
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, b13);
			com.alpha.bookflight.bookseat.rs27 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs27.next()) {
				com.alpha.bookflight.bookseat.btnB13.setEnabled(false);
			}
			//checking seat B14
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, b14);
			com.alpha.bookflight.bookseat.rs28 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs28.next()) {
				com.alpha.bookflight.bookseat.btnB14.setEnabled(false);
			}
			/*______________________________________________________________________________________*/
			
			//check seat C1
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, c1);
			com.alpha.bookflight.bookseat.rs29 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs29.next()) {
				com.alpha.bookflight.bookseat.btnC1.setEnabled(false);
			}
			//check seat C2
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, c2);
			com.alpha.bookflight.bookseat.rs30 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs30.next()) {
				com.alpha.bookflight.bookseat.btnC2.setEnabled(false);
			}
			//check seat C3
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, c3);
			com.alpha.bookflight.bookseat.rs31 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs31.next()) {
				com.alpha.bookflight.bookseat.btnC3.setEnabled(false);
			}
			//checking seat C4
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, c4);
			com.alpha.bookflight.bookseat.rs32 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs32.next()) {
				com.alpha.bookflight.bookseat.btnC4.setEnabled(false);
			}
			//checking seat C5
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, c5);
			com.alpha.bookflight.bookseat.rs33 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs33.next()) {
				com.alpha.bookflight.bookseat.btnC5.setEnabled(false);
			}
			//checking seat C6
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, c6);
			com.alpha.bookflight.bookseat.rs34 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs34.next()) {
				com.alpha.bookflight.bookseat.btnC6.setEnabled(false);
			}
			//checking seat C7
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, c7);
			com.alpha.bookflight.bookseat.rs35 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs35.next()) {
				com.alpha.bookflight.bookseat.btnC7.setEnabled(false);
			}
			//checking seat C8
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, c8);
			com.alpha.bookflight.bookseat.rs36 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs36.next()) {
				com.alpha.bookflight.bookseat.btnC8.setEnabled(false);
			}
			//checking seat C9
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, c9);
			com.alpha.bookflight.bookseat.rs37 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs37.next()) {
				com.alpha.bookflight.bookseat.btnC9.setEnabled(false);
			}
			//checking seat C10
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, c10);
			com.alpha.bookflight.bookseat.rs38 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs38.next()) {
				com.alpha.bookflight.bookseat.btnC10.setEnabled(false);
			}
			//checking seat C11
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, c11);
			com.alpha.bookflight.bookseat.rs39 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs39.next()) {
				com.alpha.bookflight.bookseat.btnC11.setEnabled(false);
			}
			//checking seat C12
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, c12);
			com.alpha.bookflight.bookseat.rs40 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs40.next()) {
				com.alpha.bookflight.bookseat.btnC12.setEnabled(false);
			}
			//checking seat C13
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, c13);
			com.alpha.bookflight.bookseat.rs41 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs41.next()) {
				com.alpha.bookflight.bookseat.btnC13.setEnabled(false);
			}
			//checking seat C14
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, c14);
			com.alpha.bookflight.bookseat.rs42 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs42.next()) {
				com.alpha.bookflight.bookseat.btnC14.setEnabled(false);
			}
			/*______________________________________________________________________________________*/
			
			//check seat D1
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, d1);
			com.alpha.bookflight.bookseat.rs43 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs43.next()) {
				com.alpha.bookflight.bookseat.btnD1.setEnabled(false);
			}
			//check seat D2
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, d2);
			com.alpha.bookflight.bookseat.rs44 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs44.next()) {
				com.alpha.bookflight.bookseat.btnD2.setEnabled(false);
			}
			//check seat D3
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, d3);
			com.alpha.bookflight.bookseat.rs45 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs45.next()) {
				com.alpha.bookflight.bookseat.btnD3.setEnabled(false);
			}
			//checking seat D4
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, d4);
			com.alpha.bookflight.bookseat.rs46 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs46.next()) {
				com.alpha.bookflight.bookseat.btnD4.setEnabled(false);
			}
			//checking seat D5
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, d5);
			com.alpha.bookflight.bookseat.rs47 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs47.next()) {
				com.alpha.bookflight.bookseat.btnD5.setEnabled(false);
			}
			//checking seat D6
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, d6);
			com.alpha.bookflight.bookseat.rs48 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs48.next()) {
				com.alpha.bookflight.bookseat.btnD6.setEnabled(false);
			}
			//checking seat D7
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, d7);
			com.alpha.bookflight.bookseat.rs49 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs49.next()) {
				com.alpha.bookflight.bookseat.btnD7.setEnabled(false);
			}
			//checking seat D8
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, d8);
			com.alpha.bookflight.bookseat.rs50 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs50.next()) {
				com.alpha.bookflight.bookseat.btnD8.setEnabled(false);
			}
			//checking seat D9
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, d9);
			com.alpha.bookflight.bookseat.rs51 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs51.next()) {
				com.alpha.bookflight.bookseat.btnD9.setEnabled(false);
			}
			//checking seat D10
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, d10);
			com.alpha.bookflight.bookseat.rs52 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs52.next()) {
				com.alpha.bookflight.bookseat.btnD10.setEnabled(false);
			}
			//checking seat D11
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, d11);
			com.alpha.bookflight.bookseat.rs53 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs53.next()) {
				com.alpha.bookflight.bookseat.btnD11.setEnabled(false);
			}
			//checking seat D12
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, d12);
			com.alpha.bookflight.bookseat.rs54 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs54.next()) {
				com.alpha.bookflight.bookseat.btnD12.setEnabled(false);
			}
			//checking seat D13
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, d13);
			com.alpha.bookflight.bookseat.rs55 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs55.next()) {
				com.alpha.bookflight.bookseat.btnA13.setEnabled(false);
			}
			//checking seat D14
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, d14);
			com.alpha.bookflight.bookseat.rs56 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs56.next()) {
				com.alpha.bookflight.bookseat.btnD14.setEnabled(false);
			}
			/*______________________________________________________________________________________*/
			
			//check seat E1
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, e1);
			com.alpha.bookflight.bookseat.rs57 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs57.next()) {
				com.alpha.bookflight.bookseat.btnE1.setEnabled(false);
			}
			//check seat E2
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, e2);
			com.alpha.bookflight.bookseat.rs58 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs58.next()) {
				com.alpha.bookflight.bookseat.btnE2.setEnabled(false);
			}
			//check seat E3
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, e3);
			com.alpha.bookflight.bookseat.rs59 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs59.next()) {
				com.alpha.bookflight.bookseat.btnE3.setEnabled(false);
			}
			//checking seat E4
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, e4);
			com.alpha.bookflight.bookseat.rs60 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs60.next()) {
				com.alpha.bookflight.bookseat.btnE4.setEnabled(false);
			}
			//checking seat E5
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, e5);
			com.alpha.bookflight.bookseat.rs61 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs61.next()) {
				com.alpha.bookflight.bookseat.btnE5.setEnabled(false);
			}
			//checking seat E6
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, e6);
			com.alpha.bookflight.bookseat.rs62 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs62.next()) {
				com.alpha.bookflight.bookseat.btnA6.setEnabled(false);
			}
			//checking seat E7
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, e7);
			com.alpha.bookflight.bookseat.rs63 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs63.next()) {
				com.alpha.bookflight.bookseat.btnE7.setEnabled(false);
			}
			//checking seat E8
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, e8);
			com.alpha.bookflight.bookseat.rs64 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs64.next()) {
				com.alpha.bookflight.bookseat.btnE8.setEnabled(false);
			}
			//checking seat E9
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, e9);
			com.alpha.bookflight.bookseat.rs65 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs65.next()) {
				com.alpha.bookflight.bookseat.btnE9.setEnabled(false);
			}
			//checking seat E10
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, e10);
			com.alpha.bookflight.bookseat.rs66 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs66.next()) {
				com.alpha.bookflight.bookseat.btnE10.setEnabled(false);
			}
			//checking seat E11
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, e11);
			com.alpha.bookflight.bookseat.rs67 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs67.next()) {
				com.alpha.bookflight.bookseat.btnE11.setEnabled(false);
			}
			//checking seat E12
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, e12);
			com.alpha.bookflight.bookseat.rs68 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs68.next()) {
				com.alpha.bookflight.bookseat.btnE12.setEnabled(false);
			}
			//checking seat E13
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, e13);
			com.alpha.bookflight.bookseat.rs69 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs69.next()) {
				com.alpha.bookflight.bookseat.btnE13.setEnabled(false);
			}
			//checking seat E14
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, e14);
			com.alpha.bookflight.bookseat.rs70 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs70.next()) {
				com.alpha.bookflight.bookseat.btnE14.setEnabled(false);
			}
			/*______________________________________________________________________________________*/
			
			//check seat F1
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, f1);
			com.alpha.bookflight.bookseat.rs71 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs71.next()) {
				com.alpha.bookflight.bookseat.btnF1.setEnabled(false);
			}
			//check seat F2
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, f2);
			com.alpha.bookflight.bookseat.rs72 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs72.next()) {
				com.alpha.bookflight.bookseat.btnF2.setEnabled(false);
			}
			//check seat F3
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, f3);
			com.alpha.bookflight.bookseat.rs73 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs73.next()) {
				com.alpha.bookflight.bookseat.btnF3.setEnabled(false);
			}
			//checking seat F4
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, f4);
			com.alpha.bookflight.bookseat.rs74 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs74.next()) {
				com.alpha.bookflight.bookseat.btnF4.setEnabled(false);
			}
			//checking seat F5
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, f5);
			com.alpha.bookflight.bookseat.rs75 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs75.next()) {
				com.alpha.bookflight.bookseat.btnF5.setEnabled(false);
			}
			//checking seat F6
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, f6);
			com.alpha.bookflight.bookseat.rs76 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs76.next()) {
				com.alpha.bookflight.bookseat.btnF6.setEnabled(false);
			}
			//checking seat F7
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, f7);
			com.alpha.bookflight.bookseat.rs77 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs77.next()) {
				com.alpha.bookflight.bookseat.btnF7.setEnabled(false);
			}
			//checking seat F8
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, f8);
			com.alpha.bookflight.bookseat.rs78 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs78.next()) {
				com.alpha.bookflight.bookseat.btnF8.setEnabled(false);
			}
			//checking seat F9
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, f9);
			com.alpha.bookflight.bookseat.rs79 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs79.next()) {
				com.alpha.bookflight.bookseat.btnF9.setEnabled(false);
			}
			//checking seat F10
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, f10);
			com.alpha.bookflight.bookseat.rs80 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs80.next()) {
				com.alpha.bookflight.bookseat.btnF10.setEnabled(false);
			}
			//checking seat F11
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, f11);
			com.alpha.bookflight.bookseat.rs81 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs81.next()) {
				com.alpha.bookflight.bookseat.btnF11.setEnabled(false);
			}
			//checking seat F12
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, f12);
			com.alpha.bookflight.bookseat.rs82 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs82.next()) {
				com.alpha.bookflight.bookseat.btnF12.setEnabled(false);
			}
			//checking seat F13
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, f13);
			com.alpha.bookflight.bookseat.rs83 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs83.next()) {
				com.alpha.bookflight.bookseat.btnF13.setEnabled(false);
			}
			//checking seat F14
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, f14);
			com.alpha.bookflight.bookseat.rs84 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs84.next()) {
				com.alpha.bookflight.bookseat.btnF14.setEnabled(false);
			}
			/*______________________________________________________________________________________*/
			
			//check seat G1
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, g1);
			com.alpha.bookflight.bookseat.rs85 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs85.next()) {
				com.alpha.bookflight.bookseat.btnG1.setEnabled(false);
			}
			//check seat G2
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, g2);
			com.alpha.bookflight.bookseat.rs86 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs86.next()) {
				com.alpha.bookflight.bookseat.btnG2.setEnabled(false);
			}
			//check seat G3
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, g3);
			com.alpha.bookflight.bookseat.rs87 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs87.next()) {
				com.alpha.bookflight.bookseat.btnG3.setEnabled(false);
			}
			//checking seat G4
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, g4);
			com.alpha.bookflight.bookseat.rs88 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs88.next()) {
				com.alpha.bookflight.bookseat.btnG4.setEnabled(false);
			}
			//checking seat G5
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, g5);
			com.alpha.bookflight.bookseat.rs89 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs89.next()) {
				com.alpha.bookflight.bookseat.btnG5.setEnabled(false);
			}
			//checking seat G6
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, g6);
			com.alpha.bookflight.bookseat.rs90 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs90.next()) {
				com.alpha.bookflight.bookseat.btnG6.setEnabled(false);
			}
			//checking seat G7
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, g7);
			com.alpha.bookflight.bookseat.rs91 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs91.next()) {
				com.alpha.bookflight.bookseat.btnG7.setEnabled(false);
			}
			//checking seat G8
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, g8);
			com.alpha.bookflight.bookseat.rs92 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs92.next()) {
				com.alpha.bookflight.bookseat.btnG8.setEnabled(false);
			}
			//checking seat G9
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, g9);
			com.alpha.bookflight.bookseat.rs93 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs93.next()) {
				com.alpha.bookflight.bookseat.btnG9.setEnabled(false);
			}
			//checking seat G10
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, g10);
			com.alpha.bookflight.bookseat.rs94 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs94.next()) {
				com.alpha.bookflight.bookseat.btnG10.setEnabled(false);
			}
			//checking seat G11
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, g11);
			com.alpha.bookflight.bookseat.rs95 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs95.next()) {
				com.alpha.bookflight.bookseat.btnG11.setEnabled(false);
			}
			//checking seat G12
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, g12);
			com.alpha.bookflight.bookseat.rs96 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs96.next()) {
				com.alpha.bookflight.bookseat.btnG12.setEnabled(false);
			}
			//checking seat G13
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, g13);
			com.alpha.bookflight.bookseat.rs97 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs97.next()) {
				com.alpha.bookflight.bookseat.btnG13.setEnabled(false);
			}
			//checking seat G14
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, g14);
			com.alpha.bookflight.bookseat.rs98 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs98.next()) {
				com.alpha.bookflight.bookseat.btnG14.setEnabled(false);
			}
			/*______________________________________________________________________________________*/
			
			//check seat H1
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, h1);
			com.alpha.bookflight.bookseat.rs99 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs99.next()) {
				com.alpha.bookflight.bookseat.btnH1.setEnabled(false);
			}
			//check seat H2
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, h2);
			com.alpha.bookflight.bookseat.rs100 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs100.next()) {
				com.alpha.bookflight.bookseat.btnH2.setEnabled(false);
			}
			//check seat H3
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, h3);
			com.alpha.bookflight.bookseat.rs101 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs101.next()) {
				com.alpha.bookflight.bookseat.btnH3.setEnabled(false);
			}
			//checking seat H4
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, h4);
			com.alpha.bookflight.bookseat.rs102 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs102.next()) {
				com.alpha.bookflight.bookseat.btnH4.setEnabled(false);
			}
			//checking seat H5
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, h5);
			com.alpha.bookflight.bookseat.rs103 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs103.next()) {
				com.alpha.bookflight.bookseat.btnH5.setEnabled(false);
			}
			//checking seat H6
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, h6);
			com.alpha.bookflight.bookseat.rs104 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs104.next()) {
				com.alpha.bookflight.bookseat.btnH6.setEnabled(false);
			}
			//checking seat H7
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, h7);
			com.alpha.bookflight.bookseat.rs105 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs105.next()) {
				com.alpha.bookflight.bookseat.btnH7.setEnabled(false);
			}
			//checking seat H8
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, h8);
			com.alpha.bookflight.bookseat.rs106 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs106.next()) {
				com.alpha.bookflight.bookseat.btnH8.setEnabled(false);
			}
			//checking seat H9
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, h9);
			com.alpha.bookflight.bookseat.rs107 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs107.next()) {
				com.alpha.bookflight.bookseat.btnH9.setEnabled(false);
			}
			//checking seat H10
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, h10);
			com.alpha.bookflight.bookseat.rs108 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs108.next()) {
				com.alpha.bookflight.bookseat.btnH10.setEnabled(false);
			}
			//checking seat H11
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, h11);
			com.alpha.bookflight.bookseat.rs109 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs109.next()) {
				com.alpha.bookflight.bookseat.btnH11.setEnabled(false);
			}
			//checking seat H12
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, h12);
			com.alpha.bookflight.bookseat.rs110 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs110.next()) {
				com.alpha.bookflight.bookseat.btnH12.setEnabled(false);
			}
			//checking seat H13
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, h13);
			com.alpha.bookflight.bookseat.rs111 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs111.next()) {
				com.alpha.bookflight.bookseat.btnH13.setEnabled(false);
			}
			//checking seat H14
			com.alpha.bookflight.bookseat.pst = com.alpha.bookflight.bookseat.con.prepareStatement("select Seats from ticket_booking where Flight_Name = ? and Serial_No = ? and TakeOf = ? and Starting_Date = ? and Return_Date = ? and Starting_From = ? and Destination = ? and Trip = ? and Seats =  ?");
			com.alpha.bookflight.bookseat.pst.setString(1, f_name);
			com.alpha.bookflight.bookseat.pst.setString(2, f_no);
			com.alpha.bookflight.bookseat.pst.setString(3, time);
			com.alpha.bookflight.bookseat.pst.setString(4, dep);
			com.alpha.bookflight.bookseat.pst.setString(5, ret);
			com.alpha.bookflight.bookseat.pst.setString(6, From);
			com.alpha.bookflight.bookseat.pst.setString(7, To);
			com.alpha.bookflight.bookseat.pst.setString(8, type);
			com.alpha.bookflight.bookseat.pst.setString(9, h14);
			com.alpha.bookflight.bookseat.rs112 = com.alpha.bookflight.bookseat.pst.executeQuery();
			
			if (com.alpha.bookflight.bookseat.rs112.next()) {
				com.alpha.bookflight.bookseat.btnH14.setEnabled(false);
			}
			/*______________________________________________________________________________________*/
			}

		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

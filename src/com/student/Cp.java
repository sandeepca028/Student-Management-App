package com.student;

import java.sql.*;

public class Cp {
	//new
	static Connection con;
	
	public static Connection createC() {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");	
			
			//create the connection
			String user = "root";
			String password = "Garima@1128";
			String url = "jdbc:mysql://localhost:3306/student";
			
			con = DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}

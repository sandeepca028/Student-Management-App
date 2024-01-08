package com.student;

import java.sql.*;

public class StudentDao {
	
	public static boolean insertStudentToDB(Student st) {
		
		boolean f = false;
		
		try {
			
			Connection con = Cp.createC();
			String q = "insert into students(sname, sphone, scity) values(? ,? ,?)";
			
			//prepared statement
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//set the values of parameters
			
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			pstmt.executeUpdate();	
			
			f = true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}

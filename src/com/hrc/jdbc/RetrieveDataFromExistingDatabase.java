package com.hrc.jdbc;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class RetrieveDataFromExistingDatabase {

	public static void main(String[] args) {
		Connection dbcon=null;
		PreparedStatement pstmt=null;
		ResultSet result = null;
		
		String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
		String username="root";
		String password="root";
		
		String query = "Select * from student";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbcon=(Connection) DriverManager.getConnection(url,username,password);
			pstmt = (PreparedStatement) dbcon.prepareStatement(query);
			
			result = pstmt.executeQuery();
			while(result.next()) {
				System.out.println(result.getString(2));
			}
			
			result.close();
			pstmt.close();
			dbcon.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}



}

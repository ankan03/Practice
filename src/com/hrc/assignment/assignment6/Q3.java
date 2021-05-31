// 3.Write a program to print the records in Descending Order using JDBC.
package com.hrc.assignment.assignment6;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Q3 {
	public static void main(String[] args) {
		Connection dbcon=null;
		PreparedStatement pstmt=null;
		ResultSet result = null;
		
		String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
		String username="root";
		String password="root";
		
		String query = "SELECT * FROM account_details ORDER BY account_id DESC;";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbcon=(Connection) DriverManager.getConnection(url,username,password);
			pstmt = (PreparedStatement) dbcon.prepareStatement(query);
			
			result = pstmt.executeQuery();
			while(result.next()) {
				System.out.println("account_id: "+result.getString(1)+"\taccount_name: "+result.getString(2)+"\tdocument_number: "+result.getString(3));
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

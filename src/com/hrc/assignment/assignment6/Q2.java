//2.Write a program which searches a record in a table using JDBC.
package com.hrc.assignment.assignment6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Q2 {
	public static void main(String[] args) throws IOException {
		Connection dbcon=null;
		PreparedStatement pstmt=null;
		ResultSet result = null;
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter account_id: ");
		String accountId = bufferedReader.readLine();
		
		String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
		String username="root";
		String password="root";
		
		String query = "SELECT * FROM account_details WHERE account_id = ?";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbcon=(Connection) DriverManager.getConnection(url,username,password);
			pstmt = (PreparedStatement) dbcon.prepareStatement(query);
			
			pstmt.setString(1,accountId);
			result = pstmt.executeQuery();
			
			if (result!=null) {
				while(result.next()) {
					System.out.println("account_id: "+result.getString(1)+" account_name: "+result.getString(2)+" document_number: "+result.getString(3));
				}
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

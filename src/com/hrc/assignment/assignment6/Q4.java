//4.Write a program that delete a particular record from the table using JDBC
package com.hrc.assignment.assignment6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Q4 {
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
		
		String query = "DELETE FROM account_details WHERE account_id = ?";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbcon=(Connection) DriverManager.getConnection(url,username,password);
			pstmt = (PreparedStatement) dbcon.prepareStatement(query);
			
			pstmt.setString(1,accountId);
			int status = pstmt.executeUpdate();
			if(status>0)
				System.out.println("Successfully deleted: ");
			else
				System.out.println("This account_id doesn't exist");
			
//			result.close();
			pstmt.close();
			dbcon.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

package com.hrc.jdbc;

import java.sql.*;
public class InsertingData {
	public static void main(String[] args) {
		Connection dbcon=null;
		Statement stmt=null;
		
		String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
		String username="root";
		String password="root";
		
		String query1 = "INSERT INTO account_details VALUES(90011,'ABC','70CA89')";
		String query2 = "INSERT INTO account_details VALUES(90011,'ABC','70CA99')";
		String query3 = "INSERT INTO account_details VALUES(90013,'ACCESS','800EU')";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbcon=DriverManager.getConnection(url,username,password);

			stmt = dbcon.createStatement();
			stmt.addBatch(query1);
			stmt.addBatch(query2);
			stmt.addBatch(query3);
			
			int i[]=stmt.executeBatch();
			if(i!=null)
				System.out.println("Batch executed");
			else				
				System.out.println("Batch execution fail");
			
			stmt.close();
			dbcon.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

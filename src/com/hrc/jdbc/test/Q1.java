package com.hrc.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q1 {
	public static void main(String[] args) {
		Connection dbcon=null;
		Statement stmt=null;
		PreparedStatement preparedStatement1 = null;
		
		ResultSet result = null;
		

		String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
		String username="root";
		String password="root";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbcon=DriverManager.getConnection(url,username,password);
			
			
			String sql1 = "CREATE TABLE student2 (s_roll INT , s_name VARCHAR(255));";
			
			String query1 = "INSERT INTO student2 VALUES(1,'Ankan')";
			String query2 = "INSERT INTO student2 VALUES(2,'Mukherjee')";
			String query3 = "INSERT INTO student2 VALUES(3,'Abhishek')";
			String query4 = "INSERT INTO student2 VALUES(4,'Raj')";
			String query5 = "INSERT INTO student2 VALUES(5,'Anubhav')";
			
			
			
			
			
			preparedStatement1 = dbcon.prepareStatement(sql1);
			preparedStatement1.executeUpdate(sql1);
			preparedStatement1.close();
			
			stmt = dbcon.createStatement();
			stmt.addBatch(query1);
			stmt.addBatch(query2);
			stmt.addBatch(query3);
			stmt.addBatch(query4);
			stmt.addBatch(query5);
			
			int i[]=stmt.executeBatch();
			if(i!=null)
				System.out.println("Batch executed and successfully inserted");
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


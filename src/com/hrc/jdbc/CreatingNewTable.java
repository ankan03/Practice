package com.hrc.jdbc;

import java.sql.*;

public class CreatingNewTable {

	public static void main(String[] args) {
		Connection dbcon=null;
		Statement stmt=null;
		ResultSet result = null;

		String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
		String username="root";
		String password="root";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbcon=DriverManager.getConnection(url,username,password);
			stmt = dbcon.createStatement();

			String sql = "CREATE TABLE account_details " +
					"(account_id INTEGER not NULL, " +
					" account_name VARCHAR(255), " + 
					" document_number VARCHAR(255)); "; 

			stmt.executeUpdate(sql);
			System.out.println("Table created.");
			stmt.close();
			dbcon.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

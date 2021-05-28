package com.hrc.jdbc;

import java.sql.*;

public class UpdatingData {
	public static void main(String[] args) {
		Connection dbcon=null;
		PreparedStatement pstmt=null;

		String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
		String username="root";
		String password="root";

		String query = "Update account_details set account_name = ? where account_id = ?";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbcon=DriverManager.getConnection(url,username,password);
			pstmt = dbcon.prepareStatement(query);

			pstmt.setString(1,"ABCEU");
			pstmt.setString(2,"90011");

			pstmt.executeUpdate();
			System.out.println("Update successful");

			pstmt.close();
			dbcon.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

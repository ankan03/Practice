//1.Write a program to insert 10 more items in the account_details table using JDBC.

package com.hrc.assignment.assignment6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Q1 {
	public static void main(String[] args) {
		Connection dbcon=null;
		Statement stmt=null;
		
		String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
		String username="root";
		String password="root";
		
		String query1 = "INSERT INTO account_details VALUES(90014,'Ankan','70CA90')";
		String query2 = "INSERT INTO account_details VALUES(90015,'Mukherjee','70CA91')";
		String query3 = "INSERT INTO account_details VALUES(90016,'Qwert','8001EU')";
		String query4 = "INSERT INTO account_details VALUES(90017,'Poiuy','70CA92')";
		String query5 = "INSERT INTO account_details VALUES(90018,'Asdfg','70CA93')";
		String query6 = "INSERT INTO account_details VALUES(90019,'Lkjh','8002EU')";
		String query7 = "INSERT INTO account_details VALUES(90020,'Zxcv','70CA94')";
		String query8 = "INSERT INTO account_details VALUES(90021,'Mnb','70CA95')";
		String query9 = "INSERT INTO account_details VALUES(90022,'Qaz','8003EU')";
		String query10 = "INSERT INTO account_details VALUES(90023,'Wsx','70CA96')";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbcon=DriverManager.getConnection(url,username,password);

			stmt = dbcon.createStatement();
			stmt.addBatch(query1);
			stmt.addBatch(query2);
			stmt.addBatch(query3);
			stmt.addBatch(query4);
			stmt.addBatch(query5);
			stmt.addBatch(query6);
			stmt.addBatch(query7);
			stmt.addBatch(query8);
			stmt.addBatch(query9);
			stmt.addBatch(query10);
			
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

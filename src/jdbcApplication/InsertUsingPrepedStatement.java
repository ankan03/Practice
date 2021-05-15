package jdbcApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertUsingPrepedStatement {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/demo";
	// Database credentials
	static final String USER = "root";
	static final String PASS = "root";
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
		Connection conn=null;
		PreparedStatement preparedStmt = null;
		
	    String userName = "Abhishek1";
	    int userId = 7;
	    String sql = "INSERT INTO student VALUES (?,?)";
	    
		try {
			  Class.forName(JDBC_DRIVER);
			  conn = DriverManager.getConnection(DB_URL,USER,PASS);
		      preparedStmt = conn.prepareStatement(sql);
		      		      
		      preparedStmt.setInt(1, userId);
		      preparedStmt.setString(2, userName);
		      
		      int count = preparedStmt.executeUpdate();
		      System.out.println(count+" Row affected");
		      
		      conn.close();
		      preparedStmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

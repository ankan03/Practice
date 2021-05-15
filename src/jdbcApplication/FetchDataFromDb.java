package jdbcApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchDataFromDb {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/demo";
	// Database credentials
	static final String USER = "root";
	static final String PASS = "root";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
	    Statement stmt = null;
		
	    try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);
		      stmt = conn.createStatement();
		      String sql = "SELECT * FROM student";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		      String data = "";
		      
		      while (rs.next()) {
		    	  data = "userId: "+rs.getString(1)+"\tuserName: "+rs.getString(2)+"\n";
		    	  System.out.println(data);
			}
		      
		      conn.close();
		      stmt.close();
		      
		      
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

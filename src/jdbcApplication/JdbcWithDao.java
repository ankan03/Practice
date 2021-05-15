package jdbcApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class JdbcWithDao {

	public static void main(String[] args) {
		
		Dao dao = new Dao();
		dao.connection();
		
		//Display student
		Student s = dao.getName(8);
		System.out.println(s.userName);
		
		//Add student
//		Student s1 = new Student();
//		s1.userId = 8;
//		s1.userName = "Abhedya";
//		dao.addStudent(s1);
		
		
		
		
	}

}

class Dao{
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/demo";
	// Database credentials
	static final String USER = "root";
	static final String PASS = "root";
	
	Connection conn;
	public void connection() {
		try {
			 Class.forName(JDBC_DRIVER);
			 conn = DriverManager.getConnection(DB_URL,USER,PASS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}
	
	public Student getName(int id) {
		
		Student student = new Student();
		student.userId = id;
		String sql = "SELECT * FROM student WHERE userId="+id;
		
		try {
		      Statement stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery(sql);
		      
		      rs.next();
		      String name = rs.getString(2);
		      student.userName = name;
		      
		      return student;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;  
	}
	
	public void addStudent(Student s) {
		String sql = "INSERT INTO student VALUES (?,?)";
		try {
			  PreparedStatement preparedStmt = conn.prepareStatement(sql);
		      preparedStmt.setInt(1, s.userId);
		      preparedStmt.setString(2, s.userName);
		      
		      int count = preparedStmt.executeUpdate();
		      System.out.println(count+" Row affected");
		      
		      conn.close();
		      preparedStmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
class Student{
	int userId;
	String userName;
}
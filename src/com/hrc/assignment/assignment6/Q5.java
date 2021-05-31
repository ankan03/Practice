package com.hrc.assignment.assignment6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.*;

public class Q5 {
	public static void main(String[] args) {
		Connection dbcon=null;
		PreparedStatement preparedStatement1 = null;
		PreparedStatement preparedStatement2 = null;
		PreparedStatement preparedStatement3 = null;
		PreparedStatement preparedStatement4 = null;
		PreparedStatement preparedStatement5 = null;
		ResultSet result = null;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		List<Student> studentList = new ArrayList<Student>();

		String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
		String username="root";
		String password="root";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbcon=DriverManager.getConnection(url,username,password);
			
			
			String sql1 = "CREATE TABLE student1 "
					+ "(student_roll INT , "
					+ "student_name VARCHAR(255) ,"
					+ "admission_date VARCHAR(255));";
			
			
			String sql2 = "INSERT INTO student1 VALUES(?,?,?);";
			String sql3 = "SELECT * FROM student1";
			String sql4 = "ALTER TABLE student1 ADD student_ID VARCHAR(255)";
			String sql5 = "UPDATE student1 SET student_ID = ? WHERE student_roll = ?";
			
			
			preparedStatement1 = dbcon.prepareStatement(sql1);
			preparedStatement2 = dbcon.prepareStatement(sql2);
			preparedStatement3 = dbcon.prepareStatement(sql3);
			preparedStatement4 = dbcon.prepareStatement(sql4);
			preparedStatement5 = dbcon.prepareStatement(sql5);
			
			preparedStatement1.executeUpdate(sql1);
			preparedStatement1.close();
			
			System.out.println("Table created Enter how many entry you want to insert");
			int n = Integer.parseInt(bufferedReader.readLine());
			for (int i = 0; i < n; i++) {
				System.out.println("Enter roll for student-"+(i+1));
				int roll = Integer.parseInt(bufferedReader.readLine());
				
				System.out.println("Enter name for student-"+(i+1));
				String name = bufferedReader.readLine();
				
				System.out.println("Enter admission_date for student-"+(i+1));
				String admissionDate = bufferedReader.readLine();
				
				preparedStatement2.setInt(1, roll);
				preparedStatement2.setString(2, name);
				preparedStatement2.setString(3, admissionDate);
				
				preparedStatement2.addBatch();
				preparedStatement2.executeBatch();
				
			}
			System.out.println("Successfully inserted");
			preparedStatement2.close();
			
			
			
			result = preparedStatement3.executeQuery();
			while (result.next()) {
				studentList.add(new Student(result.getInt(1), result.getString(2), result.getString(3)));
			}
			preparedStatement3.close();
		
			
			preparedStatement4.executeUpdate();
			preparedStatement4.close();
			
			for (int i = 0; i < studentList.size(); i++) {
				preparedStatement5.setString(1,getStudentId(studentList.get(i).admissionDate,studentList.get(i).roll));
				preparedStatement5.setInt(2, studentList.get(i).roll);
				preparedStatement5.execute();
			}
			System.out.println("Successfully altered");
			preparedStatement5.close();
			
			
			dbcon.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static String getStudentId(String date,int roll) {
		
		String temp[] = date.split("-");
		String outputString = "";
		for (int i =0 ; i <temp.length; i++) {
			outputString +=temp[i];
		}
		outputString +=roll;
		
		return outputString;
	}
}

class Student{
	int roll;
	String name;
	String admissionDate;
	
	public Student(int roll, String name, String admissionDate) {
		super();
		this.roll = roll;
		this.name = name;
		this.admissionDate = admissionDate;
	}
}

package com.hrc.jdbc.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) throws FileNotFoundException {
        File file = new File(System.getProperty("user.dir") + "\\src\\com\\hrc\\jdbc\\test\\StudentInput.txt");
        Scanner hemp = new Scanner(file);
        hemp.nextLine();
        List<Student> studentList = new ArrayList<Student>();
        while (hemp.hasNextLine()) {
        	String s1[] = hemp.nextLine().split(",");
        	studentList.add(new Student(Integer.parseInt(s1[0]), s1[1], Double.parseDouble(s1[2]), Double.parseDouble(s1[3]), Double.parseDouble(s1[4]), (Double.parseDouble(s1[2])+Double.parseDouble(s1[3])+Double.parseDouble(s1[4])), (Double.parseDouble(s1[2])+Double.parseDouble(s1[3])+Double.parseDouble(s1[4]))/3));
        }
        
        for (Student student : studentList) {
			System.out.println(student);
		}
        
        

        Connection dbcon=null;
		PreparedStatement preparedStatement1 = null;
		String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
		String username="root";
		String password="root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbcon=DriverManager.getConnection(url,username,password);
			String sql1 = "INSERT INTO student_table (student_id, student_name, student_total_marks, student_avg) VALUES (?, ?, ?, ?)";
			preparedStatement1 = dbcon.prepareStatement(sql1);
			
			for (Student student : studentList) {
				preparedStatement1.setInt(1, student.getStudentId());
				preparedStatement1.setString(2, student.getStudentName());
				preparedStatement1.setString(3,String.valueOf(student.getTotalMarks()));
				preparedStatement1.setString(4,String.valueOf(student.getAvgMarks()));
				
				preparedStatement1.addBatch();
				preparedStatement1.executeBatch();
			}
			
			System.out.println("Successfully inserted");
			preparedStatement1.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}  
    }
}
//STUDENT_ID,STUDENT_NAME,MARKS1,MARKS2,MARKS3
class Student{
	int studentId;
	String studentName;
	double mark1;
	double mark2;
	double mark3;
	double totalMarks;
	double avgMarks;
	
	

	public Student(int studentId, String studentName, double mark1, double mark2, double mark3, double totalMarks,
			double avgMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.totalMarks = totalMarks;
		this.avgMarks = avgMarks;
	}



	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public double getMark1() {
		return mark1;
	}



	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}



	public double getMark2() {
		return mark2;
	}



	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}



	public double getMark3() {
		return mark3;
	}



	public void setMark3(double mark3) {
		this.mark3 = mark3;
	}



	public double getTotalMarks() {
		return totalMarks;
	}



	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}



	public double getAvgMarks() {
		return avgMarks;
	}



	public void setAvgMarks(double avgMarks) {
		this.avgMarks = avgMarks;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", mark1=" + mark1 + ", mark2="
				+ mark2 + ", mark3=" + mark3 + ", totalMarks=" + totalMarks + ", avgMarks=" + avgMarks + "]";
	}



	
	
	
}

package com.springorm.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This is used for Spring Jdbc Configuration WITH XML
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/introduction/config.xml");
		StudentDao dao = context.getBean("studentDao",StudentDao.class);
//		
//		Student student = new Student(1, "Ankan", "Chinsurah");
//		dao.insert(student);
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		
			while (flag) {
				try {
				System.out.println("\n\nPress 1 for insert a Student");
				System.out.println("Press 2 for display all Students");
				System.out.println("Press 3 for getting details of a single Student");
				System.out.println("Press 4 for delete a Student");
				System.out.println("Press 5 for update a Student");
				System.out.println("Press 6 for exit from this program\n");
				int choice = Integer.parseInt(bufferedReader.readLine());
				
				switch (choice) {
				case 1:
					System.out.println("Enter Student Id");
					int id = Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter Student Name");
					String name = bufferedReader.readLine();
					System.out.println("Enter City");
					String city = bufferedReader.readLine();
					dao.insert(new Student(id,name,city));
					System.out.println("Successfully Inserted");
					break;
				case 2:
					List<Student> students = dao.getAllStudents();
					for (Student student : students) {
						System.out.println(student);
					}
					break;
				case 3:
					System.out.println("Enter Student Id");
					int sId = Integer.parseInt(bufferedReader.readLine());
					Student student = dao.getStudent(sId);
					System.out.println(student);
					break;
				case 4:
					System.out.println("Enter student Id");
					int id1 = Integer.parseInt(bufferedReader.readLine());
					dao.deleteStudent(id1);
					System.out.println("Successfully Deleted");
					break;
				case 5:
					System.out.println("Enter Student Id");
					int id2 = Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter Student Name");
					String name2 = bufferedReader.readLine();
					System.out.println("Enter City");
					String city2 = bufferedReader.readLine();
					dao.updateStudent(new Student(id2, name2, city2));
					System.out.println("Updated Successfully");
					break;
				case 6:
					flag=false;
					System.out.println("Thank you for using This Application");
					break;
				default:
					System.out.println("Wrong choice");
					break;
				}
			} catch (NumberFormatException e) {
					System.out.println("Incorrect input");
			} catch (IOException e) {
					System.out.println("Exception found during Input/Output Operation");
			} catch (Exception e) {
					System.out.println("Exception Found\n"+e.getMessage());
			}
		}
	}
}

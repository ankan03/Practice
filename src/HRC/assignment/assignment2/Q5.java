//Consider a class Employee with the following private variables:
//int employeeId
//String name
//String gender
//String city
//Initialize the values using the constructor and display the details separated by comma.
// While displaying the details,use the Employee object like System.out.println(employeeObject) [override toString()].
//
//Sample Input:
//Enter employeeId
//100
//Enter name
//Sudha
//Enter the gender:
//Female
//Enter the city:
//BBSR
//Sample Output1:
//employeeId:100,name:Sudha,gender:Female,city:BBSR

package HRC.assignment.assignment2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        int employeeId;
        String name,gender,city;

        //Taking input through scanner class
        System.out.println("\n----------------------Taking input through Scanner class----------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employeeId");
        employeeId = scanner.nextInt();
        String s = scanner.nextLine();

        System.out.println("Enter name");
        name = scanner.nextLine();

        System.out.println("Enter gender");
        gender = scanner.nextLine();

        System.out.println("Enter city");
        city = scanner.nextLine();

        Employee1 employee1 = new Employee1(employeeId,name,gender,city);
        System.out.println(employee1.toString());

        System.out.println("\n\n----------------------Taking input through BufferedReader----------------------");
        //Taking input through BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter employeeId");
            employeeId = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Enter name");
            name = bufferedReader.readLine();

            System.out.println("Enter gender");
            gender = bufferedReader.readLine();

            System.out.println("Enter city");
            city = bufferedReader.readLine();

            Employee1 employee2 = new Employee1(employeeId,name,gender,city);
            System.out.println(employee2.toString());


        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }
}

class Employee1{
    int employeeId;
    String name;
    String gender;
    String city;

    public Employee1(int employeeId, String name, String gender, String city) {
        this.employeeId = employeeId;
        this.name = name;
        this.gender = gender;
        this.city = city;
    }

    @Override
    public String toString() {
        return  "employeeId:" + employeeId +
                ", name:" + name  +
                ", gender:" + gender +
                ", city:" + city ;
    }
}

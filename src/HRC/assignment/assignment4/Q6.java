//Create 10 objects for Employee class.
// Employee has {name(string),empId(integer),city(string),contact(string),salary(double),designation(string)}.
//Create enum Designation{MANAGER,DEVELOPER,INTERN}.
//Input the data using BufferedReader and assign designation within the code using enum Designation(randomly).
// Write the data to the file using BufferedWriter.
//The data in file should be comma separated.
//Eg
//empId,name,city,contact,salary,designation
//123,Ravi,Hyderabad,998899899,50000.00,DEVELOPER
//163,Mohan,Kolkata,9982344899,15000.00,INTERN
//125,Ankan,Chinsurah,6666666666,555555.50,DEVELOPER
//150,Abhishek,Patna,9999999999,666666.00,DEVELOPER
//
//...so on.
//
//Create another class that reads the file and creates a new Employee object for each line.
// Create a generic function that returns and displays that data from the Employee objects in the console.


package HRC.assignment.assignment4;

import java.io.*;
import java.util.*;


public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of employee");
        int numberOfObject = Integer.parseInt(bufferedReader.readLine());

        List<Employee> employeeList = new ArrayList<>();


        for (int i = 0; i < numberOfObject; i++) {
            System.out.println("Enter "+(i+1)+" employee details in comma separated  format");
            String commaSeparatedInput = bufferedReader.readLine();

            String input[] = commaSeparatedInput.split(",");
            int empId = Integer.parseInt(input[0]);
            String name = input[1];
            String city = input[2];
            String contact = input[3];
            Double salary = Double.parseDouble(input[4]);
            employeeList.add(new Employee(name,empId,city,contact,salary,Designation.randomDesignationGenerator().toString()));

        }

        FileWriter fileWriter = new FileWriter("EmployeeDetails.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Employee e :employeeList) {
            bufferedWriter.write(e.toString());
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();

        System.out.println("Reading Employee data from file");
        new ReadEmployee().ReadEmployeeFromFile();
    }

    public static Designation randomDesignation() {
        int pick = new Random().nextInt(Designation.values().length);
        return Designation.values()[pick];
    }
}

class Employee{
    String name;
    int empId;
    String city;
    String contact;
    Double salary;
    String designation;

    public Employee(String name, int empId, String city, String contact, Double salary, String designation) {
        this.name = name;
        this.empId = empId;
        this.city = city;
        this.contact = contact;
        this.salary = salary;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return   empId + ","+name+","+ city +","+ contact+"," +salary +","+designation ;
    }
}

enum Designation{
    MANAGER,
    DEVELOPER,
    INTERN;

    private static final List<Designation> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Designation randomDesignationGenerator()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}

class ReadEmployee{
    List<Employee> employeeList = new ArrayList<>();

    public void ReadEmployeeFromFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("EmployeeDetails.txt"));
        StringBuffer stringBuffer = new StringBuffer("");
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {

            String input[] = line.split(",");
            int empId = Integer.parseInt(input[0]);
            String name = input[1];
            String city = input[2];
            String contact = input[3];
            Double salary = Double.parseDouble(input[4]);
            String designation = input[5];
            employeeList.add(new Employee(name,empId,city,contact,salary,designation));
            line = "";
        }

        for (Employee e : employeeList) {
            System.out.println(e);
        }

    }
}
//Create a class named 'Member' having the following members:
//Data members
//1 - Name
//2 - Age
//3 - Phone number
//4 - Address
//5 - Salary
//It also has a method named 'printSalary' which prints the salary of the members.
//Two classes 'Employee' and 'Manager' inherits the 'Member' class.
// The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
// Now, assign name, age, phone number, address and salary to an employee
// and a manager by making an object of both of these classes and print the same.

package HRC.assignment.assignment2;

public class Q1 {
    public static void main(String[] args) {

        System.out.println("\n----------------------------------------------------------Object of Employee----------------------------------------------------------");
        Employee employee = new Employee();
        employee.name = "Ankan Mukherjee";
        employee.age = 20;
        employee.phoneNumber = "9876543210";
        employee.address = "Kolkata , West Bengal";
        employee.salary = "10000";
        System.out.println("Employee Details: " + employee.toString());

        System.out.println("\n----------------------------------------------------------Object of Manager----------------------------------------------------------");
        Manager manager = new Manager();
        manager.name = "Abhishek Raj";
        manager.age = 21;
        manager.phoneNumber = "0123456789";
        manager.address = "Patna , Bihar";
        manager.salary = "20000";
        System.out.println("Manager Details: " + manager.toString());
    }
}

class Member{
    String name;
    int age;
    String phoneNumber;
    String address;
    String salary;

    public  void printSalary(){
        System.out.println("Salary of the member = "+salary);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}

class Employee extends Member{
    String specialization;

}

class Manager extends Member{
    String department;
}

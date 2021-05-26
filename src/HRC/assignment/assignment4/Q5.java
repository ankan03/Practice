//Create an Employee class with employee id,name,salary and age as its members.
// Sort the employee objects based on age using Comparable interface.
// Sort the employee objects based on employee id and salary using Comparator interface.

//6
//2
//ankan
//150
//20
//5
//mukherjee
//150
//27
//1
//anubhav
//300
//17
//3
//mishra
//200
//23
//6
//abhishek
//150
//25
//6
//anubhav
//300
//13

package HRC.assignment.assignment4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q5 {
    public static void main(String[] args) throws IOException {
        List<Employee1> employee1List = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of Employee");
        int numberOfEmployee = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numberOfEmployee; i++) {
            System.out.println("Enter id for Employee-"+(i+1));
            int id = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Enter name for Employee-"+(i+1));
            String name = bufferedReader.readLine();

            System.out.println("Enter salary for Employee-"+(i+1));
            Double salary = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Enter age for Employee-"+(i+1));
            int age = Integer.parseInt(bufferedReader.readLine());

            employee1List.add(new Employee1(id,name,salary,age));
        }

        Comparator<Employee1> comparatorAge = new Comparator<Employee1>() {
            @Override
            public int compare(Employee1 o1, Employee1 o2) {
                return o1.age>o2.age?1:-1;
            }
        };

//        Comparator<Employee1> comparatorIdAndSalary = Comparator
//                .comparing(Employee1::getId)
//                .thenComparing(Employee1::getSalary);

        System.out.println("-----------------Sorting the employee objects based on age-----------------");
        Collections.sort(employee1List,comparatorAge);

        for (Employee1 e : employee1List) {
            System.out.println(e);
        }

//        System.out.println("-----------------Sorting the employee objects based on employee id and salary-----------------");
//        Collections.sort(employee1List,comparatorIdAndSalary);
//
//        for (Employee1 e : employee1List) {
//            System.out.println(e);
//        }

        System.out.println("-----------------Sorting the employee objects based on employee id and salary-----------------");
        Collections.sort(employee1List);
        for (Employee1 e : employee1List) {
            System.out.println(e);
        }
    }
}

class Employee1 implements Comparable<Employee1>{
    int id;
    String name;
    Double salary;
    int age;

    public Employee1(int id, String name, Double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee1 o) {
        if (this.id>o.id)
            return 1;
        else if (this.id<o.id)
            return -1;
        else {
            if (this.salary>o.salary)
                return 1;
            else if (this.salary<o.salary)
                return -1;
            else return 0;
        }
    }
}
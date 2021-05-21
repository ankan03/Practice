//Create a class and declare 2 variables: name and manager.
//manager is a static variable , instantiate the variables using constructors and static blocks.
// Create two objects and display the data.

package HRC.assignment.assignment3;

public class Q6 {
    public static void main(String[] args) {
        MySampleClass mySampleClass1 = new MySampleClass("Ankan Mukherjee");
        MySampleClass mySampleClass2 = new MySampleClass("Rishav Banerjee");

        System.out.println(mySampleClass1);
        System.out.println(mySampleClass2);

        System.out.println("\n----------------After changing Manager----------------");
        MySampleClass.manager = "Arnab Roy";
        System.out.println(mySampleClass1);
        System.out.println(mySampleClass2);

    }
}

class MySampleClass {
    String name;
    static String manager;

    static {
        manager = "Demo Manager";
    }

    public MySampleClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MySampleClass{" +
                "name='" + name + '\'' +
                "manager='" + manager + '\'' +
                '}';
    }
}
//Can we have IIB block and static block in same class?
// Create a class with an IIB and static block with a default constructor and check the sequence of execution.
// (Print a message in each block and constructor).

package HRC.assignment.assignment2;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("\n-----------------------First Object of SampleClass-----------------------");
        SampleClass sampleClass1 = new SampleClass();
        System.out.println("\n-----------------------Second Object of SampleClass-----------------------");
        SampleClass sampleClass2 = new SampleClass();
    }
}

class SampleClass{

    public SampleClass() {
        System.out.println("Inside SampleClass Constructor");
    }

    {
        System.out.println("Instance Initialization Block - 1");
    }

    {
        System.out.println("Instance Initialization Block - 2");
    }

    static {
        System.out.println("Static Block - 1");
    }

    static {
        System.out.println("Static Block - 2");
    }
}

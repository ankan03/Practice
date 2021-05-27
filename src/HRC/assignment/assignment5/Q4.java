// Write a program where ArrayIndexOutOfBoundsException arises and catch it appropriately?

package HRC.assignment.assignment5;

public class Q4 {
    public static void main(String[] args) {
        try {
            int intArray[] = {1,2,3,4,5};
            System.out.println(intArray[10]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}

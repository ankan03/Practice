//2.Can we have multiple catch blocks for a single try block? If yes/no explain 
//with an example

package HRC.assignment.assignment5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Q2 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("EmployeeDetails.txt"));
            int intArray[] = {1,2,3,4,5};
            System.out.println(intArray[6]);

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }catch (Exception e){
            System.out.println("Wrong input");
        }
    }
}

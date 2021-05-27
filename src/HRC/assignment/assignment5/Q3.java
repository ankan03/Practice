// When FileNotFoundException arises and demonstrates with an example?

package HRC.assignment.assignment5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Q3 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("EmployeeDetail.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception");
        }
    }
}

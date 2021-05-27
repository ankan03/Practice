// Write a program to take a number in string format and convert it to BigDecimal with required precision.

package HRC.assignment.assignment5;

import java.math.BigDecimal;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        try {
            String numberString = scanner.nextLine();
            BigDecimal bigDecimal = new BigDecimal(numberString);
            System.out.println("bigDecimal: "+bigDecimal);
        }catch (Exception e){
            System.out.println("Wrong input");
        }
    }
}

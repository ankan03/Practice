//Take an input and find if the input is a number or not using exception handling.
// If it is not a number reverse the string and print it.

package HRC.assignment.assignment3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number OR string");
        String inputString = scanner.nextLine();

        try {
            Number number = Double.parseDouble(inputString);
            System.out.println("Yes user input is a Number "+ number);

        }catch (Exception e){
            System.out.println("No user input is NOT a Number");
            System.out.println("After Reverse: "+ new StringBuilder(inputString).reverse());
        }
    }
}

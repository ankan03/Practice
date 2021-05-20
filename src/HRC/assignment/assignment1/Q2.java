//Write a program to reverse a String without using reverse function

package HRC.assignment.assignment1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        
        String inputString = scanner.nextLine();
        String outputString = "";

        for (int i = inputString.length()-1; i >= 0; i--) {
            outputString +=inputString.charAt(i);;
        }

        System.out.println("After Reverse: "+outputString);

    }
}

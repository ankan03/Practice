//Create a program which takes a single alphanumeric input.
// Find the index of first occurrence of a digit and print the strings before
// and after the digit separately with comma separation.
//
//Input: ad1ur45
//Output: ad,ur45
//
//Input: 2ad1ur45
//Output:  ,ad1ur45

package HRC.assignment.assignment3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the String");
        String inputString;
        StringBuilder outputString=new StringBuilder("");

        try {
            inputString = scanner.nextLine();

            for (int i = 0; i < inputString.length(); i++) {

                Boolean isDigitPresent = Character.isDigit(inputString.charAt(i));
                if(isDigitPresent) {
                    outputString = new StringBuilder(inputString);
                    outputString.setCharAt(i, ',');
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("Wrong input");
        }

        System.out.println(outputString);
    }
}

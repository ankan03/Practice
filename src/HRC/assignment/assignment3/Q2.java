//Take a comma separated string and print the individual strings separately.
//Input: 123,abc,400.50,10009826,R
//Output:
//123
//abc
//400.50
//10009826
//R

package HRC.assignment.assignment3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a comma separated String");

        try {
            String inputString = scanner.nextLine();

            String outputStringArray[] = inputString.split(",");
            for (String s:outputStringArray) {
                System.out.println(s);
            }
        }catch (Exception e){
            System.out.println("Wrong input");
        }
    }
}

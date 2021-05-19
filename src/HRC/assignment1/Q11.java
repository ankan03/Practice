//Write a program to accept an integer n.
// If n is positive then only find the sum of all the numbers(natural numbers sum) till n.
// If n value is negative or 0 then print not a valid number
package HRC.assignment1;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a Positive number");
        int n = scanner.nextInt();
        int s=0;
        if (n>0){
            for (int i = 1; i <=n ; i++) {
                s +=i;
            }
            System.out.println("Natural number sum = "+s);
        }else {
            System.out.println("Entered number is not a positive number");
        }
    }
}

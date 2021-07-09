//Write a program to convert given decimal number into a binary number.
//
//User Input Description:
//A decimal number


//19
//10011

//25
//11001

//190
//10111110

package myPerfectice;

import java.util.Scanner;

public class Q17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        long binaryNumber = 0;
        int remainder, i = 1, step = 1;
        n = sc.nextInt();
        while (n != 0) {
            remainder = n % 2;
            n /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        System.out.println(binaryNumber);
    }
}

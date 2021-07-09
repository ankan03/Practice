//Write a program to check if a string is a palindrome or not. Output 1 if palindrome, otherwise print 0.
//
//User Input Description:
//String in lower case


//hello
//0

//Kayak
//1

//abcdedcba
//1


package myPerfectice;

import java.util.Scanner;

public class Q41 {
    public static void main(String args[]) {
        String a, b = "";
        Scanner s = new Scanner(System.in);
        a = s.nextLine();
        int n = a.length();
        for (int i = n - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        if (a.equalsIgnoreCase(b)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

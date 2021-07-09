//Write a program to print the highest frequency character in a string.
//
//User Input Description:
//String in double quotes


//Welcome to India
//e

//Hello World
//l

//i am in Mississippi
//i


package myPerfectice;

import java.util.Scanner;

public class Q38 {
    static final int ASCII_SIZE = 256;

    static char getMaxOccuringChar(String str) {
        int count[] = new int[ASCII_SIZE];
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
        int max = -1;
        char result = ' ';
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(getMaxOccuringChar(s));
    }
}

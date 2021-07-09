//Write a program to replace a character at a specific index with another given character in a string.
//
//User Input Description:
//First line - A string
//Second line - Index position
//Third line - Character to be replaced with


//Apple
//3
//k
//Appke

//Education
//4
//M
//EducMtion

//Language
//1
//O
//LOnguage

//Hundred
//0
//T
//Tundred


package myPerfectice;

import java.util.Scanner;

public class Q37 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int index = s.nextInt();
        char ch = s.next(".").charAt(0);
        str = str.substring(0, index) + ch + str.substring(index + 1);
        System.out.println(str);
    }
}

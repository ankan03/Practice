//Write a program to find the nth bit of a binary equivalent of an entered decimal number.
//
//For example, entered decimal number N= 20(10100 in binary) , if nth bit= 4, output=1 and nth bit=0, output=0.
//
//Note: Take nth bit of binary number from right to left like in binary number 10, 0= 0th index and 1=1st index.
//
//User Input Description:
//First line as a decimal number
//Second line as an integer value  for nth bit

//120
//1
//0

//20
//2
//1

//2
//0
//1


package myPerfectice;

import java.util.Scanner;

public class Q6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int dec_num, nth_bit, bitStatus;
        dec_num = sc.nextInt();
        nth_bit = sc.nextInt();
        System.out.println("Binary value: " + Integer.toBinaryString(dec_num));
        bitStatus = (dec_num >> nth_bit) & 1;
        System.out.println(bitStatus);
    }
}

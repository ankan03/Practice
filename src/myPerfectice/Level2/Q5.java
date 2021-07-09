//Write a program to find the longest sequence of 0’s in binary equivalent of an entered number.
//
//User Input Description:
//A decimal number

//29
//1

//26
//1

//5629
//1

//2600
//3
package myPerfectice.Level2;

import java.util.Scanner;

public class Q5 {
    public static void maxConsecutiveZeros(int dec_num) {
        int rem, quot, i = 1, j;
        quot = dec_num;
        int bin_num[] = new int[100];
        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }
        String Str = "";
        for (j = i - 1; j > 0; j--) {
            Str = Str + bin_num[j];
        }
        i = Str.length() - 1;
        while (Str.charAt(i) == '0') {
            i--;
        }
        int length = 0;
        int ctr = 0;
        for (; i >= 0; i--) {
            if (Str.charAt(i) == '1') {
                length = Math.max(length, ctr);
                ctr = 0;
            } else {
                ctr++;
            }
        }
        length = Math.max(length, ctr);
        System.out.println(length);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int dec_num = SC.nextInt();
        maxConsecutiveZeros(dec_num);
    }
}
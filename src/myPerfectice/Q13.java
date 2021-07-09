//Write a program to check whether an entered number N is good number or not. If the number is a good number, print "Yes",  otherwise print "No".
//
//If the binary representation of a number does not contain any consecutive 1s, then it is called “good number”. For example: Decimal number 17 is 10001 in binary, so it is a good number.
//
//User Input Description:
//A decimal number

//7
//No

//10
//Yes

//200
//No


package myPerfectice;

import java.util.Scanner;

public class Q13 {
    static boolean checkgoodnumber(int num) {
        //write your code here
        String s = Integer.toBinaryString(num);
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                c++;
                if (c >= 2) {
                    return false;
                }
            } else {
                c = 0;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (checkgoodnumber(num) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

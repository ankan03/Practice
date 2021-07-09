//Write a program that displays the sum of the 2 binary strings entered by the user.
//User Input Description:
//First line as first binary number
//Second line as second binary number

//1101
//100
//10001

//100001
//110
//100111

//111111
//1
//1000000

//1101010010
//1111
//1101100001
package myPerfectice.Level2;

import java.util.Scanner;

public class Q3 {
    static String addBinary(String a, String b) {
        String result = "";
        int s = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1) {
            s += ((i >= 0) ? a.charAt(i) - '0' : 0);
            s += ((j >= 0) ? b.charAt(j) - '0' : 0);
            result = (char) (s % 2 + '0') + result;
            s /= 2;
            i--;
            j--;
        }
        return result;
    }

    static String addBinary1(String a, String b) {
        long l1 = Long.parseLong(a, 2);
        long l2 = Long.parseLong(b, 2);
        System.out.println("l1 = " + l1 + "\tl2 = " + l2 + "\t(l1+l2) = " + (l1 + l2));
        return Long.toBinaryString(l1 + l2);
    }

    static String addBinary2(String a, String b) {
        long l1 = Long.parseLong(a);
        long l2 = Long.parseLong(b);

        while (l1 > 0 || l2 > 0) {

        }


        return Long.toBinaryString(l1 + l2);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        //System.out.print(addBinary(a, b));
        System.out.print(addBinary1(a, b));
    }
}

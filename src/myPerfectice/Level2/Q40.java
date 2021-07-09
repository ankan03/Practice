//Given a string, check if it is a rotation of a palindrome. For example your function should return 1 for “aab” as it is a rotation of “aba”.
//
//User Input Description:
//A string

//AAB
//1

//DDA
//1

//KAYA
//0

package myPerfectice.Level2;

import java.util.Scanner;

public class Q40 {
    static boolean isPalindrome(String str) {
        int l = 0;
        int h = str.length() - 1;
        while (h > l)
            if (str.charAt(l++) != str.charAt(h--))
                return false;
        return true;
    }

    static boolean isRotationOfPalindrome(String str) {
        if (isPalindrome(str))
            return true;
        int n = str.length();
        for (int i = 0; i < n - 1; i++) {
            String str1 = str.substring(i + 1);
            String str2 = str.substring(0, i + 1);
            if (isPalindrome(str1 + str2))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println((isRotationOfPalindrome(a)) ? 1 : 0);
    }
}

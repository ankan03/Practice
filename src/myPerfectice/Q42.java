//Write a program to check if characters of a given string can be rearranged to form a palindrome.
//
//Output 1 if string can be rearranged to form a palindrome, otherwise output 0.
//
//User Input Description:
//String in lower case


//perfectice
//0

//lloppo
//1

//abcdeabcde
//1

package myPerfectice;

import java.util.Arrays;
import java.util.Scanner;

public class Q42 {
    static int NO_OF_CHARS = 256;

    static boolean canFormPalindrome(String str) {
        int count[] = new int[NO_OF_CHARS];
        Arrays.fill(count, 0);
        for (int i = 0; i < str.length(); i++)
            count[(int) (str.charAt(i))]++;
        int odd = 0;
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if ((count[i] & 1) == 1)
                odd++;
            if (odd > 1)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        if (canFormPalindrome(str1))
            System.out.println(1);
        else
            System.out.println(0);
    }
}

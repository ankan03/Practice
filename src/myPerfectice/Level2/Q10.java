//Write a program to find and display a number of palindrome words from entered string.
//
//For example, in input string "MOM AND DAD ARE MY BEST FRIENDS", palindrome words are "MOM" & "DAD" and total number of palindrome word is 2.
//
//Note: The case sensitivity is not taken into an account for palindrome words like 'mom' and 'MOM' is same. A single character word are also considered as pallindrome like "a" etc.
//
//Hint: Palindrome words like mom, dad, eye etc.
//
//User Input Description:
//A string  value in double quotes


//My friends are my best friends
//0

//Mom and dad
//2

//Nitin is my classmate
//1

//Owl is a bird
//1

package myPerfectice.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10 {
    // create object of buffer class.
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // function to check palindrome
    boolean IsPalindrome(String s) {
        int l = s.length();
        String rev = "";
        for (int i = l - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (rev.equals(s))
            return true;
        else
            return false;
    }

    public static void CheckPalindromeWordsInString(String s, Q10 ob) {
        // to convert into upper case.
        s = s.toUpperCase();
        StringTokenizer str = new StringTokenizer(s, ".?! ");
        int w = str.countTokens();
        String word[] = new String[w];
        for (int i = 0; i < w; i++) {
            word[i] = str.nextToken();
        }
        int count = 0;
        for (int i = 0; i < w; i++) {
            if (ob.IsPalindrome(word[i]) == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]) throws IOException {
        // create function of palindromewords.
        Q10 ob = new Q10();
        String s = br.readLine();
        CheckPalindromeWordsInString(s, ob);
    }
}

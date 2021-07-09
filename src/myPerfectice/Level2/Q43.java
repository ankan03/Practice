//You are given two strings S1 and S2, find the length of the longest common subsequence.
//
//Longest common subsequence (LCS) of 2 strings is a subsequence(not necessarily contiguous) of maximum length which is common to both the sequences.
//
//User Input Description:
//Line 1 - Length of S1 and S2 space-separated
//Line 2- String S1
//Line 3 - String S2


//6
//7
//AGGTAB
//GXTXAYB
//4

//10
//12
//qwghrtuibn
//qwghiovbdfrt
//6

//10
//10
//abcdefghij
//abcghiabcd
//6
package myPerfectice.Level2;

import java.util.Scanner;

public class Q43 {
    int lcs(char[] x, char[] y, int m, int n) {
        //write your code here
        if (m == 0 || n == 0)
            return 0;
        if (x[m - 1] == y[n - 1])
            return 1 + lcs(x, y, m - 1, n - 1);
        else
            return Math.max(lcs(x, y, m, n - 1), lcs(x, y, m - 1, n));
    }

    public static void main(String[] args) {
        Q43 lcs = new Q43();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String s1 = scanner.next();
        String s2 = scanner.next();
        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        System.out.println(lcs.lcs(X, Y, n, m));
    }
}

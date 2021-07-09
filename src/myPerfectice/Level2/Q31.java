//Given a string ‘str’, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. Output "True" if yes, otherwise output "False".
//
//For example: If the string is abcabcabc, then the output should be True as it can be constructed by appending abc 3 times.
//
//User Input Description:
//A string


//abcabcabc
//True

//abcdabc
//False

//abcdeabcdeabcde
//True


package myPerfectice.Level2;

import java.util.Scanner;

public class Q31 {
    static void computeLPSArray(String str, int M, int lps[]) {
        int len = 0;
        int i;
        lps[0] = 0;
        i = 1;
        while (i < M) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    static boolean isRepeat(String str) {
        int n = str.length();
        int lps[] = new int[n];
        computeLPSArray(str, n, lps);
        int len = lps[n - 1];
        return (len > 0 && n % (n - len) == 0) ? true : false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (isRepeat(str))
            System.out.print("True");
        else
            System.out.print("False");
    }
}

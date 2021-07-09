//Given a string ‘str’ of digits, find the length of the longest substring(contiguous) of ‘str’ such that the length of the substring is 2k digits and sum of left k digits is equal to the sum of right k digits where k is any number.
//
//User Input Description:
//First line : String of digits


//123123
//6

//12312348
//6

//4589120305
//4

package myPerfectice;

import java.util.Scanner;

public class Q44 {
    static int findLength(String str, int n) {
        int sum[] = new int[n + 1];
        sum[0] = 0;
        for (int i = 1; i <= n; i++)
            sum[i] = (sum[i - 1] + str.charAt(i - 1) - '0');
        int ans = 0;
        for (int len = 2; len <= n; len += 2) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (sum[i + len / 2] - sum[i] == sum[i + len]
                        - sum[i + len / 2])
                    ans = Math.max(ans, len);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(findLength(str, str.length()));
    }
}

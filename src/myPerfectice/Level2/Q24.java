//Write a program to take n numbers as input from the user and find the sum of contiguous subarray in that array which has the largest sum.
//
//Explanation:
//
//Fail to get image! Please check your network.
//
//User Input Description:
//First line - Number of elements(N)
//Second line - Space separated N elements of an array

//8
//-2 -3 4 -1 -2 1 5 -3
//7

//7
//1 -3 5 -8 2 -2 5
//5

//8
//-1 -2 -3 -4 -5 -6 -7 -8
//-1


package myPerfectice.Level2;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max_sum = maxSubArraySum(a, n);
        System.out.println(max_sum);

        max_sum = maxSubArraySum1(a);
        System.out.println(max_sum);
    }

    static int maxSubArraySum(int a[], int size) {
        int max_so_far = a[0];
        int curr_max = a[0];
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a[i], curr_max + a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    static int maxSubArraySum1(int a[]) {
        //write your code here
        int m = 0, b = 0, la = Integer.MIN_VALUE, s = 0;
        for (int i = 0; i < a.length; i++) {
            s = 0;
            for (int j = i; j < a.length; j++) {
                s += a[j];
                if (s > la) {
                    m = i;
                    b = j;
                    la = s;
                }
            }
        }
        return la;
    }
}

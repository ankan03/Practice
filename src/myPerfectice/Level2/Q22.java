//Given an array of n integers. We can remove at most one element from the array. Our goal is to maximize the length of the subarray(contiguous) that contains all primes. Print the length of the largest subarray that you can get by removing at most one element from the array.
//
//If the array is arr[] = 2, 8, 5, 7, 9, 5, 7 , then the output should be 4.
//
//Explanation :If we remove the number 9 which is at index 5 then the remaining array contains a subarray whose length is 4 which is maximum
//
//User Input Description:
//First line - Number of elements in an array, N
//Second line - Space separated N elements of an array

//5
//7
//8
//6
//3
//5
//2


//4
//6
//1
//7
//3
//3

//4
//6
//1
//7
//3
//3


package myPerfectice.Level2;

import java.util.Scanner;

public class Q22 {
    int longestprimesubarray(int n, int[] arr) {
        int N = 100001;
        boolean prime[] = new boolean[N + 1];
        for (int i = 0; i < N; i++)
            prime[i] = true;
        for (int p = 2; p * p <= N; p++) {
            if (prime[p] == true) {
                for (int i = p * 2; i <= N; i += p)
                    prime[i] = false;
            }
        }
        int left[] = new int[n];
        int right[] = new int[n];
        int primecount = 0, res = 0;
        for (int i = 0; i < n; i++) {
            left[i] = primecount;
            if (prime[arr[i]]) {
                primecount++;
            } else
                primecount = 0;
        }
        primecount = 0;
        for (int i = n - 1; i >= 0; i--) {
            right[i] = primecount;
            if (prime[arr[i]]) {
                primecount++;
            } else
                primecount = 0;
        }
        for (int i = 0; i < n; i++)
            res = Math.max(res, left[i] + right[i]);
        return res;
    }

    public static void main(String[] args) {
        Q22 obj = new Q22();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = in.nextInt();
        System.out.println(obj.longestprimesubarray(n, ar));
    }
}

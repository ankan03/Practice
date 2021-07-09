//For a given an array of n numbers and an integer k, write a program to find the maximum element for each and every contiguous subarray of size k in the array and print it.
//
//Note: The maximum elements have to be displayed separated by spaces.
//
//User Input Description:
//First line - Number of elements(N)
//Second line- Integer k
//Third line - N array elements separated by spaces


//9
//3
//1 2 3 1 4 5 2 3 6
//3 3 4 5 5 5 6

//10
//4
//8 5 10 7 9 4 15 25 63 13
//10 10 10 15 25 63 63

//10
//5
//8 5 10 7 9 4 15 25 63 13
//10 10 15 25 63 63

package myPerfectice.Level2;

import java.util.Scanner;

public class Q28 {
    static void printKMax(int arr[], int n, int k) {
        int j, max;
        for (int i = 0; i <= n - k; i++) {
            max = arr[i];
            for (j = 1; j < k; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            System.out.print(max + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        printKMax(arr, n, k);
    }
}

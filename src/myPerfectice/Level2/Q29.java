//Given an array containing n positive integers, write a function that takes an array as an argument and returns the length of the longest bitonic subsequence(Not necessarily contiguous). A subsequence is called bitonic if it is first increasing, then decreasing.
//
//Also, sequence sorted in increasing order is considered Bitonic with the decreasing part as empty. Similarly, decreasing order sequence is considered Bitonic with the increasing part as empty.
//
//User Input Description:
//First line number of elements in array, second line will be elements in array

//8
//1 11 2 10 4 5 2 1
//6

//5
//1 3 8 2 4
//4

//6
//80 60 30 40 20 10
//5


package myPerfectice.Level2;

import java.util.Scanner;

public class Q29 {
    static int lbs(int arr[], int n) {
        int i, j;
        int[] lis = new int[n];
        for (i = 0; i < n; i++)
            lis[i] = 1;

        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

        int[] lds = new int[n];
        for (i = 0; i < n; i++)
            lds[i] = 1;

        for (i = n - 2; i >= 0; i--)
            for (j = n - 1; j > i; j--)
                if (arr[i] > arr[j] && lds[i] < lds[j] + 1)
                    lds[i] = lds[j] + 1;

        int max = lis[0] + lds[0] - 1;
        for (i = 1; i < n; i++)
            if (lis[i] + lds[i] - 1 > max)
                max = lis[i] + lds[i] - 1;

        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = in.nextInt();
        System.out.println(lbs(arr, size));
    }
}

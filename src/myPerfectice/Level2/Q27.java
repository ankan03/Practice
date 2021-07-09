//Given an array of n distinct and positive elements, the task is to find pairs whose sum already exists in given array. You have to display all those pairs in the order they appear in the array. If no such pair exists, then simply print 0.
//
//For example: If the given array is arr = 2,8,7,1,5, then there are 2 pairs whose sum already exists in the array. These two pairs are 2,5(7 is present in array) and 7,1(8 is present in array), so the output will be:-
//
//2 5
//
//7 1
//
//User Input Description:
//Line 1: Size of the array
//Line 2: Elements of the array space-separated

//5
//2 8 7 1 5
//2 5
//7 1

//5
//7 8 5 9 11
//0

//10
//1 2 3 4 5 6 7 8 9 10
//1 2
//1 3
//1 4
//1 5
//1 6
//1 7
//1 8
//1 9
//2 3
//2 4
//2 5
//2 6
//2 7
//2 8
//3 4
//3 5
//3 6
//3 7
//4 5
//4 6

package myPerfectice.Level2;

import java.util.Scanner;

public class Q27 {
    static void findPair(int[] arr, int n) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (arr[i] + arr[j] == arr[k]) {
                        System.out.println(arr[i] + " " + arr[j]);
                        found = true;
                    }
                }
            }
        }
        if (found == false)
            System.out.println(0);
    }

    static public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[];
        a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        findPair(a, n);
    }
}

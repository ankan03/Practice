//Write a program that takes elements of array as input from the user. Each element of array represents the maximum number of jumps that can be made from that index in the forward direction. You have to find the minimum number of jumps that can be taken to reach from first index to the last index.
//
//For example - If the given array is arr[] = 1,3,5,8,9,2,6,7,6,8,9
//
//The first element is 1, so can only go to 3. The second element is 3, so can make at most 3 steps to 5 or 8 or 9.
//
//The minimum number of jumps for this array will be 3 (1->3->8->9)
//
//User Input Description:
//First line - Number of elements in an array
//Second line - Space separated elements of an array


//8
//1 2 9 1 8 12 18 20
//3

//10
//1 3 6 3 2 3 6 8 9 5
//4

//6
//1 2 6 3 2 1
//3

package myPerfectice.Level2;

import java.util.Scanner;

public class Q14 {
    static int minJumps(int arr[], int l, int h) {
        if (h == l)
            return 0;
        if (arr[l] == 0)
            return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = l + 1; i <= h && i <= l + arr[l]; i++) {
            int jumps = minJumps(arr, i, h);
            if (jumps != Integer.MAX_VALUE &&
                    jumps + 1 < min)
                min = jumps + 1;
        }
        return min;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.print(minJumps(arr, 0, n - 1));
    }
}

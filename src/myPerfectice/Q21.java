//Given an array of n elements which contains elements from 0 to n-1 with any of these numbers appearing any number of times. Display all these repeating numbers in ascending order. The numbers should be displayed in one line with each number separated by a space.
//
//User Input Description:
//First line - Number of elements in array
//Second line - Space separated N Elements of array

//7
//1 2 3 1 3 6 6
//1 3 6

//5
//4 2 3 2 0
//2

//10
//3 2 4 7 1 8 6 3 2 4
//2 3 4


package myPerfectice;

import java.util.Scanner;

public class Q21 {
    void printRepeating(int arr[], int n) {
        int i, index;
        for (i = 0; i < n; i++) {
            index = arr[i] % n;
            arr[index] += n;
        }
        for (i = 0; i < n; i++) {
            if ((arr[i] / n) > 1)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Q21 duplicate = new Q21();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = in.nextInt();
        duplicate.printRepeating(arr, size);
    }
}

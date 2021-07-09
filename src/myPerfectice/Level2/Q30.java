//Given an array of n elements and a number, write a program to find all the unique triplets in the array such that sum of the three elements is equal to a specified number given by the user. Display the triplets in the order they appear in the array.
//
//If the array is arr=1,-2,0,5,-1,-4 and the number is 2, then the output should be:-
//
//1 5 -4
//
//-2 5 -1
//
//User Input Description:
//First line - Size of the array
//Second line - Array elements separated by space
//Third line- A target value

//6
//1 -2 0 5 -1 -4
//2
//1 5 -4
//-2 5 -1

//6
//1 -2 0 5 -1 -4
//3
//-2 0 5

//6
//1 -2 0 5 -1 -4
//4
//1 -2 5
//0 5 -1


package myPerfectice.Level2;

import java.util.Scanner;

public class Q30 {
    boolean find3Numbers(int A[], int arr_size, int sum) {
        int l, r;
        for (int i = 0; i < arr_size - 2; i++) {
            for (int j = i + 1; j < arr_size - 1; j++) {
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.print(A[i] + " " + A[j] + " " + A[k] + "\n");
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Q30 triplet = new Q30();
        Scanner in = new Scanner(System.in);
        int size, sum;
        size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = in.nextInt();
        sum = in.nextInt();
        triplet.find3Numbers(arr, size, sum);
    }
}

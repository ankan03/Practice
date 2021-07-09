//Write a program that takes an array containing only 1s and 0s as input and then segregates all the 1s on the right side and the 0s on left side. Then display the array with each element separated by a space.
//
//Suppose, the given array is {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1}, then the output should be:-
//
//0 0 0 0 0 1 1 1 1 1 1
//
//User Input Description:
//Line 1 - Size of array
//Line 2 - Elements of array space-separated

//11
//0 1 0 1 1 0 1 1 0 0 1
//0 0 0 0 0 1 1 1 1 1 1

//20
//0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1
//0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1

//30
//1 0 0 0 1 1 0 1 1 0 0 0 0 1 0 1 0 1 1 0 1 0 0 1 1 1 0 0 1 0
//0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1


package myPerfectice;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int i;
        int left = 0, right = n - 1;
        while (left < right) {
            while (nums[left] == 0 && left < right)
                left++;
            while (nums[right] == 1 && left < right)
                right--;
            if (left < right) {
                nums[left] = 0;
                nums[right] = 1;
                left++;
                right--;
            }
        }
        for (i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

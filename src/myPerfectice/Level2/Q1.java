//Write a program that takes 10 numbers as input from command line.
// Find the largest and the second largest of these numbers in single iteration of loop.
//Display the largest number in first line and then the second largest in second line.

package myPerfectice.Level2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int arr_size, i, first, second, num;
        first = second = Integer.MIN_VALUE;

        System.out.println("Enter number of element in the array: ");
        Scanner scanner = new Scanner(System.in);
        arr_size = scanner.nextInt();
        int a[] = new int[arr_size];

        System.out.println("Enter the elements in the array: ");
        for (int j = 0; j < arr_size; j++) {
            a[j] = scanner.nextInt();
        }

        for (i = 0; i < arr_size; i++) {
            num = a[i];
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first)
                second = num;
        }
        System.out.println("Largest: " + first);
        System.out.println("Second largest: " + second);
    }
}

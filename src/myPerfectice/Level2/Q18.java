//Write a program that takes n numbers as input from the user and then display the largest and second largest number in separate lines.
//
//User Input Description:
//First line - Number of elements of an array, N
//Next line- Space separated  N elements of an array

//4
//1 2 3 4
//4
//3

//5
//3 4 6 7 8
//8
//7

//10
//15 4 7 6 3 12 2 3 5 1
//15
//12


package myPerfectice.Level2;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, largest1, largest2, temp, n;
        int[] array = new int[100];
        n = in.nextInt();
        for (i = 0; i < n; i++)
            array[i] = in.nextInt();
        largest1 = array[0];
        largest2 = array[1];
        if (largest1 < largest2) {
            temp = largest1;
            largest1 = largest2;
            largest2 = temp;
        }
        for (i = 2; i < n; i++) {
            if (array[i] >= largest1) {
                largest2 = largest1;
                largest1 = array[i];
            } else if (array[i] > largest2) {
                largest2 = array[i];
            }
        }
        System.out.println(largest1);
        System.out.println(largest2);
    }
}

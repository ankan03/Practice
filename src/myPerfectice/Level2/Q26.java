//Write a program to merge two sorted arrays.
//
//Display the elements of the merged array in separate lines.
//
//User Input Description:
//Line 1: Size of Array 1
//Line 2:  Space separated elements of Array 1
//Line 3: Size of Array 2
//Line 4: Space separated elements of Array 2

//5
//1
//6
//9
//11
//12
//5
//2
//3
//4
//8
//10
//
//1
//2
//3
//4
//6
//8
//9
//10
//11
//12


//3
//3
//8
//10
//5
//1
//2
//4
//6
//9
//1
//2
//3
//4
//6
//8
//9
//10


//7
//1
//3
//5
//7
//9
//11
//13
//9
//2
//4
//6
//8
//10
//12
//14
//16
//18
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//11
//12
//13
//14
//16
//18
package myPerfectice.Level2;

import java.util.Scanner;

public class Q26 {
    public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < n1)
            arr3[k++] = arr1[i++];
        while (j < n2)
            arr3[k++] = arr2[j++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();
        int[] arr3 = new int[n1 + n2];
        mergeArrays(arr1, arr2, n1, n2, arr3);
        for (int i = 0; i < n1 + n2; i++)
            System.out.println(arr3[i]);
    }
}

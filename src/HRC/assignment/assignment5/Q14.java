//Write a program to find the second largest element in a given Array.

package HRC.assignment.assignment5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter no of elements in the array:");
        int n = Integer.parseInt(bufferedReader.readLine());

        int intArray[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            intArray[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (intArray[i]>largestElement){
                largestElement = intArray[i];
            }else if (intArray[i]>secondLargestElement){
                secondLargestElement = intArray[i];
            }
        }
        System.out.println("Second largest element in a given Array is: "+secondLargestElement);
    }
}

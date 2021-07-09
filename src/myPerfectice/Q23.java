//Write a program to find a non empty subset in an array of N integers such that sum of elements of subset is divisible by N
//
//User Input Description:
//Array elements separated by space

//10 12 52 34 63 44
//1
//2

//25 50 100 36 77 96 23 15
//2
//3 4

//15 10 8 9 36 45 12 23 77 50
//1
//2


package myPerfectice;

import java.util.HashMap;
import java.util.Scanner;

public class Q23 {
    static void findNonEmptySubset(int arr[],
                                   int N) {
        HashMap<Integer, Integer> mp =
                new HashMap<Integer, Integer>();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = (sum + arr[i]) % N;
            if (sum == 0) {
                System.out.print(i + 1 + "\n");
                for (int j = 0; j <= i; j++)
                    System.out.print(j + 1 + " ");
                return;
            }
            if (mp.containsKey(sum) == true) {
                System.out.println((i -
                        mp.get(sum)));
                for (int j = mp.get(sum) + 1;
                     j <= i; j++)
                    System.out.print(j + 1 + " ");
                return;
            } else
                mp.put(sum, i);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String inpArray[] = input.split(" ");
        int arr[] = new int[inpArray.length];
        for (int i = 0; i < inpArray.length; i++) {
            arr[i] = Integer.parseInt(inpArray[i]);
        }
        int N = arr.length;
        findNonEmptySubset(arr, N);
    }
}

package HRC.hrcTest;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter number of elements: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter the digits");
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        printArray(c);
    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+"-"+(char)a[i]);
        }
    }
}

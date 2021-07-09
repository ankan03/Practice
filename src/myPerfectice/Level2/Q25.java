//You are given an array of n integers. Some numbers appear twice in the array.
//You have to output those numbers in the order they appear in the array. Print each number in a different line.
//
//User Input Description:
//First line: Number of elements in an array(n)
//Second lines: Space separated N elements of an array


//8
//1 2 5 5 6 6 7 2
//2
//5
//6

//8
//1 3 5 5 6 6 7 2
//5
//6

//10
//3 2 4 5 6 7 1 3 4 2
//3
//2
//4


package myPerfectice.Level2;

import java.util.*;

public class Q25 {
    public static boolean isE(int[] a, int n) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n)
                c++;
        }
        if (c == 2)
            return true;
        else
            return false;
    }

    public static boolean isP(List<Integer> l, int n) {
        if (l.size() == 0)
            return false;
        else {
            int c = 0;
            for (int i : l) {
                if (n == i)
                    c++;
            }
            return c == 1 ? true : false;
        }
    }

    public static void main(String[] args) {
        int n, temp;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        function(a);
        function1(a, n);
        //write your code here

    }

    private static void function1(int[] a, int n) {
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (!isP(l, a[i])) {
                if (isE(a, a[i]))
                    l.add(a[i]);
            }
        }
        for (int i : l)
            System.out.println(i);
    }

    private static void function(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] == a[j]) && (i != j)) {
                    System.out.println(a[j]);
                }
            }
        }
    }
}

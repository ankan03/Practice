package myPerfectice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q32 {
    public static <T> Set<T> merge_arr(Set<T> arr1, Set<T> arr2) {
        Set<T> merge_arr = new HashSet<T>();
        merge_arr.addAll(arr1);
        merge_arr.addAll(arr2);
        return merge_arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> arr1 = new HashSet<Integer>();
        int n1 = scan.nextInt();
        for (int i = 0; i < n1; i++) {
            arr1.add(scan.nextInt());
        }
        Set<Integer> arr2 = new HashSet<Integer>();
        int n2 = scan.nextInt();
        for (int i = 0; i < n2; i++) {
            arr2.add(scan.nextInt());
        }
        System.out.println(merge_arr(arr1, arr2));
    }
}

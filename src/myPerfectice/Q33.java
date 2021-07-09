//Write a program to find all the unique triplets of elements from an entered list such that the sum of all the three elements [x, y, z] should be equal to an entered specified number and print those triplet elements in [ ] brackets with comma and space in between in the same order as they were entered.
//
//For example, if list= 1, -2, 0 ,5, -1, -4 and specified number=2 , output would be [1, 5, -4] and [-2, 5, -1] because sum elements 1+5-4 = 2 and -2+5-1= 2 which is entered specified number 2
//
//User Input Description:
//First line as a size of an array
//Second line as a space separated N elements of an array
//Third line as a specified number

//6
//1 -2 0 5 -1 -4
//2
//[1, 5, -4]
//[-2, 5, -1]

//9
//6 5 -2 5 3 7 0 4 -2
//1
//[5, -2, -2]
//[-2, 5, -2]
//[-2, 3, 0]
//[3, 0, -2]

//6
//1 -3 3 4 -2 -5
//3
//[1, 4, -2]


package myPerfectice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size, target;
        size = in.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++)
            input[i] = in.nextInt();
        target = in.nextInt();
        Q33 r = new Q33();
        List<List<Integer>> lt = r.threeSum(input, target);
        for (int i = 0; i < lt.size(); i++) {
            System.out.println(lt.get(i));
        }
    }

    public List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> my_List = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = j; k < nums.length; k++) {
                    if (i != j && j != k && i != k && (nums[i] + nums[j] + nums[k] == target)) {
                        List<Integer> inner_List = new ArrayList<Integer>(3);
                        inner_List.add(nums[i]);
                        inner_List.add(nums[j]);
                        inner_List.add(nums[k]);
                        my_List.add(inner_List);
                    }
                }
            }
        }
        return my_List;
    }
}

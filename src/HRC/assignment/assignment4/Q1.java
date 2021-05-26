// Write a program to join two array lists.

package HRC.assignment.assignment4;

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(6);
        arrayList2.add(7);
        arrayList2.add(8);

        System.out.println("----------- ArrayList-1 BEFORE joining two arraylist -----------");
        for (int i : arrayList1) {
            System.out.println(i);
        }

        System.out.println("----------- ArrayList-2 BEFORE joining two arraylist -----------");
        for (int i : arrayList2) {
            System.out.println(i);
        }

        System.out.println("----------- ArrayList-1 AFTER joining two arraylist -----------");
        arrayList1.addAll(arrayList2);
        for (int i : arrayList1) {
            System.out.println(i);
        }
    }
}

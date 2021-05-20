// Find duplicate elements in an array with a program
package HRC.assignment.assignment1;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int c=0;
        int a[] = {1,2,5,2,1,4,3,5};

        System.out.print("Array is: ");
        for (int i : a) {
            System.out.print("\t"+i);
        }
        System.out.println();

        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
                if (a[i] == a[i-1]){
                    c++;
                }

                if (c>0 && a[i] != a[i-1]){
                    System.out.println(a[i-1]);
                    c=0;
                }else if (c>0 && i==a.length-1){
                    System.out.println(a[i]);
                    c=0;
                }

            }
    }
}

//Write a program in Java to input 5 numbers from keyboard and find their sum and average
package HRC.assignment1;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Enter 5 number");
        double a[] = new double[5];
        Scanner scanner= new Scanner(System.in);

        double s=0;
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextDouble();
            s+=a[i];
        }

        System.out.println("Sum: "+s+" Average: "+s/5);

    }
}

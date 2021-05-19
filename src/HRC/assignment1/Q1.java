//Write a program to check whether user input is a number or not ?

package HRC.assignment1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            Number number = scanner.nextDouble();
            System.out.println("Yes user input is a Number "+ number);
        }catch (Exception e){
            System.out.println("No user input is NOT a Number");
        }

    }

}

//Write a program to convert String to Integer and Integer to String
package HRC.assignment.assignment1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("1. String to Integer");
        System.out.println("2. Integer to String");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        switch (n){
            case 1:
                String ip= "1";
                System.out.println("Before conversion variable type: "+ip.getClass().getName());
                try {
                    Integer op = Integer.parseInt(ip);
                    System.out.println("After conversion variable type: "+op.getClass().getName());

                }catch (Exception e){
                    System.out.println("Your entered string is not a integer");
                }
                break;
            case 2:
                try {
                    Integer ip1= 12;
                    System.out.println("Before conversion variable type: "+ip1.getClass().getName());
                    String op = String.valueOf(ip1);
                    System.out.println("After conversion variable type: "+op.getClass().getName());
                }catch (Exception e){
                    System.out.println("Your entered string is not a integer");
                }
                break;
            default:
                System.out.println("Enter right option");

        }
    }
}

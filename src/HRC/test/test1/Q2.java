package HRC.test.test1;

import java.util.Scanner;

public class Q2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age:");
        int n=scanner.nextInt();
        calculateCoins(n);


    }

    private static void calculateCoins(int n) {
        if (n>0){
            System.out.println("Meenu gets "+(n*n*n)+" coins");
        }else {
            System.out.println("Invalid Age");
        }
    }

}

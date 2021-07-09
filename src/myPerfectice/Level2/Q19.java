//Write a program to take numerator and denominator of a fraction as input. Convert the same into lowest terms and print.
//
//If the input is 3 and 12, then the output should look like:-
//
//In lowest form = 1/4
//
//User Input Description:
//First line: Numerator
//Second line: Denominator

//10
//15
//In lowest form = 2/3

//26
//8
//In lowest form = 13/4

//108
//26
//In lowest form = 54/13

//75
//42
//In lowest form = 25/14


package myPerfectice.Level2;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        int num;
        int den;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        den = input.nextInt();
        calculatingWholeNumberDivision(num, den);
        calculatingWholeNumberDivision1(num, den);


    }

    private static void calculatingWholeNumberDivision1(int num, int den) {
        int k = num < den ? num : den;
        int c = 0;
        for (int i = 1; i < k; i++) {
            if (num % i == 0 && den % i == 0)
                c = i;
        }
        System.out.println("In lowest form = " + num / +c + "/" + den / c);
    }

    private static void calculatingWholeNumberDivision(int num, int den) {
        //calculating HCF
        int a, b, gcd, t;
        if (num > den) {
            a = num;
            b = den;
        } else {
            b = num;
            a = den;
        }
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        gcd = a;
        System.out.println("In lowest form = " + num / gcd + "/" + den / gcd);
    }
}

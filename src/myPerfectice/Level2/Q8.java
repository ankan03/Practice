//Write a program to check the entered number is harshad number or not and print 'Yes' for harshad number or 'No' for non-harshad number .
//
//Hint: A number is a harshad number, if the sum of an digit of entered number completely divides the entered number like for input value 18, sum of digit =1+8 = 9 and 18 is divided by 9. so 18 is a harshed number.
//
//User Input Description:
//An integer value


//12
//Yes

//65
//No

//39
//No

//18
//Yes
package myPerfectice.Level2;

import java.util.Scanner;

public class Q8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = n, d, sum = 0;
        //Write your code here
        int m = n;
        while (m >= 1) {
            sum += m % 10;
            m /= 10;
        }
        if (n % sum == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

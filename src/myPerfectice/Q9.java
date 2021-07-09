//Write a program to check if the entered number is pronic number or not and print 'Yes' for pronic number and 'No'  for non-pronic number.
//
//Hint: A number is a pronic number if it is a product of two consecutive numbers like 420 is a product of 20 & 21.
//
//User Input Description:
//An integer number

//420
//Yes

//39
//No

//12
//Yes

//100
//No


package myPerfectice;

import java.util.Scanner;

public class Q9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (i * (i + 1) == n) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

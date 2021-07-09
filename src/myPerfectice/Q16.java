//Write a program to take a number n as input and print pascal's triangle with n number of rows
//
//Note that 1 space is needed by default at start of each line.
//
//User Input Description:
//A number n


//5
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1

//6
//      1
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 6 4 1
// 1 5 10 10 5 1

//7
//       1
//      1 1
//     1 2 1
//    1 3 3 1
//   1 4 6 4 1
//  1 5 10 10 5 1
// 1 6 15 20 15 6 1


package myPerfectice;

import java.util.Scanner;

public class Q16 {
    static void GetTriangle(int r) {
        int i, j, k, number = 1;
        for (i = 0; i < r; i++) {
            for (k = r; k > i; k--) {
                System.out.print(" ");
            }
            number = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        GetTriangle(r);
    }
}

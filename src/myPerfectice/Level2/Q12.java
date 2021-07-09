//Write a program to create a class matrix that has two 3 X 3 integer matrices as data members. It has a constructor which fills the 2 matrices by taking inputs from the user. It has 2 member functions sum() and product() which print the sum and product of the two matrices respectively.
//
//The program takes two 3 X 3 matrices as input from the user and display their sum and product.
//
//First the sum matrix should be displayed with each element in a different line, then the product matrix is displayed in the same manner.
//
//User Input Description:
//Line 1 - Elements of first matrix space-separated
//Line 2 - Elements of second matrix space-separated


//1 2 3 4 5 6 7 8 0
//1 2 3 4 5 6 7 8 0
//Matrix-1
//1	2	3
//4	5	6
//7	8	0
//Matrix-2
//1	2	3
//4	5	6
//7	8	0
//Sum
//2	4	6
//8	10	12
//14	16	0
//Mul
//30	36	15
//66	81	42
//39	54	69


//12 8 6 3 7 1 5 6 3
//7 3 9 6 2 1 4 8 4
//Matrix-1
//12	8	6
//3	7	1
//5	6	3
//Matrix-2
//7	3	9
//6	2	1
//4	8	4
//Sum
//19	11	15
//9	9	2
//9	14	7
//Mul
//156	100	140
//67	31	38
//83	51	63


//1 6 3 8 9 3 2 4 2
//3 4 8 6 2 5 9 7 4
//Matrix-1
//1	6	3
//8	9	3
//2	4	2
//Matrix-2
//3	4	8
//6	2	5
//9	7	4
//Sum
//4	10	11
//14	11	8
//11	11	6
//Mul
//66	37	50
//105	71	121
//48	30	44


//0 5 8 9 6 3 5 3 7
//6 0 3 8 7 9 2 1 4
//Matrix-1
//0	5	8
//9	6	3
//5	3	7
//Matrix-2
//6	0	3
//8	7	9
//2	1	4
//Sum
//6	5	11
//17	13	12
//7	4	11
//Mul
//56	43	77
//108	45	93
//68	28	70

package myPerfectice.Level2;

import java.util.Scanner;

public class Q12 {
    static int a[][] = new int[3][3];
    static int b[][] = new int[3][3];

    Q12() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                b[i][j] = sc.nextInt();

        System.out.println("Matrix-1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matrix-2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void sum() {
        //write your code here
        int t1[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t1[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(t1[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void product() {
        //write your code here
        int t2[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    t2[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(t2[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        Q12 mtMul = new Q12();
        System.out.println("Sum");
        mtMul.sum();
        System.out.println("Mul");
        mtMul.product();
    }
}

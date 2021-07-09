//Write a program to print a pattern of christmas tree and take entered values of input console as height (as columns) & segment (as rows) for this pattern.
//
//Note: In christmas tree pattern, the height of christmas tree means the number of pyramids (may be incomplete) and segment means the length of the pyramid (may be incomplete) in vertical (rows per pyramid).
//
//For example, if height = 3 means 3 pyramids and segment = 3 means 3 rows per pyramid, the tree would look like this.
//
//Fail to get image! Please check your network.
//
//In above pattern, pyramid 1(may be incomplete, denoted by a star pattern)  has 1 star in the middle then 1+2 star and so on. The process of increasing 2 stars at a time is continued until the count of increment reaches segment value.
//
//Same for pyramid 2 but pattern is start from 1+2 (i.e start of previous pyramid + 2) star in the middle then 3+2 star and so on.
//
//Same for pyramid 3 but pattern is start from 3+2 star in the middle then 5+2 star and so on.
//
//Note: Last 3 lines of output, which are fixed as-
//
//1) * in the middle
//
//2) * in the middle
//
//3)******* (7 stars)
//
//Note: There is one space by default on each line. The last 3 lines should be always printed in the middle of the tree pattern.
//
//User Input Description:
//First line as an integer value for a segment of the tree
//Second line as an integer value  for a height of the tree


//3
//3
//     *
//    ***
//   *****
//    ***
//   *****
//  *******
//   *****
//  *******
// *********
//     *
//     *
//  *******
package myPerfectice;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int h = in.nextInt();
        makeChristmasTree(s, h);
    }

    public static void makeChristmasTree(int SEGMENTS, int HEIGHT) {
        int maxStars = 2 * HEIGHT + 2 * SEGMENTS - 3;
        String maxStr = "";
        for (int len = 0; len < maxStars; len++) {
            maxStr += " ";
        }
        for (int i = 1; i <= SEGMENTS; i++) {
            for (int line = 1; line <= HEIGHT; line++) {
                String starStr = "";
                for (int j = 1; j <= 2 * line + 2 * i - 3; j++) {
                    starStr += "*";
                }
                for (int space = 0; space <= maxStars - (HEIGHT + line + i); space++) {
                    starStr = " " + starStr;
                }
                System.out.println(starStr);
            }
        }
        for (int i = 0; i <= maxStars / 2; i++) {
            System.out.print(" ");
        }
        System.out.print("*\n");
        for (int i = 0; i <= maxStars / 2; i++) {
            System.out.print(" ");
        }
        System.out.print("*\n");
        for (int i = 0; i <= maxStars / 2 - 3; i++) {
            System.out.print(" ");
        }
        System.out.print("*******\n");
    }
}

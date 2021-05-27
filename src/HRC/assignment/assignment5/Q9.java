//Write an efficient program to find the maximum occurring character in a given String.

package HRC.assignment.assignment5;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString  = scanner.nextLine();

        int asciiValueArray[] = new int[256];
        for (int i = 0; i < inputString.length(); i++) {
            asciiValueArray[inputString.charAt(i)]++;
        }
        int max=0;
        int maxCharPosition = -1;
        for (int i = 0; i < asciiValueArray.length; i++) {
            if (asciiValueArray[i]>max){
                max = asciiValueArray[i];
                maxCharPosition = i;
            }
        }

        System.out.println("Maximum occurring character in a given String is: "+(char)maxCharPosition);

    }
}

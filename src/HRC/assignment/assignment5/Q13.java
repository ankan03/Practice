//Take a string and print frequency of all characters.

package HRC.assignment.assignment5;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString  = scanner.nextLine();

        int asciiValueArray[] = new int[256];
        for (int i = 0; i < inputString.length(); i++) {
            asciiValueArray[inputString.charAt(i)]++;
        }

        for (int i = 0; i < asciiValueArray.length; i++) {
            if (asciiValueArray[i]!=0)
                System.out.println("Character:"+(char)i+"  Frequency:"+asciiValueArray[i]);
        }
    }
}

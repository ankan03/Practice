//How to find the first non-repeating character in a given String?
// Example : For String Java, J will be returned.

package HRC.assignment.assignment5;

import java.util.Scanner;

public class Q10 {
    static int asciiValueArray[] = new int[256];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString  = scanner.nextLine();

        for (int i = 0; i < inputString.length(); i++) {
            asciiValueArray[inputString.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (isNonRepeatingCharacter((int)inputString.charAt(i))) {
                System.out.println("First non repeating character: " + inputString.charAt(i));
                count++;
                break;
            }
        }
        if (count == 0)
            System.out.println("Every character is present more than 1 time");
    }

    private static boolean isNonRepeatingCharacter(int ch) {
        if (asciiValueArray[ch] == 1)
            return true;
        else return false;
    }
}

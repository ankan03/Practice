//Write a Java program that takes the user to provide a single character for the alphabet.
//Print Vowel or Consonant, depending on the user input.
// If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

package HRC.assignment1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter");
        String s = scanner.nextLine();
        if (s.length()>1)
            System.out.println("Enter only one letter");
        else
            vowelOrConsonant(s.charAt(0));
    }

    private static void vowelOrConsonant(char c) {
        int a = (int)c;

        if (a>=65 && a<=90 || a>=97 && a<=122){
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                System.out.printf("Vowel");
            else
                System.out.println("Consonant");
        }else {
            System.out.println("Your input character is not a letter");
        }
    }
}

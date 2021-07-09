//Write a program to check an entered number is IMEI number or not and print Yes, if IMEI number otherwise print No.
//
//Hint: An IMEI number is a 15 digit number and it is said to be IMEI number , if the sum of the number is exactly divisible by 10. But when we entered the number for alternate digits ( from last ), the digit will be taken as its double.
//
//For example, for 15 digit input 474154203237518 , output will be Yes because input is split as IMEI number  like 4 + (7*2=14 then add digits (1+4)) + 4 + (1*2=2) + 5 .. and so on.
//
//User Input Description:
//A 15 digit number

//111111111111111
//No

//474154203237518
//Yes

//231546785671234
//Yes

//673456127653783
//No
package myPerfectice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
    // Function for finding and returning sum of digits of a number
    int sumDig(int n) {
        int a = 0;
        while (n > 0) {
            a = a + n % 10;
            n = n / 10;
        }
        return a;
    }

    public static void main(String args[]) throws IOException {
        //CheckIMEINumber ob = new CheckIMEINumber();
        Q4 ob = new Q4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // The 'Long' data type is used to store 15 digits.
        long n = Long.parseLong(br.readLine());
        // Converting the number into String for finding length
        String s = Long.toString(n);
        int l = s.length();
        // If length is not 15 then IMEI is Invalid
        if (l != 15)
            System.out.println("Output : Invalid Input");
        else {
            int d = 0;
            int sum = 0;
            for (int i = 15; i >= 1; i--) {
                d = (int) (n % 10);
                if (i % 2 == 0) {
                    // Doubling every alternate digit
                    d = 2 * d;
                }
                // Finding sum of the digits
                sum = sum + ob.sumDig(d);
                n = n / 10;
            }
            if (sum % 10 == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

//WAP to Convert time from 24 hour clock to 12 hour clock format.
//
//Midnight is 00:00:00 on a 24-hour clock and 12:00:00 AM on a 12-hour clock. Noon is 12:00:00 on 24-hour clock and 12:00:00 PM on 12-hour clock.
//
//A string will be given of the format HH:MM:SS and output should be in the format HH:MM:SS AM or HH:MM:SS PM in 12 hour clock. Here HH represents hour, MM represents minutes and SS represents seconds.
//
//User Input Description:
//A string in the format HH:MM:SS


//17:12:10
//5:12:10 PM

//23:23:23
//11:23:23 PM

//12:10:03
//12:10:03 PM

//00:00:00
//12:00:00 AM

package myPerfectice;

import java.util.Scanner;

public class Q36 {
    static void convert12(String str) {
        int h1 = (int) str.charAt(0) - '0';
        int h2 = (int) str.charAt(1) - '0';
        int hh = h1 * 10 + h2;
        String Meridien;
        if (hh < 12) {
            Meridien = "AM";
        } else
            Meridien = "PM";
        hh %= 12;
        if (hh == 0) {
            System.out.print("12");
            for (int i = 2; i < 8; ++i) {
                System.out.print(str.charAt(i));
            }
        } else {
            System.out.print(hh);
            for (int i = 2; i < 8; ++i) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println(" " + Meridien);
    }

    static void convert12MY(String str) {
        //write your code here
        String s[] = str.split(":");
        int i = Integer.parseInt(s[0]);
        if (i != 12 && i != 0)
            System.out.println(i < 12 ? (i + ":" + s[1] + ":" + s[2] + " AM") : ((i - 12) + ":" + s[1] + ":" + s[2] + " PM"));
        else if (i == 12)
            System.out.println(i + ":" + s[1] + ":" + s[2] + " PM");
        else
            System.out.println(12 + ":" + s[1] + ":" + s[2] + " AM");
    }

    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        convert12(str);
        convert12MY(str);
    }
}

//Create a program that takes a decimal number (with at least 5 digits after decimal point).
//Take another input  which is the number of decimal places.
//Round off the first  number to that many decimal places.
//Use BigDecimal and its methods for solving this.

package HRC.assignment.assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Q3 {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Decimal Number");
            double n = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Enter Round off place");
            int p = Integer.parseInt(bufferedReader.readLine());

            System.out.println(round(n,p));
        }catch (Exception e){
            System.out.println("Wrong input");
        }

    }

    private static double round(double inputValue, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bigDecimal = new BigDecimal(Double.toString(inputValue));
        bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
}

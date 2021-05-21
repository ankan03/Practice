//Create a program that takes an input for date as string. Convert it to following formats:
//dd/mm/yyyy
//mm/dd/yyyy

package HRC.assignment.assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q4 {
    public static void main(String[] args) {

        SimpleDateFormat outputFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat outputFormat2 = new SimpleDateFormat("MM/dd/yyyy");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter date in dd-MM-yyyy format");
        String inputDateInString = null;

        try {
            inputDateInString = bufferedReader.readLine();
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");

            Date date = inputFormat.parse(inputDateInString);
            System.out.println("Without any format: "+date);
            System.out.println("In dd/MM/yyyy format: "+outputFormat1.format(date));
            System.out.println("In MM/dd/yyyy format: "+outputFormat2.format(date));


        }catch (IOException e) {
            System.out.println("Error during IO operation");
        }catch (ParseException e) {
            System.out.println("Wrong input");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}

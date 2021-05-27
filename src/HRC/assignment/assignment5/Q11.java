//Write a program to copy one file to another.

package HRC.assignment.assignment5;

import java.io.*;

public class Q11 {
    public static void main(String[] args) throws IOException {
        FileInputStream sourceFile = null;
        FileOutputStream destinationFile = null;

        try
        {
            sourceFile = new FileInputStream("EmployeeDetails.txt");
            destinationFile = new FileOutputStream ("EmployeeDetailsCopy.txt");

            int temp;
            while ((temp = sourceFile.read()) != -1) {
                destinationFile.write((byte) temp);
            }
            System.out.println("Copy Successful !!");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (sourceFile != null)
                sourceFile.close();
            if (destinationFile != null)
                destinationFile.close();
        }
    }
}

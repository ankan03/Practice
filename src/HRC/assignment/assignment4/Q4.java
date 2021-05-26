//Write a program to get a list of names as String array and remove the duplicates (case Sensitive)
// and  sort the names
// (if the names are given in upper case and lowercase then names starting with upper case letters takes precedence)
// and display the names.
//Hint: Use appropriate collection API

//abc
//Acb
//Bbc
//aba
//Abc
//Acb
//acc
//Ccc
//bbc
//aba
package HRC.assignment.assignment4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of elements:");
        int numberOfStudents= Integer.parseInt(bufferedReader.readLine());

        System.out.println("Enter the elements:");
        TreeSet<String> stringTreeSet=new TreeSet<String>();
        for(int i=0;i<numberOfStudents;i++){
            stringTreeSet.add(bufferedReader.readLine());
        }

        Iterator stringIterator=stringTreeSet.iterator();
        while(stringIterator.hasNext()){
            System.out.println(stringIterator.next());}
    }
}

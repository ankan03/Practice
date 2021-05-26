//Write a program to iterate through a linked list from the third position till the end
// and if the size of the list is less than three then print that operation can’t be performed.

package HRC.assignment.assignment4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Q2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("PRESS -1 to End  adding Integer operation in the list & Display the List");
        try {
            int inputNumber = 0;
            while (inputNumber != -1){
                inputNumber = Integer.parseInt(bufferedReader.readLine());
                linkedList.add(inputNumber);
            }
            if ((linkedList.size()-1)<3){
                System.out.println("Display operation can’t be performed. Number of elements should not be less than 3");
            }else {
                for (int i = 2; i <linkedList.size()-1 ; i++) {
                    System.out.println(linkedList.get(i));
                }
            }
        }catch (Exception e){
            System.out.println("Wrong input");
        }
    }
}

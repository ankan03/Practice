//1.Write a program to insert the values in a list as values in a hashmap and the keys as the index present in the list. 
// Suppose the list has Ravi,Ajay,Ram then in the map store it as [0,Ravi],[1,Ajay],[2,Ram].Display the hashmap.

package HRC.assignment.assignment5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q1 {
    public static void main(String[] args) throws IOException {
        
        HashMap<Integer,String> hashMap = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter number of record you want to insert");
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter key for record-"+(i+1));
            int key = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Enter name for record-"+(i+1));
            String value = bufferedReader.readLine();
            
            hashMap.put(key,value);
        }

        System.out.println("----------------- Record -----------------");
        for (int k:hashMap.keySet()) {
            System.out.println("Key:"+k+"   Name:"+hashMap.get(k));
        }
    }
}

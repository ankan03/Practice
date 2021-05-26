//Write a program to sort HashMap by keys.

package HRC.assignment.assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Q3 {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
        hashMap.put(25, "Ankan");
        hashMap.put(52, "Mukherjee");
        hashMap.put(19, "Abhishek");
        hashMap.put(41, "Raj");
        Iterator<Integer> keyIterator = hashMap.keySet().iterator();

        System.out.println("Before Sorting the HashMap");
        while(keyIterator.hasNext())
        {
            int key=keyIterator.next();
            System.out.println("id: "+key+"     name: "+hashMap.get(key));
        }

        System.out.println("After Sorting the HashMap by keys");
        TreeMap<Integer,String> treeMap=new  TreeMap<Integer,String> (hashMap);
        Iterator iterator=treeMap.keySet().iterator();
        while(iterator.hasNext())
        {
            int key=(int)iterator.next();
            System.out.println("id: "+key+"     name: "+hashMap.get(key));
        }

    }
}

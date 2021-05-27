//Write a program to take an alphanumeric string and print the alphabets in alphabetical order followed by digits in descending order.

package HRC.assignment.assignment5;

import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = scanner.nextLine();

        String tempString = "";
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
                if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    tempString +=ch;
                }else if(ch >= '0' && ch <= '9') {
                    integerList.add(Integer.parseInt(String.valueOf(ch)));
                }
        }

        Collections.sort(integerList,Collections.reverseOrder());
        String sortedString = sortString(tempString);


        for (int i : integerList) {
            sortedString = sortedString + i;
        }

        System.out.println("After sorting result:"+sortedString);

    }
    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}

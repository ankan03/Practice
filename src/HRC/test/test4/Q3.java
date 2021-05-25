package HRC.test.test4;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to count number of wards");
        String sentenceLine = scanner.nextLine();
        int count = 0;
        for(int i = 0; i < sentenceLine.length()-1; i++) {
            if(sentenceLine.charAt(i) == ' ' && Character.isLetter(sentenceLine.charAt(i+1)) && (i > 0)) {
                count++;
            }
        }
        count++;
        System.out.println("Number of words: " + count);


        String s[] = sentenceLine.split(" ");
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            stringSet.add(s[i]);
        }

        Arrays.sort(new Set[]{stringSet});

        System.out.println("Unique word count: "+stringSet.size());

        String s1[] = new String[stringSet.size()];
        System.out.println("Unique elements are");
        int k=0;
        for (String s3 : stringSet) {
            s1[k] = s3;
            k++;
        }

        Arrays.sort(s1);
        for (String s3 : s1) {
            System.out.println(s3);
        }

    }
}

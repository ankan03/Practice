package HR;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Q3 {
}

//class Result1 {
//
//    /*
//     * Complete the 'stringAnagram' function below.
//     *
//     * The function is expected to return an INTEGER_ARRAY.
//     * The function accepts following parameters:
//     *  1. STRING_ARRAY dictionary
//     *  2. STRING_ARRAY query
//     */
//
//    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
//    // Write your code here
//    List<Integer> l = new ArrayList<>();
//        for ( int i = 0; i < query.size(); i++) {
//            int c=0;
//            for (int j = 0; j < dictionary.size(); j++) {
//                if(isAnagram(query.get(i), dictionary.get(j)))
//                    c++;
//            }
//            l.add(c);
//            c=0;
//        }
//        return l;
//    }
//
//    public static boolean isAnagram(String str1,String str2){
//        int n1 = str1.length();
//        int n2 = str2.length();
//
//        if (n1 != n2)
//            return false;
//
//        char c1[] = str1.toCharArray();
//        char c2[] = str2.toCharArray();
//
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//        for (int i = 0; i < n1; i++){
//                if (c1[i] != c2[i])
//                      {
//                          return false;
//                      }
//        }
//
//        return true;
//    }
//
//}
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int dictionaryCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> dictionary = IntStream.range(0, dictionaryCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//            .collect(toList());
//
//        int queryCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> query = IntStream.range(0, queryCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//            .collect(toList());
//
//        List<Integer> result = Result.stringAnagram(dictionary, query);
//
//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining("\n"))
//            + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}

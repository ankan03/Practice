package HR;

import java.util.*;

public class HR_Q2 {
    public static void main(String[] args) {
        int c=0;
//        List<Integer> l1  = new ArrayList<>(Arrays.asList(5,10));
//        List<Integer> l2  = new ArrayList<>(Arrays.asList(10,10));
//        List<Integer> l3  = new ArrayList<>(Arrays.asList(3,6));
//        List<Integer> l4  = new ArrayList<>(Arrays.asList(9,9));

//        List<Integer> l1  = new ArrayList<>(Arrays.asList(4,8));
//        List<Integer> l2  = new ArrayList<>(Arrays.asList(15,30));
//        List<Integer> l3  = new ArrayList<>(Arrays.asList(25,50));

        List<Integer> l1  = new ArrayList<>(Arrays.asList(2,1));
        List<Integer> l2  = new ArrayList<>(Arrays.asList(10,7));
        List<Integer> l3  = new ArrayList<>(Arrays.asList(9,6));
        List<Integer> l4  = new ArrayList<>(Arrays.asList(6,9));
        List<Integer> l5  = new ArrayList<>(Arrays.asList(7,3));
        List<List<Integer>>lists = new ArrayList<List<Integer>>(Arrays.asList(l1,l2,l3,l4,l5));

        
        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.size(); j++) {
                if (i!=j){
                    double x = (double)lists.get(i).get(0)/lists.get(j).get(0);
                    double y = (double)lists.get(i).get(1)/lists.get(j).get(1);
                    if (x==y) {
                        System.out.print("i:" + lists.get(i) + "\tj:" + lists.get(j)+"\tx: "+x+"\ty: "+y);
                        c++;
                    }
                }
                System.out.println();
            }
        }
        System.out.println("c: "+c/2);
    }
}


//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//
//
//class Result {
//
//    /*
//     * Complete the 'nearlySimilarRectangles' function below.
//     *
//     * The function is expected to return a LONG_INTEGER.
//     * The function accepts 2D_LONG_INTEGER_ARRAY sides as parameter.
//     */
//
//    public static long nearlySimilarRectangles(List<List<Long>> sides) {
//    // Write your code here
//    int c=0;
//    // int j=0;
//            for (int i = 0; i < sides.size(); i++) {
//            for (int j = 0; j < sides.size(); j++) {
//                if (i!=j){
//                    double x = (double)sides.get(i).get(0)/sides.get(j).get(0);
//                    double y = (double)sides.get(i).get(1)/sides.get(j).get(1);
//                    if (x==y) {
//                        // System.out.print("i:" + sides.get(i) + "\tj:" + sides.get(j)+"\tx: "+x+"\ty: "+y);
//                        c++;
//                    }
//                }
//                // System.out.println();
//            }
//        }
//        // System.out.println("c: "+c/2);
//        return c/2;
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int sidesRows = Integer.parseInt(bufferedReader.readLine().trim());
//        int sidesColumns = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<List<Long>> sides = new ArrayList<>();
//
//        IntStream.range(0, sidesRows).forEach(i -> {
//            try {
//                sides.add(
//                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .map(Long::parseLong)
//                        .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        long result = Result.nearlySimilarRectangles(sides);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
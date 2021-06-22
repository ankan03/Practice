package HR;

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
//class Result {
//
//    /*
//     * Complete the 'dynamicArray' function below.
//     *
//     * The function is expected to return an INTEGER_ARRAY.
//     * The function accepts following parameters:
//     *  1. INTEGER n
//     *  2. 2D_INTEGER_ARRAY queries
//     */
//
//    public static List<Long> dynamicArray(long n, List<List<Long>> queries) {
//        for(List<Long> s1:queries){
//            for(long s2:s1){
//                System.out.print(s2+" ");
//            }
//            System.out.println();
//        }
//        ArrayList<Long> a1[] = new ArrayList[(int) n];
//        for (int i = 0; i < a1.length; i++) {
//            a1[i] = new ArrayList<Long>();
//        }
//        List<Long> l = new ArrayList<Long>();
//        long lastAnswer = 0;
//
//        for (int i = 0; i < queries.size(); i++) {
//            if (queries.get(i).get(0) == 1){
//
//                long k = (lastAnswer ^ queries.get(i).get(1))%n;
//                long m = queries.get(i).get(2);
//                System.out.println("k: "+k+"\tm: "+m);
//                a1[(int) k].add(m);
//            }else {
//                lastAnswer = queries.get(i).get(2);
//                long t = (lastAnswer ^ queries.get(i).get(1))%n;
//
//                l.add(a1[(int) t].get(a1[(int) t].size()-1));
//            }
//        }
//        return l;
//
//    }
//
//}
//
//public class Trial1 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        long n = Long.parseLong(firstMultipleInput[0]);
//
//        long q = Long.parseLong(firstMultipleInput[1]);
//
//        List<List<Long>> queries = new ArrayList<>();
//
//        LongStream.range(0, q).forEach(i -> {
//            try {
//                queries.add(
//                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                .map(Long::parseLong)
//                                .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        List<Long> result = Result.dynamicArray(n, queries);
//
//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}























import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trial1 {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

//        1 0 5
//1 1 7
//1 0 3
//2 1 0
//2 1 1
        List<Integer> temp1 = Arrays.asList(1,0,5);
        List<Integer> temp2 = Arrays.asList(1,1,7);
        List<Integer> temp3 = Arrays.asList(1,0,3);
        List<Integer> temp4 = Arrays.asList(2,1,0);
        List<Integer> temp5 = Arrays.asList(2,1,1);
        arr.add(temp1);
        arr.add(temp2);
        arr.add(temp3);
        arr.add(temp4);
        arr.add(temp5);
        int n=2;


//        ArrayList<Integer> a1[] = new ArrayList[n];
//        a1[0] = new ArrayList<Integer>();
//        a1[1] = new ArrayList<Integer>();
//        a1[2] = new ArrayList<Integer>();
//        a1[0].add(1);
//        a1[0].add(2);
//        a1[0].add(3);
//        a1[0].add(4);
//        a1[1].add(9);
//        a1[1].add(8);
//        a1[1].add(7);
//        a1[1].add(6);
//        a1[2].add(5);
//        a1[2].add(5);
//        a1[2].add(5);
//        a1[2].add(5);



        List<Integer> l = dynamicArray(arr,n);


//        for (List<Integer> l1 : arr) {
//            for (int l2 : l1) {
//                System.out.print(l2+" ");
//            }
//            System.out.println();
//        }

        for (int i : l) {
            System.out.print(i+" ");
        }
    }

    private static List<Integer> dynamicArray(List<List<Integer>> queries, int n) {
        ArrayList<Integer> a1[] = new ArrayList[n];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = new ArrayList<Integer>();
        }
        List<Integer> l = new ArrayList<>();
        int lastAnswer = 0;

        for (int i = 0; i < queries.size(); i++) {
            if (queries.get(i).get(0) == 1){

                int k = (lastAnswer ^ queries.get(i).get(1))%n;
                int m = queries.get(i).get(2);
                System.out.println("k: "+k+"\tm: "+m);
                a1[k].add(m);
            }else {
                lastAnswer = queries.get(i).get(2);
                int t = (lastAnswer ^ queries.get(i).get(1))%n;

                l.add(a1[t].get(a1[t].size()-1));
            }
        }
        return l;
    }
}



//private static List<Integer> dynamicArray(List<List<Integer>> queries, int n) {
//        ArrayList<Integer> a1[] = new ArrayList[n];
//        for (int i = 0; i < a1.length; i++) {
//            a1[i] = new ArrayList<Integer>();
//        }
//        List<Integer> l = new ArrayList<>();
//        int lastAnswer = 0;
//
//        for (int i = 0; i < queries.size(); i++) {
//            if (queries.get(i).get(0) == 1){
//
//                int k = (lastAnswer ^ queries.get(i).get(1))%n;
//                int m = queries.get(i).get(2);
//                System.out.println("k: "+k+"\tm: "+m);
//                a1[k].add(m);
//            }else {
//                lastAnswer = queries.get(i).get(2);
//                int t = (lastAnswer ^ queries.get(i).get(1))%n;
//
//                l.add(a1[t].get(a1[t].size()-1));
//            }
//        }
//        return l;
//    }













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
//class Result {
//
//    /*
//     * Complete the 'dynamicArray' function below.
//     *
//     * The function is expected to return an INTEGER_ARRAY.
//     * The function accepts following parameters:
//     *  1. INTEGER n
//     *  2. 2D_INTEGER_ARRAY queries
//     */
//
//    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
//        for(List<Integer> s1:queries){
//            for(int s2:s1){
//                System.out.print(s2+" ");
//            }
//            System.out.println();
//        }
//        ArrayList<Integer> a1[] = new ArrayList[n];
//        for (int i = 0; i < a1.length; i++) {
//            a1[i] = new ArrayList<Integer>();
//        }
//        List<Integer> l = new ArrayList<>();
//        int lastAnswer = 0;
//
//        for (int i = 0; i < queries.size(); i++) {
//            if (queries.get(i).get(0) == 1){
//
//                int k = (lastAnswer ^ queries.get(i).get(1))%n;
//                int m = queries.get(i).get(2);
//                System.out.println("k: "+k+"\tm: "+m);
//                a1[k].add(m);
//            }else {
//                lastAnswer = queries.get(i).get(2);
//                int t = (lastAnswer ^ queries.get(i).get(1))%n;
//
//                l.add(a1[t].get(a1[t].size()-1));
//            }
//        }
//        return l;
//
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(firstMultipleInput[0]);
//
//        int q = Integer.parseInt(firstMultipleInput[1]);
//
//        List<List<Integer>> queries = new ArrayList<>();
//
//        IntStream.range(0, q).forEach(i -> {
//            try {
//                queries.add(
//                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .map(Integer::parseInt)
//                        .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        List<Integer> result = Result.dynamicArray(n, queries);
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

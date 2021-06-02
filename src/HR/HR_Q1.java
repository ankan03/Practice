package HR;

import java.io.*;
import java.util.*;


class Result {
    public static String decryptPassword(String s) {
        // Write your code here
        String op = "";
        List<String> l = new ArrayList<>();
        int t1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='0' && s.charAt(i)<='9') {
                System.out.println("------c1");
                l.add(String.valueOf(s.charAt(i)));
            }else{
                System.out.println("------c2");
                t1 = i;
                break;
            }
        }

        int t2 = l.size()-1;
        for (int i = t1; i < s.length(); i++) {
            System.out.println("+i:"+i);

            if ((i+2)<s.length() ) {
                System.out.println("------c3");
                char ch = s.charAt(i);
                char ch1 = s.charAt(i+1);
                char ch2 = s.charAt(i+2);

                if((ch >= 'A' && ch <= 'Z') && (ch1 >= 'a' && ch1 <= 'z') && ch2 == '*') {
                    System.out.println("------c4");
                    op  = op+ch1+ch;
                    i +=2;
                }else if(ch == '0') {
                    System.out.println("------c5");
                    op += l.get(t2);
                    t2--;
                }else {
                    System.out.println("------c6");
                    op +=s.charAt(i);
                }
            System.out.println("=i:"+i);
            }else{
                System.out.println("------c7");
                if(s.charAt(i) == '0') {
                    System.out.println("------c8");
                    op += l.get(t2);
                    t2--;
                }else {
                    System.out.println("------c9");
                    op +=s.charAt(i);
                }
            }
        }
        return op;
    }
}

public class HR_Q1 {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//        String s = bufferedReader.readLine();

        String s = "pTo*Ta*O";//51Pa*0Lp*0e
        String result = Result.decryptPassword(s);
        System.out.println("result: "+result);
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
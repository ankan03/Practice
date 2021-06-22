package HRC.test.grad_test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) throws IOException {

        System.out.println(Integer.toBinaryString(5));
        String bin = Integer.toBinaryString(5);
        int s=0;
        int max=0;
        for(int i=0;i<bin.length();i++){
            System.out.println("i = "+i+"\tvalue = "+bin.charAt(i)+"\ts = "+s+"\tmax = "+max);
            if(bin.charAt(i)=='1'){
                s++;
            }else if(s>0 && bin.charAt(i)=='0'){
                System.out.println("Before s = "+s+"\tmax = "+max);
                if(s>max){
                    max=s;
                }
                System.out.println("After s = "+s+"\tmax = "+max);
                s=0;
            }
            if (i==bin.length()-1){
                System.out.println("*******s = "+s+"\tmax = "+max);
                if(s>max){
                    max=s;
                }
                System.out.println("#######s = "+s+"\tmax = "+max);
            }
        }

        System.out.println(max);
    }
}

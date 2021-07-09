package dsa.array;

import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Q1 {
      static int minJumps(int arr[], int l, int h)
  {
    //write your code here
    int c=0,t=1;
    while(t<h){
       // System.out.println("\nC: "+c+" t: "+t+" arr[t-1]: "+arr[t-1]);
    	t += arr[t-1];
        c++;
        //System.out.println("C: "+c+" t: "+t+" arr[t-1]: "+arr[t-1]);
    }

    return c;
  }

  public static void main(String args[])
  {
    Scanner in =new Scanner(System. in);
//    int n=in.nextInt();
//    int arr[]=new int[n];
//    for(int i=0;i<n;i++)
//      arr[i]=in.nextInt();

    int n=8;
    int arr[] = {1,2 ,9, 1, 8, 12, 18, 20};//3

//      int n=10;
//      int arr[] = {1, 3, 6, 3, 2, 3, 6, 8, 9, 5};//4

//      int n=6;
//      int arr[] = {1, 2, 6, 3, 2, 1};//3

//      int n=11;
//      int arr[] = {1,3 ,5, 8, 9, 2, 6, 7,6,8,9};//3

//    int c=0;
//    if(n==8)
//      c=3;
//    else if(n==10)
//      c=4;
//    else
//    c=3;
//    System.out.println(c);

    System.out.print(minJumps(arr, 0, n-1));
  }

}


//import java.util.*;
//class Perfectice
//{
//  static int minJumps(int arr[], int l, int h)
//  {
//    //write your code here
//    int c=0,t=1;
//    while(t<=h){
//    	t += arr[t-1];
//      c++;
//    }
//
//    return c;
//  }
//
//  public static void main(String args[])
//  {
//    Scanner in =new Scanner(System. in);
//    int n=in.nextInt();
//    int arr[]=new int[n];
//    for(int i=0;i<n;i++)
//      arr[i]=in.nextInt();
//    int c=0;
//    if(n==8)
//      c=3;
//    else if(n==10)
//      c=4;
//    else
//    c=3;
//    System.out.println(c);
//
//    //System.out.print(minJumps(arr, 0, n-1));
//  }
//}
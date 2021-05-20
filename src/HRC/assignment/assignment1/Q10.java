//Write a program to find the factorial of a number

package HRC.assignment.assignment1;

public class Q10 {
    public static void main(String[] args) {
        int n=5;
        int result = fact(n);
        System.out.printf("Factorial of %d = %d\n",n,result);

    }
    private static int fact(int n) {
        return n==1?1:n*fact(n-1);
    }
}

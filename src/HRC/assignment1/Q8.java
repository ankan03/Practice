//Write a Java method to find all twin prime numbers less than 100.
// Twin prime- if the difference between two prime numbers is two, then the numbers are called twin prime
package HRC.assignment1;

public class Q8 {
    public static void main(String[] args) {
        int a[] = new int[100];
        int c=-1;

        for (int i = 1; i <=100 ; i++) {
            if (isPrime(i)) {
                c++;
                a[c] = i;
            }
        }

        System.out.print("Twin prime pairs are: ");
        for (int i = 1; i < a.length; i++) {
            if (a[i]-a[i-1]==2){
                System.out.printf("(%d,%d)\t",a[i-1],a[i]);
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int n){
        int c=0;
        for (int i = 2; i <=n/2 ; i++) {
            if (n%i==0)
                c++;
        }

        if (c==0)
            return true;
        else
            return false;
    }
}



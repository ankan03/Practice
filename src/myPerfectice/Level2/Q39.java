//You are given a string S of length N. Lets call reverse of string S as R. String S is called magical if and only if |S[i]-S[i-1]|= |R[i]-R[i-1]| and it should be true for every character in S.
//
//Input:
//2
//acxz
//bcxz
//
//Output:
//YES
//NO
//
//Explanation:
//
//c-a=2 (alphabetically position wise)
//
//z-x=2 (alphabetically position wise)
//
//as both are same continue this till we check for all and print YES if true for every such pair else print NO
//
//User Input Description:
//First line - Number of strings(n)
//n strings in separate lines

//10
//jkotzxzxrxtzytlruwrxytyzsuzytwyzxuzytryzuzysxvsmupouysywywqlhg
//eklrywzvpxtvoptlrskmskszvwzsuzxrtvyzwruqvyxusqwupnurqmtltnltsmuyxqoksyurpwqpv
//efhpuvqvnuwpvwysvnunostvpqvxtxsvqwqvsxtxvqpvtsonunvsywvpwunvqvupxzy
//otytmpszumnryqvxpvnvxyvpvprumnvsqwqwtsqyqksqvnuqpxszwzsxsx
//bhmptlqswsvoqsvzyzwoqtvowpyqxpwurpxutswtrpwzvrpkswzuo
//rvovprxzvwrxpwpzsltzutxztrxqxt
//ceiosyrtztvnqsuozrxvtqywqwyrxtnjh
//djnsyzxszryqworuxpqvqwquvotzsqvoupwvztzupowtqnvpxqyrwutzuys
//kovzuywsuvwxuxtwzryzuxyvouvyskoqtwryszxqqxzsyrwtqoksyvuovyxuzyrzwtxuxwvuswuqvryu
//ptvzstvotxqyvzrwyqryzrpkswzryupwutmigc
//
//YES
//NO
//YES
//YES
//NO
//YES
//NO
//NO
//YES
//YES

//3
//asdfg
//asgfdsadf
//cnbvcfgf
//NO
//NO
//NO

//2
//acxz
//bcxz
// YES
//NO

package myPerfectice.Level2;

import java.util.Scanner;

public class Q39 {
    public static int magical(String S) {
        int flag = 0;
        String rev = new StringBuilder(S).reverse().toString();
        int len = S.length();
        for (int i = 1; i < len; i++) {
            int n1 = Math.abs(S.charAt(i) - S.charAt(i - 1));
            int n2 = Math.abs(rev.charAt(i) - rev.charAt(i - 1));
            if (n1 != n2) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int k = 1; k <= n; k++) {
            String S = scanner.next();
            int x = magical(S);
            if (x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

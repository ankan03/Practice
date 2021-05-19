//What is a do while loop? Demonstrate with an example?

//In the do-while loop, the body of a loop is always executed at least once.
// After the body is executed, then it checks the condition.
// If the condition is true, then it will again execute the body of a loop otherwise control is transferred out of the loop.

package HRC.assignment1;

public class Q5 {
    public static void main(String[] args) {


        int a = 1;
        do {
            System.out.println("value of a : " + a );
            a++;
        }while( a < 5 );


        //Drawback (Here inspite of being b<0 the loop will execute one time )
        int b = -1;
        do {
            System.out.println(b+ " is positive");
        }while( b >0 );

    }
}

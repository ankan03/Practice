//What is an abstract class and demonstrate with an example?

package HRC.assignment.assignment5;

public class Q8 extends MyAbstractClass{
    public static void main(String[] args) {
        new Q8().show();
    }

    @Override
    public void show() {
            System.out.println("Inside show method ");
    }
}

abstract class MyAbstractClass{
    public abstract void show();
}

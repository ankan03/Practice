//Is it possible that one interface can extend another interface? If yes/no demonstrate with an example.

package HRC.assignment.assignment5;

public class Q6 implements Calculater{
    public static void main(String[] args) {
        new Q6().add();
        new Q6().sub();
        new Q6().show();
    }

    @Override
    public void add() {
        System.out.println("add method");
    }

    @Override
    public void sub() {
        System.out.println("sub method");
    }

    @Override
    public void show() {
        System.out.println("show method");
    }
}

interface Add{
    public void add();
}

interface Sub{
    public void sub();
}

interface Calculater extends Add,Sub{
    public void show();
}

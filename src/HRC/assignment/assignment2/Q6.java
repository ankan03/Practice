//Create an abstract class Shape with a method displayShape.
// Now create 2 classes Circle and Square.
// Inherit the abstract class and define the method displayShape to print the shape.(Eg This is a Circle/Square).

package HRC.assignment.assignment2;

public class Q6 {
    public static void main(String[] args) {

        new Circle().displayShape();
        new Square().displayShape();
    }
}

abstract class Shape1{
    public abstract void displayShape();
}

class Circle extends Shape1{

    @Override
    public void displayShape() {
        System.out.println("This is a Circle");
    }
}

class Square extends Shape1{

    @Override
    public void displayShape() {
        System.out.println("This is a Square");
    }
}

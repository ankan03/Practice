//Create a class Shape with overloaded method volume() that calculates the volume based on the parameters.
// If 1 parameter(side) then calculate the volume of the cube.
// If 2 parameters(radius, height) calculate volume of cylinder.
// If 3 parameters(length,breadth and height) calculate volume of cuboid.

package HRC.assignment.assignment2;

public class Q3 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.volume(3);
        shape.volume(5,10);
        shape.volume(5,10,15);
    }
}

class Shape{
    public void volume(double side){
        System.out.println("Volume of the cube: "+Math.pow(side,3));
    }

    public void volume(double radius,double height){
        System.out.println("Volume of the cylinder: "+(Math.PI*Math.pow(radius,2)*height));
    }

    public void volume(double length,double breadth,double height){
        System.out.println("Volume of the cuboid: "+(length*breadth*height));
    }
}

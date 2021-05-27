// What is a super keyword and explain with an example program?

package HRC.assignment.assignment5;

public class Q7 {
    public static void main(String[] args) {
        new ChildClass().printFavouriteFood();
    }
}

class ParentClass{
    String favouriteFood = "Pizza";
    public void printFavouriteFood(){
        System.out.println("Favourite food: "+favouriteFood);
    }
}

class ChildClass extends ParentClass{
    String favouriteFood = "Berger";
    public void printFavouriteFood(){
        System.out.println("Favourite food of child: "+favouriteFood);
        System.out.println("Favourite food of parent: "+super.favouriteFood);
    }
}

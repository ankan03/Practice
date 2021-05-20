//Create a program with a class CarLottery which implements  interface Car.
//Car has a string array that stores the names of 4 cars(Swift, Bolero, Scorpio, BMW X5).
//It has a method getCar that gets the car randomly for a random number between 1 and 4 based on index in array from beginning.

package HRC.assignment.assignment2;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        CarLottery carLottery = new CarLottery();
        carLottery.getCar();


    }
}

interface Car{
    String s[] = {"Swift","Bolero","Scorpio","BMW X5"};
    public void getCar();
}

class CarLottery implements Car{

    Random rn = new Random();
    int n = 4 - 1 + 1;
    int i = rn.nextInt() % n;
    int randomNum = Math.abs(1 + i);

    @Override
    public void getCar() {
        System.out.println(s[randomNum-1]);
    }
}


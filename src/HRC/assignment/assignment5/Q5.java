// Write program to create your own custom exception.

package HRC.assignment.assignment5;

public class Q5 {
    public static void main(String[] args) throws MyException {
        int age = 5;
        if (age<18)
            throw new MyException("Content is not available under 18");
    }
}
class MyException extends Exception{
    public MyException(String str){
        System.out.println(str);
    }
}

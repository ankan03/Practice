//Create an enum and print the values using for each loop.

package HRC.assignment.assignment5;

public class Q15 {
    public static void main(String[] args) {
        System.out.println("Day values are: ");
        for (Day day:Day.values()) {
            System.out.println(day);
        }
    }
}

enum Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
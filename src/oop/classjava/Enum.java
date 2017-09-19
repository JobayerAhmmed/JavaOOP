package oop.classjava;

/**
 * a special data type that enables for a variable to be a set of predefined constants.
 * use enum types any time you need to represent a fixed set of constants.
 * enum declaration defines a class (called an enum type).
 * The enum class body can include methods and other fields.
 * constants be defined first, prior to any fields or methods and be ended with semicolon.
 */

enum Day {
    SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}
public class Enum {

    Day day;

    public Enum(Day day) {
        this.day = day;
    }

    public void saySomething() {
        switch (day) {
            case SATURDAY:
                System.out.println("Today is " + day.SATURDAY);
                break;
            case SUNDAY:
                System.out.println("Today is " + day.SUNDAY);
                break;
        }
    }

    public static void main(String[] args) {

        Enum enumObj = new Enum(Day.SUNDAY);
        enumObj.saySomething();
    }
}

package basic;

/**
 * Instance variable:
 *      - in heap with its object
 *      - default values
 *
 * Class variable:
 *      - one copy of each class variable per class, regardless of how many objects are created from it.
 *      - in static memory.
 *      - default values
 *      - Every instance of the class shares a class variable, which is in one fixed location in memory.
 *      - Any object can change the value of a class variable.
 *
 * Local variable:
 *      - no default value for local variables
 *      - no access modifier
 *      - in stack level
 *
 * Constant:
 *      -
 *
 * Parameter:
 *      - parameters are always classified as "variables" not "fields".
 */
public class Variable {

//    instance variable
    private String name;
    private double salary;

//    Class variable / static variable
    private static int count;

//    constant
    public static final double PI_VALUE = 3.1416;

    public void printData() {
        // local variable
        int numberOfData = 5;
    }

//    A common use for static methods is to access static fields.
    public static int getCount() {
        return count;
    }
}

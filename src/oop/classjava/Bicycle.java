package oop.classjava;

/**
 * Class modifier: public, no modifier: scope package.
 * Method signature: method's name and the parameter types: calculateAnswer(double, int, double)
 * Java files should be named the same as the name of the class they contain.
 * Java extends the Object class when you do not explicitly extend a class.
 */
public class Bicycle {

    private int gear;
    private int speed;

    private static int id;

//    static initialization block
//    initialize static variables in static block or static method (method can be reused)
    static {
        id = 1;
    }

//    alternative of constructor initialization is initializer block
//    Java compiler copies initializer blocks into every constructor.
//    this approach can be used to share a block of code between multiple constructors.
    {
        gear = 0;
        speed = 0;
    }

    // Constructors are invoked to create objects from the class blueprint.
    //Java platform differentiates constructors on the basis of the number of arguments in the list and their types.
    // You cannot write two constructors that have the same number and type of arguments for the same class.
    // Access modifier: public, protected, private, no modifier
    // Not allowed modifiers: abstract, final, static, native, synchronized
//    super must be in the first line
//    initialize instance variables in constructor

//    explicit constructor invocation.
//    the invocation of another constructor must be the first line in the constructor.

//    constructor can have logic: if, for loop

    public Bicycle() {
        this(0, 0);  // invoking Bicycle(startGear, startSpeed)
    }
    public Bicycle(int startGear, int startSpeed) {
        gear = startGear;
        speed = startSpeed;
    }

    public static int getId() {
        return id;
    }
}
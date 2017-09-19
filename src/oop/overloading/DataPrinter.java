package oop.overloading;

/**
 * Overloaded methods are differentiated by the number and the type of the arguments passed into the method.
 * The compiler does not consider return type when differentiating methods,
 *      so you cannot declare two methods with the same signature even if they have a different return type.
 */
public class DataPrinter {

    public void printData(int i) {
        System.out.print(i);
    }

    // different parameter type
    public void printData(double d) {
        System.out.print(d);
    }

    // different parameter type
    public void printData(String s) {
        System.out.print(s);
    }

    // different number of parameters
    public void printData(int i, String s) {
        System.out.print(i + "" + s);
    }

    // different return type, but same parameter: NOT ALLOWED
//    public int printData(int i) {
//        return i;
//    }
}

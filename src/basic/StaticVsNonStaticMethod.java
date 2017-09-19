package basic;

/**
 * You can't call something that doesn't exist. Since you haven't created an object,
 * the non-static method doesn't exist yet. A static method (by definition) always exists.
 */
public class StaticVsNonStaticMethod {

    // instance variable, belongs t0 the instance of the class
    public int roll;

    // instance level method, belongs the the instance of the class
    public void printRoll() {
        System.out.println("Roll: " + this.roll);
    }

    // static variable, belongs to the class
    public static String name;

    // static method, belongs to the class
    public static void printName() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // cannot call roll, printRoll(); because they belong to the instance of the class
        // and no instance is created yet.
        // but can call name, printName() because they belong to the Class itself
        name = "Jobayer";
        printName();

        // to access roll, printRoll(); first create an instance of the class
        StaticVsNonStaticMethod myClass = new StaticVsNonStaticMethod();
        myClass.roll = 502;
        myClass.printRoll();
    }
}
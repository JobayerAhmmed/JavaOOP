package basic;

/**
 * everything in Java is pass-by-value
 * passes the reference by value, not the object
 * Java does manipulate objects by reference, and all object variables are references.
 * However, Java doesn't pass method arguments by reference; it passes them by value.
 *
 * Reference data type parameters, such as objects, are also passed into methods by value.
 * This means that when the method returns, the passed-in reference still references the same object as before.
 * However, the values of the object's fields can be changed in the method, if they have the proper access level.
 */
public class PassByValue {

    public static void main(String[] args) {

        // pass by value
        int number = 100;
        System.out.println("Before changeValue method: " + number);
        changeValue(number);
        System.out.println("After changeValue method: " + number);

        // create a emp object
        Employee emp = new Employee("Jobayer");
        System.out.println("Before changeObject method: " + emp.getName());
        // send copy of emp reference as value to changeObject()
        changeObject(emp);
        System.out.println("After changeObject method: " + emp.getName());
    }

    public static void changeValue(int x) {
        x = x + 50;
        System.out.println("Inside changeValue method: " + x);
    }

    public static void changeObject(Employee e) {
        // e refer to emp, thus set name to Jayed
        e.setName("Jayed");
        // e2 is a new Employee object
        Employee e2 = new Employee("Junayed");
        // now e refer to e2, not emp
        e = e2;
        System.out.println("Inside changeObject method: " + e.getName());
    }

    // only one "public" class in every file
    static class Employee {

        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }
}


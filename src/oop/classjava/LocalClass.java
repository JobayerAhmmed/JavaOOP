package oop.classjava;

public class LocalClass {

    static int topClassValue = 100;

    public static int addValues(int value1, int value2) {

        final int finalValue = 50;

//        not allowed; it will break effectively final
//        value1 = 60;

//        Local class
//        local class has access to the members of its enclosing class.
//        local class can access local variables and parameters of the enclosing block that are final or effectively final.
//        A variable or parameter whose value is never changed after it is initialized is effectively final.
//        cannot declare any static member.
//        can have static members provided that they are constant variables.
//        local class in static method can only refer to static members of the enclosing class.
//        Local classes are non-static
//        can define a local class in a method body, a for loop, or an if clause.
//        You cannot declare an interface inside a block; interfaces are inherently static.
        class IAmLocal {

            int localClassValue;
            static final int staticFinalValue = 55;

            IAmLocal(int value) {
                localClassValue = value;
            }

            public int getValues() {
                return topClassValue + value1 + value2 + finalValue + localClassValue + staticFinalValue;
            }
        }

        IAmLocal local = new IAmLocal(5);

        return local.getValues();
    }

    public static void main(String[] a) {
        System.out.println(addValues(1000, 1000));
    }
}

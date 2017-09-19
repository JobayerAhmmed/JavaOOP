package oop.classjava;

/**
 * an anonymous class is an expression.
 * declare and instantiate a class at the same time.
 * Use anonymous class if you need to use a local class only once.
 * ideal for implementing an interface that contains two or more methods.
 * Syntax:
 *      new
 *      name of interface or class to extend
 *      parenthesis; for class, may contain arguments; but for interface, no argument
 *      body: method declarations are allowed but statements are not.
 *      semicolon
 * Access level:
 *      can access to the members of its enclosing class.
 *      cannot access local variables in its enclosing scope that are not declared as final or effectively final.
 *      cannot declare static initializer or member interfaces in an anonymous class.
 *      can have static members provided that they are constant variables.
 *      cannot declare constructors in an anonymous class.
 */
public class AnonymousClass {

    interface HelloWorld {
        void greet();
        void greetSomeone(String name);
    }

    public void sayHello() {

        // local class
        class EnglishGreeting implements HelloWorld {
            String name = "John";
            public void greet() {
                greetSomeone(name);
            }
            public void greetSomeone(String name) {
                this.name = name;
                System.out.println(name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        // anonymous class: use interface to be implemented or class to be extended
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "Mund";
            @Override
            public void greet() {
                greetSomeone(name);
            }

            @Override
            public void greetSomeone(String name) {
                this.name = name;
                System.out.println(name);
            }
        };

        englishGreeting.greet();
        spanishGreeting.greetSomeone("Fuck de lois");
    }

    public static void main(String[] args) {
        AnonymousClass obj = new AnonymousClass();
        obj.sayHello();
    }
}

package oop.interfacejava;

/**
 * Can contain only constants, method signatures, default methods, static methods, and nested types.
 *
 * interface can be declared public or package scope (no access modifier).
 * accessing a variable from an interface is similar to accessing a static variable in a class.
 * A class that implements an interface must implement all the methods declared in the interface.
 * The methods must have the exact same signature (name + parameters) as declared in the interface.
 * The class does not need to implement (declare) the variables of an interface.
 * You cannot create instances of a Java interface by itself.
 * A Java class can implement multiple Java interfaces.
 *
 * If a Java class implements multiple Java interfaces, there is a risk that some of these interfaces
 * may contain methods with the same signature (name + parameters). Since a Java class can only implement
 * at method with a given signature once, this could potentially lead to some problems.
 * The Java specification does not give any solution to this problem.
 *
 * A Java interface can contain both variables and constants.
 * However, often it does not makes sense to place variables in an interface.
 * avoid placing variables in Java interfaces if you can.
 * All variables in an interface are public, even if you leave out the public keyword.
 *
 * the interface cannot specify any implementation for methods.
 * All methods in an interface are public, even if you leave out the public keyword.
 *
 * Before Java 8 Java interfaces could not contain an implementation of the methods.
 * Java 8 has added the concept of interface default methods to Java interfaces.
 * An interface default method can contain a default implementation of that method.
 * Classes that implement the interface but which contain no implementation
 * for the default interface will then automatically get the default method implementation.
 *
 * Inheritance: an interface can inherit (extends) another interface.
 * if a class implements MySubInterface, that class has to implement
 *      all methods defined in both MySubInterface and MySuperInterface.
 * It is possible to define methods in a subinterface with the same signature (name + parameters)
 *      as methods defined in a superinterface
 * interfaces can inherit (extends) from multiple superinterfaces.
 * As when implementing multiple interfaces, there are no rules for how you handle the
 *      situation when multiple superinterfaces have methods with the same signature (name + parameters).
 *
 * if two interfaces contain the same method signature (name + parameters) and one of the interfaces declare
 * this method as a default method, a class cannot automatically implement both interfaces.
 * The situation is the same if an interface extends (inherits from) multiple interfaces,
 * and one or more of these interfaces contain methods with the same signature,
 * and one of the superinterfaces declare the overlapping method as a default method.
 * In both of the above situations the Java compiler requires that the class implementing
 * the interface(s) explicitly implements the method which causes the problem.
 */
public class Interface {
}

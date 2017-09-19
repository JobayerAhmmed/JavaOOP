package oop.classjava;

import basic.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Stream;

/**
 * Java 8 feature
 * iterate, filter and extract data from collection.
 * a replacement of java inner anonymous class.
 * lambda expression is treated as a function
 * Functional interface: interface with only one abstract method
 * Lambda expression provides implementation of functional interface.
 * access local variables and parameters of the enclosing block that are final or effectively final.
 * no shadowing issue
 * do not create new level of scoping
 * lambda expression are interpreted just as they are in the enclosing environment.
 * lambda expression is essentially an object.
 */

@FunctionalInterface // optional
interface Addable {
    int add(int x, int y);
}
public class LambdaExpression {
    public static void main(String[] args) {

        // lambda expression implements functional interface
        Addable adder = (a, b) -> (a+b);
        System.out.println(adder.add(20, 30));

        // lambda expression
        Addable adder2 = (a, b) -> {
            a += 10;
            b += 10;
            return a + b;
        };
        System.out.println(adder2.add(10, 20));

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);
        numbers.add(55);


        // lambda expression
        numbers.forEach(
                x -> System.out.println(x)
        );

        // lambda expression
        Stream<Integer> oddNumbers = numbers.stream().filter(x -> x % 2 != 0);
        oddNumbers.forEach(x -> System.out.println(x));
    }
}

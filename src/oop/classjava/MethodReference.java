package oop.classjava;

import basic.Array;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;

/**
 * do not use existing method in lambda expression, instead use method reference; it is clearer
 */
public class MethodReference {
    public static void main(String[] args) {

        Person[] persons = new Person[3];
        persons[0] = new Person(10);
        persons[1] = new Person(100);
        persons[2] = new Person(50);

        // can create lambda expression to compare; but compare method already exists, so no need
        Arrays.sort(persons, (a, b) -> {
            return (a.getAge() > b.getAge()) ? a.getAge() : b.getAge();
        });

        // use compare method in lambda expression as already exists
        Arrays.sort(persons, (a, b) -> Person.compareByAge(a, b));

        // method reference: you can use method reference instead of lambda expression
        Arrays.sort(persons, Person::compareByAge);
    }


}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static int compareByAge(Person a, Person b) {
        return (a.getAge() > b.getAge()) ? a.getAge() : b.getAge();
    }
}
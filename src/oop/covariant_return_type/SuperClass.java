package oop.covariant_return_type;

/**
 * Created by bsse0 on 8/14/2017.
 */
public class SuperClass {

    public Animal getAnimal() {
        return new Dog();
    }
}

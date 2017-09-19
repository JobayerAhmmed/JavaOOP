package oop.covariant_return_type;

public class SubClass extends SuperClass {

//    covariant return type, the return type is allowed to vary in the same direction as the subclass.
//    You can override a method and define it to return a subclass of the original method
    @Override
    public Dog getAnimal() {
        return new Dog();
    }
}

package oop.inheritance;

/**
 * To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
 * Consider a scenario where A, B and C are three classes. The C class inherits A and B classes.
 * If A and B classes have same method and you call it from child class object,
 * there will be ambiguity to call method of A or B class.
 */
public class SavingsAccount extends Account {

    public SavingsAccount(long amount) {
        super("Savings", amount);
    }
}

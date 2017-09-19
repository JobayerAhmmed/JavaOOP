package oop.inheritance;

/**
 * Created by bsse0 on 8/1/2017.
 */
public class Account {

    private String name;
    private long amount;
    private String password;

    public Account(String name, long amount) {
        this.name = name;
        this.amount = amount;
        password = "bsse";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getPassword() {
        return encryptPassword();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // final method cannot be overridden
    public final String encryptPassword() {
        return "iit" + password + "du";
    }

    public void deposit(long amount) {
        this.amount += amount;
    }

    public void withdraw(long amount) {
        this.amount -= amount;
    }
}

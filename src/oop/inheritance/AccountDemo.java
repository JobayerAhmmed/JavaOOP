package oop.inheritance;

/**
 * Created by bsse0 on 8/1/2017.
 */
public class AccountDemo {

    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount(50000);

        System.out.println("Account name: " + savingsAccount.getName());
        System.out.println("Password: " + savingsAccount.getPassword());
        System.out.println("Initial amount: " + savingsAccount.getAmount());

        savingsAccount.deposit(30000);
        System.out.println("Amount after deposit: " + savingsAccount.getAmount());

        savingsAccount.withdraw(10000);
        System.out.println("Amount after withdraw: " + savingsAccount.getAmount());
    }
}

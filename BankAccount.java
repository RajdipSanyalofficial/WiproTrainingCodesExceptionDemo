package exceptiondemo;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    //Method might throw custom exception InSufficientFundsException
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

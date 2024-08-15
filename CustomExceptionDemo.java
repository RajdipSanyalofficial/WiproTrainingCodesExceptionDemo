/**
 * Java program that demonstrates the use of a custom exception.
 * This example involves a bank account system where a custom exception is used to handle insufficient funds.
 */

package exceptiondemo;

public class CustomExceptionDemo {

    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(500.00);

        System.out.println("Attempting to deposit $200:");
        account.deposit(200.00);

        System.out.println("\nAttempting to withdraw $800:");
        try {
            account.withdraw(800.00);
        } catch (InsufficientFundsException e) { //Catch Custom Exceptions
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("\nAttempting to withdraw $300:");
        try {
            account.withdraw(300.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("\nFinal Balance: " + account.getBalance());
    }
}

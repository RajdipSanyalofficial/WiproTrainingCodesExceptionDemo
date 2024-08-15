package exceptiondemo;

// Define Custom Exception Class to handle Insufficient Funds in Bank
public class InsufficientFundsException extends Exception {


    public InsufficientFundsException(String message) {
        super(message);
    }
}



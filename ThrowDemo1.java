package exceptiondemo;

public class ThrowDemo1 {


        // Method to demonstrate throw keyword
        public static void checkAge(int age) {
        if (age < 18) {
            // Throwing an ArithmeticException if age is less than 18
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args)
    {
        // Testing the checkAge method with different age values
        System.out.println("Testing with age 15:");
        try {
            checkAge(15);  // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // continue flow of execution after exception is caught
        // if not using exception handling the program will terminate at this point
        System.out.println("\nTesting with age 20:");
        try {
            checkAge(11);  // This will not throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}

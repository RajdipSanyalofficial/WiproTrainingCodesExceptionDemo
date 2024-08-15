/**
 * Program to find Division of 2 Numbers without Exception Handling
 */


package exceptiondemo;

import java.util.Scanner;

// Division of 2 numbers with exception handling
public class DivisionWithException {

    public static void main(String[] args)
    {
        int a, b, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Input two integers :");
        a = input.nextInt();
        b = input.nextInt();

        // statements to be monitored which may throw exception
        try {
            result = a / b;
            System.out.println("Result = " + result);
        }

        // Exception thrown in try block is handled in catch block
        // using exception object

        catch (ArithmeticException ex)
        {
            System.out.println("Please enter second number as non-zero");
            System.err.println("Exception name and Description :"+ex.toString());
            System.err.println("Exception Decription :"+ex.getMessage());

            // print  exception name , description, file name and line number

            ex.printStackTrace();
        }
        finally { // cleanup operation
            input.close();
            System.out.println("In finally block");
        }
    }
}

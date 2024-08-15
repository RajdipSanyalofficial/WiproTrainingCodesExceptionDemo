/**
 * Program to find Division of 2 Numbers without Exception Handling
 */


package exceptiondemo;

import java.util.Scanner;

// Division of 2 numbers without exception handling
public class Division {

    public static void main(String[] args)
    {
        int a, b, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Input two integers :");
        a = input.nextInt();
        b = input.nextInt();

        result = a / b; //Exception is thrown by JRE for Divide by Zero Exception
        System.out.println("Result = " + result);

        input.close();
    }
}

/**
 * Program demonstrates the use of try-catch-finally blocks to handle potential exceptions,
 *  such as invalid input or operations that might throw exceptions.
 */

package exceptiondemo;

import java.util.Scanner;

public class ShoppingApp {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of items: ");
            int numberOfItems = Integer.parseInt(scanner.nextLine());

            if (numberOfItems <= 0) {
                System.out.println("Number of items must be positive.");
                return; // Exit the method early if invalid input is detected
            }

            double totalPrice = 0;

            for (int i = 1; i <= numberOfItems; i++) {
                System.out.print("Enter the price of item " + i + ": ");
                double price = Double.parseDouble(scanner.nextLine());

                if (price < 0) {
                    System.out.println("Price cannot be negative.");
                    return; // Exit the method early if invalid input is detected
                }

                totalPrice += price;
            }

            System.out.println("Total price: $" + totalPrice);

        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter a valid number.");
            e.printStackTrace();


        } finally {
            System.out.println("Thank you for using the shopping app.");
            scanner.close();
        }

        System.out.println("Program continues after exception handling.");
    }
}

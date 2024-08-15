/**
 * Java program that simulates a library system.
 * The program allows users to borrow books and handles potential exceptions such as
 * entering an invalid book ID (NumberFormatException) and
 * attempting to borrow a book that is not available (ArrayIndexOutOfBoundsException).
 */

package exceptiondemo;

import java.util.Scanner;

public class LibrarySystem {

    public static void main(String[] args)
    {

        String[] books = {"The Great Gatsby", "1984", "To Kill a Mockingbird", "The Catcher in the Rye"};
        boolean[] isBookAvailable = {true, true, false, true}; // Availability of each book
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Available books:");
            for (int i = 0; i < books.length; i++) {
                System.out.println(i + ". " + books[i] + (isBookAvailable[i] ? " (Available)" : " (Not Available)"));
            }

            System.out.print("Enter the book ID to borrow: ");
            int bookId = Integer.parseInt(scanner.nextLine());

            if (!isBookAvailable[bookId]) {
                System.out.println("Sorry, the book \"" + books[bookId] + "\" is not available.");
            } else {
                isBookAvailable[bookId] = false; // Mark the book as borrowed
                System.out.println("You have successfully borrowed \"" + books[bookId] + "\".");
            }

        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter a valid book ID.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: The book ID you entered does not exist.");
        } finally {
            System.out.println("Thank you for using the library system.");
            scanner.close();
        }

        System.out.println("Program continues after exception handling.");

    }
}

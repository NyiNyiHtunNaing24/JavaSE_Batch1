import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        int number = -1; // Initialize with an invalid number

        // Loop until a valid non-negative integer is entered
        while (number < 0) {
            try {
                // Prompt the user for input
                System.out.print("Enter a non-negative number : ");
                number = scanner.nextInt();

                // Check for invalid input
                if (number < 0) {
                    System.out.println("Number must be non-negative. Please try again.");
                }
            } catch (InputMismatchException e) {
                // Handle the exception if input is not an integer
                System.out.println("Please enter a valid Number!");
                scanner.next(); // Clear the invalid input
            }
        }

        // Calculate the factorial for the input number
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the output
        System.out.println("The factorial of " + number + " is: " + factorial);

        // Close the scanner
        scanner.close();
    }
}

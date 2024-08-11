import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input_number = 0;

        while (input_number == 0) {
            try {
                // ask user input number
                System.out.print("Enter a number : ");
                input_number = scanner.nextInt();

                // check the input number is in range 1 to 10
                if (input_number < 1 || input_number > 10) {
                    // ask the user to input again
                    System.out.println("Please enter a number from 1 to 10!");
                    input_number = 0;
                } else {
                    // output the required result
                    System.err.println("Multliplication table for " + input_number);
                    for (int i = 1; i < 11; i++) {
                        System.out.println(input_number + " * " + i + " = " + input_number * i);
                    }
                }

            } catch (InputMismatchException e) {
                // Handle the exception if input is not an integer
                System.out.println("Please enter a valid Number!");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.close();
    }
}
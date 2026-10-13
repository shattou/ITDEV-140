package recursivemultiplication;

import java.util.Scanner;

public class RecursiveMultiplicationApp {

	public static void main(String[] args)
    {
        // Create a new instance of the MultiplyApp class
        MultiplyApp app = new MultiplyApp();

        // Create a Scanner to read input from the console
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            // Read the first number from the user
            System.out.print("Enter the first number (0 to exit): ");
            int firstNumber = scanner.nextInt();

            if (firstNumber == 0)
            {
                // If the first number is 0, exit the loop
                break;
            }

            // Read the second number from the user
            System.out.print("Enter the second number: ");
            int secondNumber = scanner.nextInt();

            // Calculate the multiplication
            int result = app.multiply(firstNumber, secondNumber);

            // Print the result
            System.out.println(firstNumber + " * " + secondNumber + " = " + result);
        }
    }
}

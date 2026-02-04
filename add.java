import java.util.Scanner; // Import the Scanner class to read user input

public class add {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner inputScanner = new Scanner(System.in);

        int number1; // Declare a variable to store the first number
        int number2; // Declare a variable to store the second number
        int sum;     // Declare a variable to store the sum

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        number1 = inputScanner.nextInt(); // Read the first number from the user

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        number2 = inputScanner.nextInt(); // Read the second number from the user

        // Calculate the sum of the two numbers
        sum = number1 + number2;

        // Display the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

        // Close the scanner to release system resources
        inputScanner.close();
    }
}
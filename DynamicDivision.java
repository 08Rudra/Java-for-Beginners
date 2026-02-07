import java.util.Scanner; // Import the Scanner class

public class DynamicDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("Input the first number (dividend):");
        // Use double for potential decimal input and precise division
        double number1 = scanner.nextDouble();

        System.out.println("Input the second number (divisor):");
        double number2 = scanner.nextDouble();

        // Check for division by zero
        if (number2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Perform the division
            double result = number1 / number2;

            // Print the result using printf for formatted output (e.g., two decimal places)
            System.out.printf("The result of the division is: %.2f%n", result);
        }

        scanner.close(); // Close the scanner
    }
}

import java.util.Scanner;

public class DynamicSubtraction {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        // Read the first integer from the user
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        // Read the second integer from the user
        int secondNumber = scanner.nextInt();

        // Perform the subtraction
        int difference = firstNumber - secondNumber;

        // Print the result
        System.out.println("The difference is: " + difference);

        // Close the scanner
        scanner.close();
    }
}

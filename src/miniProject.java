import java.util.Scanner;
import java.util.InputMismatchException;

public class miniProject {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1 = 0, num2 = 0, result;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Enter two numbers: ");
                num1 = scnr.nextInt();
                num2 = scnr.nextInt();
                validInput = true;  // If input is valid, proceed to operations
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter valid integers");
                scnr.nextLine();  // Consume the invalid input
            }
        }

        try {
            result = num1 + num2;
            System.out.println("Addition Result: " + result);

            result = num1 - num2;
            System.out.println("Subtraction Result: " + result);

            result = num1 * num2;
            System.out.println("Multiplication Result: " + result);

            result = num1 / num2;
            System.out.println("Division Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }

        scnr.close();
    }
}

import java.util.Scanner;

public class TryToParseDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0;

        System.out.println("Enter a double value:");
        String input = scanner.nextLine();

        try {
            number = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid double. Defaulting to 0.");
        }

        System.out.println("The number is: " + number);
    }
}

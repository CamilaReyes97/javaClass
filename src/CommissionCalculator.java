import java.util.Scanner;

public class CommissionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Real Estate Commission Calculator!");

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        String county;

        while (true) {
            System.out.print("Please enter your county (Miami Dade or Palm Beach): ");
            county = scanner.nextLine();

            if (county.equalsIgnoreCase("Miami Dade") || county.equalsIgnoreCase("Palm Beach")) {
                break; // Correct county entered
            } else {
                System.out.println("The app only covers Miami Dade or Palm Beach counties.");
                System.out.print("Would you like to retype the county name? (YES/NO): ");
                String answer = scanner.nextLine();
                if (!answer.equalsIgnoreCase("YES")) {
                    System.out.println("Program ended. Goodbye!");
                    return; // Exit the program
                }
            }
        }

        // Commission calculation based on the county
        System.out.print("Please enter the purchase price: ");
        double purchasePrice = scanner.nextDouble();
        double commissionRate = 0.0;

        if (county.equalsIgnoreCase("Miami Dade")) {
            commissionRate = 5.2;
        } else if (county.equalsIgnoreCase("Palm Beach")) {
            commissionRate = 5.7;
        }

        double commission = purchasePrice * commissionRate / 100;
        System.out.printf("For %s, the commission at %.1f%% of $%.2f is $%.2f.\n", county, commissionRate, purchasePrice, commission);
    }
}

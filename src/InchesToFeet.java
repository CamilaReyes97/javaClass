import java.util.Scanner;
public class InchesToFeet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of inches: ");
        int inches = scanner.nextInt();

        final int INCHES_IN_A_FOOT = 12;

        int feet = inches / INCHES_IN_A_FOOT;
        int remainingInches = inches % INCHES_IN_A_FOOT;

        System.out.println(inches + " inches is equivalent to " + feet + " feet and " + remainingInches + " inches.");

        scanner.close();
    }
}

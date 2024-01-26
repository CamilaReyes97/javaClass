import java.util.Scanner;

public class ChangeCalculator {
    // Constantes para valores de monedas
    private static final int DOLLAR_VALUE = 100;
    private static final int QUARTER_VALUE = 25;
    private static final int DIME_VALUE = 10;
    private static final int NICKEL_VALUE = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the change in cents:");
        int changeInCents = scanner.nextInt();

        if (changeInCents < 0) {
            System.out.println("Negative Value. Cannot Calculate Change.");
        } else if (changeInCents == 0) {
            System.out.println("No change");
        } else {
            calculateAndPrintChange(changeInCents);
        }

        scanner.close();
    }

    private static void calculateAndPrintChange(int cVal) {
        int numB = cVal / DOLLAR_VALUE;
        cVal %= DOLLAR_VALUE;

        int numQ = cVal / QUARTER_VALUE;
        cVal %= QUARTER_VALUE;

        int numD = cVal / DIME_VALUE;
        cVal %= DIME_VALUE;

        int numN = cVal / NICKEL_VALUE;
        cVal %= NICKEL_VALUE;

        int numC = cVal; // Los centavos restantes son pennies

        // Imprime el cambio debido
        System.out.println("Dollar Bill: " + numB + (numB == 1 ? " bill" : " bills"));
        System.out.println("Quarter: " + numQ + (numQ == 1 ? " quarter" : " quarters"));
        System.out.println("Dime: " + numD + (numD == 1 ? " dime" : " dimes"));
        System.out.println("Nickel: " + numN + (numN == 1 ? " nickel" : " nickels"));
        System.out.println("Cent: " + numC + (numC == 1 ? " cent" : " cents"));
    }
}
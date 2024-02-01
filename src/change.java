import java.util.Scanner;

public class change {

    public static void main(String[] args) {
        int cVal;
        int numB, numQ, numD, numN, numP;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the change in cents:");
        cVal = sc.nextInt();
        if (cVal < 0) {
            System.out.println("Negative value. Cannot calculate change.");
        } else if (cVal == 0) {
            System.out.println("Zero value entered. No change to calculate.");
        } else {
            numB = cVal / 100;
            cVal = cVal - (numB * 100);

            numQ = cVal / 25;
            cVal = cVal - (numQ * 25);

            numD = cVal / 10;
            cVal = cVal - (numD * 10);

            numN = cVal / 5;
            cVal = cVal - (numN * 5);

            numP = cVal;

            System.out.println("Dollar Bills: " + numB + (numB == 1 ? " Bill" : " Bills"));
            System.out.println("Quarters: " + numQ + (numQ == 1 ? " Quarter" : " Quarters"));
            System.out.println("Dimes: " + numD + (numD == 1 ? " Dime" : " Dimes"));
            System.out.println("Nickels: " + numN + (numN == 1 ? " Nickel" : " Nickels"));
            System.out.println("Cents: " + numP + (numP == 1 ? " Cent" : " Cents"));
        }
    }
}

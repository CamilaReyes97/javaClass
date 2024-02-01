
import java.util.Scanner;

public class class0130 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        boolean isLeapYear = false;
        boolean repeat = true;

        //int j;
        //for (j= -320; j<0; j++){
        //  System.out.println("Value of j" + j);
        // }
        while (repeat == true) {
            System.out.println("Enter a year");
            int year = sc.nextInt();

            if (year % 4 == 0) {
                if (year % 400 == 0) {
                    System.out.println("It is a leap year");
                } else if (year % 100 == 0) {
                    System.out.println("It is not a leap year");
                }
            } else {
                System.out.println("It is not a leap year");
            }

            System.out.println("Do you want to repeat the operation? (yes/no)");
            String userChoice = sc.nextLine();

            if ("yes".equalsIgnoreCase(userChoice)) {
                repeat = true;
            } else if ("no".equalsIgnoreCase(userChoice)) {
                repeat = false;
            } else {
                System.out.println("Invalid input. Please type 'yes' or 'no'.");
                // Since invalid input is entered, we could ask again or exit
                // Here, let's exit. Set repeat to false.

            }
        }
        sc.close();
    }
}


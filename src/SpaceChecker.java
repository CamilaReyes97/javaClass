import java.util.Scanner;

public class SpaceChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter a String value: ");
        String inputValue = scanner.nextLine();


        if (inputValue.contains(" ")) {
            System.out.println("Value with Spaces");
        } else {
            System.out.println("No Spaces");
        }

        scanner.close();
    }
}

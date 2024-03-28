import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = {10, 22, 35, 47, 53, 67, 79, 82, 94, 100};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number to search: ");
        int target = scanner.nextInt();

        int comparisons = 0;
        boolean found = false;

        for (int num : numbers) {
            comparisons++; // Increase comparison count for each check
            if (num == target) {
                found = true;
                break; // Stop searching once the number is found
            }
        }

        if (found) {
            System.out.println("Number " + target + " found after " + comparisons + " comparisons.");
        } else {
            System.out.println("Number " + target + " does not exist in the array. " + comparisons + " comparisons made.");
        }
    }
}

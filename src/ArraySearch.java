import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number to search for: ");
        int searchValue = scanner.nextInt();
        int comparisons = 0;
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            comparisons++;
            if (array[i] == searchValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number found after " + comparisons + " comparisons.");
        } else {
            System.out.println("Number not found. Made " + comparisons + " comparisons.");
        }


    }
}

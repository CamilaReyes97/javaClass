import java.util.Scanner;

public class visitors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] theFair = new int[14];
        int i, total, average, max, min;

        total = 0;

        for(i = 0; i < theFair.length; i++) {
            System.out.println("Enter the number of visitors for Day " + (i + 1) + ":");
            theFair[i] = sc.nextInt();
            total += theFair[i];
        }

        System.out.println("Total number of visitors: " + total);
        average = total / theFair.length;
        System.out.println("Average number of visitors: " + average);

        max = theFair[0];
        min = theFair[0];

        for(i = 0; i < theFair.length; i++) {
            if(theFair[i] > max)
                max = theFair[i];
            if(theFair[i] < min)
                min = theFair[i];
        }

        System.out.println("Highest number of visitors: " + max);
        System.out.println("Lowest number of visitors: " + min);

        // Ask user for a search key
        System.out.println("Enter a search key:");
        int searchKey = sc.nextInt();
        boolean found = false;

        // Search the array for the value
        for(i = 0; i < theFair.length; i++) {
            if(theFair[i] == searchKey) {
                System.out.println("Value found on Day " + (i + 1));
                found = true;
            }
        }

        // If value not found
        if(!found) {
            System.out.println("Value not found.");
        }
    }
}

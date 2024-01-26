import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Breakfast input
        System.out.println("Enter first breakfast item: ");
        String item1 = input.nextLine();

        System.out.println("How many calories was " + item1 + " ?");
        int calories1 = input.nextInt();

        input.nextLine();

        System.out.println("Enter the second breakfast item: ");
        String item2 = input.nextLine();

        System.out.println("How many calories was " + item2 + " ?");
        int calories2 = input.nextInt();

        input.nextLine();

        // Lunch input
        System.out.println("Enter first lunch item: ");
        String lunchItem1 = input.nextLine();

        System.out.println("How many calories was " + lunchItem1 + " ?");
        int lunchCalories1 = input.nextInt();

        input.nextLine();

        System.out.println("Enter second lunch item: ");
        String lunchItem2 = input.nextLine();

        System.out.println("How many calories was " + lunchItem2 + " ?");
        int lunchCalories2 = input.nextInt();

        input.nextLine();

        // Dinner input
        System.out.println("Enter first dinner item: ");
        String dinnerItem1 = input.nextLine();

        System.out.println("How many calories was " + dinnerItem1 + " ?");
        int dinnerCalories1 = input.nextInt();

        input.nextLine();

        System.out.println("Enter second dinner item: ");
        String dinnerItem2 = input.nextLine();

        System.out.println("How many calories was " + dinnerItem2 + " ?");
        int dinnerCalories2 = input.nextInt();


        input.close();


        int totalBreakfastCalories = calories1 + calories2;
        int totalLunchCalories = lunchCalories1 + lunchCalories2;
        int totalDinnerCalories = dinnerCalories1 + dinnerCalories2;
        int totalDayCalories = totalBreakfastCalories + totalLunchCalories + totalDinnerCalories;


        System.out.println("\nBreakfast item 1: " + item1 + " : " + calories1 + " calories");
        System.out.println("Breakfast item 2: " + item2 + " : " + calories2 + " calories");
        System.out.println("Total breakfast calories: " + totalBreakfastCalories);

        System.out.println("\nLunch item 1: " + lunchItem1 + " : " + lunchCalories1 + " calories");
        System.out.println("Lunch item 2: " + lunchItem2 + " : " + lunchCalories2 + " calories");
        System.out.println("Total lunch calories: " + totalLunchCalories);

        System.out.println("\nDinner item 1: " + dinnerItem1 + " : " + dinnerCalories1 + " calories");
        System.out.println("Dinner item 2: " + dinnerItem2 + " : " + dinnerCalories2 + " calories");
        System.out.println("Total dinner calories: " + totalDinnerCalories);

        System.out.println("\nTotal calories for the day: " + totalDayCalories);
    }
}


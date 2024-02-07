import java.util.Scanner;
public class level {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int buildingInput, levelInput;
        char unitLetter;

        System.out.println("Enter the building number (1-5) or 0 for all buildings:");
        buildingInput = scanner.nextInt();
        System.out.println("Enter the level number (1-8) or 0 for all levels:");
        levelInput = scanner.nextInt();

        for(int building = 1; building <= 5; building++) {
            // Skip to the next iteration if the user asked for a specific building and this isn't it
            if(buildingInput != 0 && buildingInput != building) continue;

            for(int level = 1; level <= 8; level++) {
                // Skip to the next iteration if the user asked for a specific level and this isn't it
                if(levelInput != 0 && levelInput != level) continue;

                for(int unit = 1; unit <= 26; unit++) {
                    // Convert the unit number to a letter, where 1 maps to 'A', 2 to 'B', etc.
                    unitLetter = (char)('A' + unit - 1);
                    System.out.print(building + "-" + level + "-" + unitLetter + " ");
                }

                System.out.println(); // Newline after each level
            }
            System.out.println(); // Newline after each building
        }

        scanner.close();
    }
}

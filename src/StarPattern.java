public class StarPattern {

    public static void main(String[] args) {

        int numberOfRows = 5;


        for (int i = 1; i <= numberOfRows; i++) {

            // Inner loop for each column in a row
            for (int j = 1; j <= i; j++) {
                // Print star for each column of the current row
                System.out.print("*");
            }

            // Move to the next line after printing all stars in a row
            System.out.println();
        }
    }
}

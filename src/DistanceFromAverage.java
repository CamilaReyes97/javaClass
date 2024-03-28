import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[15];
        int count = 0;
        double sum = 0;

        System.out.println("Enter up to 15 numbers. Enter 99999 to finish.");

        while (count < 15) {
            double input = scanner.nextDouble();
            if (input == 99999) {
                break;
            }
            numbers[count] = input;
            sum += input;
            count++;
        }

        if (count == 0) {
            System.out.println("Error: No numbers were entered.");
        } else {
            double average = sum / count;
            System.out.println("Average: " + average);

            System.out.println("Number\tDistance from Average");
            for (int i = 0; i < count; i++) {
                double distance = numbers[i] - average;
                System.out.printf("%.2f\t%.2f\n", numbers[i], distance);
            }
        }
    }
}

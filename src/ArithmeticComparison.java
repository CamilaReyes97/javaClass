public class ArithmeticComparison {
        public static void main(String[] args) {

            int x = 30;
            int y = 12;


            int sum = x + y;
            int division = x / y;


            boolean isGreater = x > y;
            boolean isEqual = x == y;

            System.out.println("The sum of " + x + " plus " + y + " is: " + sum);
            System.out.println("The division of " + x + " by " + y + " is: " + division);


            if (isGreater) {
                System.out.println(x + " is greater than " + y);
            } else {
                System.out.println(x + " is not greater than " + y);
            }

            if (isEqual) {
                System.out.println(x + " is equal to " + y);
            } else {
                System.out.println(x + " is not equal to " + y);
            }
        }
    }

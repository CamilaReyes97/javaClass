import java.util.Scanner;

public class PasswordAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        int digitCount = 0;
        int punctuationCount = 0;
        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (!Character.isLetterOrDigit(ch)) {
                punctuationCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            }
        }

        String strength = calculateStrength(digitCount, punctuationCount, lowerCaseCount, upperCaseCount);
        System.out.println("Password Strength: " + strength);
        System.out.println("Details: Digits: " + digitCount + ", Punctuation: " + punctuationCount +
                ", Lowercase: " + lowerCaseCount + ", Uppercase: " + upperCaseCount);
    }

    private static String calculateStrength(int digitCount, int punctuationCount, int lowerCaseCount, int upperCaseCount) {
        int criteriaMet = 0;
        if (digitCount > 0) criteriaMet++;
        if (punctuationCount > 0) criteriaMet++;
        if (lowerCaseCount > 0) criteriaMet++;
        if (upperCaseCount > 0) criteriaMet++;

        if (criteriaMet >= 4) {
            return "Strong";
        } else if (criteriaMet == 3) {
            return "Medium";
        } else {
            return "Weak";
        }
    }
}

import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your password to check its strength: ");
        String password = scanner.nextLine();

        boolean hasLowercase = false, hasUppercase = false, hasDigit = false, hasSpecialChar = false;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isLowerCase(ch)) hasLowercase = true;
                if (Character.isUpperCase(ch)) hasUppercase = true;
                if (Character.isDigit(ch)) hasDigit = true;
                if (!Character.isLetterOrDigit(ch)) hasSpecialChar = true;
            }

            if (hasLowercase && hasUppercase && hasDigit && hasSpecialChar) {
                System.out.println("Password is strong.");
            } else {
                System.out.println("Password is weak. It must contain lowercase and uppercase letters, a number, and a special character.");
            }
        } else {
            System.out.println("Password is too short. It must be at least 8 characters long.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class PasswordGenerator2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        
        if (isStrongPassword(password)) {
            System.out.println("Password is strong!");
        } else {
            System.out.println("Password is weak. Please choose a stronger password.");
        }
        
        String correctPassword = "isStrongPassword(password)";
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();
        
        if (enteredPassword.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Wrong password. Please try again.");
        }
    }
    
    private static boolean isStrongPassword(String password) {
        // Check password length
        if (password.length() < 8) {
            return false;
        }
        
        // Check for at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        
        // Check for at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }
        
        // Check for at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }
        
        // Check for at least one special character
        if (!password.matches(".*[!@#$%^&*()].*")) {
            return false;
        }
        return true;
    }
}
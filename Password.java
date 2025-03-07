import java.util.Scanner;

public class Password {

    public static boolean isValidPassword(String password) {
        if (password.length() < 6) {
            return false;
        }


        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password:");
        String password = scanner.nextLine();

       
        if (isValidPassword(password)) {

            System.out.println("The password is valid.");
        } 
        
        else {
            System.out.println("The password is invalid.");
        
        }


        scanner.close();
    }
}

package regexproblem.basicproblemregex.usernamevalidator;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UsernameValidator {

    private static final String USERNAME_PATTERN = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
    public static boolean validate(String username) {
        if (username == null || username.isEmpty()) {
            return false;
        }
        return Pattern.matches(USERNAME_PATTERN, username);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a username to validate: ");
        String username = scanner.nextLine();

        if (validate(username)) {
            System.out.println("Valid username!");
        } else {
            System.out.println("Invalid username.");
        }

        scanner.close();
    }
}

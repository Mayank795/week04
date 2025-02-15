package regexproblem.basicproblemregex.licenseplatevalidator;
import java.util.regex.Pattern;

public class LicensePlateValidator {

    // Regular expression for a valid license plate
    private static final String LICENSE_PLATE_PATTERN = "^[A-Z]{2}\\d{4}$";

    // Method to validate license plate
    public static boolean validate(String licensePlate) {
        if (licensePlate == null || licensePlate.isEmpty()) {
            return false;
        }
        return Pattern.matches(LICENSE_PLATE_PATTERN, licensePlate);
    }

    // Main method for command-line validation
    public static void main(String[] args) {
        // Scanner to take user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter a license plate to validate: ");
        String licensePlate = scanner.nextLine();

        if (validate(licensePlate)) {
            System.out.println("Valid license plate!");
        } else {
            System.out.println("Invalid license plate.");
        }

        scanner.close();
    }
}

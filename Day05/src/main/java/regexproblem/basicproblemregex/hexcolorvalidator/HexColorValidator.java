package regexproblem.basicproblemregex.hexcolorvalidator;
import java.util.regex.Pattern;
import java.util.Scanner;
public class HexColorValidator {

    private static final String HEX_COLOR_PATTERN = "^#([0-9A-Fa-f]{6})$";

    public static boolean validate(String hexColor) {
        if (hexColor == null || hexColor.isEmpty()) {
            return false;
        }
        return Pattern.matches(HEX_COLOR_PATTERN, hexColor);
    }

    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a hex color code to validate: ");
        String hexColor = scanner.nextLine();

        if (validate(hexColor)) {
            System.out.println("Valid hex color code!");
        } else {
            System.out.println("Invalid hex color code.");
        }

        scanner.close();
    }
}

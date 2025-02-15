package customexception;
import java.util.Scanner;
public class AgeValidatorApp {
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Access granted!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgeValidatorApp app = new AgeValidatorApp();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            app.validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


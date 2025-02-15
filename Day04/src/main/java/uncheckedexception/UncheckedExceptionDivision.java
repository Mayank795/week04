package uncheckedexception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class UncheckedExceptionDivision {
    public void divideNumbers() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter integer Values only.");
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        UncheckedExceptionDivision divisionApp = new UncheckedExceptionDivision();
        divisionApp.divideNumbers();
    }
}

package regexproblem.advancedproblem.creditcardvalidator;
import java.util.regex.Pattern;
public class CreditCardValidator {

    private static final String VISA_PATTERN = "^4[0-9]{15}$";
    private static final String MASTERCARD_PATTERN = "^5[1-5][0-9]{14}$";

    public static boolean isValidCreditCard(String cardNumber) {
        return Pattern.matches(VISA_PATTERN, cardNumber) || Pattern.matches(MASTERCARD_PATTERN, cardNumber);
    }

    public static void main(String[] args) {
        String cardNumber = "4111111111111111";
        System.out.println(isValidCreditCard(cardNumber) ? "Valid" : "Invalid");
    }
}

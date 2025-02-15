package regexproblem.advancedproblem.creditcardvalidator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import regexproblem.advancedproblem.creditcardvalidator.CreditCardValidator;

public class CreditCardValidatorTest {
    @Test
    public void testValidVisaCard() {
        assertTrue(CreditCardValidator.isValidCreditCard("4111111111111111"));
    }
    @Test
    public void testInvalidVisaCard() {
        assertFalse(CreditCardValidator.isValidCreditCard("41111111111111"));
    }
    @Test
    public void testValidMasterCard() {
        assertTrue(CreditCardValidator.isValidCreditCard("5111111111111111"));
    }
    @Test
    public void testInvalidMasterCard() {
        assertFalse(CreditCardValidator.isValidCreditCard("51111111111111"));
    }

    @Test
    public void testInvalidCardWithInvalidPrefix() {
        assertFalse(CreditCardValidator.isValidCreditCard("6111111111111111"));
    }
}

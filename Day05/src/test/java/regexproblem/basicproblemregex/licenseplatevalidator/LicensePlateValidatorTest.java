package regexproblem.basicproblemregex.licenseplatevalidator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LicensePlateValidatorTest {

    @Test
    public void testValidLicensePlate() {
        assertTrue(LicensePlateValidator.validate("AB1234"));
    }

    @Test
    public void testInvalidLicensePlateTooShort() {
        assertFalse(LicensePlateValidator.validate("A12345"));
    }

    @Test
    public void testInvalidLicensePlateTooLong() {
        assertFalse(LicensePlateValidator.validate("AB12345"));
    }

    @Test
    public void testInvalidLicensePlateLettersNotUpperCase() {
        assertFalse(LicensePlateValidator.validate("ab1234"));
    }

    @Test
    public void testInvalidLicensePlateNotEnoughLetters() {
        assertFalse(LicensePlateValidator.validate("A1234"));
    }

    @Test
    public void testInvalidLicensePlateWithSpecialCharacters() {
        assertFalse(LicensePlateValidator.validate("AB!234"));
    }

    @Test
    public void testEmptyLicensePlate() {
        assertFalse(LicensePlateValidator.validate(""));
    }

    @Test
    public void testNullLicensePlate() {
        assertFalse(LicensePlateValidator.validate(null));
    }
}

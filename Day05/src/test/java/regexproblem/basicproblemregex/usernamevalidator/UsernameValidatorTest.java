package regexproblem.usernamevalidator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import regexproblem.basicproblemregex.usernamevalidator.UsernameValidator;

public class UsernameValidatorTest {
    @Test
    public void testValidUsername() {
        assertTrue(UsernameValidator.validate("user_123"));
    }
    @Test
    public void testInvalidUsernameStartsWithNumber() {
        assertFalse(UsernameValidator.validate("123user"));
    }
    @Test
    public void testTooShortUsername() {
        assertFalse(UsernameValidator.validate("us"));
    }
    @Test
    public void testTooLongUsername() {
        assertFalse(UsernameValidator.validate("this_username_is_too_long"));
    }
    @Test
    public void testEmptyUsername() {
        assertFalse(UsernameValidator.validate(""));
    }
    @Test
    public void testNullUsername() {
        assertFalse(UsernameValidator.validate(null));
    }
    @Test
    public void testUsernameWithSpecialCharacters() {
        assertFalse(UsernameValidator.validate("user@123"));
    }

    @Test
    public void testUsernameWithOnlyNumbers() {
        assertFalse(UsernameValidator.validate("123456"));
    }
}

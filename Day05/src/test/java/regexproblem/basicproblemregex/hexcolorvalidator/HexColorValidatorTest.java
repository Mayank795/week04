package regexproblem.basicproblemregex.hexcolorvalidator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import regexproblem.basicproblemregex.hexcolorvalidator.HexColorValidator;

public class HexColorValidatorTest {
    @Test
    public void testValidHexColorCodeUppercase() {
        assertTrue(HexColorValidator.validate("#FFA500"));
    }
    @Test
    public void testValidHexColorCodeLowercase() {
        assertTrue(HexColorValidator.validate("#ff4500"));
    }
    @Test
    public void testInvalidHexColorCodeTooShort() {
        assertFalse(HexColorValidator.validate("#123"));
    }
    @Test
    public void testInvalidHexColorCodeTooLong() {
        assertFalse(HexColorValidator.validate("#1234567"));
    }
    @Test
    public void testInvalidHexColorCodeWithSpecialCharacters() {
        assertFalse(HexColorValidator.validate("#ff45@0"));
    }
    @Test
    public void testInvalidHexColorCodeWithoutHash() {
        assertFalse(HexColorValidator.validate("ff4500"));
    }
    @Test
    public void testEmptyHexColorCode() {
        assertFalse(HexColorValidator.validate(""));
    }
    @Test
    public void testNullHexColorCode() {
        assertFalse(HexColorValidator.validate(null));
    }
}

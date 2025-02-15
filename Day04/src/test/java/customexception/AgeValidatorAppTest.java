package customexception;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AgeValidatorAppTest {

    @Test
    public void testValidateAge_AgeAbove18() {
        AgeValidatorApp app = new AgeValidatorApp();
        try {
            app.validateAge(20);
        } catch (InvalidAgeException e) {
            fail("Exception should not be thrown for age 20");
        }
    }

    @Test
    public void testValidateAge_AgeBelow18() {
        AgeValidatorApp app = new AgeValidatorApp();
        InvalidAgeException exception = assertThrows(InvalidAgeException.class, () -> {
            app.validateAge(16);
        });
        assertEquals("Age must be 18 or above", exception.getMessage());
    }
}


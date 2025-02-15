package throwvsthrows;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThrowVsThrowsInterestCalculatorTest {

    @Test
    public void testValidInput() {
        try {
            double result = ThrowVsThrowsInterestCalculator.calculateInterest(1000, 5, 3);
            assertEquals(150.0, result);
        } catch (IllegalArgumentException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testNegativeAmount() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ThrowVsThrowsInterestCalculator.calculateInterest(-1000, 5, 3);
        });
        assertEquals("Amount and rate must be positive", exception.getMessage());
    }

    @Test
    public void testNegativeRate() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ThrowVsThrowsInterestCalculator.calculateInterest(1000, -5, 3);
        });
        assertEquals("Amount and rate must be positive", exception.getMessage());
    }
}

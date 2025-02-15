package finallyblock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FinallyBlockDivisionTest {

    @Test
    public void testValidDivision() {
        assertEquals(5, FinallyBlockDivision.divide(10, 2));
    }

    @Test
    public void testDivisionByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            FinallyBlockDivision.divide(10, 0);
        });
        assertEquals("/ by zero", exception.getMessage());
    }
}

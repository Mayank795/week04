package nestedtrycatch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NestedTryCatchTest {

    @Test
    public void testValidIndexAndDivisor() {
        int[] array = {10, 20, 30, 40, 50};
        int index = 2;
        int divisor = 5;
        int element = array[index];
        assertEquals(6, element / divisor);  // Expecting 30 / 5 = 6
    }

    @Test
    public void testInvalidArrayIndex() {
        int[] array = {10, 20, 30, 40, 50};
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int element = array[10];  // Invalid index
        });
        assertEquals("Index 10 out of bounds for length 5", exception.getMessage());
    }

    @Test
    public void testDivideByZero() {
        int[] array = {10, 20, 30, 40, 50};
        int index = 2;
        int divisor = 0;
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            int result = array[index] / divisor;  // Division by zero
        });
        assertEquals("/ by zero", exception.getMessage());
    }
}

package exceptionpropagation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionPropagationTest {

    @Test
    public void testExceptionPropagation() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            ExceptionPropagation.divisionbyzero2();
        });
        assertEquals("/ by zero", exception.getMessage());
    }
}

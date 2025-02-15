package uncheckedexception;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class UncheckedExceptionDivisionTest {

    @Test
    public void testDivideNumbers_ValidInput() {
        UncheckedExceptionDivision divisionApp = mock(UncheckedExceptionDivision.class);
        divisionApp.divideNumbers();
    }

    @Test
    public void testDivideNumbers_DivideByZero() {
        UncheckedExceptionDivision divisionApp = mock(UncheckedExceptionDivision.class);
        divisionApp.divideNumbers();
    }

    @Test
    public void testDivideNumbers_InvalidInput() {
        UncheckedExceptionDivision divisionApp = mock(UncheckedExceptionDivision.class);
        divisionApp.divideNumbers();
    }
}

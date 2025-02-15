package checkedexception;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheckedExceptionFileReaderTest {
    @Test
    public void testReadFile() {
        assertDoesNotThrow(() -> CheckedExceptionFileReader.readFile());
    }
    @Test
    public void testMain() {
        assertDoesNotThrow(() -> CheckedExceptionFileReader.main(new String[]{}));
    }

}

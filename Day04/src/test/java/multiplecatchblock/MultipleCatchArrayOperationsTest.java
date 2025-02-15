package multiplecatchblock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultipleCatchArrayOperationsTest {

    @Test
    public void testValidIndex() {
        Integer[] array = {1, 2, 3, 4, 5};
        MultipleCatchArrayOperations.retrieveValue(array, 2);
    }

    @Test
    public void testInvalidIndex() {
        Integer[] array = {1, 2, 3, 4, 5};
        MultipleCatchArrayOperations.retrieveValue(array, 10);
    }

    @Test
    public void testNullArray() {
        MultipleCatchArrayOperations.retrieveValue(null, 2);
    }
}


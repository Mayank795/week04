package regexproblem.extractionproblem.dateextract;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
public class DateExtractorTest {
    @Test
    public void testExtractDates() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> expected = List.of("12/05/2023", "15/08/2024", "29/02/2020");
        List<String> result = DateExtractor.extractDates(text);
        assertEquals(expected, result);
    }
    @Test
    public void testNoDates() {
        String text = "No dates here!";
        List<String> expected = List.of();
        List<String> result = DateExtractor.extractDates(text);
        assertEquals(expected, result);
    }
    @Test
    public void testSingleDate() {
        String text = "The event is scheduled for 01/01/2025.";
        List<String> expected = List.of("01/01/2025");
        List<String> result = DateExtractor.extractDates(text);
        assertEquals(expected, result);
    }
}

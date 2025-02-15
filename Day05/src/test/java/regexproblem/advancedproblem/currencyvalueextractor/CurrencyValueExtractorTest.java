package regexproblem.advancedproblem.currencyvalueextractor;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import regexproblem.advancedproblem.currencyvalueextractor.CurrencyValueExtractor;

import java.util.List;
public class CurrencyValueExtractorTest {
    @Test
    public void testExtractCurrencyValues() {
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> values = CurrencyValueExtractor.extractCurrencyValues(text);
        assertEquals(2, values.size());
        assertTrue(values.contains("$45.99"));
        assertTrue(values.contains("10.50"));
    }
    @Test
    public void testExtractCurrencyValuesNoMatch() {
        String text = "There is no currency in this text.";
        List<String> values = CurrencyValueExtractor.extractCurrencyValues(text);

        assertTrue(values.isEmpty());
    }

    @Test
    public void testExtractCurrencyValuesWithMultipleSymbols() {
        String text = "The price is $100.99 and the total is 200.50.";
        List<String> values = CurrencyValueExtractor.extractCurrencyValues(text);

        assertEquals(2, values.size());
        assertTrue(values.contains("$100.99"));
        assertTrue(values.contains("200.50"));
    }
}

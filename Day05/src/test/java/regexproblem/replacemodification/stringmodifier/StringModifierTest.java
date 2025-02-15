package regexproblem.replacemodification.stringmodifier;
import org.junit.jupiter.api.Test;
import regexproblem.replacemodification.stringmodifier.StringModifier;

import static org.junit.jupiter.api.Assertions.*;

public class StringModifierTest {
    @Test
    public void testReplaceMultipleSpaces() {
        String input = "My   Name  is Ankit Patel.";
        String expected = "My Name is Ankit Patel.";
        String result = StringModifier.replaceMultipleSpaces(input);
        assertEquals(expected, result);
    }

    @Test
    public void testNoExtraSpaces() {
        String input = "One Day or Day one Choice is yours.";
        String expected = "One Day or Day one Choice is yours.";
        String result = StringModifier.replaceMultipleSpaces(input);
        assertEquals(expected, result);
    }

    @Test
    public void testOnlySpaces() {
        String input = "     ";
        String expected = " ";
        String result = StringModifier.replaceMultipleSpaces(input);
        assertEquals(expected, result);
    }
}

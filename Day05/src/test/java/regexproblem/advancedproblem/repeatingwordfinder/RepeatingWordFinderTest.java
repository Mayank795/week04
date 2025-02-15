package regexproblem.advancedproblem.repeatingwordfinder;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import regexproblem.advancedproblem.repeatingwordfinder.RepeatingWordFinder;

import java.util.Set;

public class RepeatingWordFinderTest {

    @Test
    public void testFindRepeatingWords() {
        String sentence = "This is is a repeated repeated word test.";
        Set<String> repeatingWords = RepeatingWordFinder.findRepeatingWords(sentence);

        assertEquals(2, repeatingWords.size());
        assertTrue(repeatingWords.contains("is"));
        assertTrue(repeatingWords.contains("repeated"));
    }

    @Test
    public void testFindRepeatingWordsWithNoRepeats() {
        String sentence = "My name is Ankit Patel";
        Set<String> repeatingWords = RepeatingWordFinder.findRepeatingWords(sentence);

        assertTrue(repeatingWords.isEmpty());
    }

    @Test
    public void testFindRepeatingWordsWithPunctuation() {
        String sentence = "Moshi Moshi! Hello Hello!";
        Set<String> repeatingWords = RepeatingWordFinder.findRepeatingWords(sentence);

        assertEquals(2, repeatingWords.size());
        assertTrue(repeatingWords.contains("Hello"));
        assertTrue(repeatingWords.contains("Moshi"));
    }
}

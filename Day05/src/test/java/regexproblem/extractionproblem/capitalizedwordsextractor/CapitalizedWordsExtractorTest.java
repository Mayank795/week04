package regexproblem.extractionproblem.capitalizedwordsextractor;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
public class CapitalizedWordsExtractorTest {

    @Test
    public void testExtractCapitalizedWordsFromSentence() {
        String sentence = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> words = CapitalizedWordsExtractor.extractCapitalizedWords(sentence);
        assertEquals(8, words.size());
        assertTrue(words.contains("Tower"));
        assertTrue(words.contains("Paris"));
        assertTrue(words.contains("Statue"));
        assertTrue(words.contains("Liberty"));
        assertTrue(words.contains("New"));
        assertTrue(words.contains("York"));
    }

    @Test
    public void testExtractCapitalizedWordsFromSentenceWithNoCapitalizedWords() {
        String sentence = "this is a simple sentence.";
        List<String> words = CapitalizedWordsExtractor.extractCapitalizedWords(sentence);

        assertTrue(words.isEmpty());
    }

    @Test
    public void testExtractCapitalizedWordsFromEmptySentence() {
        String sentence = "";
        List<String> words = CapitalizedWordsExtractor.extractCapitalizedWords(sentence);

        assertTrue(words.isEmpty());
    }

    @Test
    public void testExtractCapitalizedWordsFromSentenceWithMixedCase() {
        String sentence = "Extract All Capitalized Words From a Sentence";
        List<String> words = CapitalizedWordsExtractor.extractCapitalizedWords(sentence);

        assertEquals(6, words.size());
        assertTrue(words.contains("Extract"));
        assertTrue(words.contains("All"));
        assertTrue(words.contains("From"));
        assertTrue(words.contains("Capitalized"));
        assertTrue(words.contains("Words"));
        assertTrue(words.contains("Sentence"));
    }
}

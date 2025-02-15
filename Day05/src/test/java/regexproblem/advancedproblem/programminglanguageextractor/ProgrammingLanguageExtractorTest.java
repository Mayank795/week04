package regexproblem.advancedproblem.programminglanguageextractor;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import regexproblem.advancedproblem.programminglanguageextractor.ProgrammingLanguageExtractor;

import java.util.List;
public class ProgrammingLanguageExtractorTest {
    @Test
    public void testExtractLanguages() {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> languages = ProgrammingLanguageExtractor.extractLanguages(text);
        assertEquals(4, languages.size());
        assertTrue(languages.contains("Java"));
        assertTrue(languages.contains("Python"));
        assertTrue(languages.contains("JavaScript"));
        assertTrue(languages.contains("Go"));
    }
    @Test
    public void testExtractLanguagesWithNoMatch() {
        String text = "I love coding!";
        List<String> languages = ProgrammingLanguageExtractor.extractLanguages(text);

        assertTrue(languages.isEmpty());
    }
    @Test
    public void testExtractLanguagesWithPartialMatches() {
        String text = "I love Java and Python, but I don't know JavaScript or Go.";
        List<String> languages = ProgrammingLanguageExtractor.extractLanguages(text);
        assertEquals(4, languages.size());
        assertTrue(languages.contains("Java"));
        assertTrue(languages.contains("Python"));
        assertTrue(languages.contains("Go"));
    }
}

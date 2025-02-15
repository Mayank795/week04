package regexproblem.extractionproblem.linksextractor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.List;

public class LinksExtractorTest {

    @Test
    public void testExtractLinksFromText() {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> links = LinksExtractor.extractLinks(text);

        assertEquals(2, links.size());
        assertTrue(links.contains("https://www.google.com"));
        assertTrue(links.contains("http://example.org"));
    }

    @Test
    public void testExtractLinksFromTextWithNoLinks() {
        String text = "This text contains no URLs.";
        List<String> links = LinksExtractor.extractLinks(text);

        assertTrue(links.isEmpty());
    }

    @Test
    public void testExtractLinksFromTextWithMultipleLinks() {
        String text = "Check https://ankitpatel1806.github.io/Yugtechcreations, and https://ankitkumar.college .";
        List<String> links = LinksExtractor.extractLinks(text);

        assertEquals(2, links.size());
        assertTrue(links.contains("https://ankitpatel1806.github.io/Yugtechcreations"));
        assertTrue(links.contains("https://ankitkumar.college"));
    }

    @Test
    public void testExtractLinksFromTextWithExtraSpaces() {
        String text = "The links are https://ankitpatel1806.github.io/Yugtechcreations and https://ankitkumar.college .";
        List<String> links = LinksExtractor.extractLinks(text);

        assertEquals(2, links.size());
        assertTrue(links.contains("https://ankitpatel1806.github.io/Yugtechcreations"));
        assertTrue(links.contains("https://ankitkumar.college"));
    }

    @Test
    public void testExtractLinksFromEmptyText() {
        String text = "";
        List<String> links = LinksExtractor.extractLinks(text);

        assertTrue(links.isEmpty());
    }
}


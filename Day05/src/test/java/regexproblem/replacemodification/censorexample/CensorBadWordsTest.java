package regexproblem.replacemodification.censorexample;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import regexproblem.replacemodification.censorexample.CensorBadWords;

import java.util.List;
public class CensorBadWordsTest {
    @Test
    public void testCensorBadWords() {
        List<String> badWords = List.of("damn", "stupid");
        String sentence = "This is a damn bad example with some stupid words.";
        String censoredSentence = CensorBadWords.censorBadWords(sentence, badWords);
        assertEquals("This is a **** bad example with some **** words.", censoredSentence);
    }

    @Test
    public void testCensorBadWordsWithDifferentCase() {
        List<String> badWords = List.of("DAMN", "STUPID");
        String sentence = "This is a damn bad example with some stupid words.";
        String censoredSentence = CensorBadWords.censorBadWords(sentence, badWords);
        assertEquals("This is a damn bad example with some stupid words.", censoredSentence);
    }
    @Test
    public void testCensorBadWordsWithNoMatch() {
        List<String> badWords = List.of("idiot", "fool");
        String sentence = "This is a damn bad example with some stupid words.";
        String censoredSentence = CensorBadWords.censorBadWords(sentence, badWords);
        assertEquals("This is a damn bad example with some stupid words.", censoredSentence);
    }

    @Test
    public void testCensorBadWordsWithEmptySentence() {
        List<String> badWords = List.of("damn", "stupid");
        String sentence = "";
        String censoredSentence = CensorBadWords.censorBadWords(sentence, badWords);
        assertEquals("", censoredSentence);
    }
}

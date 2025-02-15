package regexproblem.extractionproblem.emailextractor;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmailExtractorTest {

    @Test
    public void testExtractEmailsFromText() {
        String text = "Contact us at capgminilab@cap.org and technocrats191@techno.org for more information.";
        List<String> emails = EmailExtractor.extractEmails(text);

        assertEquals(2, emails.size());
        assertTrue(emails.contains("capgminilab@cap.org"));
        assertTrue(emails.contains("technocrats191@techno.org"));
    }

    @Test
    public void testExtractEmailsFromTextWithExtraSpaces() {
        String text = "You can reach me at yugap1806@gmail.com,   or sidhart_18@outlook.com";
        List<String> emails = EmailExtractor.extractEmails(text);

        assertEquals(2, emails.size());
        assertTrue(emails.contains("yugap1806@gmail.com"));
        assertTrue(emails.contains("sidhart_18@outlook.com"));
    }


    @Test
    public void testExtractEmailsFromTextWithNoEmails() {
        String text = "There are no emails in this text.";
        List<String> emails = EmailExtractor.extractEmails(text);

        assertTrue(emails.isEmpty());
    }

    @Test
    public void testExtractEmailsFromEmptyText() {
        String text = "";
        List<String> emails = EmailExtractor.extractEmails(text);

        assertTrue(emails.isEmpty());
    }
}

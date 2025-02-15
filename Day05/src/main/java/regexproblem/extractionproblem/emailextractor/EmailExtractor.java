package regexproblem.extractionproblem.emailextractor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailExtractor {
    private static final String EMAIL_PATTERN = "([a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7})";

    public static List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            emails.add(matcher.group());
        }

        return emails;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> emails = extractEmails(text);

        System.out.println("Extracted email addresses:");
        for (String email : emails) {
            System.out.println(email);
        }
    }
}

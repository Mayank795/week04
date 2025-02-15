package regexproblem.advancedproblem.programminglanguageextractor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageExtractor {

    private static final String LANGUAGES_PATTERN = "\\b(Java|Python|JavaScript|Go)\\b";

    public static List<String> extractLanguages(String text) {
        List<String> languages = new ArrayList<>();
        Pattern pattern = Pattern.compile(LANGUAGES_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            languages.add(matcher.group());
        }

        return languages;
    }

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        System.out.println(extractLanguages(text));
    }
}


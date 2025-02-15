package regexproblem.extractionproblem.capitalizedwordsextractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class CapitalizedWordsExtractor {

    private static final String CAPITALIZED_WORD_PATTERN = "\\b[A-Z][a-z]*\\b";

    public static List<String> extractCapitalizedWords(String sentence) {
        List<String> capitalizedWords = new ArrayList<>();
        Pattern pattern = Pattern.compile(CAPITALIZED_WORD_PATTERN);
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }

        return capitalizedWords;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        List<String> capitalizedWords = extractCapitalizedWords(sentence);
        System.out.println("Extracted capitalized words:");
        for (String word : capitalizedWords) {
            System.out.println(word);
        }
    }
}


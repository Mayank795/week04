package regexproblem.extractionproblem.linksextractor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
public class LinksExtractor {
    private static final String URL_PATTERN = "\\b(?:https?|ftp):\\/\\/[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*(?:\\/[^\\s]*)?\\b";
    public static List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        Pattern pattern = Pattern.compile(URL_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            links.add(matcher.group());
        }

        return links;
    }

    public static void main(String[] args) {
        String text = "Visit https://hianime.to/watch/solo-leveling-season-2-arise-from-the-shadow-19413?ep=132569";


        List<String> links = extractLinks(text);

        System.out.println("Extracted links:");
        for (String link : links) {
            System.out.println(link);
        }
    }
}


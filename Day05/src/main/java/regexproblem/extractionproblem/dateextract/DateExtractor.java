package regexproblem.extractionproblem.dateextract;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DateExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> dates = extractDates(text);
        System.out.println(String.join(", ", dates));
    }

    public static List<String> extractDates(String text) {
        List<String> dates = new ArrayList<>();
        String regex = "\\b(\\d{2}/\\d{2}/\\d{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }
}

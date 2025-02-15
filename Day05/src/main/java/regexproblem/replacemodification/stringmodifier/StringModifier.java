package regexproblem.replacemodification.stringmodifier;

public class StringModifier {
    public static void main(String[] args) {
        String input = "This  is   an   example    with multiple spaces.";
        String output = replaceMultipleSpaces(input);
        System.out.println(output);
    }

    public static String replaceMultipleSpaces(String input) {
        return input.replaceAll("\\s+", " ");
    }
}

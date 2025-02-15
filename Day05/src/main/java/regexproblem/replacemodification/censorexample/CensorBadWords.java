package regexproblem.replacemodification.censorexample;

import java.util.List;

public class CensorBadWords {
    public static String censorBadWords(String sentence, List<String> badWords) {
        for (String badWord : badWords) {
            sentence = sentence.replaceAll("\\b" + badWord + "\\b", "****");
        }
        return sentence;
    }

    public static void main(String[] args) {

        List<String> badWords = List.of("damn", "stupid");

        String sentence = "This is a damn bad example with some stupid words.";
        String censoredSentence = censorBadWords(sentence, badWords);

        System.out.println(censoredSentence);
    }
}


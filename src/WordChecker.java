import java.util.HashSet;
import java.util.Set;

public class WordChecker {
    private String text;

    public WordChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Set<String> words = new HashSet<>();
        String[] wordsArray = text.split("\\P{IsAlphabetic}+");
        for (String w : wordsArray) {
            String wLowerCase = w.toLowerCase();
            words.add(wLowerCase);
        }
        String wordLowerCase = word.toLowerCase();
        if (words.contains(wordLowerCase)) {
            return true;
        } else {
            return false;
        }
    }
}

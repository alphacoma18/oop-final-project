import java.util.regex.*;
import java.util.HashSet;
abstract class Guess {
    public HashSet<String> guessWords = new HashSet<>();


    protected boolean isGuessCorrect(String guessWord) {
        Pattern pattern = Pattern.compile(guessWord);
        Matcher matcher = pattern.matcher(guessWord);
        return matcher.matches();
    }
}

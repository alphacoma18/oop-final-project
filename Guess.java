import java.util.HashSet;

public class Guess {
    protected HashSet<String> guessWords = new HashSet<String>();

    protected boolean exists(String guessWord) {
        return guessWords.contains(guessWord);
    }

}

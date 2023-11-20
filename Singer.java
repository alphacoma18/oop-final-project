import java.util.Arrays;
import java.util.HashSet;

public class Singer extends People {
    Singer() {
        guessWords = new HashSet<String>(Arrays.asList("The Weeknd", "Adele", "Ed Sheeran", "Beyoncé", "Taylor Swift",
                "Justin Bieber", "Rihanna", "Drake", "Ariana Grande", "Bruno Mars",
                "Katy Perry", "Shawn Mendes", "Dua Lipa", "Selena Gomez", "Post Malone",
                "Lady Gaga", "John Legend", "Sam Smith", "Billie Eilish", "Harry Styles",
                "Nicki Minaj", "Sia", "Chris Martin", "Zayn Malik", "Camila Cabello"));
    }

}
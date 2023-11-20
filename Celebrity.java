import java.util.Arrays;

import java.util.HashSet;

public class Celebrity extends People {
    public Celebrity() {
        super();
        guessWords = new HashSet<String>(
                Arrays.asList("Tom Hanks", "Jennifer Lawrence", "Leonardo DiCaprio", "Emma Stone", "Brad Pitt",
                        "Angelina Jolie", "Johnny Depp", "Meryl Streep", "Will Smith", "Scarlett Johansson",
                        "Keanu Reeves", "Bryan Cranston", "Aaron Paul"));
    }

}

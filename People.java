
// # People

// 1. Celebrities
// 2. YouTubers
// 3. Politicians
// 4. Singers
// 5. Streamers
// 6. E-sports Player
import java.util.ArrayList;

public class People {
    protected ArrayList<String> names = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
    }

    public void displayNames() {
        System.out.println("Names: " + names);
    }
}

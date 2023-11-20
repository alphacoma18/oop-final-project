/**
 * youtubers
 */
import java.util.ArrayList;
public class youtubers {
    private ArrayList<String> youtuberNames = new ArrayList<>();

    public void addYouTubers(){
         String[] youtuberNamesArray = {
            "PewDiePie",  "MrBeast", "Markiplier", "Dude Perfect",
            "Ninja", "Jake Paul", "Logan Paul", "Shane Dawson", "Casey Neistat",
            "David Dobrik", "Jeffree Star", "Liza Koshy", "Ryan Higa", "Philip DeFranco",
            "Vsauce", "H3H3 Productions", "Marques Brownlee", "MatPat"
        };
        //add
        for (String youtuberName : youtuberNamesArray){
            youtuberNames.add(youtuberName);
        }
    }
    public void isGuessCorrect (String guess){
        for (String youtuberName : youtuberNames){
            if (youtuberName.equalsIgnoreCase(guess)){
                System.out.println("YOU ARE CORRECT!");
                System.exit(0);
            }
        }
    }
    
}
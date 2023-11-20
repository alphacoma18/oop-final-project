
import java.util.ArrayList;

public class celebrities extends People {
    
    private ArrayList<String> celebrityNames = new ArrayList<>();
    public void addCelebrities() {
         String[] celebrityNamesArray = {
            "Tom Hanks", "Jennifer Lawrence", "Leonardo DiCaprio", "Emma Stone", "Brad Pitt",
            "Angelina Jolie", "Johnny Depp", "Meryl Streep", "Will Smith", "Scarlett Johansson",
            "Keanu Reeves", "Bryan Cranston", "Aaron Paul"
        };
        //adds
        for (String celebName : celebrityNamesArray){
            celebrityNames.add(celebName);
        }  
    }
    public void isGuessCorrect (String guessWord){
        for (String celebName : celebrityNames){
            if (guessWord.equalsIgnoreCase(celebName)){
                System.out.println("CORRECT! YOU GUESSED THE RIGHT PERSON!");
                System.exit(0); //For now, system exit muna :> 
            } 
        }
    }
}

import java.util.HashSet;
/**
 * singers
 */
public class singers extends People {
    private HashSet <String> singerNames = new HashSet<>();

    public void addSingers(){
        String[] singerNamesArray = {
            "The Weeknd", "Adele", "Ed Sheeran", "Beyoncé", "Taylor Swift",
            "Justin Bieber", "Rihanna", "Drake", "Ariana Grande", "Bruno Mars",
            "Katy Perry", "Shawn Mendes", "Dua Lipa", "Selena Gomez", "Post Malone",
            "Lady Gaga", "John Legend", "Sam Smith", "Billie Eilish", "Harry Styles",
            "Nicki Minaj", "Sia", "Chris Martin", "Zayn Malik", "Camila Cabello"
        };
        //add
        for (String singerName : singerNamesArray){
            System.out.print(singerName + " ");
            singerNames.add(singerName);
            
        }
    }

    public void isGuessCorrect(String guess){
        for (String singerName : singerNames){
            if (singerName.equalsIgnoreCase(guess)){
                System.out.println("CORRECT! THATS THE RIGHT WORD!");
                System.exit(0);
            }
        }
    }
    
}
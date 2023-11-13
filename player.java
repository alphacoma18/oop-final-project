import java.util.HashMap; //can be used for storing players
import java.util.Scanner;
public class player extends score {
    private String userName;
    private int playerScore; 
    Scanner scan = new Scanner(System.in);
    player(String userName, int playerScore){
        super(playerScore);
        this.userName = userName;
    }
    // NEW PLAYER 
    public void newPlayer(){
        String name;
        int score;
        System.out.print("Enter Player Name: ");
        name = scan.nextLine();
        System.out.print("Enter Score: ");
        score = scan.nextInt();
        player Player = new player(name,score);
    }
    //CHECKS IF THE PLAYER ALREADY EXIST, NEEDS CONCRETE IMPLEMENTATION
    public boolean isExist (){
        return true;
    }
    
}

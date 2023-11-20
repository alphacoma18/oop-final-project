import java.util.HashSet;

abstract class GameMode {
    static String gameMode = "";

    abstract void play();
}

class SinglePlayer extends GameMode {
    public SinglePlayer() {
        gameMode = "Single Player";
    }

    @Override
    public void play() {
        System.out.println("Playing " + gameMode);
    }
}

class MultiPlayer extends GameMode {
    public MultiPlayer() {
        gameMode = "Multi Player";
    }

    @Override
    public void play() {
        System.out.println("Playing " + gameMode);
    }
}

public class PinoyHenyo {
    HashSet<String> gameModes = new HashSet<>();
    private GameMode gameMode;
    IO io = IO.getInstance();

    private void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    private void play() {
        gameMode.play();
    }

    private void prompt() {
        Integer choice = 0;
        System.out.println("Choose game mode: ");
        gameModes.forEach((gameMode) -> {
            System.out.println(gameMode);
        });
        System.out.print("Enter choice: ");
        while (choice != 1 && choice != 2) {
            choice = io.getScanner().nextInt();
            switch (choice) {
                case 1: {
                    setGameMode(new SinglePlayer());
                    break;
                }
                case 2: {
                    setGameMode(new MultiPlayer());
                    break;
                }
                default: {
                    System.out.println("Invalid choice!");
                    break;
                }
            }
        }
    } 

    public void start() {
        prompt();
        play();
    }

    public PinoyHenyo() {

    }
}

import java.util.Set;

abstract class GameMode {
    String gameMode = "";

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
    Set<String> gameModes = Set.of(SinglePlayer.class.getName(), MultiPlayer.class.getName());
    private GameMode gameMode;
    IO io = IO.getInstance();

    private void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    private void play() {
        gameMode.play();
    }

    public void start() {
        System.out.println("Choose game mode: ");
        gameModes.forEach((gameMode) -> {
            System.out.println(gameMode);
        });
        System.out.print("Enter choice: ");
        int choice = io.getScanner().nextInt();
        switch (choice) {
            case 1:
                setGameMode(new SinglePlayer());
                break;
            case 2:
                setGameMode(new MultiPlayer());
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        play();
    }

    public PinoyHenyo() {

    }
}

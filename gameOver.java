
public class gameOver {
    private Timer timer;
     public void startGame() {
        timer = new Timer();
        timer.start();
    }

    public void endGame() {
        timer.stop();

        long elapsedTime = timer.getElapsedTime();
        long elapsedSeconds = elapsedTime / 1000;
        long minutes = elapsedSeconds / 60;
        long seconds = elapsedSeconds % 60;

        System.out.printf("Elapsed time: %02d:%02d%n", minutes, seconds);
    }
}
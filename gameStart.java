public class gameStart  {
    private Timer timer;

    public void startGame() {
        timer = new Timer(3 * 60 * 1000); // 3 minutes
        timer.start();
    }

    public void endGame() {
        timer.stop();

        long elapsedTime = timer.getElapsedTime();
        System.out.println("Elapsed time in milliseconds: " + elapsedTime);
    }
}
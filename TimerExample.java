public class TimerExample {
    public static void main(String[] args) {
        Timer timer = new Timer(3 * 60 * 1000); // 3 minutes

        System.out.println("Timer started!");
        timer.start();

        // Simulating other tasks while the timer is running
        for (int i = 1; i <= 10; i++) {
            System.out.println("Performing task " + i);
            try {
                Thread.sleep(1000); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        timer.stop();
        System.out.println("Timer stopped!");
    }
}

class Timer {
    private final long duration;
    private boolean running;

    Timer(long durationInMillis) {
        this.duration = durationInMillis;
        this.running = false;
    }

    void start() {
        running = true;
        long startTime = System.currentTimeMillis();

        while (running) {
            long elapsedTime = System.currentTimeMillis() - startTime;
            long remainingTime = duration - elapsedTime;

            if (remainingTime <= 0) {
                System.out.println("Time limit reached!");
                break;
            }

            long minutes = (remainingTime / 1000) / 60;
            long seconds = (remainingTime / 1000) % 60;

            System.out.printf("Time remaining: %02d:%02d%n", minutes, seconds);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void stop() {
        running = false;
    }
}
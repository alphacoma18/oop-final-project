public class Timer {
    private long startTime;
    private long endTime;
    private boolean running;

    public Timer() {
        this.running = false;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public boolean isRunning() {
        return this.running;
    }
}
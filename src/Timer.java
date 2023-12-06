public class Timer {
    private long startTime;
    private long stopTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        stopTime = System.nanoTime();
    }

    public String getFormattedTime() {
        long nanoSecondsTime = stopTime - startTime;
        double secondsTime = nanoSecondsTime / 1_000_000_000.0;

        return String.format("%d nanosegundos (%f segundos)", nanoSecondsTime, secondsTime);
    }
}

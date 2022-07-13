import java.util.concurrent.TimeUnit;

public class Timer {
    protected static long timer(Runnable method) {
        long time = System.nanoTime();
        method.run();
        time = System.nanoTime() - time;
        return TimeUnit.NANOSECONDS.convert(time, TimeUnit.NANOSECONDS);
    }
}

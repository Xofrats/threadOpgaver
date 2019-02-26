package lektion3a.Exercise4;

public class CounterIncrementer implements Runnable {
    private Counter counter;
    private int update;

    public CounterIncrementer(Counter counter, int update) {
        this.counter = counter;
        this.update = update;
    }

    @Override
    public void run() {
for (int i = 0; i<update; i++){
counter.increment();
        }
    }
}

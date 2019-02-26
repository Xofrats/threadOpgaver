package lektion3a.Exercise1and2;

public class Countincrementer implements Runnable {

    private Counter counter;

    public Countincrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++){
            counter.incrementA();
        }

        System.out.println(counter.getCountA());

    }
}

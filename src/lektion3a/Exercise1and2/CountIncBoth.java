package lektion3a.Exercise1and2;

public class CountIncBoth implements Runnable {

    private Counter counter;

    public CountIncBoth(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++){
            counter.incrementA();
            counter.incrementB();
        }

        System.out.println("A is " + counter.getCountA() + " And B is " + counter.getCountB());

    }
}

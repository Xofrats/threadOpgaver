package lektion3a.Exercise1and2;

public class CountIncB implements Runnable {

    private Counter counter;

    public CountIncB(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++){
            counter.incrementB();
        }

        System.out.println("B is " + counter.getCountB());

    }
}

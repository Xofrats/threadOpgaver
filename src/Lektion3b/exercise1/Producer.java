package Lektion3b.exercise1;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    Random r = new Random();

    public void run() {
        while (true) {
            int random1 = r.nextInt(50) + 1;
            int random2 = r.nextInt(50) + 1;
            try {
                queue.put(new Task(random1, random2));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

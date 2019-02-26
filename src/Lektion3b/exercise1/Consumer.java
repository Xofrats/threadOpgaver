package Lektion3b.exercise1;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    protected BlockingQueue<Task> queue = null;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            try {
                Task task = queue.take();
                System.out.println(task.toString());
                System.out.println(task.getFirstNumber() + task.getSecondNumber());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
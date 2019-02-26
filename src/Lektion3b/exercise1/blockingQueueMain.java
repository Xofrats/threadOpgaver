package Lektion3b.exercise1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class blockingQueueMain {

    public static void main(String[] args) throws Exception {

        BlockingQueue<Task> queue = new ArrayBlockingQueue(10);

        Producer producer1 = new Producer(queue);
        Producer producer2 = new Producer(queue);
        Producer producer3 = new Producer(queue);
        Producer producer4 = new Producer(queue);
        Producer producer5 = new Producer(queue);
        Producer producer6 = new Producer(queue);
        Producer producer7 = new Producer(queue);
        Producer producer8 = new Producer(queue);
        Producer producer9 = new Producer(queue);
        Producer producer10 = new Producer(queue);


        Consumer consumer1 = new Consumer(queue);
        Consumer consumer2 = new Consumer(queue);
        Consumer consumer3 = new Consumer(queue);
        Consumer consumer4 = new Consumer(queue);
        Consumer consumer5 = new Consumer(queue);
        Consumer consumer6 = new Consumer(queue);
        Consumer consumer7 = new Consumer(queue);
        Consumer consumer8 = new Consumer(queue);
        Consumer consumer9 = new Consumer(queue);
        Consumer consumer10 = new Consumer(queue);

        new Thread(producer1).start();
        new Thread(producer2).start();
        new Thread(producer3).start();
        new Thread(producer4).start();
        new Thread(producer5).start();
        new Thread(producer6).start();
        new Thread(producer7).start();
        new Thread(producer8).start();
        new Thread(producer9).start();
        new Thread(producer10).start();


        new Thread(consumer1).start();
        new Thread(consumer2).start();
        new Thread(consumer3).start();
        new Thread(consumer4).start();
        new Thread(consumer5).start();
        new Thread(consumer6).start();
        new Thread(consumer7).start();
        new Thread(consumer8).start();
        new Thread(consumer9).start();
        new Thread(consumer10).start();


    }
}

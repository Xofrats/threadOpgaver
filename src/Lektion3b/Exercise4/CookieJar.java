package Lektion3b.Exercise4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CookieJar {

    protected  BlockingQueue<Cookie> queue = new ArrayBlockingQueue(48);

    public boolean startBaking(){
        if (queue.size()<5){
            System.out.println("Start baking more cookies");
            return true;
        } else {
            return false;
        }
    }

    public synchronized void finishedBaking(){
        for (int i = 0; i < 12; i++) {
            System.out.println("Added a cookie");
            queue.add(new Cookie());
            notifyAll();
            System.out.println("Now there's " + queue.size() + " cookies left");
        }
    }

    public synchronized void eatCookie(String name) {
        if (queue.size() > 0) {
            try {
                System.out.println(name + " took a cookie");
                Cookie cookie = queue.take();
                System.out.println("There is " + queue.size() + " cookies left");
            } catch (InterruptedException e) {
                System.out.println("Couldn't take cookie");
            }
        }else{
            try{
                System.out.println(name + " is waiting for a cookie");
            wait();
            eatCookie(name);
            } catch (InterruptedException e){
                System.out.println(name + " couldn't wait for a cookie");
            }
    }

    }


}

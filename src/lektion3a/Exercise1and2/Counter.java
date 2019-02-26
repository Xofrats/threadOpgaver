package lektion3a.Exercise1and2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    private int countA = 0;
    private int countB = 0;

    private Lock lockA = new ReentrantLock();
    private Lock lockB = new ReentrantLock();

    public void incrementA(){
        synchronized (lockA){
            countA++;
        }
    }

    public void incrementB(){
        synchronized (lockB){
            countB++;
        }
    }

    public int getCountA(){
        synchronized (lockA){
            return countA;
        }
    }

    public int getCountB(){
        synchronized (lockB){
            return countB;
        }
    }
}

package Lektion3b.Exercise3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class AirportQueue implements PassengerQueue {
    protected BlockingQueue<Passenger> queue = new ArrayBlockingQueue<Passenger>(100);



    @Override
    public synchronized Passenger getNextPassenger() {
        try{
        Passenger next = queue.take();
        return next;
        }
        catch (InterruptedException e){
            System.out.println("Could take passenger");
        }
       return null;
    }

    @Override
    public synchronized void putPassengerInQueue(Passenger p) {
        try{
        queue.put(p);
        }
        catch (InterruptedException e){
            System.out.println("Couldn't put passenger in");
        }

    }

    public synchronized boolean isEmpty(){
        if (queue.size()>0){
            return false;
        } else {
        return  true;
        }
    }
}

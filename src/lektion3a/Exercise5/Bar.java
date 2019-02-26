package lektion3a.Exercise5;

import java.util.ArrayList;

public class Bar implements Runnable {
    private ArrayList<Beer> bar = new ArrayList();
    private int capacity = 20;
    private boolean open = true;

    public int getSize(){
        return bar.size();
    }

    public synchronized void placeBeer(){
       if (bar.size() < capacity){
           bar.add(new Beer());
           notifyAll();
       }
        if (bar.size() >= capacity ){
            try {
                wait();
            }
            catch (InterruptedException e){

            }
        }

    }

    public synchronized void takeBeer(){
        if (bar.size() != 0){
            bar.remove(bar.size()-1);
            } else {
            try {
                wait();
            } catch (InterruptedException e){

            }
        }
    }

    public boolean isOpen(){
        return open;
    }

    @Override
    public void run() {
        while (open){
            try {
                System.out.println("Bar is open!");
                Thread.sleep(30000);
                open = false;
                System.out.println("Bar is closed");
            } catch (InterruptedException e){

            }
        }
    }
}

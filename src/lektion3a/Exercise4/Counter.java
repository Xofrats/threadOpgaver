package lektion3a.Exercise4;

public class Counter {

    private long value;
    private long max;
    private long min;

    public Counter(long max, long min) {
        this.value = 0;
        this.max = max;
        this.min = min;
    }

    public synchronized void increment(){
        if (value<max){
            value++;
            System.out.println("Value is " + getValue() + " because of " + Thread.currentThread());
            notifyAll();
        } else {
            try {
                wait();
            }
            catch (InterruptedException e){

            }
        }
    }

    public synchronized void decrement() {
        if (value > min) {
            value -= 1;
            System.out.println("Value is " + getValue() + " because of " + Thread.currentThread());
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
    }

    public synchronized long getValue(){
        return value;
    }
}

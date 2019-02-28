package Lektion3b.Exercise3;

public class PassportControl implements Runnable {

    private AirportQueue myQueue;
    private boolean isRunning = true;
    private String type;

    public PassportControl(AirportQueue myQueue, String type) {
        this.myQueue = myQueue;
        this.type = type;
    }

    public PassportControl(AirportQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (isRunning){
            if (!(myQueue.isEmpty())) {
                Passenger next = myQueue.getNextPassenger();
                System.out.println("I'm the " + type + ". I got a passenger from " + next.getNationality() + " With the number: " + next.getPassportNumber());
            } else {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e){
                    System.out.println("Could wait for passengers");
                }
            }
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println(type + " controller got interrupted");
        }
    }
}

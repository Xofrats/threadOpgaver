package Lektion3b.Exercise3;

public class Guide implements Runnable {
private boolean isRunning = true;
private PassengerGenerator passengerGenerator;
private AirportQueue usQueue;
private AirportQueue nonUsQueue;

    public Guide(PassengerGenerator passengerGenerator, AirportQueue usQueue, AirportQueue nonUsQueue) {
        this.passengerGenerator = passengerGenerator;
        this.usQueue = usQueue;
        this.nonUsQueue = nonUsQueue;
    }

    @Override
    public void run() {
        while (isRunning){
            Passenger newArrival = passengerGenerator.passengerArrives();
            if(newArrival.getNationality().equals("US")){
                System.out.println("I'm the guide I just put someone in the US queue");
                usQueue.putPassengerInQueue(newArrival);
            } else {
                System.out.println("I'm the guide I just put someone in the OTHER queue");
                nonUsQueue.putPassengerInQueue(newArrival);
            }

            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                System.out.println("Guide couldn't wait");
            }
        }
    }
}

package Lektion3b.Exercise3;

public class Main {

    public static void main(String[] args){

        AirportQueue usQueue = new AirportQueue();
        AirportQueue nonUsQueue = new AirportQueue();

        PassengerGenerator arrivals = new PassengerGenerator();

        Guide guide = new Guide(arrivals, usQueue, nonUsQueue);

        PassportControl usControl = new PassportControl(usQueue, "USA control");
        PassportControl nonUs = new PassportControl(nonUsQueue, "others control");

        Thread guideWorking = new Thread(guide);
        Thread usWorking = new Thread(usControl);
        Thread otherWorking = new Thread(nonUs);

        guideWorking.start();
        usWorking.start();
        otherWorking.start();


    }
}

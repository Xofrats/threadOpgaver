package Lektion3b.Exercise3;

import java.util.Random;

public class PassengerGenerator {
    public Passenger passengerArrives(){
        Random r = new Random();
        String nationality;
        int passportNumber = r.nextInt(8999) + 1000;
        if (passportNumber<5500){
            nationality = "US";
        } else {
            nationality = "Other";
        }

        return new Passenger(nationality, passportNumber);
    }
}

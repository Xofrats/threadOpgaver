package Lektion3b.Exercise5;

public class Garage implements ParkingPlace {
    private int maxPlaces = 4;
    private int inUse = 0;

    @Override
    public int freePlaces() {
        return maxPlaces - inUse;
    }

    @Override
    public synchronized void arrive() {
        if (freePlaces() > 0){
            System.out.println("Car parked");
            inUse++;
        } else {
            try{
                System.out.println("Car waiting");
                wait();

            } catch (InterruptedException e){
                System.out.println("Car could not wait");
            }
            arrive();
        }
    }

    @Override
    public synchronized void leave() {
        inUse = inUse - 1;
        System.out.println("car left");
        notifyAll();
    }
}

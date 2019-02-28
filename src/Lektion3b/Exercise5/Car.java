package Lektion3b.Exercise5;

import java.util.Random;

public class Car implements Runnable {
private int driveTime = 0;
private int parkTime = 0;
private Random rand = new Random();
private String name;
private Garage garage;

    public Car(String name, Garage garage) {
        this.name = name;
        this.garage = garage;
    }

    @Override
    public void run() {
        while (true){
            driveTime = rand.nextInt(5000) + 1000;
            parkTime = rand.nextInt(5000) + 1000;

            System.out.println(name + " is driving");
            try{
                Thread.sleep(driveTime);
            } catch (InterruptedException e){
                System.out.println(name + " Couldn't drive");
            }

            System.out.println(name + " wants to park");
            garage.arrive();
            System.out.println(name + " parked");

            try {
                Thread.sleep(parkTime);
            } catch (InterruptedException e){
                System.out.println(name + " got interrupted while parked");
            }

            System.out.println(name + " is leaving");
            garage.leave();


        }

    }
}

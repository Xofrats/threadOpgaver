package Lektion3b.Exercise5;

public class Display implements Runnable {

    Garage garage = new Garage();

    public Display(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void run() {
        while (true){
            int freeSpaces = garage.freePlaces();
            System.out.println("Display shows " + freeSpaces + " free spaces");
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e){
                System.out.println("Display got interrupted");
            }
        }
    }
}

package Lektion3b.Exercise5;

public class ParkingMain {
    public static void main(String[] args){
        Garage garage = new Garage();

        Display display = new Display(garage);

        Car red = new Car("Red trunk", garage);
        Car blue = new Car("Blue Ford", garage);
        Car turkish = new Car("Turkish BMW", garage);
        Car green = new Car("Green Bobble", garage);
        Car brown = new Car("Brown Bulette", garage);
        Car rainbow = new Car("Rainbow Gryphon", garage);

        Thread displayShowing = new Thread(display);

        Thread redDriving = new Thread(red);
        Thread blueDriving = new Thread(blue);
        Thread turkishDriving = new Thread(turkish);
        Thread greenDriving = new Thread(green);
        Thread brownDriving = new Thread(brown);
        Thread rainbowDriving = new Thread(rainbow);

        displayShowing.start();
        redDriving.start();
        blueDriving.start();
        turkishDriving.start();
        greenDriving.start();
        brownDriving.start();
        rainbowDriving.start();
    }
}

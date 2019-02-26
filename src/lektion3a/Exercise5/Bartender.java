package lektion3a.Exercise5;

public class Bartender implements Runnable {
    private String name;
    private Bar bar;
    private int speed;


    public Bartender(Bar bar, String name, int speed) {
        this.bar = bar;
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void run() {
        while (bar.isOpen()){
            bar.placeBeer();
            System.out.println(name + " placed a beer on the bar. " + "There are " + bar.getSize() + " Beer left");
            try {
                Thread.sleep(speed);
            } catch (InterruptedException e) {

            }
        }

        System.out.println(name + " stopped placing beer");
    }
}

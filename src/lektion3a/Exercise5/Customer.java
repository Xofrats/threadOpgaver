package lektion3a.Exercise5;

public class Customer implements Runnable {
    private String name;
    private Bar bar;
    private int wait;

    public Customer(String name, Bar bar, int wait) {
        this.name = name;
        this.bar = bar;
        this.wait = wait;
    }

    @Override
    public void run() {
        while (bar.isOpen()) {
            System.out.println(name + " wants a beer");
            bar.takeBeer();
            System.out.println(name + " got a beer. " + "there are " + bar.getSize() + " Beer left");
            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {

            }
        }

        System.out.println(name + " went home");
    }
}

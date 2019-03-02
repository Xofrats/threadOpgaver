package Lektion3c.opgave1Bowing;

public class Friend {

    private String name;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void bow(Friend bower){
        System.out.println(name + ": " + bower.getName() + " has bowed to me!");
        bower.bowBack(this);
    }

    public synchronized void bowBack(Friend bower){
        System.out.println(name + ": " + bower.getName() + " has bowed back to me!");
    }
}

package Lektion3b.Exercise4;

public class CookieEater implements Runnable {

    private CookieJar thePrize;
    private String name;

    public CookieEater(CookieJar thePrize, String name) {
        this.thePrize = thePrize;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(name + " wants a cookie");
            thePrize.eatCookie(name);
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e){
                System.out.println(name + " got interrupted eating a cookie");
            }
        }
    }
}

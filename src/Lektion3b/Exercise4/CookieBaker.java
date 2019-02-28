package Lektion3b.Exercise4;

public class CookieBaker implements Runnable {
    private CookieJar jar;

    public CookieBaker(CookieJar jar) {
        this.jar = jar;
    }

    public void startBaking(){
        while (jar.startBaking()){
            System.out.println("Starting Baking");
            try {
                Thread.sleep(12000);
            } catch (InterruptedException e){
                System.out.println("Can't bake");
            }
            System.out.println("Finished baking");
            jar.finishedBaking();

        }

    }

    @Override
    public void run() {
       while (true){
           startBaking();
       }

    }
}

package Lektion3c.opgave1Bowing;

public class bowingMain {

    public static void main(String[] args){
        final Friend phillip = new Friend("Phillip");
        final Friend terrance = new Friend("Terrance");

        new Thread(() -> {
            while (true){
                phillip.bow(terrance);
            }
        }).start();


     new Thread(() -> {
        while (true){
            terrance.bow(phillip);
        }
    }).start();
    }
}



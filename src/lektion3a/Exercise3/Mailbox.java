package lektion3a.Exercise3;

public class Mailbox implements Runnable {
    private long maxFrequency;
    private int count;
    private static long RUNTIME = 100000;

    public Mailbox(int count) {
        this.count = count;
    }

    @Override
    public void run() {

        maxFrequency = RUNTIME/count;
        for (int i = 0; i < count; i++) {
            int number = i + 1;
            System.out.println("You got(" + number + ") new mail!");
            waitingForMails();
        }

    }

    private void waitingForMails(){

        try {
            Thread.sleep(maxFrequency);
        } catch (InterruptedException e) {

        }
    }
}

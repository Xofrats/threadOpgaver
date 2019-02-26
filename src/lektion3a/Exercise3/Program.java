package lektion3a.Exercise3;

public class Program implements Runnable {
    private String program;
    private long maxFrequency;
    private String action;
    private int count;
    private static long RUNTIME = 100000;

    public Program(String program, String action, int count) {
        this.program = program;
        this.action = action;
        this.count = count;
    }

    @Override
    public void run() {
        maxFrequency = RUNTIME/count;
        for (int i = 0; i < count; i++) {
            System.out.println(program + " wants to " + action);
            normalOperation();
        }
    }

    private void normalOperation(){
        try {
            Thread.sleep(maxFrequency);
        } catch (InterruptedException e) {

        }
    }
}

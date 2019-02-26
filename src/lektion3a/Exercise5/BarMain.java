package lektion3a.Exercise5;

public class BarMain {
    public static void main(String[] args) {
        Bar bar = new Bar();

        Thread barIsOpen = new Thread(bar);

        Bartender mike = new Bartender(bar, "Mike",13000);
        Bartender sally = new Bartender(bar, "Sally",8300);

        Thread mikeTending = new Thread(mike);
        Thread sallyTending = new Thread(sally);

        Customer joe = new Customer("Joe", bar,2520);
        Customer daniel = new Customer("Daniel", bar, 2180);
        Customer bente = new Customer("Bente", bar, 12030);

        Thread joeDrinking = new Thread(joe);
        Thread danielDrinking = new Thread(daniel);
        Thread benteDrinking = new Thread(bente);

        barIsOpen.start();
        mikeTending.start();
        sallyTending.start();
        joeDrinking.start();
        danielDrinking.start();
        benteDrinking.start();

    }
}

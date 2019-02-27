package Lektion3b.Exercise2;

public class BurgerBarEmployee implements Runnable {
    private String name;
    private BurgerBar burgerBar;

    public BurgerBarEmployee(String name, BurgerBar burgerBar) {
        this.name = name;
        this.burgerBar = burgerBar;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println(name + " is cooking");
                Thread.sleep(5000);
                burgerBar.makeBurger(name);
            } catch (InterruptedException e){
                System.out.println(name + " stopped working");
                break;
            }
        }
    }
}

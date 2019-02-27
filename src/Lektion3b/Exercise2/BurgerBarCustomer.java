package Lektion3b.Exercise2;

public class BurgerBarCustomer implements Runnable {
    private int burgerToEat;
    private String name;
    private BurgerBar burgerBar;
    private int burgersEaten = 0;

    public BurgerBarCustomer(int burgerToEat, String name, BurgerBar burgerBar) {
        this.burgerToEat = burgerToEat;
        this.name = name;
        this.burgerBar = burgerBar;
    }

    @Override
    public void run() {
        burgerBar.welcomeCustomer(name);
        while (burgersEaten < burgerToEat){
            System.out.println(name + " want a burger");
            burgerBar.eatBurger(name);
            try {
                Thread.sleep(7050);
                burgersEaten++;
            } catch (InterruptedException e){
                System.out.println(name + " got interrupted eating their burger");
            }
        }
     /*   for (int i=0; i<burgerToEat; i++){

            System.out.println(name + " want a burger");
            burgerBar.eatBurger(name);
            try {

                Thread.sleep(7050);
            } catch (InterruptedException e){
                System.out.println(name + " got interrupted eating their burger");
            }
        }*/

        burgerBar.goodbyeCustomer(name);
    }
}

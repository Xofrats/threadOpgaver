package Lektion3b.Exercise2;

import java.util.ArrayList;

public class BurgerBar implements Runnable {
    private int numberOfBurger;
    private int maxNumberOfBurgers;
    private int customers = 0;
    private boolean isOpen = true;
    private ArrayList<Thread> employees = new ArrayList<>();

    public BurgerBar(int maxNumberOfBurgers) {
        this.maxNumberOfBurgers = maxNumberOfBurgers;
    }

    public synchronized void makeBurger(String employeeName){
        if (numberOfBurger<maxNumberOfBurgers){
            System.out.println(employeeName + " made a burger");
            numberOfBurger++;
            System.out.println("Number of burgers: " + getNumberOfBurger());
            notifyAll();
        }

        else {
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println("could not wait for burger");
            }
        }
    }

    public synchronized void eatBurger(String who){
        if (numberOfBurger <= 0){
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println(who + " got interrupted wait for burger");
            }
        }
        if (numberOfBurger > 0 ){

            System.out.println(who + " eat a burger");
            numberOfBurger = numberOfBurger - 1;
            System.out.println("Numbers of burgers left: " + getNumberOfBurger());
        } else {
            eatBurger(who);
        }

    }

    public synchronized int getNumberOfBurger() {
        return numberOfBurger;
    }

    public void welcomeCustomer(String who){
        System.out.println("Welcome " + who);
        customers++;
    }

    public  void goodbyeCustomer(String who){
        System.out.println(who + " left happily");
        customers = customers-1;
    }

    public void addEmployee(Thread name){
        employees.add(name);
    }

    @Override
    public void run() {
        while (isOpen){try {
            Thread.sleep(1000);
        } catch (InterruptedException e){

        }
           if  (customers <= 0){
               System.out.println("We're closed");
               isOpen = false;
               for (Thread employee : employees){
                   employee.interrupt();
               }
           }
        }
    }
}

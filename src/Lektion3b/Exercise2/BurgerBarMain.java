package Lektion3b.Exercise2;

public class BurgerBarMain {

    public static void main(String[] args){
        BurgerBar joes = new BurgerBar(20);

        BurgerBarEmployee sitch = new BurgerBarEmployee("Sitch", joes);
        BurgerBarEmployee adam = new BurgerBarEmployee("Adam", joes);

        BurgerBarCustomer kip = new BurgerBarCustomer(4, "Kip", joes);
        BurgerBarCustomer gavin = new BurgerBarCustomer(5, "Gavin", joes);
        BurgerBarCustomer carries = new BurgerBarCustomer(2, "Carries", joes);
        BurgerBarCustomer iron = new BurgerBarCustomer(8, "Iron Fist", joes);
        BurgerBarCustomer dayson = new BurgerBarCustomer(5, "Dayson", joes);

        Thread sitchWorking = new Thread(sitch);
        Thread adamWorking = new Thread(adam);

        Thread kipEating = new Thread(kip);
        Thread gavinEating = new Thread(gavin);
        Thread carriesEating = new Thread(carries);
        Thread ironEating = new Thread(iron);
        Thread daysonEating = new Thread(dayson);

        Thread joesBar = new Thread(joes);

        joes.addEmployee(sitchWorking);
        joes.addEmployee(adamWorking);


        joesBar.start();
        sitchWorking.start();
        adamWorking.start();
        kipEating.start();
        gavinEating.start();
        carriesEating.start();
        ironEating.start();
        daysonEating.start();

    }

}

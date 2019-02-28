package Lektion3b.Exercise4;

public class CookieMain {

    public static void main(String[] args){
        CookieJar cookieJar = new CookieJar();

        CookieBaker cookieBaker = new CookieBaker(cookieJar);
        CookieEater nixie = new CookieEater(cookieJar, "Nixie");
        CookieEater star = new CookieEater(cookieJar, "Star");

        Thread baking = new Thread(cookieBaker);
        Thread nixEating = new Thread(nixie);
        Thread starEating = new Thread(star);

        baking.start();
        nixEating.start();
        starEating.start();
    }
}

package lektion3a;

import lektion3a.Exercise1and2.*;
import lektion3a.Exercise3.Mailbox;
import lektion3a.Exercise3.Program;
import lektion3a.Exercise4.CounterDecrementer;
import lektion3a.Exercise4.CounterIncrementer;

public class Main {

    public static void main(String[] args){
        Counter counter = new Counter();

   //Opgave 1
        Countincrementer count1 = new Countincrementer(counter);
        Countincrementer count2 = new Countincrementer(counter);

        Thread countingFor1 = new Thread(count1);
        Thread countingFor2 = new Thread(count2);

        countingFor1.start();
        countingFor2.start();

      //Opgave 2

     /*   CountIncA count1 = new CountIncA(counter);
        CountIncB count2 = new CountIncB(counter);
        CountIncBoth count3 = new CountIncBoth(counter);
        CountIncA count4 = new CountIncA(counter);

        Thread adding1milToA = new Thread(count1);
        Thread adding1milToB = new Thread(count2);
        Thread adding1milToBoth = new Thread(count3);
        Thread addingAnother1milToA = new Thread(count4);

        adding1milToA.start();
        adding1milToB.start();
        adding1milToBoth.start();
        addingAnother1milToA.start();*/

     //Opgave 3

       /* Program windows = new Program("windows", "update", 29);
        Program skype = new Program("Skype", "notify you about a person logging in", 21);
        Program spotify = new Program("Spotify", "play next song", 43);
        Program intelliJ = new Program("IntelliJ", "program something", 7);
        Mailbox mailbox = new Mailbox(20);

        Thread runWindows = new Thread(windows);
        Thread runSkype = new Thread(skype);
        Thread runSpotify = new Thread(spotify);
        Thread runMailbox = new Thread(mailbox);

        System.out.println("starting computer");
        runWindows.start();
        runSkype.start();
        runSpotify.start();
        runMailbox.start();*/

       //Opgave4
     /*   lektion3a.Exercise4.Counter counterExercise4 = new lektion3a.Exercise4.Counter(10,5);

        CounterIncrementer exercise4Incrementer = new CounterIncrementer(counterExercise4, 30);
        CounterDecrementer exercise4Decrementer = new CounterDecrementer(counterExercise4, 20);

        Thread run4Incremener = new Thread(exercise4Incrementer);
        Thread run4Decremener = new Thread(exercise4Decrementer);

        run4Incremener.start();
        run4Decremener.start();*/

    }
}

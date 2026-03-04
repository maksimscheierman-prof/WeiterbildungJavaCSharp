package Uebungsaufgaben;

class Animala {}

class Bird extends Animala {}

class Pinguin extends Bird {}

public class Downcast {
    public static void main(String[] args) {

        Animala animal = new Bird();      // OK – Upcast
        Bird bird = (Bird) animal;       // OK – Downcast (
        Pinguin pinguin = (Pinguin) bird;

        System.out.println("Das wirst du nie sehen, wegen Exception");

    }
}
package Uebungsaufgaben.mainapp;


import Uebungsaufgaben.shapes.Circle;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle("MeinKreis");

        // Aufruf der geerbten Methoden
        c.displayType();   // protected → erlaubt in Unterklassen
        c.printName();     // NICHT möglich → package-private (wird Fehler verursachen!)

        // Korrrekt:
        c.printCircleInfo();   // öffentliche Wrapper-Methode
    }
}


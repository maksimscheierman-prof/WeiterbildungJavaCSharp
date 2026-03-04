package ArraysUndTertiary;

import java.util.Random;

class C2 {
    void displayC2() { System.out.println("displayC2() from C2"); }
}

interface I {
    void displayI();
}

class C1 extends C2 implements I {
    public void displayI() { System.out.println("displayI() from C1"); }
}

public class Aufgabe3 {
    public static void main(String[] args) {

        System.out.println("=== Erzeugung des Objekts ===");
        C1 realObject = new C1();
        System.out.println("Typ des Objekts: " + realObject.getClass().getName());

        System.out.println("\n=== Zugriff über C1-Referenz ===");
        realObject.displayI();
        realObject.displayC2();

        System.out.println("\n=== Zugriff über I-Referenz (Interface) ===");
        I iRef = realObject;   // Upcast (automatisch)
        iRef.displayI();       // erlaubt
        // iRef.displayC2();   // NICHT erlaubt - Interface kennt displayC2 nicht

        System.out.println("iRef.getClass(): " + iRef.getClass().getName());

        System.out.println("\n=== Zugriff über C2-Referenz (Superclass) ===");
        C2 cRef = realObject;   // Upcast
        cRef.displayC2();       // erlaubt
    // erlaubt (durch Polymorphie)

        System.out.println("cRef.getClass(): " + cRef.getClass().getName());

        System.out.println("\n=== Downcast von I zu C2 ===");
        C2 casted = (C2) iRef;  // Downcast funktioniert
        casted.displayC2();


        System.out.println("casted.getClass(): " + casted.getClass().getName());

        System.out.println("\n=== Fazit ===");
        System.out.println("realObject == iRef ? " + (realObject == iRef));
        System.out.println("realObject == cRef ? " + (realObject == cRef));
        System.out.println("realObject == casted ? " + (realObject == casted));
    }
}



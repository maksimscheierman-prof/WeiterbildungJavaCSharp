package Uebungsaufgaben.shapes;

public class Shape {

    private String name;  // privates Feld

    protected void displayType() {   // geschützte Methode
        System.out.println("Dies ist eine geometrische Form.");
    }

    public void printName() {               // Standardmethode (package-private)
        System.out.println("Name: " + name);
    }

    // Öffentlicher Konstruktor
    public Shape(String name) {
        this.name = name;
    }

    // Getter, damit andere Pakete auf name zugreifen können
    public String getName() {
        return name;
    }
}


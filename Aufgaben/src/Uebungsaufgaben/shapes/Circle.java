package Uebungsaufgaben.shapes;

public class Circle extends Shape {

    public Circle(String name) {
        super(name);
    }

    @Override
    public void displayType() {
        System.out.println("Dies ist ein Kreis.");
    }

    public void printCircleInfo() {
        displayType();     // geerbte protected Methode
        printName();       // Standardmethode aus Shape (gleicher Package)
        System.out.println("Name aus Feld: " + getName());
    }
}


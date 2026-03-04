package Test;
import java.lang.*;
import java.util.Random;

class Auto {
    public void printDetails() {
        System.out.println("Ich bin ein Auto");
    }
}

class Mercedes extends Auto {
    public void printDetails() {
        System.out.println("Ich bin ein Mercedes");
    }
}

class AKlasse extends Mercedes {
    public void printDetails() {
        System.out.println("Ich bin ein A-Klasse Mercedes");
    }
}

public class Main {
    public static void main(String[] args) {
        Auto b1 = new Mercedes();
        Auto b2 = new AKlasse();
        Auto b3 = new Mercedes();
        b1 = (Auto) b3;
        Auto b4 = (Mercedes) b3;

        b1.printDetails();
        b4.printDetails();
    }
}


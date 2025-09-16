package T20_TryCatch.AufgabeMaksim;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Case a: 200 Gürtel á 80 cm
        Order orderA = new Order();
        orderA.addBelts(300, 80);
        printResult("Fall A (300 × 80 cm)", orderA);

        // Case b: 100 Gürtel á 110 cm
        Order orderB = new Order();
        orderB.addBelts(100, 110);
        printResult("Fall B (100 × 110 cm)", orderB);

        // Case c: 300 Gürtel á 150 cm
        Order orderC = new Order();
        orderC.addBelts(300, 150);
        printResult("Fall C (300 × 150 cm)", orderC);

    }
    private static void printResult(String title, Order order) {
        System.out.println("=== " + title + " ===");
        System.out.println("Gesamtlänge (cm): " + order.getTotalLengthCm());
        System.out.println("Preis pro Meter: " + order.getPricePerMeter() + " €");
        System.out.println("Gesamtpreis: " + order.getTotalPrice() + " €");
        System.out.println();
    }
}

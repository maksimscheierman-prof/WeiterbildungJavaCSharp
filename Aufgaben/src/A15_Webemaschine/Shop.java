package A15_Webemaschine;

public class Shop {
    public void run() {
        // Beispiel 1: kleine Bestellung (kein Rabatt)
        Order o1 = new Order(5, 3);
        o1.printOrder();

        // Beispiel 2: mittlere Bestellung (20 Stück → 20% Rabatt)
        Order o2 = new Order(12, 8);
        o2.printOrder();

        // Beispiel 3: große Bestellung (50 Stück → 50% Rabatt)
        Order o3 = new Order(30, 20);
        o3.printOrder();
    }
}

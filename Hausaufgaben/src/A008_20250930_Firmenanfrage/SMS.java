package A008_20250930_Firmenanfrage;

import java.util.Random;

public class SMS extends Message {
    private String senderNummer;
    private String empfängerNummer;

    public SMS(String senderNummer, String empfängerNummer, String text) {
        super(text);
        this.senderNummer = senderNummer;
        this.empfängerNummer = empfängerNummer;
    }

    @Override
    public String send() {
        Random rand = new Random();
        int duration = rand.nextInt(2) + 1;
        return "SMS Versanddauer: " + duration + " Sekunden";
    }

    @Override
    public void display() {
        System.out.println("=== SMS ===");
        System.out.println("Von: " + senderNummer);
        System.out.println("An: " + empfängerNummer);
        System.out.println("Nachricht: " + text);
        System.out.println();
    }
}
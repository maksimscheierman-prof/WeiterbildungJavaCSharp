package A008_20250930_Firmenanfrage;

import java.util.Random;

public class Email extends Message {
    private String sender;
    private String empfänger;
    private String betreff;

    public Email(String sender, String empfänger, String betreff, String text) {
        super(text);
        this.sender = sender;
        this.empfänger = empfänger;
        this.betreff = betreff;
    }

    @Override
    public String send() {
        Random rand = new Random();
        int duration = rand.nextInt(5) + 1;
        return "E-Mail Versanddauer: " + duration + " Sekunden";
    }

    @Override
    public void display() {
        System.out.println("=== E-Mail ===");
        System.out.println("Von: " + sender);
        System.out.println("An: " + empfänger);
        System.out.println("Betreff: " + betreff);
        System.out.println("Nachricht: " + text);
        System.out.println();
    }
}
package A008_20250930_Firmenanfrage;

import java.util.Random;

public class Brief extends Message {
    private String senderAddress;
    private String empfängerAddress;
    private double portokosten;

    public Brief(String senderAddress, String empfängerAddress, double portokosten, String text) {
        super(text);
        this.senderAddress = senderAddress;
        this.empfängerAddress = empfängerAddress;
        this.portokosten = portokosten;
    }

    @Override
    public String send() {
        Random rand = new Random();
        int durationDays = rand.nextInt(3) + 1;
        return "Brief Versanddauer: " + durationDays + " Tage";
    }

    @Override
    public void display() {
        System.out.println("=== Brief ===");
        System.out.println("Absender: " + senderAddress);
        System.out.println("Empfänger: " + empfängerAddress);
        System.out.println("Portokosten: " + portokosten + " EUR");
        System.out.println("Nachricht: " + text);
        System.out.println();
    }
}